create index IX_1D6A1D4 on Library_Author (name[$COLUMN_LENGTH:75$]);
create index IX_CD321A3F on Library_Author (uuid_[$COLUMN_LENGTH:75$]);

create index IX_2A67226D on Library_Book (authorId);
create index IX_8C8C89A1 on Library_Book (uuid_[$COLUMN_LENGTH:75$]);