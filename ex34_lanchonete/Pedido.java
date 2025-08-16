package ex34_lanchonete;

import java.util.ArrayList;

public class Pedido {
    
    private String nomeCliente;
    private Double taxaServico;
    private ArrayList<Prato> itensConsumidos;

    public Pedido(String nomeCliente, ArrayList<Prato> itensConsumidos) {
        this.nomeCliente = nomeCliente;
        this.itensConsumidos = itensConsumidos;
    }

    public double calcularTotal(){
        double subtotal = 0.0;
        for (Prato item : itensConsumidos) {
            item.calcularPreco();
            subtotal += item.getPreco();
        }
        taxaServico = 0.1 * subtotal;
        double total = subtotal + taxaServico;
        System.out.printf("Total do pedido: R$ %.2f%n", total);
        return subtotal;
    }

    public void mostrarFatura(){
        System.out.println("Fatura do Pedido:");
        System.out.println("Cliente: " + nomeCliente);
        double subtotal = calcularTotal();
        System.out.printf("==========================%n");
        System.out.println("Itens consumidos:");
        for (Prato item : itensConsumidos) {
            System.out.println("- " + item);
        }
        System.out.printf("==========================%n");
        System.out.printf("Subtotal: R$ %.2f%n", subtotal);
        System.out.printf("Taxa de serviço: R$ %.2f%n", taxaServico);
        System.out.printf("==========================%n");
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", taxaServico=" + taxaServico +
                ", itensConsumidos=" + itensConsumidos +
                '}';
    }

}
