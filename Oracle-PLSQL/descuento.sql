SET SERVEROUTPUT ON;
-- un restaurante ofrece un descuento del 10% para consumos de hasta $100.00 y un descuento del 20% para consumos mayores.
-- En ambos casos se aplica un impuesto del 19%.
-- Determinar el monto del descuento, el impuesto y el importe a pagar.

DECLARE
    MONTO NUMBER := 1000;
    IMPORTE NUMBER;
    DESCUENTO NUMBER;
BEGIN
    IF MONTO > 0 AND MONTO <= 100 THEN
        DESCUENTO := MONTO * 0.1;
    ELSE
        DESCUENTO := MONTO * 0.2;
    END IF;
    IMPORTE := (MONTO - DESCUENTO) * 0.19;
    MONTO := MONTO -descuento + IMPORTE;
    DBMS_OUTPUT.PUT_LINE(MONTO);
END;
