
INSERT INTO equip (id, nom) VALUES (1, 'FC Barcelona');
INSERT INTO equip (id, nom) VALUES (2, 'Real Madrid');

INSERT INTO jugador (id, nom, posicio, equip_id) VALUES (1, 'Ter Stegen', 'porter', 1);
INSERT INTO jugador (id, nom, posicio, equip_id) VALUES (2, 'Araujo', 'defensa', 1);
INSERT INTO jugador (id, nom, posicio, equip_id) VALUES (3, 'Pedri', 'mig', 1);
INSERT INTO jugador (id, nom, posicio, equip_id) VALUES (4, 'Lewandowski', 'davanter', 1);

INSERT INTO jugador (id, nom, posicio, equip_id) VALUES (5, 'Courtois', 'porter', 2);
INSERT INTO jugador (id, nom, posicio, equip_id) VALUES (6, 'Rüdiger', 'defensa', 2);
INSERT INTO jugador (id, nom, posicio, equip_id) VALUES (7, 'Modric', 'mig', 2);
INSERT INTO jugador (id, nom, posicio, equip_id) VALUES (8, 'Vinicius', 'davanter', 2);

INSERT INTO partit (id, data, gols_local, gols_visitant, resultat_local, resultat_visitant, equip_local_id, equip_visitant_id)
VALUES (1, '2025-06-10T20:00:00', 0, 0, 0, 0, 1, 2);
