package aula_310723;

class Garrafa {
    float volume;

    public float obterVolume() {
        return this.volume;
    }
}

public class EstudoMetodos {
    // Métodos/Funções -> São estruturas que executam uma determinada tarefa/atividade

    // Funções Que Recebem Parâmetros e Quem Não Recebem
    // Funções Que Retornam Valores e Quem Não Retornam
    public String bemVindo(String nome) {
        return "Bem-Vindo! " + nome;
    }

    public void imprimir(String texto) {
        System.out.println(texto);
    }

    public static double soma(double n1, double n2, double n3) {
        double s = n1 + n2 + n3;
        return s;
    }

    public  static void main(String[] args) {
//        double resultado = soma(12.1, 34.3, 7.4);
//        System.out.println(resultado);

       Garrafa garrafa = new  Garrafa();
       garrafa.volume = 1.5F;

       float volumaGarrafa = garrafa.obterVolume();
        System.out.println(volumaGarrafa + " Litros");
    }
}
