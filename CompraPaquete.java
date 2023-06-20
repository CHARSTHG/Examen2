class CompraPaquete extends CompraParqueAcuatico {
    private double precioEspectaculoNocturno;
    private String seccionLugar;

    public CompraPaquete(double precioEntrada) {
        super(precioEntrada);
    }

    public double getPrecioEspectaculoNocturno() {
        return precioEspectaculoNocturno;
    }

    public void setPrecioEspectaculoNocturno(double precioEspectaculoNocturno) {
        this.precioEspectaculoNocturno = precioEspectaculoNocturno;
    }

    public String getSeccionLugar() {
        return seccionLugar;
    }

    public void setSeccionLugar(String seccionLugar) {
        this.seccionLugar = seccionLugar;
    }

    public double calcularTotalCompra() {
        return super.calcularTotalCompra() + precioEspectaculoNocturno;
    }
}