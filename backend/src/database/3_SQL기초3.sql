- 제약조건
			1. pk	: primary key(pk필드명)
				- 기본키[식별키] : 식별가능한 필드, 중복x , nullx , 공백x , 테이블1당 1개 이상 권장
				- 예) 학번 , 사번 , 주민등록번호 ,  상호코드 등등
                - 다른테이블의 필드에서 해당 PK필드를 참조 당한다.
                -not null + unlock = primary key
                
            2. fk	: foreign key(fk필드명) referances pk테이블명(pk필드명) [ 선택 옵션 ]
				-외래키 [참조키]
					-예) 점수테이블(접수자) , 출결(출근한사번), 각종서류(주민등륵번호) , 대여(ISBM) , 재고관리(상호코드)
			3. auto_increment		: insert(삽입) 할때 해당 필드를 생략하면 자동번호 부여 [ 자동으로 1씩 증가]
				*auto_increment 사용할려면 무조건 pk필드 이면서 만 가능
			4.not null				: insert(삽입) 할때 해당 필드의 공백 방지
            5. unlock				: insert(삽입) 할때 해당 필드의 값 중복 방지
            6. default				: insert(삽입) 할때 해당 필드의 값 생략하면 자동으로 대입되는 기본값
				default 0
                default now()
                default '문자열'
			
		-SQL 함수
			1. now() 	: 현재날짜/시간 반환해주는 함수



# ----------------------------------------------------------------------------------------- #
drop database if exists sqldb3web;
create database sqldb3web;
use sqldb3web;
# 예제 변경될때
drop table if exists member1;
create table member1(mno_pk int auto_increment, mid varchar(10) , primary key(mno_pk));
select * from member1;				#반복!!!! : 확인용
#------------------------------
# * 테이블에 레코드/행 추가하기 .	
		#1.	[ insert into 테이블명 values(값1 , 값2 , 값3) ]  # 모든 필드에 값 추가할때
		#2.	insert into 테이블명(필드명1, 필듬여2) values(값1 , 값2)
insert into member1 values( 1 ); 	-- mebmer1 테이블에 mno필드에 1 추가
insert into member1 values(1 , '유재석');	-- 직접 데이터 입력할경우 문자/날짜 입력시 ' '
insert into member1 values(1 , '유재석'); -- mno pk필드 이므로 중복방지해서 오류 발생
# 예3)
insert into member1 values(1 , '유재석'); 		-- 가능
insert into member1 values('유재석'); 			-- 오류 '유재석' 데이터를 어떤 필드에 넣을지 식별 불가능
insert into member1(mid) values('유재석'); 		-- 오류방안 : 특정 필드에만 데이터 삽입할경우 테이블명(필드명제시);
create table member1(
mno_pk int auto_increment, 
mid varchar(10) not null unique , 
memail varchar(20), 
primary key(mno_pk)
);
# 예4 ) not null : 해당 필드에 값이 무조건 존재해야되는 경우에 사용
insert into member1(mid,memail) values('유재석', 'sstonm9861@naver.com');
insert into member1(mid) values('강호동');	-- 삽입시 필드 생략하면 생략된 필드는 null 대입
drop table if exists member1;
select * from member1;
insert into member1(memail) values('qwe@com'); -- 오류 : mid 필드는 not null 제약조건을 사용했으므로 무조건 값 대입	
insert into member1(mid) values('유재석');
insert into member1(mid) values('유재석');

create table member1(
mno_pk int auto_increment, 							-- 회원번호 [ pk , 자동번호 부여]
mid varchar(10) not null unique , 					-- 회원아이디 [ 공백x , 중복x]
memail varchar(20) not null unique,					-- 회원이메일 [ 공백x , 중복x]
mpoint int not null default 1000,						-- 회원포인트 [ 공백x 기본값 0]				-- 회원가입시 입력하는 사항x
mdate datetime not null default now(),				-- 회원가입일 [ 공백x , 기본값 현재날짜/시간]
mreceive boolean not null default true, 			-- 회원이메일수신여부 [ 공백x , 기본값 true]		-- 
mimg varchar(1000) not null default '기본프로필.jpg',	-- 회원프로필사진 [공백 x, 기본값 '기본프로필']
primary key(mno_pk)									-- pk 설정
);
# 예6)
drop table if exists member1;
select * from member1;
insert into member1(mid , memail) values ('유재석', 'qwe@com');
insert into member1(mid , memail, mpoint) values ('강호동', 'qw1e@com', 1000);
insert into member1(mid , memail, mpoint,mdate) values ('유석', 'we@com',1000,'2023-08-03 12:10:10');
insert into member1(mid , memail , mpoint , mdate , mreceive)
					values('하하','cre@nc',1000,'2023-08-03 12:15:10',false);
                    insert into member1(mid , memail , mpoint , mdate , mreceive, mimg)
					values('서장훈','cre2@nc',10002,'2023-08-03 12:12:10',false , '증명사진.jpg');
insert into member1(mid , memail , mimg) values('김희철', 'vadf@com', '김희철증명사진.jpg');





