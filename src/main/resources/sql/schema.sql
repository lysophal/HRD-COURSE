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

create table users(
	id serial primary key,
	username varchar(100),
	password varchar(200),
	status boolean
);

create table roles(
	id serial primary key,
	role varchar(100),
	status varchar(100)
);

create table users_roles(
	user_id int4 references users(id) on delete cascade,
	role_id int4 references roles(id) on delete cascade
);