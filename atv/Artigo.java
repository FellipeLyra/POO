import java.util.List;

public class Artigo extends Publicacao {
    private String resumo;


    public Artigo(String dataPublicacao, String titulo, List<Publicacao> referencias, List<Autor> autores, String resumo) {
        super(dataPublicacao, titulo, referencias, autores);
        this.resumo = resumo;
    }


    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }


    public double calcularMulta(int numeroRenovacoes) {
        return numeroRenovacoes > 3 ? (numeroRenovacoes - 3) * 2.0 : 0;
    }
}
