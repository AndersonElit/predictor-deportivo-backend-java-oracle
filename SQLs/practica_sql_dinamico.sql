--ensayo insertar datos
/*
INSERT INTO tab_ligas (liga) VALUES('premier league');
INSERT INTO tab_temporadas (temporada) VALUES(2018);
INSERT INTO tab_paises (pais) VALUES('england');
*/

--INSERT INTO tab_equipos (pais, temporada, liga, equipos) VALUES ('england', 2018, 'premier league', arr_equipos('liverpool', 'manchester', 'everton', 'leeds'));

SET SERVEROUTPUT ON
DECLARE
    sql_base VARCHAR2(100) := 'INSERT INTO tab_equipos (pais, temporada, liga, equipos) VALUES (:pais, :temporada, :liga, :equipos);';
    pais VARCHAR2(100) := 'england';
    temporada VARCHAR2(100) := 2018;
    liga VARCHAR2(100) := 'premier league';
BEGIN
    -- str1 := SUBSTR(str1, 0, length(str1) - 1);
    str1 := str1 || str2;
    dbms_output.put_line(str1);
END;
