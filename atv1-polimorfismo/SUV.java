class SUV extends Carros{
    private String mala;
    private String tração;
    private String combustivel;
    
    public SUV(String marca, String modelo, String placa, int ano, double valorLocacao, double valorMulta, String mala,
            String tração, String combustivel) {
        super(marca, modelo, placa, ano, valorLocacao, valorMulta);
        this.mala = mala;
        this.tração = tração;
        this.combustivel = combustivel;
    }

    public String getMala() {
        return mala;
    }
    public void setMala(String mala) {
        this.mala = mala;
    }
    public String getTração() {
        return tração;
    }
    public void setTração(String tração) {
        this.tração = tração;
    }
    public String getCombustivel() {
        return combustivel;
    }
    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    @Override
    public double calcularValorTotal(int renovacoes){
        int renovacoesCobradas = Math.max(0, renovacoes-3);
        return valorLocacao + (renovacoesCobradas * valorMulta);
    }

    public String getTipo(){
        return "SUV";
    }

    
}
