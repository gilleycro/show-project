-- USERS
INSERT INTO users (age, fname, lname)
VALUES (20, 'Marc', 'Nowicky');

-- MATCHES
INSERT INTO match (status, start_time)
values ('UNKNOWN', (NOW() + INTERVAL '1 YEAR')),
       ('UNKNOWN', (NOW() + INTERVAL '1 YEAR')),
       ('LOSING', (NOW() - INTERVAL '5 MINUTES')),
       ('WINNING', (NOW() - INTERVAL '1 MONTH'));