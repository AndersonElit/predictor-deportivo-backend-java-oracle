--CREATE TABLE paises (id NUMBER, pais VARCHAR2(150) PRIMARY KEY);

--CREATE TABLE categorias (id NUMBER, division VARCHAR2(150) PRIMARY KEY);

--CREATE TABLE temporadas (id NUMBER, temporada VARCHAR2(150) PRIMARY KEY);

/*
CREATE TABLE ligas (
    id NUMBER,
    liga VARCHAR2(150) PRIMARY KEY,
    pais VARCHAR2(150) NOT NULL,
    categoria VARCHAR2(150) NOT NULL,
    FOREIGN KEY (pais) REFERENCES paises(pais),
    FOREIGN KEY (categoria) REFERENCES categorias(division)
);
*/

/*
CREATE TYPE equipos_varray IS VARRAY (30) OF VARCHAR2(150);
*/

/*
CREATE TABLE equipos (
    id NUMBER,
    liga VARCHAR2(150) NOT NULL,
    pais VARCHAR2(150) NOT NULL,
    temporada VARCHAR2(150) NOT NULL,
    categoria VARCHAR2(150) NOT NULL,
    lista_equipos equipos_varray NOT NULL,
    FOREIGN KEY (pais) REFERENCES paises(pais),
    FOREIGN KEY (liga) REFERENCES ligas(liga),
    FOREIGN KEY (temporada) REFERENCES temporadas(temporada),
    FOREIGN KEY (categoria) REFERENCES categorias(division)
);
*/


/*
CREATE TABLE partidos (
    id NUMBER,
    pais VARCHAR2(150) NOT NULL,
    liga VARCHAR2(150) NOT NULL,
    temporada VARCHAR2(150) NOT NULL,
    categoria VARCHAR2(150) NOT NULL,
    fecha NUMBER NOT NULL,
    local VARCHAR2(150) NOT NULL,
    visitante VARCHAR2(150) NOT NULL,
    goles_local NUMBER NOT NULL,
    goles_visitante NUMBER NOT NULL,
    resultado VARCHAR2(2) NOT NULL,
    marco_goles_local NUMBER NOT NULL,
    recibio_goles_local NUMBER NOT NULL,
    marco_goles_visitante NUMBER NOT NULL,
    recibio_goles_visitantes NUMBER NOT NULL,
    mas15 NUMBER NOT NULL,
    menos15 NUMBER NOT NULL,
    mas25 NUMBER NOT NULL,
    menos25 NUMBER NOT NULL,
    bts NUMBER NOT NULL,
    FOREIGN KEY (pais) REFERENCES paises(pais),
    FOREIGN KEY (liga) REFERENCES ligas(liga),
    FOREIGN KEY (temporada) REFERENCES temporadas(temporada),
    FOREIGN KEY (categoria) REFERENCES categorias(division)
);
*/

/*
CREATE TABLE estadisticas (
    id NUMBER,
    id_partido NUMBER NOT NULL,
    numero_partidos_local NUMBER NOT NULL,
    numero_partidos_visitante NUMBER NOT NULL,
    cs_local NUMBER NOT NULL,
    cs_visitante NUMBER NOT NULL,
    fts_local NUMBER NOT NULL,
    fts_visitante NUMBER NOT NULL,
    mas15_local NUMBER NOT NULL,
    menos15_local NUMBER NOT NULL,
    mas25_local NUMBER NOT NULL,
    menos25_local NUMBER NOT NULL,
    bts_local NUMBER NOT NULL,
    mas15_visitante NUMBER NOT NULL,
    menos15_visitante NUMBER NOT NULL,
    mas25_visitante NUMBER NOT NULL,
    menos25_visitante NUMBER NOT NULL,
    bts_visitante NUMBER NOT NULL,
    partidos_ganados_local NUMBER NOT NULL,
    partidos_empatados_local NUMBER NOT NULL,
    partidos_perdidos_local NUMBER NOT NULL,
    partidos_ganados_visitante NUMBER NOT NULL,
    partidos_empatados_visitante NUMBER NOT NULL,
    partidos_perdidos_visitante NUMBER NOT NULL,
    partidos_ganados_local_total NUMBER NOT NULL,
    partidos_empatados_local_total NUMBER NOT NULL,
    partidos_perdidos_local_total NUMBER NOT NULL,
    partidos_ganados_visitante_total NUMBER NOT NULL,
    partidos_empatados_visitante_total NUMBER NOT NULL,
    partidos_perdidos_visitante_total NUMBER NOT NULL,
    cs_local_total NUMBER NOT NULL,
    cs_visitante_total NUMBER NOT NULL,
    fts_local_total NUMBER NOT NULL,
    fts_visitante_total NUMBER NOT NULL,
    mas15_local_total NUMBER NOT NULL,
    menos15_local_total NUMBER NOT NULL,
    mas25_local_total NUMBER NOT NULL,
    menos25_local_total NUMBER NOT NULL,
    bts_local_total NUMBER NOT NULL,
    mas15_visitante_total NUMBER NOT NULL,
    menos15_visitante_total NUMBER NOT NULL,
    mas25_visitante_total NUMBER NOT NULL,
    menos25_visitante_total NUMBER NOT NULL,
    bts_visitante_total NUMBER NOT NULL
);
*/
