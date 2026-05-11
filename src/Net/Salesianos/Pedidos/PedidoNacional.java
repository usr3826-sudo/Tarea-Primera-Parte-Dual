package Net.Salesianos.Pedidos;

public class PedidoNacional extends Pedido {

    private double peso;
    private boolean urgente;

    public PedidoNacional() {

        super();
    }

    public PedidoNacional(String codigo, String cliente, double importeBase, double peso, boolean urgente) {

        super(codigo, cliente, importeBase);

        this.peso = peso;
        this.urgente = urgente;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean getUrgente() {
        return urgente;
    }

    public void setUrgente(boolean urgente) {
        this.urgente = urgente;
    }

}