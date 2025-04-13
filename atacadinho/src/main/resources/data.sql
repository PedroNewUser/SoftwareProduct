CREATE TABLE usuario(
    id BIGINT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    NOME VARCHAR(255) NOT NULL,
    EMAIL VARCHAR(255) NOT NULL,
    SENHA VARCHAR(255) NOT NULL,
    PRIMARY KEY(ID)
);

CREATE TABLE produto (
        id BIGINT AUTO_INCREMENT PRIMARY KEY NOT NULL,
        name VARCHAR(255) NOT NULL,
        categoria VARCHAR(255) NOT NULL,
        quantidade BIGINT NOT NULL,
        valor DECIMAL(10,2) NOT NULL
);

CREATE TABLE produto_history (
    id BIGINT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    name VARCHAR(255) NOT NULL,
    quantidade BIGINT NOT NULL,
    valor DECIMAL(10,2) NOT NULL
);

CREATE TABLE adminUser (
    id BIGINT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    email VARCHAR(255) NOT NULL,
    senha VARCHAR(255) NOT NULL,
);
