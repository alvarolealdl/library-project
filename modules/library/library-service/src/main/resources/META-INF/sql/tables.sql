create table Library_Author (
	uuid_ VARCHAR(75) null,
	authorId LONG not null primary key,
	name VARCHAR(75) null,
	nationality VARCHAR(75) null
);

create table Library_Book (
	uuid_ VARCHAR(75) null,
	bookId LONG not null primary key,
	title VARCHAR(75) null,
	publicationYear INTEGER,
	authorId LONG
);