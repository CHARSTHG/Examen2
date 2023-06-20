public class Main {
    public static void main(String[] args) {
        // Ejemplo de compra de entrada
        ParqueAcuatico parque1 = new ParqueAcuatico(50.0);
        System.out.println("Compra de entrada:");
        System.out.println("Total a pagar: " + parque1.calcularTotalCompra());

        // Ejemplo de compra con comida buffet
        CompraParqueAcuatico compra1 = new CompraParqueAcuatico(50.0);
        compra1.setPrecioComidaBuffet(25.0);
        compra1.setNombrePlatillo("Hamburguesa");
        System.out.println("\nCompra con comida buffet:");
        System.out.println("Total a pagar: " + compra1.calcularTotalCompra());
        System.out.println("Platillo: " + compra1.getNombrePlatillo());

        // Ejemplo de compra con comida buffet y espectáculo nocturno
        CompraPaquete compra2 = new CompraPaquete(50.0);
        compra2.setPrecioComidaBuffet(25.0);
        compra2.setNombrePlatillo("Pizza");
        compra2.setPrecioEspectaculoNocturno(10.0);
        compra2.setSeccionLugar("VIP");
        System.out.println("\nCompra con comida buffet y espectáculo nocturno:");
        System.out.println("Total a pagar: " + compra2.calcularTotalCompra());
        System.out.println("Platillo: " + compra2.getNombrePlatillo());
        System.out.println("Sección del lugar: " + compra2.getSeccionLugar());

        // Ejemplo de compra con comida buffet, espectáculo nocturno y nado con delfines
        CompraPaqueteDelfines compra3 = new CompraPaqueteDelfines(50.0);
        compra3.setPrecioComidaBuffet(25.0);
        compra3.setNombrePlatillo("Ensalada");
        compra3.setPrecioEspectaculoNocturno(10.0);
        compra3.setSeccionLugar("General");
        compra3.setPrecioNadoDelfines(50.0);
        compra3.setTipoInteraccion("Extra");
        System.out.println("\nCompra con comida buffet, espectáculo nocturno y nado con delfines:");
        System.out.println("Total a pagar: " + compra3.calcularTotalCompra());
        System.out.println("Platillo: " + compra3.getNombrePlatillo());
        System.out.println("Sección del lugar: " + compra3.getSeccionLugar());
        System.out.println("Tipo de interacción en el nado con delfines: " + compra3.getTipoInteraccion());
    }
}
