BEGIN TRANSACTION;

DROP TABLE IF EXISTS users, crusade_cards CASCADE;

CREATE TABLE users (
	user_id SERIAL,
	username varchar(50) NOT NULL UNIQUE,
	password_hash varchar(200) NOT NULL,
	role varchar(50) NOT NULL,
	CONSTRAINT PK_user PRIMARY KEY (user_id)
	);

CREATE TABLE crusade_cards (
	unit_id SERIAL,
	unit_name varchar(50) NOT NULL UNIQUE,
	unit_type varchar(50) NOT NULL,
	equipment varchar (150),
	enhancements_upgrades varchar(150),
	points_cost INT NOT NULL,
	crusade_points INT NOT NULL,
	experience_points INT,
	model_count INT,
	battles_played INT,
	battles_survived INT,
	units_destroyed INT,
	battle_honors varchar(1000),
	battle_scars varchar(500),
	rank varchar(50)
	);



COMMIT TRANSACTION;