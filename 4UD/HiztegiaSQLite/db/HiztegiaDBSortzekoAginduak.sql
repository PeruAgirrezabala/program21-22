.open C:\Users\agirrezabala.peru\Documents\programazioa\4UD\HiztegiaSQLite\db
/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  agirrezabala.peru
 * Created: 09-mar-2022
 */
DROP TABLE Terminoak;
CREATE TABLE Terminoak(
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    euskearaz VARCHAR(20),
    gazteleraz VARCHAR(20)
);
INSERT INTO Terminoak VALUES (null, "sagarra", "manzana");
INSERT INTO Terminoak VALUES (euskearaz, gazteleraz) VALUES("madaria", "pera");
INSERT INTO Terminoak VALUES (euskearaz, gazteleraz) VALUES("marrubia", "fresa");

