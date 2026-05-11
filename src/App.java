import Net.Salesianos.Pedidos.Pedido;
import Net.Salesianos.Pedidos.PedidoInternacional;
import Net.Salesianos.Pedidos.PedidoNacional;

public class App {

    public static void main(String[] args) {

        Pedido pedidoBase = new Pedido();

        pedidoBase.setCodigo("P001");
        pedidoBase.setCliente("Lucía");
        pedidoBase.setImporteBase(80);

        System.out.println(pedidoBase.mostrarInfo());

        System.out.println("Pedido válido: " + pedidoBase.PedidoValido());

        pedidoBase.aplicarDescuento(10);

        System.out.println("Después del descuento:");

        System.out.println(pedidoBase.mostrarInfo());

        System.out.println(Pedido.mostrarTotalPedidos());


        PedidoNacional pedidoRapido = new PedidoNacional();

        pedidoRapido.setCodigo("P002");
        pedidoRapido.setCliente("Mario");
        pedidoRapido.setImporteBase(120);

        pedidoRapido.setPeso(6.5);
        pedidoRapido.setUrgente(true);

        System.out.println("----------------");

        System.out.println(pedidoRapido.mostrarInfo());

        pedidoRapido.cambiarUrgencia();

        System.out.println("Cambio de urgencia:");

        System.out.println(pedidoRapido.mostrarInfo());

        System.out.println("Pedido válido: " + pedidoRapido.PedidoValido());

        System.out.println(Pedido.mostrarTotalPedidos());

        PedidoInternacional pedidoExterior = new PedidoInternacional();

        pedidoExterior.setCodigo("P003");
        pedidoExterior.setCliente("Sara");
        pedidoExterior.setImporteBase(250);
        pedidoExterior.setPaisDestino("Suiza");
        pedidoExterior.setAduanas(true);

        System.out.println("----------------");

        System.out.println(pedidoExterior.mostrarInfo());

        System.out.println("Revisión aduanera: "
                + pedidoExterior.requiereRevisionAduanera());

        pedidoExterior.aplicarDescuento(5);

        System.out.println("Después del descuento:");

        System.out.println(pedidoExterior.mostrarInfo());

        System.out.println(Pedido.mostrarTotalPedidos());

        Pedido[] tiendaOnline = new Pedido[3];

        tiendaOnline[0] = pedidoBase;
        tiendaOnline[1] = pedidoRapido;
        tiendaOnline[2] = pedidoExterior;

        double total = 0;

        int validos = 0;

        Pedido mayor = tiendaOnline[0];

        System.out.println("====== PEDIDOS ======");

        for (Pedido p : tiendaOnline) {

            System.out.println("----------------");

            System.out.println(p.mostrarInfo());

            total = total + p.calcularImporteFinal();

            if (p.PedidoValido()) {

                validos++;
            }

            if (p.calcularImporteFinal() > mayor.calcularImporteFinal()) {

                mayor = p;
            }
        }

        System.out.println("====== RESULTADOS ======");

        System.out.println("Total importes: " + total);

        System.out.println("Pedidos válidos: " + validos);

        System.out.println("Pedido mayor: " + mayor.getCodigo());

        System.out.println("Importe mayor: " + mayor.calcularImporteFinal());
    }
}