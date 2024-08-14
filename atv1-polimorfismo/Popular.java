class Popular extends Carros {
    private boolean arCondicionado;


    public Popular(String marca, String modelo, String placa, int ano, double valorLocacao, double valorMulta,
            boolean arCondicionado) {
        super(marca, modelo, placa, ano, valorLocacao, valorMulta);
        this.arCondicionado = arCondicionado;
    }


    public boolean isArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    @Override
    public double calcularValorTotal(int renovacoes){
        int renovacoesCobradas = Math.max(0, renovacoes-1);
        return valorLocacao + (renovacoesCobradas * valorMulta);
    }

    public String getTipo(){
        return "Popular";
    }

    
}
