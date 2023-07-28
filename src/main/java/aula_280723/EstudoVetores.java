package aula_280723;

import java.util.Scanner;

public class EstudoVetores {
    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 4, 5}; // vetor de numeros interos
//        System.out.println(nums[4]);
//        nums[4] = 8;
//        System.out.println(nums[4]);
//
//        double[] notas = new double[60]; // declara um vetor double vazio com 60 posições
//        notas[59] = 5.6;
//        System.out.println(notas[59]);
//
//        String[] nomes = {"Fernando", "Felipe"}; // válido
//        String nomes2[] = {"João", "Maria"}; // válido
//
//        for (int i = 0; i < nums.length; i++) { // interar sobre o vetor
//            System.out.println(nums[i]);
//        }
//        System.out.println(); // quebra de linha
//
//        for (int num : nums) { // for each do java
//            System.out.println(num);
//        }
//        System.out.println(); // quebra de linha

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de notas");
        int nNotas = scanner.nextInt();
        double[] notas = new double[nNotas];
        for (int i = 0; i < nNotas; i++) {
            System.out.println("Digite a nota: ");
            notas[i] = scanner.nextDouble(); // Guarrdar as notas no vetor
        }
        double media = 0.0;
        for (double nota : notas) media += nota; // soma todos os vetoes
        media /= nNotas; // calculo da media com base no númeo de notas
        System.out.printf("A media é igual a %.2f", media);
    }
}
