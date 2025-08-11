# Sistema de Gerenciamento de Biblioteca em Java

Este projeto é um sistema de gerenciamento de biblioteca simples, desenvolvido em Java, utilizando conceitos de Programação Orientada a Objetos (POO) e boas práticas de design de software. Ele simula as operações básicas de uma biblioteca, como o gerenciamento de livros, membros e empréstimos, com persistência de dados em memória para fins de demonstração e aprendizado.

## Funcionalidades

O sistema oferece as seguintes funcionalidades principais:

### Gerenciamento de Livros
- **Adicionar Livro**: Permite cadastrar novos livros com ID, título, autor e ISBN.
- **Listar Livros**: Exibe todos os livros cadastrados na biblioteca.
- **Listar Livros Disponíveis**: Mostra apenas os livros que estão atualmente disponíveis para empréstimo.
- **Buscar Livro por Título**: Permite encontrar livros a partir de uma busca parcial no título.
- **Buscar Livro por Autor**: Permite encontrar livros a partir de uma busca parcial no nome do autor.
- **Remover Livro**: Exclui um livro do sistema, desde que não esteja emprestado.

### Gerenciamento de Membros
- **Registrar Membro**: Permite cadastrar novos membros com ID, nome, email e telefone. O email deve ser único.
- **Listar Membros**: Exibe todos os membros registrados na biblioteca.
- **Buscar Membro por Nome**: Permite encontrar membros a partir de uma busca parcial no nome.
- **Remover Membro**: Exclui um membro do sistema, desde que não possua empréstimos ativos.

### Gerenciamento de Empréstimos
- **Realizar Empréstimo**: Permite emprestar um livro a um membro, verificando a disponibilidade do livro e se o membro possui empréstimos atrasados.
- **Devolver Livro**: Registra a devolução de um livro, tornando-o disponível novamente.
- **Listar Empréstimos Ativos**: Exibe todos os empréstimos que ainda não foram devolvidos.
- **Listar Empréstimos Atrasados**: Mostra os empréstimos que excederam a data prevista de devolução.
- **Listar Empréstimos por Membro**: Exibe todos os empréstimos (ativos e devolvidos) de um membro específico.

### Relatórios
- **Relatório Geral**: Apresenta um resumo estatístico da biblioteca, incluindo o total de livros, livros disponíveis, total de membros, empréstimos ativos e empréstimos atrasados.

## Estrutura do Projeto

O projeto segue uma arquitetura modular, dividida em pacotes para organizar as responsabilidades:

- `com.biblioteca.model`: Contém as classes de modelo que representam as entidades do domínio (Livro, Membro, Emprestimo).
- `com.biblioteca.repository`: Contém as classes de repositório que simulam a persistência de dados em memória para cada entidade (LivroRepository, MembroRepository, EmprestimoRepository).
- `com.biblioteca.service`: Contém a lógica de negócio principal da aplicação (BibliotecaService), orquestrando as operações entre os repositórios e aplicando as regras de negócio.
- `com.biblioteca.view`: Contém a classe de interface com o usuário (ConsoleView), responsável por interagir com o usuário via console e exibir os resultados.
- `com.biblioteca.main`: Contém a classe principal da aplicação (Main), que é o ponto de entrada do programa.

## Como Executar o Projeto

Este projeto pode ser executado em qualquer IDE Java (como IntelliJ IDEA, Eclipse, VS Code com extensões Java) ou via linha de comando.

### Pré-requisitos
- Java Development Kit (JDK) 17 ou superior instalado.

### Executando via IntelliJ IDEA
1. **Clonar o Repositório**: Se você clonou este repositório do GitHub, abra o IntelliJ IDEA e selecione `File -> Open` e navegue até a pasta raiz do projeto (`biblioteca-java`).
2. **Importar Projeto Maven/Gradle (se aplicável)**: Este projeto é um projeto Java simples. O IntelliJ deve reconhecer a estrutura automaticamente. Se houver problemas, verifique se o JDK está configurado corretamente em `File -> Project Structure -> Project SDK`.
3. **Executar a Classe Principal**: Navegue até `src/main/java/com/biblioteca/main/Main.java`. Clique com o botão direito no arquivo `Main.java` e selecione `Run 'Main.main()'`. O programa será iniciado no console do IntelliJ.


## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou pull requests para melhorias, correção de bugs ou novas funcionalidades.
--------------------------------------------------------------------------------------------------------------------------------------------------

# Library Management System in Java

This project is a simple library management system developed in Java, using Object-Oriented Programming (OOP) concepts and good software design practices. It simulates the basic operations of a library, such as managing books, members, and loans, with in-memory data persistence for demonstration and learning purposes.

## Features

The system offers the following main features:

### Book Management

- ** Add Book: Allows registering new books with ID, title, author, and ISBN.
- ** List Books: Displays all books registered in the library.
- ** List Available Books: Shows only the books currently available for loan.
- ** Search Book by Title: Allows finding books through a partial search in the title.
- ** Search Book by Author: Allows finding books through a partial search in the author's name.
- ** Remove Book: Deletes a book from the system, as long as it is not currently on loan.

### Member Management

- ** Register Member: Allows registering new members with ID, name, email, and phone number. The email must be unique.
- ** List Members: Displays all members registered in the library.
- ** Search Member by Name: Allows finding members through a partial search in the name.
- ** Remove Member: Deletes a member from the system, as long as they have no active loans.

### Loan Management

- ** Perform Loan: Allows lending a book to a member, checking both the book's availability and whether the member has overdue loans.
- ** Return Book: Records the return of a book, making it available again.
- ** List Active Loans: Displays all loans that have not yet been returned.
- ** List Overdue Loans: Shows loans that have exceeded the expected return date.
- ** List Loans by Member: Displays all loans (active and returned) for a specific member.

### Reports

- ** General Report: Presents a statistical summary of the library, including the total number of books, available books, total members, active loans, and overdue loans.

## Project Structure

The project follows a modular architecture, divided into packages to organize responsibilities:

- `com.biblioteca.model`: Contains the model classes that represent the domain entities (Book, Member, Loan).
- `com.biblioteca.repository`: Contains the repository classes that simulate in-memory data persistence for each entity (BookRepository, MemberRepository, LoanRepository).
- `com.biblioteca.service`: Contains the main business logic of the application (LibraryService), orchestrating operations between repositories and applying business rules.
- `com.biblioteca.view`: Contains the user interface class (ConsoleView), responsible for interacting with the user via the console and displaying results.
- `com.biblioteca.main`: Contains the application's main class (Main), which is the program's entry point.

## How to Run the Project

This project can be run in any Java IDE (such as IntelliJ IDEA, Eclipse, or VS Code with Java extensions) or via the command line.

### Prerequisites

- Java Development Kit (JDK) 17 or higher installed.

### Running via IntelliJ IDEA
1. ** Clone the Repository: If you cloned this repository from GitHub, open IntelliJ IDEA and select `File -> Open`, then navigate to the project's root folder (`biblioteca-java`).
2. ** Import Maven/Gradle Project (if applicable): This is a simple Java project. IntelliJ should recognize the structure automatically. If there are issues, ensure the JDK is correctly set in `File -> Project Structure -> Project SDK`.
3. ** Run the Main Class: Navigate to `src/main/java/com/biblioteca/main/Main.java`. Right-click on the `Main.java` file and select `Run 'Main.main()'`. The program will start in IntelliJ's console.



## Contributions

Contributions are welcome! Feel free to open issues or pull requests for improvements, bug fixes, or new features.

