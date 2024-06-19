import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Biblioteca biblioteca = new Biblioteca("Biblioteca Central", "Rua Principal, 123");


        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Autor");
            System.out.println("2. Adicionar Publicação");
            System.out.println("3. Adicionar Usuário");
            System.out.println("4. Realizar Empréstimo");
            System.out.println("5. Renovar Empréstimo");
            System.out.println("6. Calcular Multa");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    adicionarAutor(scanner, biblioteca);
                    break;
                case 2:
                    adicionarPublicacao(scanner, biblioteca);
                    break;
                case 3:
                    adicionarUsuario(scanner, biblioteca);
                    break;
                case 4:
                    realizarEmprestimo(scanner, biblioteca);
                    break;
                case 5:
                    renovarEmprestimo(scanner, biblioteca);
                    break;
                case 6:
                    calcularMulta(scanner, biblioteca);
                    break;
                case 7:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }


    private static void adicionarAutor(Scanner scanner, Biblioteca biblioteca) {
        System.out.print("Nome do autor: ");
        String nome = scanner.nextLine();
        System.out.print("Titulação do autor: ");
        String titulacao = scanner.nextLine();

        Autor autor = new Autor(nome, titulacao);
        biblioteca.adicionarAutor(autor);
        System.out.println("Autor adicionado com sucesso!");
    }


    private static void adicionarPublicacao(Scanner scanner, Biblioteca biblioteca) {
        System.out.println("Tipo de publicação (1. Artigo, 2. Livro, 3. Tese): ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Data de publicação (dd/MM/yyyy): ");
        String dataStr = scanner.nextLine();

        System.out.print("Autores (nomes separados por vírgula): ");
        String[] nomesAutores = scanner.nextLine().split(",");
        List<Autor> autores = new ArrayList<>();
        for (String nome : nomesAutores) {
            autores.add(biblioteca.getAutorPorNome(nome.trim()));
        }

        List<Publicacao> referencias = new ArrayList<>(); 

        switch (tipo) {
            case 1:
                System.out.print("Resumo: ");
                String resumoArtigo = scanner.nextLine();
                Artigo artigo = new Artigo(dataStr, titulo, referencias, autores, resumoArtigo);
                biblioteca.adicionarPublicacao(artigo);
                System.out.println("Artigo adicionado com sucesso!");
                break;
            case 2:
                System.out.print("Número da edição: ");
                int edicao = scanner.nextInt();
                scanner.nextLine(); 
                System.out.print("Nome da editora: ");
                String editora = scanner.nextLine();
                System.out.print("ISBN: ");
                String isbn = scanner.nextLine();
                Livro livro = new Livro(dataStr, titulo, referencias, autores, edicao, editora, isbn);
                biblioteca.adicionarPublicacao(livro);
                System.out.println("Livro adicionado com sucesso!");
                break;
            case 3:
                System.out.print("Número de páginas: ");
                int paginas = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Resumo: ");
                String resumoTese = scanner.nextLine();
                System.out.print("Data da defesa (dd/MM/yyyy): ");
                String dataDefesaStr = scanner.nextLine();
                System.out.print("Instituição: ");
                String instituicao = scanner.nextLine();
                Tese tese = new Tese(dataStr, titulo, referencias, autores, paginas, resumoTese, dataDefesaStr, instituicao);
                biblioteca.adicionarPublicacao(tese);
                System.out.println("Tese adicionada com sucesso!");
                break;
            default:
                System.out.println("Tipo de publicação inválido!");
        }
    }


    private static void adicionarUsuario(Scanner scanner, Biblioteca biblioteca) {
        System.out.print("Nome do usuário: ");
        String nome = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Tipo de usuário (1. Comum, 2. Especial): ");
        int tipo = scanner.nextInt();
        scanner.nextLine(); 

        Usuario usuario;
        if (tipo == 1) {
            usuario = new Usuario(nome, telefone, email, cpf);
        } else if (tipo == 2) {
            usuario = new Especial(nome, telefone, email, cpf);
        } else {
            System.out.println("Tipo de usuário inválido!");
            return;
        }

        biblioteca.adicionarUsuario(usuario);
        System.out.println("Usuário adicionado com sucesso!");
    }


    private static void realizarEmprestimo(Scanner scanner, Biblioteca biblioteca) {
        System.out.print("Nome do usuário: ");
        String nomeUsuario = scanner.nextLine();
        Usuario usuario = biblioteca.getUsuarioPorNome(nomeUsuario);

        if (usuario == null) {
            System.out.println("Usuário não encontrado!");
            return;
        }

        System.out.print("Título da publicação: ");
        String tituloPublicacao = scanner.nextLine();
        Publicacao publicacao = biblioteca.getPublicacaoPorTitulo(tituloPublicacao);

        if (publicacao == null) {
            System.out.println("Publicação não encontrada!");
            return;
        }

        Emprestimo emprestimo = new Emprestimo(publicacao, usuario, new Date());
        biblioteca.getEmprestimos().add(emprestimo);
        usuario.incrementarEmprestimos();
        System.out.println("Empréstimo realizado com sucesso!");
    }


    private static void renovarEmprestimo(Scanner scanner, Biblioteca biblioteca) {
        System.out.print("Nome do usuário: ");
        String nomeUsuario = scanner.nextLine();
        Usuario usuario = biblioteca.getUsuarioPorNome(nomeUsuario);

        if (usuario == null) {
            System.out.println("Usuário não encontrado!");
            return;
        }

        System.out.print("Título da publicação: ");
        String tituloPublicacao = scanner.nextLine();
        Emprestimo emprestimo = biblioteca.getEmprestimoPorUsuarioEPublicacao(usuario, tituloPublicacao);

        if (emprestimo == null) {
            System.out.println("Empréstimo não encontrado!");
            return;
        }

        emprestimo.renovarEmprestimo();
        System.out.println("Empréstimo renovado com sucesso!");
    }


    private static void calcularMulta(Scanner scanner, Biblioteca biblioteca) {
        System.out.print("Nome do usuário: ");
        String nomeUsuario = scanner.nextLine();
        Usuario usuario = biblioteca.getUsuarioPorNome(nomeUsuario);

        if (usuario == null) {
            System.out.println("Usuário não encontrado!");
            return;
        }

        System.out.print("Título da publicação: ");
        String tituloPublicacao = scanner.nextLine();
        Emprestimo emprestimo = biblioteca.getEmprestimoPorUsuarioEPublicacao(usuario, tituloPublicacao);

        if (emprestimo == null) {
            System.out.println("Empréstimo não encontrado!");
            return;
        }

        double multa = emprestimo.calcularMulta();
        System.out.println("Multa: " + multa);
    }
}
