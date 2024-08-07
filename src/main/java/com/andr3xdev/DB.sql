-- Tables
CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    name VARCHAR(40) NOT NULL,
    password VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL UNIQUE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE itemsXusers (
    id SERIAL PRIMARY KEY,
    user_id INT NOT NULL,
    item_id INT NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE items (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    description VARCHAR(50) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    reclaimed BOOLEAN DEFAULT FALSE,
    reclaimed_at TIMESTAMP DEFAULT null,
    found BOOLEAN DEFAULT FALSE,
    finder_id INT,
    publisher_id INT
);

CREATE TABLE sports (
    item_id INT PRIMARY KEY,
    type VARCHAR(50) not null ,
    brand VARCHAR(50),
    size VARCHAR(50),
    color VARCHAR(50)
);

CREATE TABLE clothes (
    item_id INT PRIMARY KEY,
    type VARCHAR(50) not null ,
    brand VARCHAR(50),
    size VARCHAR(50),
    color VARCHAR(50)
);

CREATE TABLE cards (
    item_id INT PRIMARY KEY,
    type VARCHAR(50) not null ,
    owner VARCHAR(50),
    company VARCHAR(50)
);

CREATE TABLE technologys (
    item_id INT PRIMARY KEY,
    type VARCHAR(50) not null ,
    brand VARCHAR(50),
    model VARCHAR(50)
);


-- Foraing keys
ALTER TABLE itemsXusers
ADD CONSTRAINT fk_itemsXusers
FOREIGN KEY (user_id) REFERENCES items(id);

ALTER TABLE itemsXusers
ADD CONSTRAINT fk_usersXitems
FOREIGN KEY (item_id) REFERENCES users(id);

ALTER TABLE items
ADD CONSTRAINT fk_items_finder
FOREIGN KEY (id) REFERENCES users(id);

ALTER TABLE items
ADD CONSTRAINT fk_items_publisher
FOREIGN KEY (id) REFERENCES users(id);


-- Foraing keys for items types
ALTER TABLE sports
ADD CONSTRAINT fk_sports
FOREIGN KEY (item_id) REFERENCES items(id);

ALTER TABLE clothes
ADD CONSTRAINT fk_clothes
FOREIGN KEY (item_id) REFERENCES items(id);

ALTER TABLE cards
ADD CONSTRAINT fk_cards
FOREIGN KEY (item_id) REFERENCES items(id);

ALTER TABLE technologys
ADD CONSTRAINT fk_technologys
FOREIGN KEY (item_id) REFERENCES items(id);

-- TEST DATA
