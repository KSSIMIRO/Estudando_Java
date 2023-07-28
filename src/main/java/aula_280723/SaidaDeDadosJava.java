package aula_280723;

public class SaidaDeDadosJava {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); // saida no console
        System.out.print(1);
        System.out.print(2);
        System.out.println(); // quebra de linha
        System.out.println("Oi\nEu sou Java!");
        System.err.println("Ops! Houve um erro!"); // serr

        int n1 = 7;
        int n2 = 9;
        int soma = n1 + n2;

        System.out.printf("A soma de %d e %d é igual a %d\n", n1, n2, soma);

        String nome = "Matheus";
        System.out.printf("Bem vindo, %s\n", nome);

        double nu1 = 3.4;
        double nu2 = 12.5;
        double div = nu1 / nu2;
        System.out.printf("A divisão de %.2f e %.2f é igual a %.3f\n", nu1, nu2, div);
        // %d -> mapeia um numero
        // %s -> mapeia um texto
        // %f -> mapeia um numero flutuante
    }
}
