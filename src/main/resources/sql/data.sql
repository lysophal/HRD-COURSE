insert into books (id, title, publishDate, author, page, coverImage) values (1,'No Highway','1971-01-13', 'Dr. Clarissa Dibbert', 36,'http://lorempixel.com/35/50/business/');
insert into books (id, title, publishDate, author, page, coverImage) values (2,'Whats Become of Waring','1982-05-08', 'Zander Kub', 78,'http://lorempixel.com/35/50/sports/');
insert into books (id, title, publishDate, author, page, coverImage) values (3,'Where Angels Fear to Tread','1972-06-17', 'Vince Schiller MD', 22,'http://lorempixel.com/35/50/city/');
insert into books (id, title, publishDate, author, page, coverImage) values (4,'Many Waters','1953-05-19', 'Aubrey King DDS', 57,'http://lorempixel.com/35/50/nightlife/');
insert into books (id, title, publishDate, author, page, coverImage) values (5,'A Monstrous Regiment of Women','1978-09-29', 'Lauriane Barton', 94,'http://lorempixel.com/35/50/transport/');
insert into books (id, title, publishDate, author, page, coverImage) values (6,'Consider the Lilies','1983-04-15', 'Twila Krajcik', 36,'http://lorempixel.com/35/50/nature/');
insert into books (id, title, publishDate, author, page, coverImage) values (7,'Consider the Lilies','1971-04-20', 'Sandra Stamm', 23,'http://lorempixel.com/35/50/technics/');
insert into books (id, title, publishDate, author, page, coverImage) values (8,'Some Buried Caesar','1970-04-30', 'Mr. Sabrina Mills', 67,'http://lorempixel.com/35/50/food/');
insert into books (id, title, publishDate, author, page, coverImage) values (9,'The Yellow Meads of Asphodel','1966-10-18', 'Eliza Bartell', 88,'http://lorempixel.com/35/50/people/');
insert into books (id, title, publishDate, author, page, coverImage) values (10,'For a Breath I Tarry','1974-12-14', 'Dr. Althea Pfeffer', 32,'http://lorempixel.com/35/50/people/');

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
insert into book_publisher(book_id,publisher_id) values(2,1);
insert into book_publisher(book_id,publisher_id) values(3,2);
insert into book_publisher(book_id,publisher_id) values(4,3);
insert into book_publisher(book_id,publisher_id) values(5,5);
insert into book_publisher(book_id,publisher_id) values(6,1);
insert into book_publisher(book_id,publisher_id) values(7,1);
insert into book_publisher(book_id,publisher_id) values(8,2);
insert into book_publisher(book_id,publisher_id) values(9,3);
insert into book_publisher(book_id,publisher_id) values(10,5);