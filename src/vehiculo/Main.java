
package vehiculo;

/**
 *
 * @author 
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoXXX2223 miVehiculoXXX2223;
        int stockActual;
        
        miVehiculoXXX2223 = new VehiculoXXX2223("Seat",18000,100);
        stockActual = operativaVehiculoXXX2223(miVehiculoXXX2223, null); 
        System.out.println("El stock actual es "+ stockActual );
    }

    public static int operativaVehiculoXXX2223(VehiculoXXX2223 miVehiculoXXX2223, int cantidad) {
        int stockActual;
        
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoXXX2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoXXX2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoXXX2223.obtenerStock();
        return stockActual;
    }

}
    
