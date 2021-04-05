package Rodrigues.Oliveira.Felipe.Luiz;

public class DadoTestDrive {
    public static void main(String[] args) {
        Dados d1 = new Dados(6);
        for (int i = 0; i < 10; i++) {
            System.out.println("Informações do dado");
            System.out.println("Lançamento: " + d1.lancarDado());
            System.out.println("Lançamento atual: "+ d1.lerLancamentoAtual());
        }
    }
}
