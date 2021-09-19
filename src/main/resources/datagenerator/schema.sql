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

CREATE TABLE ticket_match
(
    id        serial,
    match_id  bigint,
    ticket_id bigint,
    FOREIGN KEY (match_id)
        REFERENCES match (match_id),
    FOREIGN KEY (ticket_id)
        REFERENCES ticket (ticket_id),
    primary key (id)
);