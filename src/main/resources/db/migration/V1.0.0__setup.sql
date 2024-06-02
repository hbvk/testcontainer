create table hello
(
    id      serial primary key,
    message text
);

insert into hello(message)
values ('Hello world!');