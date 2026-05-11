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



}
