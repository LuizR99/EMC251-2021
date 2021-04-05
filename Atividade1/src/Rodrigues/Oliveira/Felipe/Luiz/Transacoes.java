package Rodrigues.Oliveira.Felipe.Luiz;

import java.util.Random;

public class Transacoes {


    private static int getRandomNumberInRange(int min, int max) { //Gera um número randômico para usar como código no QRCode.

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public String receberPagamento(String id, String usuario, double valor) { //Retorna a String completa do QRCode.

        String s ="" + id + ";" + usuario + ";" + valor + ";" + getRandomNumberInRange( 1000, 9999);
        return s;

    }

    public boolean pagar(Contas paga, Contas recebe, String QR) {

        String[] dados = QR.split(";");
        String id = dados[0];
        String usuario = dados[1];
        String valor = dados[2];
        double val0r =Double.parseDouble(valor);
        String numAleatorio = dados[3];

        if(recebe.getId().equals(id) && recebe.getUsuario().getNome().equals(usuario)) { //Valida o id e nome de usuario fornecidos pelo usuário via QRCode.

            if(paga.transferencia(recebe, val0r)) {

                return true;
            }
            else {

                return false;
            }
        }
        else {

            return false;
        }
    }







}
