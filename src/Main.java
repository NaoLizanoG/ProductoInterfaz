import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        venta venta1 = new venta();

        venta1.ingresarVenta(new IProductoRepositorio(){
            Alimento alimento= new Alimento();

            @Override
            public void ingresarProducto(){
                Scanner sc = new Scanner(System.in);
                System.out.println("Ingrese el  nombre del alimento");
                alimento.nombre= sc.next();
            }

            @Override
            public void imprimirProducto(){
                System.out.println("El nombre del producto es "+alimento.nombre);
            }
        });
    }
}