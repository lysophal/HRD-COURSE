insert into books (id, title, publishDate, author, page, coverImage) values (1,'No Highway','1971-01-13', 'Dr. Clarissa Dibbert', 36,'http://lorempixel.com/35/50/business/');
insert into books (id, title, publishDate, author, page, coverImage) values (2,'Whats Become of Waring','1982-05-08', 'Zander Kub', 78,'http://lorempixel.com/35/50/sports/');
insert into books (id, title, publishDate, author, page, coverImage) values (3,'Where Angels Fear to Tread','1972-06-17', 'Vince Schiller MD', 22,'http://lorempixel.com/35/50/city/');
insert into books (id, title, publishDate, author, page, coverImage) values (4,'Many Waters','1953-05-19', 'Aubrey King DDS', 57,'http://lorempixel.com/35/50/nightlife/');
insert into books (id, title, publishDate, author, page, coverImage) values (5,'A Monstrous Regiment of Women','1978-09-29', 'Lauriane Barton', 94,'http://lorempixel.com/35/50/transport/');
insert into books (id, title, publishDate, author, page, coverImage) values (6,'A Monstrous Regiment of Women','1978-09-29', 'Lauriane Barton', 94,'http://lorempixel.com/35/50/transport/');
insert into books (id, title, publishDate, author, page, coverImage) values (7,'A Monstrous Regiment of Women','1978-09-29', 'Lauriane Barton', 94,'http://lorempixel.com/35/50/transport/');
insert into books (id, title, publishDate, author, page, coverImage) values (8,'A Monstrous Regiment of Women','1978-09-29', 'Lauriane Barton', 94,'http://lorempixel.com/35/50/transport/');
insert into books (id, title, publishDate, author, page, coverImage) values (9,'A Monstrous Regiment of Women','1978-09-29', 'Lauriane Barton', 94,'http://lorempixel.com/35/50/transport/');

insert into publisher(id,name) values(1,'Ly Sophal Printing Shop');
insert into publisher(id,name) values(2,'PHD Udorm Printing Shop');
insert into publisher(id,name) values(3,'Var Dara Printing Shop');
insert into publisher(id,name) values(4,'Keo Tola Printing Shop');
insert into publisher(id,name) values(5,'Keo Mesa Printing Shop');


insert into book_publisher(book_id,publisher_id) values(1,1);
insert into book_publisher(book_id,publisher_id) values(1,2);
insert into book_publisher(book_id,publisher_id) values(2,1);
insert into book_publisher(book_id,publisher_id) values(3,2);
insert into book_publisher(book_id,publisher_id) values(4,3);
insert into book_publisher(book_id,publisher_id) values(5,5);

insert into users(id,username,password,status) values(1,'admin','123',1);
insert into users(id,username,password,status) values(2,'dba','123',1);
insert into users(id,username,password,status) values(3,'user','123',1);

insert into roles(id,role,status) values(1,'ADMIN',1);
insert into roles(id,role,status) values(2,'DBA',1);
insert into roles(id,role,status) values(3,'USER',1);

insert into users_roles(user_id,role_id,) values(1,1);
insert into users_roles(user_id,role_id,) values(2,2);
insert into users_roles(user_id,role_id,) values(3,3);


