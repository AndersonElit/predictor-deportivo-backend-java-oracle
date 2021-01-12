CREATE OR REPLACE PACKAGE pk_operaciones_equipo
IS
    PROCEDURE sp_insertar_equipo(id IN NUMBER, equipo IN VARCHAR2);
    PROCEDURE sp_lista_equipos(cur_equipos OUT sys_refcursor);
END;
/
CREATE OR REPLACE PACKAGE BODY pk_operaciones_equipo
IS
    PROCEDURE sp_insertar_equipo(id IN NUMBER, equipo IN VARCHAR2)
    AS
    BEGIN
        INSERT INTO equipos VALUES(id, equipo);
    END;
    
    PROCEDURE sp_lista_equipos(cur_equipos OUT sys_refcursor)
    AS
    BEGIN
        OPEN cur_equipos FOR SELECT * FROM equipos;
    END;
    
END;
