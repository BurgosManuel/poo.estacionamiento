/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  mburgos
 * Created: Aug 26, 2026
 */

CREATE TABLE ticket (
    id INT PRIMARY KEY AUTO_INCREMENT, 
    patente VARCHAR(15),
    tipo_vehiculo VARCHAR(20),
    hora_ingreso DATETIME,
    hora_salida DATETIME,
    cantidad_horas INT,
    total DECIMAL(10,2)
);