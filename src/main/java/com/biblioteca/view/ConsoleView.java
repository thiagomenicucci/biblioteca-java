package com.biblioteca.view;

import com.biblioteca.model.Emprestimo;
import com.biblioteca.model.Livro;
import com.biblioteca.model.Membro;
import com.biblioteca.service.BibliotecaService;

import java.util.List;
import java.util.Scanner;

/**
 * Classe responsável pela interface de usuário via console.
 * Gerencia a interação com o usuário e chama os serviços apropriados.
 */
public class ConsoleView {
    private BibliotecaService bibliotecaService;
    private Scanner scanner;

    public ConsoleView() {
        this.bibliotecaService = new BibliotecaService();
        this.scanner = new Scanner(System.in);
    }

    /**
     * Inicia o menu principal da aplicação
     */
    public void iniciar() {
        System.out.println("=== SISTEMA DE GERENCIAMENTO DE BIBLIOTECA ===");
        System.out.println("Bem-vindo ao sistema!");
        
        while (true) {
            exibirMenuPrincipal();
            int opcao = lerOpcao();
            
            switch (opcao) {
                case 1 -> menuLivros();
                case 2 -> menuMembros();
                case 3 -> menuEmprestimos();
                case 4 -> exibirRelatorios();
                case 0 -> {
                    System.out.println("Obrigado por usar o sistema!");
                    return;
                }
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    private void exibirMenuPrincipal() {
        System.out.println("\n=== MENU PRINCIPAL ===");
        System.out.println("1. Gerenciar Livros");
        System.out.println("2. Gerenciar Membros");
        System.out.println("3. Gerenciar Empréstimos");
        System.out.println("4. Relatórios");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private void menuLivros() {
        while (true) {
            System.out.println("\n=== GERENCIAR LIVROS ===");
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Listar Todos os Livros");
            System.out.println("3. Listar Livros Disponíveis");
            System.out.println("4. Buscar Livro por Título");
            System.out.println("5. Buscar Livro por Autor");
            System.out.println("6. Remover Livro");
            System.out.println("0. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");
            
            int opcao = lerOpcao();
            
            switch (opcao) {
                case 1 -> adicionarLivro();
                case 2 -> listarTodosLivros();
                case 3 -> listarLivrosDisponiveis();
                case 4 -> buscarLivroPorTitulo();
                case 5 -> buscarLivroPorAutor();
                case 6 -> removerLivro();
                case 0 -> { return; }
                default -> System.out.println("Opção inválida!");
            }
        }
    }

    private void menuMembros() {
        while (true) {
            System.out.println("\n=== GERENCIAR MEMBROS ===");
            System.out.println("1. Registrar Membro");
            System.out.println("2. Listar Todos os Membros");
            System.out.println("3. Buscar Membro por Nome");
            System.out.println("4. Remover Membro");
            System.out.println("0. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");
            
            int opcao = lerOpcao();
            
            switch (opcao) {
                case 1 -> registrarMembro();
                case 2 -> listarTodosMembros();
                case 3 -> buscarMembroPorNome();
                case 4 -> removerMembro();
                case 0 -> { return; }
                default -> System.out.println("Opção inválida!");
            }
        }
    }

    private void menuEmprestimos() {
        while (true) {
            System.out.println("\n=== GERENCIAR EMPRÉSTIMOS ===");
            System.out.println("1. Realizar Empréstimo");
            System.out.println("2. Devolver Livro");
            System.out.println("3. Listar Empréstimos Ativos");
            System.out.println("4. Listar Empréstimos Atrasados");
            System.out.println("5. Listar Empréstimos por Membro");
            System.out.println("0. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");
            
            int opcao = lerOpcao();
            
            switch (opcao) {
                case 1 -> realizarEmprestimo();
                case 2 -> devolverLivro();
                case 3 -> listarEmprestimosAtivos();
                case 4 -> listarEmprestimosAtrasados();
                case 5 -> listarEmprestimosPorMembro();
                case 0 -> { return; }
                default -> System.out.println("Opção inválida!");
            }
        }
    }

    // ===== MÉTODOS AUXILIARES =====

    private int lerOpcao() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private void adicionarLivro() {
        System.out.print("ID do livro: ");
        String id = scanner.nextLine();
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        System.out.print("ISBN: ");
        String isbn = scanner.nextLine();
        
        bibliotecaService.adicionarLivro(id, titulo, autor, isbn);
        System.out.println("Livro adicionado com sucesso!");
    }

    private void listarTodosLivros() {
        List<Livro> livros = bibliotecaService.listarLivros();
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro encontrado.");
        } else {
            System.out.println("\n=== TODOS OS LIVROS ===");
            livros.forEach(System.out::println);
        }
    }

    private void listarLivrosDisponiveis() {
        List<Livro> livros = bibliotecaService.listarLivrosDisponiveis();
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro disponível.");
        } else {
            System.out.println("\n=== LIVROS DISPONÍVEIS ===");
            livros.forEach(System.out::println);
        }
    }

    private void buscarLivroPorTitulo() {
        System.out.print("Digite o título (ou parte dele): ");
        String titulo = scanner.nextLine();
        List<Livro> livros = bibliotecaService.buscarLivrosPorTitulo(titulo);
        
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro encontrado com esse título.");
        } else {
            System.out.println("\n=== LIVROS ENCONTRADOS ===");
            livros.forEach(System.out::println);
        }
    }

    private void buscarLivroPorAutor() {
        System.out.print("Digite o autor (ou parte do nome): ");
        String autor = scanner.nextLine();
        List<Livro> livros = bibliotecaService.buscarLivrosPorAutor(autor);
        
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro encontrado desse autor.");
        } else {
            System.out.println("\n=== LIVROS ENCONTRADOS ===");
            livros.forEach(System.out::println);
        }
    }

