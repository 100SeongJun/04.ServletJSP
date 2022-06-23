drop table gbook;

create table gbook (
	num INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	title VARCHAR(50) NOT NULL,
	author VARCHAR(50) NOT NULL,
	email VARCHAR(50) NOT NULL,
	content VARCHAR(200),
	password VARCHAR(20) NOT NULL,
	writeday TIMESTAMP DEFAULT NOW(),
	readnum INT
);