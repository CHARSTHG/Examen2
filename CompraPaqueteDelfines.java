class CompraPaqueteDelfines extends CompraPaquete {
    private double precioNadoDelfines;
    private String tipoInteraccion;

    public CompraPaqueteDelfines(double precioEntrada) {
        super(precioEntrada);
    }

    public double getPrecioNadoDelfines() {
        return precioNadoDelfines;
    }

    public void setPrecioNadoDelfines(double precioNadoDelfines) {
        this.precioNadoDelfines = precioNadoDelfines;
    }

    public String getTipoInteraccion() {
        return tipoInteraccion;
    }

    public void setTipoInteraccion(String tipoInteraccion) {
        this.tipoInteraccion = tipoInteraccion;
    }

    public double calcularTotalCompra() {
        return super.calcularTotalCompra() + precioNadoDelfines;
    }
}