    private void removerLivro() {
        System.out.print("ID do livro a ser removido: ");
        String id = scanner.nextLine();
        
        if (bibliotecaService.removerLivro(id)) {
            System.out.println("Livro removido com sucesso!");
        } else {
            System.out.println("Não foi possível remover o livro. Verifique se ele existe e não está emprestado.");
        }
    }

    private void registrarMembro() {
        System.out.print("ID do membro: ");
        String id = scanner.nextLine();
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        
        if (bibliotecaService.registrarMembro(id, nome, email, telefone)) {
            System.out.println("Membro registrado com sucesso!");
        } else {
            System.out.println("Não foi possível registrar o membro. Email já existe.");
        }
    }

    private void listarTodosMembros() {
        List<Membro> membros = bibliotecaService.listarMembros();
        if (membros.isEmpty()) {
            System.out.println("Nenhum membro encontrado.");
        } else {
            System.out.println("\n=== TODOS OS MEMBROS ===");
            membros.forEach(System.out::println);
        }
    }

    private void buscarMembroPorNome() {
        System.out.print("Digite o nome (ou parte dele): ");
        String nome = scanner.nextLine();
        List<Membro> membros = bibliotecaService.buscarMembrosPorNome(nome);
        
        if (membros.isEmpty()) {
            System.out.println("Nenhum membro encontrado com esse nome.");
        } else {
            System.out.println("\n=== MEMBROS ENCONTRADOS ===");
            membros.forEach(System.out::println);
        }
    }

    private void removerMembro() {
        System.out.print("ID do membro a ser removido: ");
        String id = scanner.nextLine();
        
        if (bibliotecaService.removerMembro(id)) {
            System.out.println("Membro removido com sucesso!");
        } else {
            System.out.println("Não foi possível remover o membro. Verifique se ele existe e não possui empréstimos ativos.");
        }
    }

    private void realizarEmprestimo() {
        System.out.print("ID do membro: ");
        String idMembro = scanner.nextLine();
        System.out.print("ID do livro: ");
        String idLivro = scanner.nextLine();
        
        String resultado = bibliotecaService.emprestarLivro(idMembro, idLivro);
        System.out.println(resultado);
    }

    private void devolverLivro() {
        System.out.print("ID do empréstimo: ");
        String idEmprestimo = scanner.nextLine();
        
        String resultado = bibliotecaService.devolverLivro(idEmprestimo);
        System.out.println(resultado);
    }

    private void listarEmprestimosAtivos() {
        List<Emprestimo> emprestimos = bibliotecaService.listarEmprestimosAtivos();
        if (emprestimos.isEmpty()) {
            System.out.println("Nenhum empréstimo ativo.");
        } else {
            System.out.println("\n=== EMPRÉSTIMOS ATIVOS ===");
            emprestimos.forEach(System.out::println);
        }
    }

    private void listarEmprestimosAtrasados() {
        List<Emprestimo> emprestimos = bibliotecaService.listarEmprestimosAtrasados();
        if (emprestimos.isEmpty()) {
            System.out.println("Nenhum empréstimo atrasado.");
        } else {
            System.out.println("\n=== EMPRÉSTIMOS ATRASADOS ===");
            emprestimos.forEach(System.out::println);
        }
    }

    private void listarEmprestimosPorMembro() {
        System.out.print("ID do membro: ");
        String idMembro = scanner.nextLine();
        
        List<Emprestimo> emprestimos = bibliotecaService.listarEmprestimosPorMembro(idMembro);
        if (emprestimos.isEmpty()) {
            System.out.println("Nenhum empréstimo encontrado para este membro.");
        } else {
            System.out.println("\n=== EMPRÉSTIMOS DO MEMBRO ===");
            emprestimos.forEach(System.out::println);
        }
    }

    private void exibirRelatorios() {
        System.out.println("\n" + bibliotecaService.gerarRelatorioGeral());
    }
}

