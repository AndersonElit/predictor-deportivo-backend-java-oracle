CREATE OR REPLACE PACKAGE pk_operaciones_equipo
IS
    PROCEDURE sp_insertar_equipo(id IN NUMBER, equipo IN VARCHAR2);
    PROCEDURE sp_insertar_equipo_xml(equipos_xml IN VARCHAR2);
    PROCEDURE sp_lista_equipos(cur_equipos OUT sys_refcursor);
END;
/
CREATE OR REPLACE PACKAGE BODY pk_operaciones_equipo
IS
    ----------------------------------------------------------------
    PROCEDURE sp_insertar_equipo(id IN NUMBER, equipo IN VARCHAR2)
    AS
    BEGIN
        INSERT INTO equipos VALUES(id, equipo);
    END;
    
    -----------------------------------------------------------------
    PROCEDURE sp_insertar_equipo_xml(equipos_xml IN VARCHAR2)
    IS
        w_request XMLTYPE := XMLTYPE(equipos_xml);
    BEGIN
    
        FOR r IN (
            SELECT extractvalue(VALUE(p), '/equipo/id/text()') AS id_equipo
                   ,extractvalue(VALUE(p), '/equipo/nombre/text()') AS equipo
            FROM TABLE(xmlsequence(EXTRACT(w_request,'/equipos/equipo'))) p
            ) LOOP 
            INSERT INTO equipos VALUES(TO_NUMBER(r.id_equipo), r.equipo);
        END LOOP;
    END;
    
    -----------------------------------------------------------------
    PROCEDURE sp_lista_equipos(cur_equipos OUT sys_refcursor)
    AS
    BEGIN
        OPEN cur_equipos FOR SELECT * FROM equipos;
    END;
    
END;
