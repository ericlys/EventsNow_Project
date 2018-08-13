create database eventsnow;

use eventsnow;

create table  users (username varchar(50) not null, email varchar(50) primary key,
 curse varchar(50) not null, institute varchar(50) not null, password varchar(50)not null); 
 
 
create table  events (id int primary key auto_increment, title varchar(50), startdate date, finaldate date, theme varchar(50),
 latitude float, longitude float, address varchar(250), mail_user varchar(50), constraint mail_user foreign key (mail_user) references users(email));
 
 
