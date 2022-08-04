# Livraria

Aplicação desenvolvida para atividade da disciplina de Software Concorrente e Distribuído, ministrada pelo prof. Dr. Sérgio Teixeira de Carvalho no semestre letivo de 2022/1 para o Instituto de Informática da Universidade Federal de Goiás.

A aplicação foi desenvolvida em Java, utilizando banco de dados MariaDB para persistência. Ela usa threads para simular vários usuários disputando recursos do sistema simultaneamente, com controle de concorrência por Monitor de Hoare e algorítmo de request/release.

Seu contexto é o de uma rede de livrarias, com diversas unidades, vendedores e livros em estoque. Os usuários são vendedores que devem fazer login para efetuar alguma operação de cadastro de livro, alteração de quantidade em estoque, busca por título, e remoção do item do estoque. Todas os login e operações são registrados em relatório em arquivo .txt, com a região crítica da aplicação sendo composta por estas ações.
