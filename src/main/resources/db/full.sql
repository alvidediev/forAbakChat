/*
    Файл предназначен для создания новой базы данных при развертывании. Идеальным вариантом было бы подключить
    фреймворк FlyWay для миграций базы...
*/

BEGIN;

drop table if exists users cascade;

create table users(
    id                  serial             primary key           not null,
    firstname           varchar                                  not null,
    lastname            varchar                                  not null,
    telephone_number    bigint                                   not null,
    email               varchar                                  not null
    );

drop table if exists messages cascade;

create table if not exists messages(
    id                  serial             primary key           not null,
    message             varchar                                  not null,
    date_of_message     timestamp                                not null
    );

COMMIT;