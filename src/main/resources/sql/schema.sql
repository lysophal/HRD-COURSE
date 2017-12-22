create table books(
	id serial primary key,
	title varchar(200),
	publishDate varchar(200),
	author varchar(200),
	page int4,
	coverImage varchar(200)
);

create table publisher(id serial primary key,name varchar(100));

create table book_publisher(
	book_id int4 references books(id) on delete cascade,
	publisher_id int4 references publisher(id) on delete cascade
);