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

### Executando via Linha de Comando
1. **Navegar até a pasta raiz do projeto**: Abra o terminal ou prompt de comando e navegue até o diretório `biblioteca-java`.
   ```bash
   cd biblioteca-java
   ```
2. **Compilar o projeto**: Utilize o compilador Java (javac) para compilar os arquivos `.java`.
   ```bash
   javac -d out src/main/java/com/biblioteca/model/*.java src/main/java/com/biblioteca/repository/*.java src/main/java/com/biblioteca/service/*.java src/main/java/com/biblioteca/view/*.java src/main/java/com/biblioteca/main/*.java
   ```
   *Nota: Se você tiver muitos arquivos, pode ser mais fácil usar um script de compilação ou uma ferramenta de build como Maven/Gradle. Para este projeto simples, o comando acima deve funcionar.*
3. **Executar o projeto**: Após a compilação, execute a classe principal.
   ```bash
   java -cp out com.biblioteca.main.Main
   ```

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou pull requests para melhorias, correção de bugs ou novas funcionalidades.

## Licença

Este projeto está licenciado sob a licença MIT. Veja o arquivo `LICENSE` para mais detalhes. (O arquivo LICENSE não está incluído neste exemplo, mas é uma boa prática tê-lo em um projeto real).

---

**Desenvolvido por:** Manus AI
**Data:** 8 de abril de 2025


