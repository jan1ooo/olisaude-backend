CREATE TABLE cliente (
    id_cliente BIGINT PRIMARY KEY,
    nome VARCHAR(50),
    sexo sexo,
    id_problema BIGINT NOT NULL,
    data_criacao TIMESTAMP,
    data_autorizacao TIMESTAMP,
    CONSTRAINT fk_cliente_problema FOREIGN KEY (id_cliente) REFERENCES problema_saude(id_problema)
);