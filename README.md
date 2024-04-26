# Exercício Spring Data

### **Atividade:**

1. **Definição do Modelo de Dados:**
    - Defina os campos necessários para a entidade **`Usuario`**, como **`id`**, **`nome`**, **`email`**, **`senha`**, etc.
    - Decida sobre as regras de negócio relacionadas aos campos (por exemplo, validação de email único, força da senha, etc.).
2. **Configuração do Projeto Spring:**
    - Configure um projeto Spring Boot.
    - Adicione as dependências necessárias, incluindo **`spring-boot-starter-data-jpa`**, **`mysql-connector-java`**, etc., no arquivo **`pom.xml`** (ou **`build.gradle`** se estiver usando Gradle).
3. **Configuração do Banco de Dados:**
    - Configure as propriedades do banco de dados MySQL no arquivo **`application.properties`** ou **`application.yml`**, incluindo URL, nome de usuário, senha, etc.
4. **Criação da Entidade e Repositório:**
    - Crie a classe de entidade **`Usuario`** com as anotações JPA apropriadas para mapeamento de tabela e relacionamentos.
    - Crie uma interface **`UsuarioRepository`** estendendo **`JpaRepository<Usuario, Long>`** para permitir operações CRUD no banco de dados.
5. **Implementação de Regras de Negócio:**
    - Implemente métodos no serviço ou no controlador para manipular e popular a tabela de usuários com base nas regras de negócio definidas.
    - Por exemplo, ao criar um novo usuário, verifique se o email é único e se a senha atende aos critérios de segurança.
6. **Refinamento e Melhoria:**
    - Refine e melhore suas implementações com base nos resultados dos testes e em feedbacks adicionais.
    - Considere adicionar recursos adicionais, como autenticação de usuários, manipulação de exceções, etc., conforme necessário.

Seguindo esses passos, você poderá criar uma tabela **`Usuario`** no banco de dados MySQL usando Spring Data e manipular essa tabela com regras de negócio definidas.