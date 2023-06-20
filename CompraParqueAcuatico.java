class CompraParqueAcuatico extends ParqueAcuatico {
    private double precioComidaBuffet;
    private String nombrePlatillo;

    public CompraParqueAcuatico(double precioEntrada) {
        super(precioEntrada);
    }

    public double getPrecioComidaBuffet() {
        return precioComidaBuffet;
    }

    public void setPrecioComidaBuffet(double precioComidaBuffet) {
        this.precioComidaBuffet = precioComidaBuffet;
    }

    public String getNombrePlatillo() {
        return nombrePlatillo;
    }

    public void setNombrePlatillo(String nombrePlatillo) {
        this.nombrePlatillo = nombrePlatillo;
    }

    public double calcularTotalCompra() {
        return super.getPrecioEntrada() + precioComidaBuffet;
    }
}