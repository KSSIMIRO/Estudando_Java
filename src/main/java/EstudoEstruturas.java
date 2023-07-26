import java.util.Scanner;

public class EstudoEstruturas {
    public static void main(String[] args) {
        // Scaner = vai permitir a leitura de dados do teclado
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = entrada.nextLine(); // aguarda o texto digitado pelo usuário
        System.out.println(nome);

        // Exercício: Leia o peso da pessoa.
        // Calcule o IMC.
        // Verifique a situação do imc calculado com
        // base em: https://www.saude.rj.gov.br/obesidade/calcule-seu-imc

        System.out.println("Digite sua altura (em metros): ");
        double altura = entrada.nextDouble(); // digite o numero com viegula: 1,78

        System.out.println("Digite seu peso em kg: ");
        double peso = entrada.nextDouble();
        
        double imc = peso / Math.pow(altura, 2);
        
        if (imc < 17) {
            System.out.println("Muito abaixo do peso.");
        } else if (imc >= 17 && imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Peso normal.");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Acima do peso");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("Obesidade 1");
        } else if (imc >= 35 && imc < 40) {
            System.out.println("Obesidade 2");
        } else  {
            System.out.println("Obesidade 3");
        }

        System.out.println("Selecione uma dieta (1 a 3");
        System.out.println("1 - água");
        System.out.println("2 - fruta");
        System.out.println("3 - batata");
        
        int opcao = entrada.nextInt();
        
        switch (opcao) {
            case 1:
                System.out.println("Você escolheu a dieta da água!");
                break;
            case 2:
                System.out.println("Você escolheu a dieta da fruta!");
                break;
            case 3:
                System.out.println("Você escolheu a dieta da batata!");
                break;
            default:
                System.out.println("Escolha uma dieta válida!");
                break;
        }

        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();
        
        String mensagem = (idade >= 18) ? "Você é maior de idade" : "Você é menor de idade";
        System.out.println(mensagem);
        
        // Repetição
        // início
        // condição de parada
        // atualização do valor

        System.out.println("Digite quantos alimentos você come?");
        int total = entrada.nextInt();
        
        for (int i = 0; i < total; i++) {
            System.out.println("Você gosta de batata!");
        }
        
        // Exercício: Criem uma versão com whilw do código
        
        int i = 0;

        while (i < total) {
            System.out.println("Você gosta de batata!");
            i++;
        }

        int j = 0;

        do {
            System.out.println("Você gosta de batata!");
            j++;
        } while (j < total);
        
    }
}
