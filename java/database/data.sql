BEGIN TRANSACTION;

INSERT INTO users (username,password_hash,role) VALUES ('user','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER');
INSERT INTO users (username,password_hash,role) VALUES ('admin','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_ADMIN');

--TEST DATA
INSERT INTO crusade_cards (unit_name, unit_type, equipment, enhancements_upgrades, points_cost, crusade_points
experience_points, model_count, battles_played, battles_survived, units_destroyed, battle_honors, battle_scars,
rank)
VALUES ('Grand Vizier Mahkret', 'Plasmancer', 'Plasmic Lance', 'Dimensional Sanctum', 75, 2, 8, 1, 2, 1, 2,
'Trait - Endless Legions. Relic - Godpyre Mantle', 'Blooded');

COMMIT TRANSACTION;
