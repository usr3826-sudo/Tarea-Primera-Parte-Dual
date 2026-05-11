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

      @Override
    public double calcularImporteFinal() {

        double total = importeBase;


        total = total + 25;


        if (aduanas == true) {

            total = total + (importeBase * 12 / 100);
        }


        if (paisDestino.equalsIgnoreCase("Suiza") ||
            paisDestino.equalsIgnoreCase("Noruega")) {

            total = total + 18;
        }


        if (importeBase > 200) {

            total = total - 10;
        }

        return total;
    }

    public boolean requiereRevisionAduanera() {


        if (aduanas == true) {

            return true;
        }

        if (!paisDestino.equalsIgnoreCase("Francia") &&
            !paisDestino.equalsIgnoreCase("Portugal") &&
            !paisDestino.equalsIgnoreCase("Italia")) {

            return true;
        }

        return false;
    }

    @Override
    public String mostrarInfo() {

        return "Cliente: " + cliente +
                "País: " + paisDestino +
                "Aduanas: " + aduanas +
                "Importe Final: " + calcularImporteFinal();
    }
}

