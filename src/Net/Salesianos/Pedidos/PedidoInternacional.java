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

        public String getPaisDestino() {
        return paisDestino;
    }

    public void setPaisDestino(String paisDestino) {
        this.paisDestino = paisDestino;
    }

    public boolean getAduanas() {
        return aduanas;
    }

    public void setAduanas(boolean aduanas) {
        this.aduanas = aduanas;
    }

}
