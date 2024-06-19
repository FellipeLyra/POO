import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;

public class Tese extends Publicacao {
    private int numeroPaginas;
    private String resumo;
    private String dataDefesa;
    private String instituicao;


    public Tese(String dataPublicacao, String titulo, List<Publicacao> referencias, List<Autor> autores, int numeroPaginas, String resumo, String dataDefesa, String instituicao) {
        super(dataPublicacao, titulo, referencias, autores);
        this.numeroPaginas = numeroPaginas;
        this.resumo = resumo;
        this.dataDefesa = dataDefesa;
        this.instituicao = instituicao;
    }


    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getDataDefesa() {
        return dataDefesa;
    }

    public void setDataDefesa(String dataDefesa) {
        this.dataDefesa = dataDefesa;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }


    public double calcularMulta(int numeroRenovacoes) {
        return numeroRenovacoes > 3 ? (numeroRenovacoes - 3) * 10.0 : 0;
    }


    public Date getFormattedData() throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    return sdf.parse(this.dataDefesa);
    }


    public void setFormattedData(Date data) {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    this.dataDefesa = sdf.format(dataDefesa);
    }
}
