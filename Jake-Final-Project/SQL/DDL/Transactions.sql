CREATE TABLE JS156724.TRANSACTIONS
(
    TransactionID INT CONSTRAINT PK_TRANSACTIONS_TRANSACTIONID PRIMARY KEY ,
    Price DECIMAL(10,2) NOT NULL,
    TransactionDate DATETIME,
    ShippingInfo VARCHAR(255) NOT NULL,
    Username VARCHAR(20) NOT NULL,
    CONSTRAINT FK_TRANSACTIONS_USERNAME FOREIGN KEY(Username) REFERENCES JS156724.USERS(Username),
    Game VARCHAR(30) NOT NULL,
    CONSTRAINT FK_TRANSACTIONS_GAME FOREIGN KEY(Game) REFERENCES JS156724.GAME(GameName)
)