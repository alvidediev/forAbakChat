/*
    Файл предназначен для создания новой базы данных при развертывании. Идеальным вариантом было бы подключить
    фреймворк FlyWay для миграций базы...
*/

BEGIN;

drop table if exists users cascade;

create table users(
    id                  int             primary key              not null,
    firstname           varchar                                  not null,
    lastname            varchar                                  not null,
    telephone_number    int                                      not null,
    email               varchar                                  not null
    );

drop table if exists messages cascade;

create table if not exists messages(
    id                  int             primary key              not null,
    message             text                                     not null,
    date_of_message     timestamp                                not null
    );

COMMIT;