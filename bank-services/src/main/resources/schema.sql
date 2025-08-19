CREATE TABLE IF NOT EXISTS bank (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    city VARCHAR(200) NOT NULL
);

INSERT INTO bank(name, city) VALUES ('Banco de Bogota ', 'Bogota');
INSERT INTO bank(name, city) VALUES ('Banco Itau', 'Bucaramanga');
INSERT INTO bank(name, city) VALUES ('Banco Agrario', 'Duitama');
INSERT INTO bank(name, city) VALUES ('Bancolombia', 'Medellin');
INSERT INTO bank(name, city) VALUES ('AV Villas', 'Tunja');