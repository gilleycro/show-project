drop table if exists users;
drop table if exists ticket;
drop table if exists match;

CREATE TABLE users
(
    id    bigint NOT NULL DEFAULT nextval('user_sequence'),
    lname varchar(255),
    fname varchar(255),
    age   int,
    primary key (id)
);


CREATE TABLE ticket
(
    ticket_id     bigint NOT NULL DEFAULT nextval('ticket_sequence'),
    ticket_status varchar(20),
    primary key (ticket_id)

);

CREATE TABLE match
(
    match_id   bigint NOT NULL DEFAULT nextval('match_sequence'),
    status     varchar(20),
    start_time timestamp,
    primary key (match_id)
);

CREATE TABLE ticket_matches
(
    ticket_id bigint,
    match_id bigint,
    constraint ticket_pk primary key (ticket_id, match_id),
    constraint fk_ticket
        foreign key (ticket_id) references ticket(ticket_id),
    constraint fk_match
        foreign key (match_id) references match(match_id)
);

