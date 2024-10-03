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
INSERT INTO produto (name, quantidade) VALUES ('Farinha de milho', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Azeite de oliva', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Pimenta', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Espinafre', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Pão de forma', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Leite', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Iogurte', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Manteiga', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Maionese', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Mostarda', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Coca-cola', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Pasta de dente', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Requeijão', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Café', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Macarrão', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Farinha de trigo', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Óleo de soja', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Sal', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Cebola', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Batata', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Cenoura', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Tomate', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Alface', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Queijo mussarela', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Presunto', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Ovo', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Ket-chup', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Requeijão', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Chá (mate)', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Achocolatado', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Suco de laranja', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Refrigerante', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Água miner', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Sabão em pó', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Detergente', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Amaciante', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Frango (peito)', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Carne bovina (filé)', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Carne suína (lombo)', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Peixe (salmão)', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Atum enlatado', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Sardinha enlatada', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Milho enlatado', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Ervilha enlatada', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Feijão enlatado', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Molho de tomate', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Fio-Dental', 1000);
INSERT INTO produto (name, quantidade) VALUES ('Papel higiênico', 1000);


CREATE TABLE produto_history (
    id BIGINT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    name VARCHAR(255) NOT NULL,
    QUANTIDADE BIGINT NOT NULL
);