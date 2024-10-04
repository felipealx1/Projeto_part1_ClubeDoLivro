<body>

<h1>Sistema de Cadastro de Usuários e Livros</h1>

<p>Este sistema tem como objetivo gerenciar cadastros de usuários e livros, permitindo operações de criação, leitura, atualização e exclusão (CRUD) para ambos. Ele também implementa funcionalidades de busca por ID e atualização de status para os livros.</p>

<h2>Especificações</h2>
<ul>
    <li>Backend desenvolvido em <strong>Java</strong> utilizando o framework <strong>Spring Boot</strong>.</li>
    <li>Utiliza <strong>JPA/Hibernate</strong> para interação com o banco de dados.</li>
    <li>Banco de dados <strong>MySQL</strong> configurado para persistência das entidades <strong>Cadastro</strong> e <strong>Livro</strong>.</li>
    <li>As rotas seguem o padrão RESTful, retornando os dados no formato <strong>JSON</strong>.</li>
    <li>As funcionalidades estão divididas entre os serviços de <strong>Cadastro</strong> e <strong>Livro</strong>, cada um com suas respectivas operações de CRUD e atualizações específicas.</li>
</ul>

<h2>Linguagens e Ferramentas Utilizadas</h2>
<ul>
    <li><strong>Java</strong> (versão 11 ou superior)</li>
    <li><strong>Spring Boot</strong> (versão 2.7.x)</li>
    <li><strong>Maven</strong> para gerenciamento de dependências</li>
    <li><strong>JPA/Hibernate</strong> para ORM (Mapeamento Objeto-Relacional)</li>
    <li><strong>MySQL</strong> como banco de dados relacional</li>
</ul>

<h2>Funcionalidades Implementadas</h2>

<h3>1. Funcionalidades de Cadastro</h3>
<ul>
    <li>Registrar um novo cadastro (usuário)</li>
    <li>Buscar cadastro por ID</li>
    <li>Atualizar cadastro por ID</li>
</ul>

<h4>Rotas de Cadastro</h4>
<ul>
    <li><strong>POST /cadastros</strong> - Registra um novo cadastro</li>
    <li><strong>GET /cadastros/{id}</strong> - Busca um cadastro específico por ID</li>
    <li><strong>PUT /cadastros/{id}</strong> - Atualiza os dados de um cadastro específico</li>
</ul>

<h3>2. Funcionalidades de Livro</h3>
<ul>
    <li>Registrar um novo livro</li>
    <li>Buscar todos os livros com paginação</li>
    <li>Buscar livro por ID</li>
    <li>Atualizar livro por ID</li>
    <li>Deletar livro por ID</li>
    <li>Atualizar status do livro (lido/não lido)</li>
</ul>

<h4>Rotas de Livro</h4>
<ul>
    <li><strong>POST /livros</strong> - Registra um novo livro</li>
    <li><strong>GET /livros</strong> - Busca todos os livros com paginação</li>
    <li><strong>GET /livros/{id}</strong> - Busca um livro específico por ID</li>
    <li><strong>PUT /livros/{id}</strong> - Atualiza os dados de um livro específico</li>
    <li><strong>DELETE /livros/{id}</strong> - Deleta um livro específico</li>
    <li><strong>PATCH /livros/{id}/updateStatus</strong> - Atualiza o status de leitura do livro (LIDO/NÃO LIDO)</li>
</ul>

<h2>Configuração do Projeto</h2>

<h3>Requisitos</h3>
<ul>
    <li>Java 17 ou superior</li>
    <li>Maven</li>
    <li>MySQL como banco de dados</li>
</ul>


</body>