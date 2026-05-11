package Net.Salesianos.Pedidos;

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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getImporteBase() {
        return importeBase;
    }

    public void setImporteBase(double importeBase) {
        this.importeBase = importeBase;
    }

    public double calcularImporteFinal() {

        return importeBase;
    }

    public boolean PedidoValido() {

        if (!codigo.isEmpty() &&
                !cliente.isEmpty() &&
                importeBase > 0) {

            return true;
        }

        return false;
    }

    public boolean aplicarDescuento(double porcentaje) {

        if (porcentaje <= 0 || porcentaje >= 100) {

            return false;
        }

        importeBase = importeBase - (importeBase * porcentaje / 100);

        return true;
    }

    public String mostrarInfo() {

        return "Código: " + codigo +
                "Cliente: " + cliente +
                "Importe Base: " + importeBase +
                "Importe Final: " + calcularImporteFinal();
    }

    public static String mostrarTotalPedidos() {

        return "Total pedidos: " + totalPedidos;
    }
}
