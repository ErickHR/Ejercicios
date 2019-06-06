SET SERVEROUTPUT ON;

DECLARE
    numero1   NUMBER := 4;
    numero2   NUMBER := 5;
    numero3   NUMBER := 3;
BEGIN
    IF numero1 > numero2 THEN
        IF numero1 > numero3 THEN
            DBMS_OUTPUT.PUT_LINE('MAYOR: ' || numero1);
        ELSE
            DBMS_OUTPUT.PUT_LINE('MAYOR: ' || numero3);
        END IF;

    ELSE
        IF numero2 > numero3 THEN
            DBMS_OUTPUT.PUT_LINE('MAYOR: ' || numero2);
        ELSE
            DBMS_OUTPUT.PUT_LINE('MAYOR: ' || numero3);
        END IF;
    END IF;
END;