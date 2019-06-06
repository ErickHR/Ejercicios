SET SERVEROUTPUT ON;

DECLARE
    vocal CHAR := 3;
BEGIN
    IF upper(vocal) in ('A', 'E', 'I', 'O', 'U') THEN
        DBMS_OUTPUT.PUT_LINE('ES VOCAL');
    ELSE
        DBMS_OUTPUT.PUT_LINE('NO ES VOCAL');
    END IF;
END;