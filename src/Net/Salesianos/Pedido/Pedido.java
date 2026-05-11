package Net.Salesianos.Pedido;

public class Pedido {

    protected String codigo;
    protected String cliente;
    protected double importeBase;

    protected static int totalPedidos = 0;

      public Pedido() {

        totalPedidos++;
    }

       public Pedido(String codigo, String cliente, double importeBase) {

        this.codigo = codigo;
        this.cliente = cliente;
        this.importeBase = importeBase;

        totalPedidos++;
    }


}
