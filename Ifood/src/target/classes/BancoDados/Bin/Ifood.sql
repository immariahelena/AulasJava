CREATE DATABASE IF NOT EXISTS ifood;
USE ifood;

CREATE TABLE endereco (
                          id INT AUTO_INCREMENT PRIMARY KEY,
                          rua VARCHAR(100) NOT NULL,
                          bairro VARCHAR(50) NOT NULL,
                          numero VARCHAR(10),
                          cidade VARCHAR(50) NOT NULL,
                          estado VARCHAR(30) NOT NULL,
                          ponto_referencia VARCHAR(100),
                          complemento VARCHAR(100),
                          cep VARCHAR(9) NOT NULL,
                          tipo_endereco ENUM('casa', 'apartamento', 'comercial') NOT NULL
);

CREATE TABLE categoria (
                           id INT AUTO_INCREMENT PRIMARY KEY,
                           nome VARCHAR(50) NOT NULL,
                           descricao TEXT,
                           tipo_categoria ENUM('restaurante', 'produto') NOT NULL
);

CREATE TABLE restaurante (
                             id INT AUTO_INCREMENT PRIMARY KEY,
                             nome VARCHAR(60) NOT NULL,
                             telefone VARCHAR(15),
                             hora_abertura TIME,
                             hora_fechamento TIME,
                             id_endereco INT NOT NULL,
                             aceita_retirada BOOLEAN DEFAULT FALSE,
                             id_categoria INT NOT NULL,
                             valor_minimo_entrega DECIMAL(10, 2),
                             FOREIGN KEY (id_endereco) REFERENCES endereco(id),
                             FOREIGN KEY (id_categoria) REFERENCES categoria(id)
);

CREATE TABLE produto (
                         id INT AUTO_INCREMENT PRIMARY KEY,
                         nome VARCHAR(60) NOT NULL,
                         preco DECIMAL(10, 2) NOT NULL,
                         id_categoria INT NOT NULL,
                         id_restaurante INT NOT NULL,
                         FOREIGN KEY (id_categoria) REFERENCES categoria(id),
                         FOREIGN KEY (id_restaurante) REFERENCES restaurante(id)
);

CREATE TABLE promocao (
                          id INT AUTO_INCREMENT PRIMARY KEY,
                          nome VARCHAR(60) NOT NULL,
                          codigo VARCHAR(30) UNIQUE NOT NULL,
                          desconto DECIMAL(10, 2) NOT NULL,
                          validade DATE NOT NULL,
                          tipo ENUM('percentual', 'valor_fixo') NOT NULL
);

CREATE TABLE acompanhamento (
                                id INT AUTO_INCREMENT PRIMARY KEY,
                                nome VARCHAR(50) NOT NULL,
                                descricao TEXT,
                                valor DECIMAL(10, 2)
);

CREATE TABLE produto_acompanhamento (
                                        id_produto INT NOT NULL,
                                        id_acompanhamento INT NOT NULL,
                                        PRIMARY KEY (id_produto, id_acompanhamento),
                                        FOREIGN KEY (id_produto) REFERENCES produto(id),
                                        FOREIGN KEY (id_acompanhamento) REFERENCES acompanhamento(id)
);

CREATE TABLE forma_pagamento (
                                 id INT AUTO_INCREMENT PRIMARY KEY,
                                 forma VARCHAR(50) NOT NULL UNIQUE
);

CREATE TABLE restaurante_pagamento (
                                       id_restaurante INT NOT NULL,
                                       id_forma_pagamento INT NOT NULL,
                                       PRIMARY KEY (id_restaurante, id_forma_pagamento),
                                       FOREIGN KEY (id_restaurante) REFERENCES restaurante(id),
                                       FOREIGN KEY (id_forma_pagamento) REFERENCES forma_pagamento(id)
);

CREATE TABLE historico_pagamento (
                                     id INT AUTO_INCREMENT PRIMARY KEY,
                                     data_pagamento DATE NOT NULL,
                                     id_forma_pagamento INT NOT NULL,
                                     valor DECIMAL(10, 2) NOT NULL,
                                     FOREIGN KEY (id_forma_pagamento) REFERENCES forma_pagamento(id)
);

CREATE TABLE status_entrega (
                                id INT AUTO_INCREMENT PRIMARY KEY,
                                nome VARCHAR(50) NOT NULL UNIQUE
);

CREATE TABLE pedido (
                        id INT AUTO_INCREMENT PRIMARY KEY,
                        data_pedido DATE NOT NULL,
                        id_restaurante INT NOT NULL,
                        valor_total DECIMAL(10, 2) NOT NULL,
                        taxa_entrega DECIMAL(10, 2),
                        id_promocao INT,
                        id_forma_pagamento INT NOT NULL,
                        observacoes TEXT,
                        troco DECIMAL(10, 2),
                        id_status_entrega INT NOT NULL,
                        id_endereco INT NOT NULL,
                        FOREIGN KEY (id_restaurante) REFERENCES restaurante(id),
                        FOREIGN KEY (id_promocao) REFERENCES promocao(id),
                        FOREIGN KEY (id_forma_pagamento) REFERENCES forma_pagamento(id),
                        FOREIGN KEY (id_status_entrega) REFERENCES status_entrega(id),
                        FOREIGN KEY (id_endereco) REFERENCES endereco(id)
);

CREATE TABLE historico_entrega (
                                   id INT AUTO_INCREMENT PRIMARY KEY,
                                   id_status_entrega INT NOT NULL,
                                   id_pedido INT NOT NULL,
                                   data_hora DATETIME NOT NULL,
                                   FOREIGN KEY (id_status_entrega) REFERENCES status_entrega(id),
                                   FOREIGN KEY (id_pedido) REFERENCES pedido(id)
);

CREATE TABLE avaliacao (
                           id INT AUTO_INCREMENT PRIMARY KEY,
                           nota INT CHECK (nota BETWEEN 1 AND 5),
                           comentario TEXT,
                           id_pedido INT NOT NULL,
                           FOREIGN KEY (id_pedido) REFERENCES pedido(id)
);

CREATE TABLE pedido_produto (
                                id INT AUTO_INCREMENT PRIMARY KEY,
                                id_pedido INT NOT NULL,
                                id_produto INT NOT NULL,
                                quantidade INT NOT NULL,
                                FOREIGN KEY (id_pedido) REFERENCES pedido(id),
                                FOREIGN KEY (id_produto) REFERENCES produto(id)
);

CREATE TABLE pedido_produto_acompanhamento (
                                               id_pedido_produto INT NOT NULL,
                                               id_acompanhamento INT NOT NULL,
                                               PRIMARY KEY (id_pedido_produto, id_acompanhamento),
                                               FOREIGN KEY (id_pedido_produto) REFERENCES pedido_produto(id),
                                               FOREIGN KEY (id_acompanhamento) REFERENCES acompanhamento(id)
);
