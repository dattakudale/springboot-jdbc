create table user_detail_demo 
(
	user_id bigint(20) not null auto_increment,
	created_time datetime, email varchar(100), 
	first_name varchar(50), 
	last_name varchar(50), 
	updated_time datetime, 
	primary key (user_id)
);