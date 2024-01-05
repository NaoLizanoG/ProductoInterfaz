import java.util.Scanner;

public class Alimento extends  Producto{
    public String fechaElaboracion;
    public String fechaExpiracion;

    public Alimento(String fechaElaboracion, String fechaExpiracion) {
        this.fechaElaboracion = fechaElaboracion;
        this.fechaExpiracion = fechaExpiracion;
    }
    public Alimento() {
    }

    public void imprimirAlimento() {
        System.out.println("El nombre del producto es: "+nombre);
        System.out.println("El còdigo del producto es: "+codigo);
        System.out.println("La cantidad de producto es: "+cantidad);
        System.out.println("El precio del producto es: "+precio);


    }

    public void ingresarAlimento() {
      ingresarProducto();
      Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese fecha de elaboracion del producto");
        fechaElaboracion=sc.next();
        System.out.println("Ingrese fecha de expiracion del producto ");
        fechaExpiracion=sc.next();
    }

}
