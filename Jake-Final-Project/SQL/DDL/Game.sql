
CREATE TABLE JS156724.GAME
(
    GameName VARCHAR(30) CONSTRAINT PK_GAME_GAMENAME PRIMARY KEY,
    [Description] VARCHAR(100) NOT NULL,
    Price DECIMAL (10,2) NOT NULL CONSTRAINT CK_GAME_PRICE CHECK (Price > 0),
    Platform VARCHAR(20) NOT NULL,
    ReleaseDate DATETIME NOT NULL,
    Genre VARCHAR(30),
    CONSTRAINT FK_GAME_GENRE FOREIGN KEY (Genre) REFERENCES JS156724.GENRES(Name),
    DevID INT NOT NULL,
    CONSTRAINT FK_GAME_DEVID FOREIGN KEY(DevID) REFERENCES JS156724.DEVELOPER(DevID),
)