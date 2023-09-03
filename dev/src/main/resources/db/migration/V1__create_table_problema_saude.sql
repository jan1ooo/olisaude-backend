CREATE TABLE problema_saude (
    id_problema SERIAL PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    grau_do_problema BIGINT NOT NULL
);