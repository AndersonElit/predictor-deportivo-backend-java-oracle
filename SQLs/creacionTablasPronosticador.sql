--CREATE TABLE tab_paises (id NUMBER, pais VARCHAR2(150) PRIMARY KEY);

--CREATE TABLE tab_temporadas (id NUMBER, temporada NUMBER PRIMARY KEY);

/*
CREATE TABLE tab_ligas (
    id NUMBER,
    liga VARCHAR2(100) PRIMARY KEY
);
*/

--CREATE TYPE arr_equipos IS TABLE OF VARCHAR2(100);

/*
CREATE TABLE tab_equipos (
    id NUMBER,
    pais VARCHAR2(100),
    temporada NUMBER,
    liga VARCHAR2(100),
    equipos arr_equipos,
    FOREIGN KEY (pais) REFERENCES tab_paises(pais),
    FOREIGN KEY (temporada) REFERENCES tab_temporadas(temporada),
    FOREIGN KEY (liga) REFERENCES tab_ligas(liga)
)
NESTED TABLE equipos STORE AS ntab_equipos;
*/

--extraer lista equipos:
--SELECT COLUMN_VALUE FROM tab_equipos t1, TABLE(t1.equipos) t2;


