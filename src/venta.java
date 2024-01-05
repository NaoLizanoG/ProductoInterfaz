public class venta  extends Cliente implements IProductoRepositorio{

    @Override
    public void imprimirProducto() {

    }

    @Override
    public void ingresarProducto() {

    }


    public void ingresarVenta(IProductoRepositorio producto){
        producto.ingresarProducto();
        producto.imprimirProducto();
    }
}
