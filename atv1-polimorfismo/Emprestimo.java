class Emprestimo {
    private Carros carros;
    private Cliente cliente;
    private int renovacoes;


    public Emprestimo(Carros carros, Cliente cliente, int renovacoes) {
        this.carros = carros;
        this.cliente = cliente;
        this.renovacoes = 0;
    }


    public Carros getCarros() {
        return carros;
    }

    public void setCarros(Carros carros) {
        this.carros = carros;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getRenovacoes() {
        return renovacoes;
    }

    public void setRenovacoes(int renovacoes) {
        this.renovacoes = renovacoes;
    }


    public void renovar(){
        this.renovacoes++;
    }

    public double calcularValorTotal(){
        return carros.calcularValorTotal(renovacoes);
    }

}
