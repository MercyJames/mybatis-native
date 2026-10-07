create table tb_user(
    id integer not null,
    user_id varchar(40) not null,
    reality_name varchar(20) not null,
    mobile varchar(11) not null,
    primary key (id)
) ;

insert into tb_user(id, user_id, reality_name, mobile) values (1,'James','James.S.Lee','13913722185') ;