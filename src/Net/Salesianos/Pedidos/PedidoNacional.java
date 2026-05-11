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

    @Override
    public double calcularImporteFinal() {

        double total = importeBase;

        if (peso <= 2) {

            total = total + 5;

        } else if (peso <= 10) {

            total = total + 12;

        } else {

            total = total + 20;
        }

        if (urgente == true) {

            total = total + 15;
        }

        return total;
    }

    public boolean cambiarUrgencia() {

        urgente = !urgente;

        return urgente;
    }

    @Override
    public String mostrarInfo() {

        return "Código: " + codigo +
                "Peso: " + peso +
                "Urgente: " + urgente +
                "Importe Final: " + calcularImporteFinal();
    }

}