SET SERVEROUTPUT ON;
--EJERCICIO
--Dados dos n�meros enteros diferentes, devolver el n�mero mayor

DECLARE
    numero1   NUMBER := 5;
    numero2   NUMBER := 8;
BEGIN
    IF numero1 > numero2 THEN
        dbms_output.put_line(numero1
                             || ' es mayor que '
                             || numero2);
    ELSE
        dbms_output.put_line(numero2
                             || ' es mayor que '
                             || numero1);
    END IF;
END;