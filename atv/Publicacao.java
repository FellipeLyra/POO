import java.util.*;
import java.text.*;
import java.util.List;


public abstract class Publicacao {
    private String dataPublicacao;
    private String titulo;
    private List<Publicacao> referencias;
    private List<Autor> autores;


    public Publicacao(String dataPublicacao, String titulo, List<Publicacao> referencias, List<Autor> autores) {
        this.dataPublicacao = dataPublicacao;
        this.titulo = titulo;
        this.referencias = referencias;
        this.autores = autores;
    }


    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Publicacao> getReferencias() {
        return referencias;
    }

    public void setReferencias(List<Publicacao> referencias) {
        this.referencias = referencias;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }


public Date getFormattedData() throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    return sdf.parse(this.dataPublicacao);
}


public void setFormattedData(Date data) {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    this.dataPublicacao = sdf.format(dataPublicacao);
}


public abstract double calcularMulta(int numeroRenovacoes);


}