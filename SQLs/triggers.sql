/*
CREATE TRIGGER insertar_id_tabla_paises
    BEFORE INSERT ON paises
    FOR EACH ROW
        WHEN (new.id IS NULL)
    BEGIN
        :new.id := seq_tabla_paises.nextval;
END;
*/

/*
CREATE TRIGGER insertar_id_tabla_categorias
    BEFORE INSERT ON categorias
    FOR EACH ROW
        WHEN (new.id IS NULL)
    BEGIN
        :new.id := seq_tabla_categorias.nextval;
END;
*/

/*
CREATE TRIGGER insertar_id_tabla_temporadas
    BEFORE INSERT ON temporadas
    FOR EACH ROW
        WHEN (new.id IS NULL)
    BEGIN
        :new.id := seq_tabla_temporadas.nextval;
END;
*/

/*
CREATE TRIGGER insertar_id_tabla_ligas
    BEFORE INSERT ON ligas
    FOR EACH ROW
        WHEN (new.id IS NULL)
    BEGIN
        :new.id := seq_tabla_ligas.nextval;
END;
*/

/*
CREATE TRIGGER insertar_id_tabla_equipos
    BEFORE INSERT ON equipos
    FOR EACH ROW
        WHEN (new.id IS NULL)
    BEGIN
        :new.id := seq_tabla_equipos.nextval;
END;
*/

/*
CREATE TRIGGER insertar_id_tabla_datos_partidos
    BEFORE INSERT ON datos_partidos
    FOR EACH ROW
        WHEN (new.id IS NULL)
    BEGIN
        :new.id := seq_tabla_partidos.nextval;
END;
*/

/*
CREATE TRIGGER insertar_id_tabla_estadisticas
    BEFORE INSERT ON estadisticas
    FOR EACH ROW
        WHEN (new.id IS NULL)
    BEGIN
        :new.id := seq_tabla_estadisticas.nextval;
END;
*/