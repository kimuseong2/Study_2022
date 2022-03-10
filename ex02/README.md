create sequence seq_board;

create table tbl_board (
bno number(10,0),
title varchar2(200) not null,
content varchar2(2000) not null,
writer varchar2(50) not null,
regdate date default sysdate,
updatedate date default sysdate
);

alter table tbl_board add constraint pk_board
primary key (bno);

-- DB --
url="jdbc:log4jdbc:oracle:thin:@localhost:1521:XE"
username=BOOK_EX
password=BOOK_EX