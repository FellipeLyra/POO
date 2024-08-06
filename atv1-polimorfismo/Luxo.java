class Luxo extends Carros {
    private int airBag;
    private String mala;
    private boolean gps;

    

    public Luxo(String marca, String modelo, String placa, int ano, double valorLocacao, double valorMulta, int airBag,
            String mala, boolean gps) {
        super(marca, modelo, placa, ano, valorLocacao, valorMulta);
        this.airBag = airBag;
        this.mala = mala;
        this.gps = gps;
    }

    public int getAirBag() {
        return airBag;
    }

    public void setAirBag(int airBag) {
        this.airBag = airBag;
    }

    public String getMala() {
        return mala;
    }

    public void setMala(String mala) {
        this.mala = mala;
    }

    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    @Override
    public double calcularValorTotal(int renovacoes){
        int renovacoesCobradas = Math.max(0, renovacoes-5);
        return valorLocacao + (renovacoesCobradas * valorMulta);
    }

    public String getTipo(){
        return "Luxo";
    }


    
}
