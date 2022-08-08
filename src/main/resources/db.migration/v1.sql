create table if not exists users(
    id                  int             primary key              not null,
    firstname           varchar                                  not null,
    lastname            varchar                                  not null,
    telephone_number    int                                      not null,
    email               varchar                                  not null
    );

create table if not exists messages(
    id                  int             primary key              not null,
    message             text                                     not null,
    date_of_message     timestamp                                not null
    );