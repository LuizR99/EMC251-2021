//Luiz Felipe de Oliveira Rodrigues 19.00574-0
package Rodrigues.Oliveira.Felipe.Luiz;

import java.util.Scanner;

public class Inter {

    private Scanner scanner;
    private boolean executar;
    private Transacoes transacoes = new Transacoes();
    private Contas[] c = new Contas[3];

    public void exibirMenu() { //Gera um menu com opções

        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Gerar um QR code");
        System.out.println("2 - Pagar via QR code");
        System.out.println("0 - Sair");
    }

    public void executar() { //Executa o programa e é orientado de acordo com a opção que o usuário digitar.

        this.scanner = new Scanner(System.in);
        this.executar = true;
        int op;

        while(executar) {
            exibirMenu();
            op = Integer.parseInt(scanner.nextLine()); // Por algum motivo dá erro no primeiro caso constando que op tem o valor "".
            avaliarOpcao(op);
        }
    }

    private void avaliarOpcao(int op) { //Decide qual opção seguir de acordo com o que o usuário digitou
        switch (op) {
            case 0:
                System.out.println("Fim da operação!");
                this.executar = false; //Quebra o while do executar(), encerrando o programa.
                break;
            case 1:
                System.out.println("Informe o id da conta cujo valor será destinado: ");
                String id = scanner.nextLine();
                System.out.println("Informe o nome do titular da conta: ");
                String titular = scanner.nextLine();
                System.out.println("Informe o valor para transferência: ");
                double valor = scanner.nextDouble();

                System.out.println(transacoes.receberPagamento(id, titular, valor)); //Gera o QRCode solicitado pelo usuário.
                break;
            case 2:
                System.out.println("Informe o seu id: ");
                String idPaga = scanner.nextLine();
                Contas paga = c[Integer.parseInt(idPaga)-1];

                System.out.println("Informe o id do destinatário: ");
                String idRecebe = scanner.nextLine();
                Contas recebe = c[Integer.parseInt(idRecebe)-1];

                System.out.println("Informe o QRCode: ");
                String QR = scanner.nextLine();

                if(transacoes.pagar(paga, recebe, QR)) { //verifica se a operação pode ser realizada.

                    System.out.println("Transação realizada com sucesso!");
                }
                else {

                    System.out.println("Não foi possível realizar a transação");
                }
                break;
        }

    }
}




// ideia para gerar várias contas diferentes (ignorar).
//import java.util.Scanner;

//public class Inter {
//    private Usuario usuario;
//    private Contas contas;
//    private Scanner scanner;
//    private Transacoes transacoes;
//    int n;
//    public String c[] = new String[n];
//    public String u[] = new String[n];
//
//    public Inter() {
//        int i;
//        this.scanner = new Scanner(System.in);
//
//        System.out.println("Quantos usuários serão criados no teste?");
//
//        n = 3;
//
//        this.c = new String[n];
//        this.u = new String[n];
//        for (i = 0; i < n; i++) {
//
//            String uAtual;
//            double uSaldo;
//            System.out.println("Informe o nome do usuário " + (1 + i) + ": ");
//            uAtual = scanner.next();
//            this.u[i] = uAtual;
//            System.out.println("Informe o saldo do usuário " + (1 + i) + ": ");
//            uSaldo = scanner.nextDouble();
//            this.contas = new Contas((1 + i), uSaldo, uAtual);
//            this.c[i] = contas.toString();
//        }
//
//    }
//
//
//
//}
