SET SERVEROUTPUT ON;

DECLARE
    NUMERO NUMBER := 60;
BEGIN
    IF MOD(NUMERO,5) = 0 AND MOD(NUMERO,3) = 0 THEN
        DBMS_OUTPUT.PUT_LINE('ES DIVISIBLE');
    ELSE 
        DBMS_OUTPUT.PUT_LINE('NO ES DIVISBLE');
    END IF;
END;