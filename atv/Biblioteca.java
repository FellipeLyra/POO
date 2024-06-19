import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nome;
    private String endereco;
    private List<Publicacao> publicacoes;
    private List<Usuario> usuarios;
    private List<Emprestimo> emprestimos;
    private List<Autor> autores;

    public Biblioteca(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.publicacoes = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
        this.autores = new ArrayList<>();
    }

    public void adicionarPublicacao(Publicacao publicacao) {
        publicacoes.add(publicacao);
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void adicionarAutor(Autor autor) {
        autores.add(autor);
    }

    public Publicacao getPublicacaoPorTitulo(String titulo) {
        for (Publicacao publicacao : publicacoes) {
            if (publicacao.getTitulo().equalsIgnoreCase(titulo)) {
                return publicacao;
            }
        }
        return null;
    }

    public Usuario getUsuarioPorNome(String nome) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNome().equalsIgnoreCase(nome)) {
                return usuario;
            }
        }
        return null;
    }

    public Emprestimo getEmprestimoPorUsuarioEPublicacao(Usuario usuario, String tituloPublicacao) {
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getUsuario().equals(usuario) && emprestimo.getPublicacao().getTitulo().equalsIgnoreCase(tituloPublicacao)) {
                return emprestimo;
            }
        }
        return null;
    }

    public Autor getAutorPorNome(String nome) {
        for (Autor autor : autores) {
            if (autor.getNome().equalsIgnoreCase(nome)) {
                return autor;
            }
        }
        return null;
    }

    
    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public List<Publicacao> getPublicacoes() {
        return publicacoes;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public List<Autor> getAutores() {
        return autores;
    }
}
