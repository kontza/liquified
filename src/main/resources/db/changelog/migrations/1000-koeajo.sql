create table if not exists stuff
(
    id
    bigint
    auto_increment,
    name
    varchar
(
    255
));
insert into stuff(name)
values ('hello'),
values ('world');
