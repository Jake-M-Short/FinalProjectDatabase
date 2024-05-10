INSERT INTO JS156724.GENRES (Name, Description)
VALUES
    ('Horror', 'Spooky Scary Games'),
    ('Adventure', 'Emphasis on Exploration'),
    ('Action' , 'Focus on Fighting'),
    ('Strategy' , 'Strategy is very much involved'),
    ('RPG' , 'Role Playing Games')
GO

INSERT INTO JS156724.USERS (Username, Password, Location, Email, PreferredGenre)
VALUES
    ('Jake', 'DontUsePlease' , 'Montana' , 'Jake@email.com' , 'RPG'),
    ('Damian' , 'DontLook123' , 'United States' ,'Damian@email.com', 'Action'),
    ('Addison' , 'AddisonRealPassword', 'Montana', 'Addison@email.com', 'Strategy'),
    ('Superman', 'Kryptonite321', 'Different Planet', 'Superman@email.com', 'Action'),
    ('Annabelle' , '7Days' , 'Unknown', 'Annabelle@Email.com', 'Horror');
GO

INSERT INTO JS156724.DEVELOPER(DevID, DevNames, WebsiteName, NewsBoard, PublishedGames)
VALUES
    ('1', 'Bethesda', 'bethesda.net', 'Welcome to Bethesda Studios where we make Fallout and ElderScrolls games :)', '3'),
    ('2', 'Rockstar' , 'rockstar.com', 'Creators of Red Dead and GTA' , '2'),
    ('3', 'Valve' , 'steam.com' , 'The Creators of Half Life and Portal' , '3'),
    ('4', 'Endnight' , 'Endnight.com', 'The devlopers of The Forest' , '2'),
    ('5', 'Firaxis Games' , 'Firaxis.com' , 'Creators of the strategy game Civilization', '2');
GO

INSERT INTO JS156724.GAME(GameName, [Description], Price, Platform, ReleaseDate, Genre, DevID)
VALUES
    ('Fallout New Vegas' , 'RPG game in an apocalyptic wasteland', '20.00' , 'Windows' , 'October-19-2010', 'RPG' , '1'),
    ('Red Dead Redemption' , 'RPG game in the era of American Cowboys', '20.00' , 'Windows' , 'May-18-2010', 'RPG', '2'),
    ('Half-Life 2' , 'Story Driven Action game' , '10.00' , 'Windows' , 'November-16-2004', 'Action', '3'),
    ('The Forest' , 'Horror exploration story on an island' , '15.00' , 'Windows', 'April-30-2018', 'Horror', '4'),
    ('Civilization 5' , 'Strategy game around controlling an empire' , '9.99' , 'Windows' , 'September-21-2010' , 'Strategy', '5');
GO

INSERT INTO JS156724.GAMELIBRARY(LibraryID, Username, Game)
VALUES
    ('1', 'Jake', 'Fallout New Vegas'),
    ('2', 'Damian' , 'Half-Life 2'),
    ('3', 'Addison' , 'Civilization 5'),
    ('4' , 'Annabelle', 'The Forest'),
    ('5' , 'Superman' , 'Red Dead Redemption');
GO



INSERT INTO JS156724.STAFF(StaffID, Firstname, Lastname)
VALUES
    ('1', 'Jack' , 'Frost'),
    ('2', 'Austin', 'Powers'),
    ('3' , 'Indiana', 'Jones'),
    ('4', 'Ace' , 'Ventura'),
    ('5', 'Perry', 'The Platypus');
GO


INSERT INTO JS156724.TICKETS(TicketID, TicketName, TicketContext, Username, StaffID)
VALUES
    ('1', 'Help with Game' , 'I cant run the game I bought' , 'Jake' , '4'),
    ('2', 'I want refund' , 'Game is not Fun', 'Superman' ,'1'),
    ('3', 'My library is not updating for new bought game' , 'New game not in library', 'Damian', '5'),
    ('4', 'Not saving wallet balance', 'Balance did not update in wallet', 'Addison', '2'),
    ('5', 'Need help installing game', 'cant download game :(', 'Jake', '3');
