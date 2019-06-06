SET SERVEROUTPUT ON;

DECLARE
    numero1   NUMBER := 15;
    numero2   NUMBER := 17;
    numero3   NUMBER := 18;
BEGIN
    IF numero1 > numero2 THEN
        IF numero2 > numero3 THEN
            dbms_output.put_line(numero1 || ' ' || numero2 || ' ' || numero3);

        ELSE
            IF numero1 > numero3 THEN
                dbms_output.put_line(numero1 || ' ' || numero3 || ' ' || numero2);
            ELSE
                dbms_output.put_line(NUMERO3 || ' ' || numero1 || ' ' || numero2);
            END IF;
        END IF;

    ELSE
        IF numero1 > numero3 THEN
            dbms_output.put_line(numero2 || ' ' || numero1 || ' ' || numero3);
        ELSE
            IF numero2 > numero3 THEN
                dbms_output.put_line(numero2 || ' ' || numero3 || ' ' || numero1);
            ELSE
                dbms_output.put_line(numero3 || ' ' || numero2 || ' ' || numero1);
            END IF;
        END IF;
    END IF;
END;


--------------------------------------------------------------

DECLARE
    numero1   NUMBER := 18;
    numero2   NUMBER := 16;
    numero3   NUMBER := 20;
    mayor     NUMBER;
    medio     NUMBER;
    menor     NUMBER;
BEGIN
    IF numero1 > numero2 AND numero1 > numero3 THEN
        mayor := numero1;
    ELSIF numero2 > numero3 THEN
        mayor := numero2;
    ELSE
        mayor := numero3;
    END IF;

    IF numero1 < numero2 AND numero1 < numero3 THEN
        menor := numero1;
    ELSIF numero2 < NUMERO3 THEN
        menor := numero2;
    ELSE
        menor := NUMERO3;
    END IF;

    medio := numero1 + numero2 + numero3 - ( mayor + menor );
    DBMS_OUTPUT.PUT_LINE(MAYOR || ' ' || MEDIO || ' ' || MENOR);
END;