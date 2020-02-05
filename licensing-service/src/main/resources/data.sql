CREATE TABLE IF NOT EXISTS Licenses (
id identity,
license_name varchar(25)
);

INSERT INTO Licenses (id, license_name) VALUES
  (1, 'Spring'),
  (2, 'IntelliJ IDEA'),
  (3, 'Java');