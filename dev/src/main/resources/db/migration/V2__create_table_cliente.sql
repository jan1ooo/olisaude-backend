CREATE TABLE cliente (
    id_cliente SERIAL PRIMARY KEY,
    nome VARCHAR(50),
    sexo VARCHAR(9),
    id_problema SERIAL NOT NULL,
    data_criacao TIMESTAMP,
    data_autorizacao TIMESTAMP,
    CONSTRAINT fk_cliente_problema FOREIGN KEY (id_cliente) REFERENCES problema_saude(id_problema)
);