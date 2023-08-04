drop database if exists sqldb4web;
create database sqldb4web;
use sqldb4web;
drop table if exists member;
create table member(
	mno_pk int auto_increment,
	mid varchar(30) not null unique,
    mpw varchar(30) not null,
    mname varchar(30) not null,
    mnumber varchar(13) not null unique,
    primary key(mno_pk)
);
select * from member;