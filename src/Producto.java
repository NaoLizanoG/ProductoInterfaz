import java.util.Scanner;

public class Producto implements IProductoRepositorio{

    public double precio;
    public int cantidad;
    public String nombre="";
    public String codigo="";

    @Override
    public void imprimirProducto() {
        System.out.println("El nombre del producto es: "+nombre);
        System.out.println("El còdigo del producto es: "+codigo);
        System.out.println("La cantidad de producto es: "+cantidad);
        System.out.println("El precio del producto es: "+precio);


    }

    @Override
    public void ingresarProducto() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre dle producto:");
        this.nombre=sc.next();
        System.out.println("Ingrese el codigo del producto:");
        this.codigo=sc.next();
        System.out.println("Ingrese la cantidad de producto: ");
        this.cantidad=sc.nextInt();
        System.out.println("Ingrese el precio del producto:");
        this.precio=sc.nextInt();

    }
}
