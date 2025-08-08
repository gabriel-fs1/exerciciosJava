import java.util.LinkedList;

public class ex11 {

    public static void main(String[] args) {
        
        LinkedList<String> clientes = new LinkedList<String>();

        clientes.addLast("João");
        clientes.addLast("Maria");
        clientes.addLast("Pedro");
        clientes.addLast("Ana");
        clientes.addLast("Carlos");

        System.out.println("Lista original: " + clientes);

        clientes.removeFirst();
        clientes.removeFirst();

        System.out.println("\nLista após remover os 2 primeiros clientes: " + clientes);

        clientes.addFirst("Cleber");
        clientes.addFirst("Giovane");

        System.out.println("\nLista após adicionar 2 novos clientes no início: " + clientes + "\n");

    }
    
}
