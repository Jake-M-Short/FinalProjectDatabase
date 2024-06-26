CREATE TABLE JS156724.REVIEWS
(
    ReviewID INT CONSTRAINT PK_REVIEWS_REVIEWID PRIMARY KEY,
    Username VARCHAR(20) NOT NULL ,
    ReviewTitle VARCHAR(255),
    Context VARCHAR(255),
    Rating DECIMAL(3,2) NOT NULL,
    CONSTRAINT PK_REVIEWS_USERNAME FOREIGN KEY (Username) REFERENCES JS156724.USER(Username)
)