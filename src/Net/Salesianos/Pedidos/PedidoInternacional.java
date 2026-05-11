package Net.Salesianos.Pedidos;

public class PedidoInternacional extends Pedido {

    private String paisDestino;
    private boolean aduanas;

    public PedidoInternacional() {

        super();
    }

    public PedidoInternacional(String codigo, String cliente, double importeBase, String paisDestino, boolean aduanas) {

        super(codigo, cliente, importeBase);

        this.paisDestino = paisDestino;
        this.aduanas = aduanas;
    }

}
