USE [6BI_N2]
GO

CREATE TABLE [IMAGEM] (
  [id_imagem] int PRIMARY KEY IDENTITY(1, 1),
  [blob_imagem] varchar(255) NOT NULL,
  [nome_arquivo] varchar(255) UNIQUE NOT NULL,
  [extensao] varchar(20) NOT NULL,
  [data_criacao] datetime NOT NULL
)
GO

CREATE TABLE [COMENTARIO] (
  [id_comentario] int PRIMARY KEY IDENTITY(1, 1),
  [titulo] varchar(80) NOT NULL,
  [texto] varchar(255) NOT NULL,
  [estrelas] int NOT NULL
)
GO

CREATE TABLE [USUARIO] (
  [id_usuario] int PRIMARY KEY IDENTITY(1, 1),
  [usuario] varchar(255) NOT NULL,
  [senha] varchar(255) NOT NULL,
  [email] varchar(255) NOT NULL,
  [telefone] varchar(255) NOT NULL,
  [data_nascimento] datetime NOT NULL,
  [privilegio_administrador] bit NOT NULL DEFAULT (0)
)
GO

CREATE TABLE [ENDERECO] (
  [id_endereco] int PRIMARY KEY IDENTITY(1, 1),
  [id_usuario] int NOT NULL,
  [endereco] varchar(255) NOT NULL,
  [bairro] varchar(255) NOT NULL,
  [cidade] varchar(255) NOT NULL,
  [uf] varchar(2) NOT NULL
)
GO

CREATE TABLE [CLIENTE] (
  [id_cliente] int PRIMARY KEY IDENTITY(1, 1),
  [id_usuario] int NOT NULL,
  [nome] varchar(255) NOT NULL,
  [cpf] varchar(15) NOT NULL,
  [id_endereco] int NOT NULL,
  [passe_vip] bit NOT NULL DEFAULT (0)
)
GO

CREATE TABLE [ENTREGADOR] (
  [id_entregador] int PRIMARY KEY IDENTITY(1, 1),
  [id_usuario] int NOT NULL,
  [nome] varchar(255) NOT NULL
)
GO

CREATE TABLE [VENDEDOR] (
  [id_vendedor] int PRIMARY KEY IDENTITY(1, 1),
  [id_usuario] int NOT NULL,
  [nome] varchar(255) NOT NULL,
  [cnpj] varchar(255) NOT NULL,
  [id_endereco] int NOT NULL,
  [parceiro] varchar(255) NOT NULL,
  [id_imagem] int NOT NULL
)
GO

CREATE TABLE [VENDEDOR_PRODUTO] (
  [id_vendedor] int NOT NULL,
  [id_produto] int NOT NULL,
  [preco] float NOT NULL,
  [quantidade] int NOT NULL
)
GO

CREATE TABLE [VENDEDOR_ESTOQUE] (
  [id_vendedor] int NOT NULL,
  [id_produto] int NOT NULL,
  [quantidade_modificada] int NOT NULL,
  [data_criacao] datetime NOT NULL
)
GO

CREATE TABLE [VENDEDOR_ENTREGADOR] (
  [id_vendedor] int NOT NULL,
  [id_entregador] int NOT NULL
)
GO

CREATE TABLE [VENDEDOR_IMAGEM] (
  [id_vendedor] int NOT NULL,
  [id_imagem] int NOT NULL
)
GO

CREATE TABLE [VENDEDOR_COMENTARIO] (
  [id_vendedor] int NOT NULL,
  [id_comentario] int NOT NULL,
  [id_comentario_resposta] int NOT NULL
)
GO

CREATE TABLE [PRODUTO] (
  [id_produto] int PRIMARY KEY IDENTITY(1, 1),
  [nome] varchar(255) NOT NULL,
  [descricao] varchar(255) NOT NULL,
  [id_categoria] int NOT NULL
)
GO

CREATE TABLE [PRODUTO_CATEGORIA] (
  [id_categoria] int PRIMARY KEY NOT NULL,
  [nome] varchar(255) NOT NULL
)
GO

CREATE TABLE [PRODUTO_COMENTARIO] (
  [id_produto] int NOT NULL,
  [id_comentario] int NOT NULL,
  [id_comentario_resposta] int NOT NULL
)
GO

CREATE TABLE [PRODUTO_IMAGEM] (
  [id_produto] int NOT NULL,
  [id_imagem] int NOT NULL
)
GO

CREATE TABLE [ORDEM] (
  [id_ordem] int PRIMARY KEY IDENTITY(1, 1),
  [id_cliente] int NOT NULL,
  [id_vendedor] int NOT NULL,
  [id_entregador] int NOT NULL,
  [status] nvarchar(255) NOT NULL CHECK ([status] IN ('processamento', 'aceito', 'entrega', 'finalizado', 'recusado')),
  [data_atualizacao] datetime NOT NULL,
  [data_criacao] datetime NOT NULL
)
GO

CREATE TABLE [ORDEM_ITEM] (
  [id_ordem] int NOT NULL,
  [id_produto] int NOT NULL,
  [preco] float NOT NULL,
  [quantidade] int NOT NULL,
  [desconto] float NOT NULL
)
GO

