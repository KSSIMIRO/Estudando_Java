package aula_310723;

enum NivelAcesso {
    COMUM, USUARIO, ADMINISTRADOR
}

class Pessoa {
    public String nome;
    public int idade;
    public NivelAcesso nivelAcesso;

    public Pessoa(String nome, int idade, NivelAcesso nivelAcesso) {
        this.nome = nome;
        this.idade = idade;
        this.nivelAcesso = nivelAcesso;
    }
}

public class EstudoEnums {
    public static void main(String[] args) {
        Pessoa davi = new Pessoa("Davi",8, NivelAcesso.USUARIO);

        if (davi.nivelAcesso == NivelAcesso.ADMINISTRADOR) {
            System.out.println("Libera tudo!");
        }
        else if (davi.nivelAcesso == NivelAcesso.USUARIO) {
            System.out.println("Libera somente area privada!");
        }
        else if (davi.nivelAcesso == NivelAcesso.COMUM) {
            System.out.println("Libera somente area publica!");
        }
    }
}

