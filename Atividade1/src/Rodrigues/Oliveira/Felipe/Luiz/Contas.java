//Luiz Felipe de Oliveira Rodrigues 19.00574-0
package Rodrigues.Oliveira.Felipe.Luiz;

public class Contas {
    private String idConta;
    private double saldo;
    private Usuario usuario;

    public Contas(String idConta, double saldo, String nome) {
        this.idConta = idConta;
        this.saldo = saldo;
        this.usuario = new Usuario(nome);
    }

    public double getSaldo() {

        return saldo;
    }
    public Usuario getUsuario() {

        return usuario;
    }
    public String getId() {

        return idConta;
    }

    public void deposito(double valor){ //Soma o valor depositado no saldo.

        this.saldo += valor;
    }

    public boolean sacar(double valor) { //Verifica se é possível o saque e faz a retirada(caso verdade).

        if(this.saldo >= valor) {

            this.saldo -= valor;
            return true;
        }
        else {

            return false;
        }
    }

    public boolean transferencia(Contas recebe, double valor) { //Realiza a transferência

        if(this.sacar(valor)) {

            recebe.deposito(valor);
            return true;
        }
        else {

            return false;
        }
    }






    @Override
    public String toString() {
        return "Contas{" +
                "idConta=" + idConta +
                ", saldo=" + saldo +
                ", usuario=" + usuario +
                '}';
    }
}
