package Net.Salesianos.Pedido;

public class Pedido {

    protected String codigo;
    protected String cliente;
    protected double importeBase;

    protected static int totalPedidos = 0;

      public Pedido() {

        totalPedidos++;
    }

}
