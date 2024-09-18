CREATE TABLE usuario(
    id BIGINT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    NOME VARCHAR(255) NOT NULL,
    EMAIL VARCHAR(255) NOT NULL,
    SENHA VARCHAR(255) NOT NULL,
    PRIMARY KEY(ID)
);

CREATE TABLE produto (
    id BIGINT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    NOME VARCHAR(255) NOT NULL,
    QUANTIDADE BIGINT NOT NULL
);
INSERT INTO produto (nome, quantidade) VALUES ('Arroz', 50);
INSERT INTO produto (nome, quantidade) VALUES ('Feijão', 50);
INSERT INTO produto (nome, quantidade) VALUES ('Açúcar', 50);
INSERT INTO produto (nome, quantidade) VALUES ('Farinha de milho', 50);
INSERT INTO produto (nome, quantidade) VALUES ('Azeite de oliva', 50);
INSERT INTO produto (nome, quantidade) VALUES ('Pimenta', 50);
INSERT INTO produto (nome, quantidade) VALUES ('Espinafre', 50);
INSERT INTO produto (nome, quantidade) VALUES ('Pão de forma', 50);
INSERT INTO produto (nome, quantidade) VALUES ('Leite', 50);
INSERT INTO produto (nome, quantidade) VALUES ('Iogurte', 50);
INSERT INTO produto (nome, quantidade) VALUES ('Manteiga', 50);
INSERT INTO produto (nome, quantidade) VALUES ('Maionese', 50);
INSERT INTO produto (nome, quantidade) VALUES ('Mostarda', 50);
INSERT INTO produto (nome, quantidade) VALUES ('Coca-cola', 50);
INSERT INTO produto (nome, quantidade) VALUES ('Pasta de dente', 50);
INSERT INTO produto (nome, quantidade) VALUES ('Requeijão', 50);
INSERT INTO produto (nome, quantidade) VALUES ('Café', 50);
INSERT INTO produto (nome, quantidade) VALUES ('Macarrão', 50);
INSERT INTO produto (nome, quantidade) VALUES ('Farinha de trigo', 50);
INSERT INTO produto (nome, quantidade) VALUES ('Óleo de soja', 50);
INSERT INTO produto (nome, quantidade) VALUES ('Sal', 50);
INSERT INTO produto (nome, quantidade) VALUES ('Cebola', 50);
INSERT INTO produto (nome, quantidade) VALUES ('Batata', 50);
INSERT INTO produto (nome, quantidade) VALUES ('Cenoura', 50);
INSERT INTO produto (nome, quantidade) VALUES ('Tomate', 50);
INSERT INTO produto (nome, quantidade) VALUES ('Alface', 50);
INSERT INTO produto (nome, quantidade) VALUES ('Queijo mussarela', 50);
INSERT INTO produto (nome, quantidade) VALUES ('Presunto', 50);
INSERT INTO produto (nome, quantidade) VALUES ('Ovo', 50);
INSERT INTO produto (nome, quantidade) VALUES ('Ket-chup', 50);
INSERT INTO produto (nome, quantidade) VALUES ('Requeijão', 50);
INSERT INTO produto (nome, quantidade) VALUES ('Chá (mate)', 50);
INSERT INTO produto (nome, quantidade) VALUES ('Achocolatado', 50);
INSERT INTO produto (nome, quantidade) VALUES ('Suco de laranja', 50);
INSERT INTO produto (nome, quantidade) VALUES ('Refrigerante', 50);
INSERT INTO produto (nome, quantidade) VALUES ('Água miner', 50);
INSERT INTO produto (nome, quantidade) VALUES ('Sabão em pó', 50);
INSERT INTO produto (nome, quantidade) VALUES ('Detergente', 50);
INSERT INTO produto (nome, quantidade) VALUES ('Amaciante', 50);
INSERT INTO produto (nome, quantidade) VALUES ('Frango (peito)', 50);
INSERT INTO produto (nome, quantidade) VALUES ('Carne bovina (filé)', 50);
INSERT INTO produto (nome, quantidade) VALUES ('Carne suína (lombo)', 50);
INSERT INTO produto (nome, quantidade) VALUES ('Peixe (salmão)', 50);
INSERT INTO produto (nome, quantidade) VALUES ('Atum enlatado', 50);
INSERT INTO produto (nome, quantidade) VALUES ('Sardinha enlatada', 50);
INSERT INTO produto (nome, quantidade) VALUES ('Milho enlatado', 50);
INSERT INTO produto (nome, quantidade) VALUES ('Ervilha enlatada', 50);
INSERT INTO produto (nome, quantidade) VALUES ('Feijão enlatado', 50);
INSERT INTO produto (nome, quantidade) VALUES ('Molho de tomate', 50);
INSERT INTO produto (nome, quantidade) VALUES ('Ketchup', 50);
INSERT INTO produto (nome, quantidade) VALUES ('Papel higiênico', 50);
