 CREATE TABLE users (
  id INTEGER IDENTITY PRIMARY KEY,
  name VARCHAR(30),
  email  VARCHAR(50)
);
INSERT INTO users (name, email) VALUES ('mkyong', 'aaa@gmail.com');
INSERT INTO users (name, email) VALUES ('alex', 'bbb@gmail.com');
INSERT INTO users (name, email) VALUES ('joel', 'ccc@gmail.com');
