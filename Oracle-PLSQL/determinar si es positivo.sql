SET SERVEROUTPUT ON;

--ERJERCICIO 2
--determinar si un numero entero es positivo, negativo o neutro

DECLARE
    numero NUMBER := 7;
BEGIN
    IF numero > 0 THEN
        dbms_output.put_line('POSITIVO');
    ELSIF numero = 0 THEN
        dbms_output.put_line('NEUTRO');
    ELSE
        dbms_output.put_line('NEGATIVO');
    END IF;
END;