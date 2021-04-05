//Luiz Felipe de Oliveira Rodrigues 19.00574-0
package Rodrigues.Oliveira.Felipe.Luiz;

public class Usuario {
    private String nome;
    private String senha;
    private String email;


    public Usuario(String nome){ //(String nome, String senha, String email)
        this.nome = nome;
        //this.senha = senha;
        //this.email = email;

    }

    public String getNome() {

        return nome;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
