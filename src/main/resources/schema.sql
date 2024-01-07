
create table publisher(publisherId INT PRIMARY KEY AUTO_INCREMENT,publisherName VARCHAR(255));

create table book(bookId INT PRIMARY KEY AUTO_INCREMENT, bookName VARCHAR(255),imageUrl VARCHAR(255), publisherId INT, FOREIGN KEY(authorId) REFERENCES Author(authorId));

CREATE TABLE IF NOT EXISTS book_author (
  bookId INT,
  authorId INT,
  PRIMARY KEY (bookId, authorId),
  FOREIGN KEY (bookId) REFERENCES Book(id),
  FOREIGN KEY (authorId) REFERENCES Author(authorId)
);