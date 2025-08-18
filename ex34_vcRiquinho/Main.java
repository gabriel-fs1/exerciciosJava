package ex34_vcRiquinho;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
     private static List<Cliente> clientes = new ArrayList<>();
    private static List<ProdutosFinanceiros> produtos = new ArrayList<>();
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        

        int opcao = -1;

        while(opcao != 0){
            System.out.println("SEJA BEM-VINDO AO VCRIQUINHO!!");
            System.out.println("Menu de opcoes");
            System.out.println("0 - Sair");
            System.out.println("1 - Gerenciar Cliente");
            System.out.println("2 - Gerenciar Produtos Financeiros");
            System.out.println("3 - Simular Rendimento Conta");
            System.out.println("4 - Simular Produto Especifico");
            System.out.println("Selecione uma das opcoes: ");

            opcao = leitor.nextInt();
            leitor.nextLine();

            switch (opcao) {
                case 1:
                    gerenciarClientes(leitor);
                    break;
                
                case 2:
                    gerenciarProdutosFinanceiros(leitor);
                    break;

                case 3:
                    simularRendimento(leitor);
                    break;

                case 4:
                    simularProduto(leitor);
                    break;

                default:
                    System.out.println("Saindo...");
                    opcao = 0;
                    break;
            }


        }

        leitor.close();

    }

    public static void gerenciarClientes(Scanner leitor){
        
        int opcaoCliente = -1;
        while (opcaoCliente != 0) {
            System.out.println("Menu de opcoes de clientes");
            System.out.println("\n--- Gerenciar Clientes ---");
            System.out.println("0 - Voltar ao Menu Principal");
            System.out.println("1 - Cadastrar Novo Cliente");
            System.out.println("2 - Listar Clientes");
            System.out.println("3 - Editar informacoes de Clientes");
            System.out.println("4 - Abrir Nova Conta para Cliente");
            System.out.println("5 - Fechar Conta de Cliente");
            System.out.println("6 - Remover Cliente");
            System.out.println("7 - Depositar na Conta de Cliente");
            System.out.print("Selecione uma das opcoes: ");

            opcaoCliente = leitor.nextInt();
            leitor.nextLine();

            switch (opcaoCliente) {
                case 1:
                    cadastrarCliente(leitor, clientes);
                    break;
                case 2:
                    listarClientes(clientes);
                    break;
                case 3:
                    atualizarCliente(leitor, clientes);
                    break;
                case 4:
                    abrirNovaConta(leitor, clientes);
                    break;
                case 5:
                    fecharConta(leitor, clientes);
                    break;
                case 6:
                    removerCliente(leitor, clientes);
                    break;
                case 7:
                    depositar(leitor, clientes);
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opcao invalida.");
                    break;
            }
            if (opcaoCliente != 0) {
                System.out.println("\nPressione Enter para continuar...");
                leitor.nextLine();
            }
        }
    }


    public static void cadastrarCliente(Scanner leitor, List<Cliente> listaDeClientes){
        System.out.println("\n--- Cadastro de Novo Cliente ---");
        System.out.print("Escolha o tipo: \n1 - Pessoa Fisica\n2 - Pessoa Juridica\n");
        String tipo = leitor.nextLine();

        if (tipo.equals("1")) {
            cadastrarClientePf(leitor, listaDeClientes);
        } else if (tipo.equals("2")) {
            cadastrarClientePj(leitor, listaDeClientes);
        } else {
            System.out.println("Tipo inválido!");
        }
    }

    public static void cadastrarClientePf(Scanner leitor, List<Cliente> listaDeClientes){
        System.out.println("Cadastro de Pessoa Fisica");
        System.out.println("Nome: ");
        String nomePF = leitor.nextLine();
        System.out.println("Email: ");
        String emailPF = leitor.nextLine();
        System.out.println("CPF: ");
        String cpf = leitor.nextLine();

        Cliente novoclientePF = new PF(nomePF, emailPF, cpf);

        System.out.println("\n--- Cadastro da Primeira Conta Obrigatória ---");
        System.out.print("Escolha o tipo da conta: \n1 - Conta Corrente\n2 - Conta CDI\n3 - Conta de Investimento\n");
        String tipoConta = leitor.nextLine();
        Contas primeiraConta = null;

        if (tipoConta.equalsIgnoreCase("1")) {
            primeiraConta = new ContaCorrente(novoclientePF);
        } else if (tipoConta.equalsIgnoreCase("2")) {
            primeiraConta = new ContaCDI(novoclientePF);
        } else if (tipoConta.equalsIgnoreCase("3")) {
            primeiraConta = new ContaInvestimentoAutomatico(novoclientePF);
        } else {
            System.out.println("Tipo de conta inválido! O cadastro do cliente foi cancelado.");
            return;
        }

        novoclientePF.adicionarConta(primeiraConta);
        listaDeClientes.add(novoclientePF);
        System.out.println("Cliente e conta criados com sucesso!");
    }

    public static void cadastrarClientePj(Scanner leitor, List<Cliente> listaDeClientes){
        System.out.println("Cadastro de Pessoa Juridica");
        System.out.println("Nome: ");
        String nomePJ = leitor.nextLine();
        System.out.println("Email: ");
        String emailPJ = leitor.nextLine();
        System.out.println("CNPJ: ");
        String cnpj = leitor.nextLine();

        Cliente novoclientePJ = new PJ(nomePJ, emailPJ, cnpj);

        System.out.println("\n--- Cadastro da Primeira Conta Obrigatoria ---");
        System.out.print("Escolha o tipo da conta: \n" + 
                        "1 - Conta Corrente\n" + 
                        "2 - Conta CDI\n" + 
                        "3 - Conta de Investimento\n" + 
                        "");
        String tipoConta = leitor.nextLine();
        Contas primeiraConta = null;

        if (tipoConta.equalsIgnoreCase("1")) {
            primeiraConta = new ContaCorrente(novoclientePJ);
        } else if (tipoConta.equalsIgnoreCase("2")) {
            primeiraConta = new ContaCDI(novoclientePJ);
        } else if (tipoConta.equalsIgnoreCase("3")) {
            primeiraConta = new ContaInvestimentoAutomatico(novoclientePJ);
        } else {
            System.out.println("Tipo de conta inválido! O cadastro do cliente foi cancelado.");
            return;
        }
        novoclientePJ.adicionarConta(primeiraConta);
        listaDeClientes.add(novoclientePJ);
        System.out.println("Cliente e conta criados com sucesso!");

    }

    public static void listarClientes(List<Cliente> listaDeClientes){
        System.out.println("\n--- Listagem de Clientes ---");

        if (listaDeClientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado no sistema.");
            return; 
        }

        for (int i = 0; i < listaDeClientes.size(); i++) {
            Cliente cliente = listaDeClientes.get(i);
            String tipoCliente;
            String documento;

            if (cliente instanceof PF) {
                tipoCliente = "Pessoa Física";
                PF pf = (PF) cliente;
                documento = "CPF: " + pf.getCpf(); 
            } else {
                tipoCliente = "Pessoa Jurídica";
                PJ pj = (PJ) cliente;
                documento = "CNPJ: " + pj.getCnpj();
            }
            System.out.println("----------------------------------------------");
            System.out.println("[" + i + "] Cliente: " + cliente.getNome() + " (" + tipoCliente + ")");
            System.out.println("    Email: " + cliente.getEmail()); 
            System.out.println("    " + documento);
            List<Contas> contasDoCliente = cliente.getContas();

            if (contasDoCliente.isEmpty()) {
                System.out.println("    Contas: Nenhuma conta cadastrada.");
            } else {
                System.out.println("    Contas:");
                for (Contas conta : contasDoCliente) {
                    String tipoConta = conta.getClass().getSimpleName(); //logica daquele exer de pegar nome da classe tlgd 
                    String saldoFormatado = String.format("%.2f", conta.getSaldo());
                    System.out.println("      - " + tipoConta + " | Saldo: R$ " + saldoFormatado);
                }
            }
            System.out.println("----------------------------------------------");    
        }
    }

    public static void atualizarCliente(Scanner leitor, List<Cliente> listaDeClientes) {
        //todas as logicas tem index como base viu
        System.out.println("\n--- Atualização de Informações de Clientes ---");

        listarClientes(listaDeClientes);

        if (listaDeClientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado no sistema.");
            return;
        }
        try{
            System.out.print("Digite o index do cliente que deseja atualizar: ");
            int index = leitor.nextInt();
            leitor.nextLine();

            if (index < 0 || index >= listaDeClientes.size()) {
                System.out.println("Index inválido!");
                return;
            }

            Cliente clienteatt = listaDeClientes.get(index);
            
            System.out.print("Digite o novo nome (ou deixe em branco para não alterar '" + clienteatt.getNome() + "'): ");
            String novoNome = leitor.nextLine();
            
            if (!novoNome.trim().isEmpty()) {
                clienteatt.setNome(novoNome);
            }

            System.out.print("Digite o novo email (ou deixe em branco para não alterar '" + clienteatt.getEmail() + "'): ");
            String novoEmail = leitor.nextLine();
            if (!novoEmail.trim().isEmpty()) {
                clienteatt.setEmail(novoEmail);
            }

            System.out.println("\nCliente atualizado com sucesso!");


        } catch (Exception e){
            System.out.println("Erro ao atualizar o cliente: " + e.getMessage());
        }
    }

    public static void fecharConta(Scanner leitor, List<Cliente> listaDeClientes) {

        System.out.println("\n--- Fechar Conta ---");

        listarClientes(listaDeClientes);
        if(listaDeClientes.isEmpty()){
            System.out.println("Nenhum cliente cadastrado no sistema.");
            return;
        }
        try{
            System.out.print("Digite o index do cliente que deseja fechar a conta: ");
            int index = leitor.nextInt();
            leitor.nextLine();

            if (index < 0 || index >= listaDeClientes.size()) {
                System.out.println("Index inválido!");
                return;
            }

            Cliente cliente = listaDeClientes.get(index);

            if (cliente.getContas().size() <= 1) {
                System.out.println("\n[ERRO] Não é possível fechar a última conta de um cliente.");
                System.out.println("Um cliente deve possuir pelo menos uma conta cadastrada, a funcionalidade deve ser excluir cliente. "); 
                return;
            }

            System.out.println("\nContas do cliente '" + cliente.getNome() + "':");

            List<Contas> contasDoCliente = cliente.getContas();

            for (int i = 0; i < contasDoCliente.size(); i++) {
                Contas conta = contasDoCliente.get(i);
                String tipoConta = conta.getClass().getSimpleName();
                String saldoFormatado = String.format("%.2f", conta.getSaldo());
                System.out.println("[" + i + "] " + tipoConta + " | Saldo: R$ " + saldoFormatado);
            }

            System.out.print("\nDigite o índice da conta que deseja fechar: ");
            int indiceConta = Integer.parseInt(leitor.nextLine());

            if (indiceConta < 0 || indiceConta >= contasDoCliente.size()) {
                System.out.println("Erro: Indice de conta invalido.");
                return;
            }

            Contas contaDelete = contasDoCliente.get(indiceConta);

            if (contaDelete.getSaldo() > 0) {
                String saldoFormatado = String.format("%.2f", contaDelete.getSaldo());
                System.out.println("\n[ERRO] Esta conta não pode ser fechada, pois ainda possui um saldo de R$ " + saldoFormatado + ".");
                System.out.println("Peça para o cliente sacar ou transferir o valor antes de fechar a conta.");
                return;
            }

            System.out.print("Tem certeza que deseja quer fechar a conta " + contaDelete.getClass().getSimpleName() + " do cliente " + cliente.getNome() + "? (S/N): ");
            String confirmacao = leitor.nextLine().toUpperCase();

            if (confirmacao.equals("S")) {
                cliente.removerConta(contaDelete);
                System.out.println("\nConta fechada com sucesso!");
            }else{
                System.out.println("\nOperacao cancelada.");
            }



        }catch (NumberFormatException e){
            System.out.println("Erro ao fechar a conta: " + e.getMessage());
        }
    }

    public static void removerCliente(Scanner leitor, List<Cliente> listaDeClientes) {

        System.out.println("\n--- Remover Cliente ---");

        listarClientes(listaDeClientes);

        if(listaDeClientes.isEmpty()){
            return;
        }

        try{
            System.out.print("Digite o index do cliente que deseja remover: ");
            int index = leitor.nextInt();
            leitor.nextLine();

            if (index < 0 || index >= listaDeClientes.size()) {
                System.out.println("Index inválido!");
                return;
            }   

            Cliente clienteRemove = listaDeClientes.get(index);

            double saldoTotal = 0;
            for (Contas conta : clienteRemove.getContas()) {
                saldoTotal += conta.getSaldo();
            }
            
            if (saldoTotal > 0) {
                String saldoFormatado = String.format("%.2f", saldoTotal);
                System.out.println("\n[ERRO] Este cliente não pode ser removido, pois ainda possui um saldo total de R$ " + saldoFormatado + " em suas contas.");
                System.out.println("A remoção foi cancelada para garantir a integridade financeira.");
                return;
            }

            System.out.print("Tem certeza que deseja quer remover o cliente " + clienteRemove.getNome() + "? (S/N): ");
            String confirmacao = leitor.nextLine().toUpperCase();

            if (confirmacao.equals("S")) {
                listaDeClientes.remove(clienteRemove);
                System.out.println("\nCliente removido com sucesso!");
            }else{
                System.out.println("\nOperacao cancelada.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro ao remover o cliente: " + e.getMessage());
        }
    }
    
    public static void abrirNovaConta(Scanner leitor, List<Cliente> clientes) {
        System.out.println("\n--- Abrir Nova Conta ---");
        listarClientes(clientes);

        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado no sistema");
            return;
        }
        
        try {
            System.out.print("Digite o index do cliente que deseja abrir uma nova conta: ");

            int index = leitor.nextInt();
            leitor.nextLine();

            if (index < 0 || index >= clientes.size()) {
                System.out.println("Index inválido!");
                return;
            }

            Cliente clienteSelecionado = clientes.get(index);

            System.out.println("\nQual tipo de conta deseja abrir para o cliente " + clienteSelecionado.getNome() + "?");
            System.out.println("1 - Conta Corrente");
            System.out.println("2 - Conta CDI");
            System.out.println("3 - Conta de Investimento");
            System.out.print("Selecione uma das opcoes: ");

            int opcaoConta = leitor.nextInt();
            leitor.nextLine();

            Contas novaConta = null;
            
            // lógica para evitar cadastro de contas duplicadas mas nao sei se precisa
            // if(opcaoConta == 1 && clienteSelecionado.getContas().stream().anyMatch(conta -> conta instanceof ContaCorrente)){
            //     System.out.println("\n[ERRO] O cliente " + clienteSelecionado.getNome() + " ja possui uma Conta Corrente.");
            //     return;
            // } else if(opcaoConta == 2 && clienteSelecionado.getContas().stream().anyMatch(conta -> conta instanceof ContaCDI)){
            //     System.out.println("\n[ERRO] O cliente " + clienteSelecionado.getNome() + " ja possui uma Conta CDI.");
            //     return;
            // } else if(opcaoConta == 3 && clienteSelecionado.getContas().stream().anyMatch(conta -> conta instanceof ContaInvestimentoAutomatico)){
            //     System.out.println("\n[ERRO] O cliente " + clienteSelecionado.getNome() + " ja possui uma Conta de Investimento.");
            //     return;
            // }
            switch (opcaoConta) {
                case 1:
                    novaConta = new ContaCorrente(clienteSelecionado);
                    break;
                case 2:
                    novaConta = new ContaCDI(clienteSelecionado);
                    break;
                case 3:
                    novaConta = new ContaInvestimentoAutomatico(clienteSelecionado);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    return;
            }

            clienteSelecionado.adicionarConta(novaConta);

            System.out.println("\nConta criada com sucesso!");

        } catch (NumberFormatException e) {
            System.out.println("Erro ao abrir uma nova conta: " + e.getMessage());
        }
    }

    public static void depositar(Scanner leitor, List<Cliente> clientes) {
    System.out.println("\n--- Depositar ---");

    if (clientes.isEmpty()) {
        System.out.println("Nenhum cliente cadastrado no sistema.");
        return;
    }

    System.out.println("Clientes disponíveis:");

    listarClientes(clientes);

    try {
        System.out.print("\nDigite o índice do cliente que receberá o depósito: ");
        int indexCliente = leitor.nextInt();
        leitor.nextLine(); 

        if (indexCliente < 0 || indexCliente >= clientes.size()) {
            System.out.println("Índice de cliente inválido!");
            return;
        }

        Cliente clienteSelecionado = clientes.get(indexCliente);
        List<Contas> contasDoCliente = clienteSelecionado.getContas(); 

        System.out.println("\nContas do cliente " + clienteSelecionado.getNome() + ":");
        for (int i = 0; i < contasDoCliente.size(); i++) {
            System.out.println("[" + i + "]"  + " - " + contasDoCliente.get(i).toString());
        }

        System.out.print("Selecione o índice da conta para depositar: ");
        int indexConta = leitor.nextInt();
        leitor.nextLine();

        if (indexConta < 0 || indexConta >= contasDoCliente.size()) {
            System.out.println("Índice de conta inválido!");
            return;
        }

        Contas contaSelecionada = contasDoCliente.get(indexConta);

        System.out.print("\nDigite o valor a ser depositado: R$ ");
        double valor = leitor.nextDouble();
        leitor.nextLine();

        contaSelecionada.depositar(valor);

        System.out.println("\nDepósito de R$ " + valor + " realizado com sucesso na " + contaSelecionada.toString() + " de " + clienteSelecionado.getNome() + ".");

    } catch (java.util.InputMismatchException e) { 
        System.out.println("Erro: Entrada inválida. Por favor, digite um número.");
        leitor.nextLine(); 
    }
}


    public static void simularRendimento(Scanner leitor) {
        System.out.println("\n--- Simular Rendimento ---");
        if(clientes.isEmpty()){
            System.out.println("Nenhum cliente cadastrado no sistema, você precisa cadastrar um primeiro.");
            return;
        }

        listarClientes(clientes);

        try{
            System.out.println("Selecione o index do cliente que deseja simular o rendimento: ");
            int index = leitor.nextInt();
            leitor.nextLine();
            Cliente cliente = clientes.get(index);
            

            System.out.println("Digite o periodo de dias para a simulacao (30, 60, 90 ou 180): ");
            int dias = leitor.nextInt();
            leitor.nextLine();

            System.out.println("\n==============================================");
            System.out.println("--- RESULTADO DA SIMULAÇÃO PARA " + dias + " DIAS ---");
            simulacaoCliente(cliente, dias);
        } catch (Exception e) {
            System.out.println("Erro ao simular o rendimento: " + e.getMessage());
        }
    }

    public static void simulacaoCliente(Cliente cliente, int dias) {
        System.out.println("\n----------------------------------------------");
        System.out.println("CLIENTE: " + cliente.getNome() + " (" + (cliente instanceof PF ? "PF" : "PJ") + ")");
        System.out.println("----------------------------------------------");

        double rendimentoTotalCliente = 0;
        double taxaTotalCliente = 0;

        if(cliente.getContas().isEmpty()){
            System.out.println("Nenhuma conta cadastrada para o cliente.");
            return;
        }

        for (Contas conta : cliente.getContas()){
            System.out.println("\n  -> CONTA: " + conta.getClass().getSimpleName());
            System.out.println("     Saldo atual: R$ " + String.format("%.2f", conta.getSaldo()));

            double rendimentoBrutoConta = conta.calcularRendimento(dias);
            rendimentoTotalCliente += rendimentoBrutoConta;
            System.out.println("     Rendimento bruto PROJETADO: R$ " + String.format("%.2f", rendimentoBrutoConta));

            double taxaServico = 0.0;
            String observacaoSobreCarencia = "";

            if (conta instanceof Tributavel){
                Tributavel conTributavel = (Tributavel) conta;
                double baseTributavel = rendimentoBrutoConta;

                if (conta instanceof ContaInvestimentoAutomatico){
                    ContaInvestimentoAutomatico contaInves = (ContaInvestimentoAutomatico) conta;
                    baseTributavel = 0.0;

                    if (!contaInves.getCarteira().isEmpty()) {
                        double saldoPorProduto = contaInves.getSaldo() / contaInves.getCarteira().size();

                        for (ProdutosFinanceiros produto : contaInves.getCarteira()) {
                            double rendimentoProduto = produto.calcularRendimentoProjetado(saldoPorProduto, dias);

                            if(produto instanceof RendaFixa && dias < ((RendaFixa) produto).getPeriodoCarenciaDias()){
                                observacaoSobreCarencia = "     AVISO: Rendimento de R$ " + String.format("%.2f", rendimentoProduto) + " do produto '" + produto.getNome() + "' isento de taxa (período de carência).";

                            } else {
                                baseTributavel += rendimentoProduto;
                            }
                        }
                    }
                }

                taxaServico = conTributavel.calcularTaxaServico(baseTributavel);
                taxaTotalCliente += taxaServico;
            }

            System.out.println("     Taxa de servico: R$ " + String.format("%.2f", taxaServico));

            if (observacaoSobreCarencia != "") {
                System.out.println(observacaoSobreCarencia);
            }
        }
        System.out.println("\n  -----------------------------------");
        System.out.println("  RESUMO PARA " + cliente.getNome() + ":");
        System.out.println("  Rendimento Bruto Total: R$ " + String.format("%.2f", rendimentoTotalCliente));
        System.out.println("  Taxa de Serviço Total: R$ " + String.format("%.2f", taxaTotalCliente));
        System.out.println("  Rendimento Líquido Projetado: R$ " + String.format("%.2f", (rendimentoTotalCliente - taxaTotalCliente)));
        System.out.println("  -----------------------------------");
    }

    //Aqui vai pra tentar simular o produto separado, mas nao funfa entao vou deixar sem nada fé
    public static void simularProduto(Scanner leitor){
        
    }
    

    public static void gerenciarProdutosFinanceiros(Scanner leitor){
        
        int opcaoProduto = -1;

        while(opcaoProduto != 0){
            System.out.println("Menu de opcoes de produtos financeiros");
            System.out.println("\n--- Gerenciar Produtos Financeiros ---");
            System.out.println("0 - Voltar ao Menu Principal");
            System.out.println("1 - Cadastrar Novo Produto Financeiro");
            System.out.println("2 - Listar Produtos Financeiros");
            System.out.println("3 - Editar informacoes de Produtos Financeiros");
            System.out.println("4 - Remover Produto Financeiro");
            System.out.print("Selecione uma das opcoes: ");

            opcaoProduto = leitor.nextInt();
            leitor.nextLine();
            
            switch (opcaoProduto) {
                 case 1:
                    cadastrarProduto(leitor);
                    break;
                case 2:
                    listarProdutos(produtos);
                    break;
                case 3:
                    atualizarProduto(leitor, produtos);
                    break;
                case 4:
                    excluirProduto(leitor, produtos);
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opcao invalida.");
                    break;
            }
            if (opcaoProduto != 0) {
                 System.out.println("\nPressione Enter para continuar...");
                 leitor.nextLine();
            }
        }
    }


    //nessa função por algum motivo o fixo vc tem que usar "," para adicionar o numero e a variavel tem que ser "."
    private static void cadastrarProduto(Scanner leitor) {
        System.out.println("\n--- Cadastro de Novo Produto Financeiro ---");

        System.out.print("Tipo do produto: \n1 - Fixa\n2 - Variavel\n");
        String tipoProduto = leitor.nextLine();

        System.out.println("Nome do produto: ");
        String nome = leitor.nextLine();

        System.out.print("Descrição: ");
        String descricao = leitor.nextLine();

        try {
            if (tipoProduto.equals("1")) {
                
                System.out.print("Rendimento mensal fixo (ex: 0,01 para 1%): ");
                double rendimento = leitor.nextDouble();
                System.out.print("Período de carência em dias: ");
                int carencia = leitor.nextInt();

                ProdutosFinanceiros novoProd = new RendaFixa(nome, descricao, rendimento, carencia);
                produtos.add(novoProd);
                System.out.println("Produto cadastrado com sucesso!");

            } else if (tipoProduto.equals("2")) {

                System.out.print("Rendimento mensal esperado (ex: 0.02 para 2%): ");
                double rendimento = Double.parseDouble(leitor.nextLine());
                ProdutosFinanceiros novoProduto = new RendaVariavel(nome, descricao, rendimento);
                produtos.add(novoProduto);
                System.out.println("Produto de Renda Variável cadastrado com sucesso!");
            }
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar o produto: " + e.getMessage());
        }
    }

    public static void listarProdutos(List<ProdutosFinanceiros> produtos) {
        System.out.println("\n--- Listagem de Produtos Financeiros ---");
        
        if (produtos.isEmpty()){
            System.out.println("Nenhum produto cadastrado no sistema.");
            return;
        }

        for (int i = 0; i < produtos.size(); i++) {
            ProdutosFinanceiros produto = produtos.get(i);

            System.out.println("----------------------------------------");
            System.out.println("[" + i + "] " + produto.getNome() + " (" + produto.getClass().getSimpleName() + ")");
            System.out.println("    Descrição: " + produto.getDescricao());

            if (produto instanceof RendaFixa) {
                RendaFixa rf = (RendaFixa) produto;
                
                System.out.println("    Rendimento Fixo: " + String.format("%.2f", rf.getRendimentoMensal() * 100) + "% ao mês");
                System.out.println("    Carência: " + rf.getPeriodoCarenciaDias() + " dias");

            }else if (produto instanceof RendaVariavel) {
            RendaVariavel rv = (RendaVariavel) produto;

            System.out.println("    Rendimento Esperado: " + String.format("%.2f", rv.getRendimentoMensalEsperado() * 100) + "% ao mês");
            }
        }
        System.out.println("----------------------------------------");
    }

    public static void atualizarProduto(Scanner leitor, List<ProdutosFinanceiros> produtos) {
        System.out.println("\n--- Edição de Produto Financeiro ---");

        listarProdutos(produtos);

        if (produtos.isEmpty()) {
            return;
        }

        try{
            System.out.print("Selecione o index do produto que deseja editar: ");
            int index = leitor.nextInt();
            leitor.nextLine();

            if (index < 0 || index >= produtos.size()) {
                System.out.println("Index inválido!");
                return;
            }

            ProdutosFinanceiros produtoAtt = produtos.get(index);

            System.out.print("Digite o novo nome (ou deixe em branco para não alterar '" + produtoAtt.getNome() + "'): ");
            String novoNome = leitor.nextLine();

            if (!novoNome.trim().isEmpty()) {
                produtoAtt.setNome(novoNome);
            }

            System.out.print("Digite a nova descrição (ou deixe em branco para não alterar '" + produtoAtt.getDescricao() + "'): ");
            String novaDescricao = leitor.nextLine();

            if (!novaDescricao.trim().isEmpty()) {
                produtoAtt.setDescricao(novaDescricao);
            }

            System.out.println("Produto atualizado com sucesso!");

        } catch (Exception e) {
            System.out.println("Erro ao editar o produto: " + e.getMessage());
        }

    }

    public static void excluirProduto(Scanner leitor, List<ProdutosFinanceiros> produtos) {
        System.out.println("\n--- Exclusão de Produto Financeiro ---");

        listarProdutos(produtos);
        if (produtos.isEmpty()) {
            return;
        }

        try {
            System.out.print("Selecione o index do produto que deseja excluir: ");
            int index = leitor.nextInt();
            leitor.nextLine();

            if (index < 0 || index >= produtos.size()) {
                System.out.println("Index inválido!");
                return;
            }

            ProdutosFinanceiros produtoExcluir = produtos.get(index);
            boolean produtoEmUso = false;
            for (Cliente cliente : clientes){
                for (Contas conta : cliente.getContas()){
                    if(conta instanceof ContaInvestimentoAutomatico){
                        ContaInvestimentoAutomatico containves = (ContaInvestimentoAutomatico) conta;

                        if (containves.getCarteira().contains(produtoExcluir)){
                            produtoEmUso = true;
                            System.out.println("Produto em uso, impossivel excluir!");
                            break;
                        }
                    }
                }
             if (produtoEmUso){
                break;
             }
            }

            if (!produtoEmUso){
                System.out.print("Tem certeza que deseja remover o produto '" + produtoExcluir.getNome() + "' do catálogo? (S/N): ");
                String confirmacao = leitor.nextLine().toUpperCase();


                if (confirmacao.equals("S")){
                    produtos.remove(index);
                    System.out.println("Produto excluido com sucesso!");
                }else{
                    System.out.println("Exclusão cancelada!");
                }
            }
        } catch (Exception e) {
            System.out.println("Erro ao excluir o produto: " + e.getMessage());
        }
    }
}