CREATE TABLE [ORDEM_COMENTARIO] (
  [id_ordem] int NOT NULL,
  [id_comentario] int NOT NULL,
  [id_comentario_resposta] int NOT NULL
)
GO

ALTER TABLE [CLIENTE] ADD FOREIGN KEY ([id_usuario]) REFERENCES [USUARIO] ([id_usuario])
GO

ALTER TABLE [ENDERECO] ADD FOREIGN KEY ([id_usuario]) REFERENCES [USUARIO] ([id_usuario])
GO

ALTER TABLE [ENTREGADOR] ADD FOREIGN KEY ([id_usuario]) REFERENCES [USUARIO] ([id_usuario])
GO

ALTER TABLE [VENDEDOR] ADD FOREIGN KEY ([id_usuario]) REFERENCES [USUARIO] ([id_usuario])
GO

ALTER TABLE [CLIENTE] ADD FOREIGN KEY ([id_endereco]) REFERENCES [ENDERECO] ([id_endereco])
GO

ALTER TABLE [VENDEDOR] ADD FOREIGN KEY ([id_endereco]) REFERENCES [ENDERECO] ([id_endereco])
GO

ALTER TABLE [VENDEDOR] ADD FOREIGN KEY ([id_imagem]) REFERENCES [IMAGEM] ([id_imagem])
GO

ALTER TABLE [VENDEDOR_PRODUTO] ADD FOREIGN KEY ([id_vendedor]) REFERENCES [VENDEDOR] ([id_vendedor])
GO

ALTER TABLE [VENDEDOR_COMENTARIO] ADD FOREIGN KEY ([id_vendedor]) REFERENCES [VENDEDOR] ([id_vendedor])
GO

ALTER TABLE [VENDEDOR_ESTOQUE] ADD FOREIGN KEY ([id_vendedor]) REFERENCES [VENDEDOR] ([id_vendedor])
GO

ALTER TABLE [VENDEDOR_ENTREGADOR] ADD FOREIGN KEY ([id_vendedor]) REFERENCES [VENDEDOR] ([id_vendedor])
GO

ALTER TABLE [VENDEDOR_IMAGEM] ADD FOREIGN KEY ([id_vendedor]) REFERENCES [VENDEDOR] ([id_vendedor])
GO

ALTER TABLE [ORDEM] ADD FOREIGN KEY ([id_vendedor]) REFERENCES [VENDEDOR] ([id_vendedor])
GO

ALTER TABLE [PRODUTO_COMENTARIO] ADD FOREIGN KEY ([id_produto]) REFERENCES [PRODUTO] ([id_produto])
GO

ALTER TABLE [PRODUTO_IMAGEM] ADD FOREIGN KEY ([id_produto]) REFERENCES [PRODUTO] ([id_produto])
GO

ALTER TABLE [ORDEM_ITEM] ADD FOREIGN KEY ([id_produto]) REFERENCES [PRODUTO] ([id_produto])
GO

ALTER TABLE [VENDEDOR_PRODUTO] ADD FOREIGN KEY ([id_produto]) REFERENCES [PRODUTO] ([id_produto])
GO

ALTER TABLE [VENDEDOR_ESTOQUE] ADD FOREIGN KEY ([id_produto]) REFERENCES [PRODUTO] ([id_produto])
GO

ALTER TABLE [PRODUTO] ADD FOREIGN KEY ([id_categoria]) REFERENCES [PRODUTO_CATEGORIA] ([id_categoria])
GO

ALTER TABLE [PRODUTO_IMAGEM] ADD FOREIGN KEY ([id_imagem]) REFERENCES [IMAGEM] ([id_imagem])
GO

ALTER TABLE [VENDEDOR_IMAGEM] ADD FOREIGN KEY ([id_imagem]) REFERENCES [IMAGEM] ([id_imagem])
GO

ALTER TABLE [ORDEM] ADD FOREIGN KEY ([id_cliente]) REFERENCES [CLIENTE] ([id_cliente])
GO

ALTER TABLE [ORDEM] ADD FOREIGN KEY ([id_entregador]) REFERENCES [ENTREGADOR] ([id_entregador])
GO

ALTER TABLE [VENDEDOR_ENTREGADOR] ADD FOREIGN KEY ([id_entregador]) REFERENCES [ENTREGADOR] ([id_entregador])
GO

ALTER TABLE [VENDEDOR_COMENTARIO] ADD FOREIGN KEY ([id_comentario]) REFERENCES [COMENTARIO] ([id_comentario])
GO

ALTER TABLE [ORDEM_COMENTARIO] ADD FOREIGN KEY ([id_comentario]) REFERENCES [COMENTARIO] ([id_comentario])
GO

ALTER TABLE [PRODUTO_COMENTARIO] ADD FOREIGN KEY ([id_comentario]) REFERENCES [COMENTARIO] ([id_comentario])
GO

ALTER TABLE [ORDEM_ITEM] ADD FOREIGN KEY ([id_ordem]) REFERENCES [ORDEM] ([id_ordem])
GO

ALTER TABLE [ORDEM_COMENTARIO] ADD FOREIGN KEY ([id_ordem]) REFERENCES [ORDEM] ([id_ordem])
GO