GO



INSERT INTO JS156724.WALLET(Username, Balance)
VALUES
    ('Jake', '20.00'),
    ('Addison', '1000.00'),
    ('Damian', '50.00'),
    ('Superman', '10.00'),
    ('Annabelle', '0.00');
GO



INSERT INTO JS156724.TRANSACTIONS(TransactionID, Price, TransactionDate, ShippingInfo, Username, Game)
VALUES
    ('1', '20.00', 'May-1-2024', '123 Apple Lane', 'Jake', 'Fallout New Vegas' ),
    ('2', '10.00', 'June-23-2024', '765 Blueberry Drive', 'Damian', 'Half-Life 2'),
    ('3', '9.99' , 'May-8-2024', '445 Montana Drive', 'Addison', 'Civilization 5'),
    ('4', '15.00' , 'December-3-2024', 'Unknown', 'Annabelle', 'The Forest'),
    ('5', '20.00' , 'August-25-2019', 'Off Planet', 'Superman', 'Red Dead Redemption');
GO



INSERT INTO JS156724.REVIEWS(ReviewID, Username, ReviewTitle, Context, Rating, Game)
VALUES
    ('1', 'Jake' , 'Best Fallout', 'This is the best fallout game ever made', '5', 'Fallout New Vegas'),
    ('2', 'Damian', 'Half-Life 2 GOTY', 'When is Half-Life 3 coming out tho...', '5', 'Half-Life 2'),
    ('3', 'Annabelle', 'Not Scary Enough', 'This game was not scary at all', '1', 'The Forest'),
    ('4', 'Superman', 'Easy Fights', 'No one could hurt me?', '3', 'Red Dead Redemption'),
    ('5', 'Addison' , 'Great Strategy Game', 'Very entertaining strategy game', '5', 'Civilization 5');
GO


INSERT INTO JS156724.FILTERER(FilterID, Username, FilterTypes, PlatformFilter)
VALUES
    ('1', 'Jake', 'RPG', 'Windows'),
    ('2', 'Damian', 'Action', 'Windows'),
    ('3', 'Addison', 'Strategy', 'Windows'),
    ('4', 'Annabelle' , 'Horror', 'Windows'),
    ('5', 'Superman', 'Action', 'Windows');
GO

INSERT INTO JS156724.COMMUNITYBOARD(BoardID, Username, Title, Description, CreationTimestamp, Comments)
VALUES
    ('1', 'Jake', 'Hello Everyone', 'How is everybody doing today? Happy Finals Week :)', 'May-9-2024', 'Hello....'),
    ('2', 'Damian', 'Half-Life 3', 'Valve when are you releasing Half-Life 3???', 'April-3-2024', 'STILL NO RESPONSE :('),
    ('3', 'Annabelle', 'New Horror Games', 'Are there any scary games on here?', 'March-5-2024', 'Still no scary games'),
    ('4', 'Superman', 'Red Dead Redemption is a game', 'too much violence cant save everyone :(', 'May-3-2024', 'I SAVED THEM :)'),
    ('5', 'Addison', 'Civ 5 is a great strategy game' , 'Everyone needs to try this game', 'May-1-2024', 'Great game');
GO


INSERT INTO JS156724.CHATMESSAGES(MessageID, SenderName, ReceiverName, Content, Timestamp)
VALUES
    ('1', 'Jake', 'Damian', 'Half-Life is coming out with Half-Life 3', 'May-6-2024'),
    ('2', 'Damian', 'Jake', 'Really?', 'May-6-2024'),
    ('3', 'Jake', 'Damian', 'No :)', 'May-6-2024'),
    ('4', 'Addison', 'Jake', 'You better be working on your project', 'May-7-2024'),
    ('5', 'Annabelle', 'Jake', 'Buy me a game or I will haunt you!', 'May-8-2024');
GO


