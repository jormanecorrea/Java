package ventas;

public class PruebaVentas {
    public static void main(String[] args) {
        System.out.println("*** SISTEMA DE VENTAS ***");
        var producto1 = new Producto("Blusa", 30.00);
        //System.out.println(producto1);
        var producto2 = new Producto("Zapatos", 50.00);
        //System.out.println(producto2);

        //Primer Objeto de tipo Orden
        var orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        System.out.println(orden1);

        //Seunda Orden
        var orden2 = new Orden();
        //Podemos crear el objeto inernamente, pero no puede ser reutilizado
        orden2.agregarProducto(new Producto("Playera", 15.00));
        orden2.agregarProducto(producto2);
        System.out.println(orden2);
    }

}
