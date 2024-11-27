CREATE TABLE usuario(
    id BIGINT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    NOME VARCHAR(255) NOT NULL,
    EMAIL VARCHAR(255) NOT NULL,
    SENHA VARCHAR(255) NOT NULL,
    PRIMARY KEY(ID)
);

CREATE TABLE produto (
    id BIGINT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    NAME VARCHAR(255) NOT NULL,
    QUANTIDADE BIGINT NOT NULL
);
INSERT INTO produto (name, quantidade) VALUES ('Arroz', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Feijão', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Açúcar', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Maça', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Banana', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Laranja', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Tomate', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Alface', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Whisky', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Cenoura', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Batata', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Linguiça', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Energético', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Abobrinha', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Creme Dental', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Leite em pó', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Café', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Macarrão', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Farinha', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Pimentão', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Carne bovina', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Carne suína', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Cebola', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Leite', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Salame', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Bacon', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Queijo', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Presunto', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Ovo (duzia)', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Óleo de soja', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Água de coco', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Chá gelado', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Achocolatado', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Sucos', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Refrigerante', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Água miner', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Chá', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Cerveja', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Frango', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Desodorante', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Detergente', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Peixe', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Sabão em pó', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Desinfetante', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Sabonete', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Shampoo', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Condicionador', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Vinho', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Fio-Dental', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Esponja', 1000);


CREATE TABLE produto_history (
    id BIGINT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    name VARCHAR(255) NOT NULL,
    QUANTIDADE BIGINT NOT NULL
);