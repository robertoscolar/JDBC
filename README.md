# JDBC

Projeto básico para testar a conexão com o banco de dados usando jdbc.
O Software armazena clientes em um banco de dados mysql dentro de uma tabela chamada cadastro_cliente.
A tabela tem dois campos: 

//código (int)
//nome (varchar(100))

A idéia é de que o código seja único e que seja colocado automaticamente em cada nome cadastrado, assim, aumentando a efetividade das buscas.
Isso é possível com o seguinte comando no mysql:

create table cadastro_cliente (
   codigo int not null auto_increment
)

O projeto implementa três classes principais:

SalvaCliente: A classe executa um JOptionPane perguntando o nome do cliente (o nome não pode ser nulo ou dará erro!), depois disso a pessoa já é cadastrada no banco.
BuscaPeloCodigo: A classe executa um JOptionPane perguntando o código do cliente. Caso ele ache, o nome aparecerá na tela.
BuscaTodosClientes: Busca todos os clientes cadastrados no banco de dados em questão.


Usuario: root
Senha: root
(é possível mudar isso na classe JdbcDAOFactory á qualquer momento, inclusive para fazer conexão com outros bancos)
