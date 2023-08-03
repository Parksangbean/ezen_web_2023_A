# -----------------------------> 테이블 관계 상태 확인 : 메뉴 -> database -> release savepoint
-- 예1 : 1:M 관계 /PK : FK 관계
use sqldb2web1;
drop table if exists memberList2;
create table memberList2(
	mno_pk int, 
	mid varchar(20), 
	mpw varchar(20),
	primary key(mno_pk)	-- 현재 테이블에서  mno_pk 라는 필드를 식별키로 사용 설정
);

drop table if exists boardList2;
CREATE TABLE boardList2(
    bno int,
    btitle varchar(100),
    bcontent longtext,
    bview int,
    bdate datetime,
    mno_fk int,		-- 1. FK 필드 선언
    foreign key(mno_fk) references memberList2(mno_pk)	-- 2. 현재 테이블에서 mno_fk 라는 필드를 외래키로 사용
    # foreign key(mno_fk)				: 'mno_fk' 라는 필드를 FK 필드로 설정
    # references memberList2(mno_pk)	: FK 필드를 memberList2 테이블의 mno_pk 필드와 참조...[관계]
);
/*
   문제5 : 조건
      1) 키오스크 시스템 개발하는데 'sqldb2sys' 라는 이름으로 DB 생성 
        2) 카테고리(category) 와 제품(product) 테이블 2개를  선언 
        3)    카테고리 : 카테고리번호(cno) , 카테고리명(cname)  
         제품 : 제품번호(pno) , 제품명(pname) , 제품가격(pprice) 
         - 필드 타입은 적절한 타입으로 선언 
      4) 두 테이블간 관계 
         - pk필드는 새로 생성하지 않고 pk설정만 하고 fk필드는 선언후 관계 설정한다.
*/
drop database if exists sqldb2sys;
create database sqldb2sys;
use sqldb2sys;
drop table if exists categorie;
create table categorie(
	cno_pk int,
    cname varchar(100),
    primary key(cno_pk)
);
drop table if exists product;
create table product(
	pno_pk int, 
    pname varchar(100) ,
    pprice int,
    cno_fk int,
    primary key(pno_pk),
    foreign key(cno_fk) references categorie(cno_pk)
);


drop database if exists team;
create database team;
use team;
create table 상호(
	호점_pk int,
    전화번호 int,
    primary key(호점_pk)
);
create table 강의실(
	강의실코드_pk int, 
	호수 int,
    수업코드_fk int,
	호점_fk int,
	직원코드_fk int,
    primary key(강의실코드_pk),
    foreign key(호점_fk) references 상호(호점_pk),
    foreign key(수업코드_fk) references 수업(수업코드_pk),
    foreign key(직원코드_fk) references 직원(직원코드_pk)
);
create table 직원(
	직급 varchar(10), 
    이름 varchar(10),
    직원코드_pk int,
    primary key(직원코드_pk)
);
 create table 수업(
	수업코드_pk int,
    수업이름 varchar(10),
	primary key(수업코드_pk)
 );
create table 학생(
	강의실코드_fk int,
    이름 varchar(10),
    학생번호_pk int,
    primary key(학생번호_pk),
    foreign key(강의실코드_fk) references 강의실(강의실코드_pk)
);
create table 출결(
	출결번호_pk int,
    학생번호_fk int,
    출결여부 boolean,
    날짜 datetime,
    primary key(출결번호_pk),
    foreign key(학생번호_fk) references 학생(학생번호_pk)
);


