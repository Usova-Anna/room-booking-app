
CREATE TABLE IF NOT EXISTS client(
    client_id serial PRIMARY KEY,
    surname VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(200) NOT NULL,
    role VARCHAR(30) NOT NULL
);


CREATE TABLE IF NOT EXISTS  conf_room(
	room_id serial PRIMARY KEY,
	room_name VARCHAR(50) NOT NULL UNIQUE,
	capacity_max INT NOT NULL,
	chairs INT
);


CREATE TABLE IF NOT EXISTS room_booking(
    booking_id serial PRIMARY KEY,
    client_id INT REFERENCES client(client_id),
    room_id INT REFERENCES conf_room(room_id),
    date_creation TIMESTAMP NOT NULL,
    event_name VARCHAR (200) NOT NULL
);

