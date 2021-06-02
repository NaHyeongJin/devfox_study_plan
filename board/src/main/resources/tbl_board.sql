create sequence seq_board;
create table tbl_board (
    bno number(10, 0),
    title varchar2(200) not null,
    content varchar2(2000) not null,
    writer varchar2(50) not null,
    regdate date default sysdate,
    updatedate date default sysdate,
    replycnt number(10, 0) DEFAULT 0
);
alter table tbl_board
add constraint pk_board primary key(bno);
insert into tbl_board(bno, title, content, writer)
values (SEQ_BOARD.nextval, '테스트 제목', '테스트 내용', 'user00');
commit;