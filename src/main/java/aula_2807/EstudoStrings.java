package aula_280723;

import java.util.Scanner;

public class EstudoStrings {

    public static void main(String[] args) {
//        String java = "Java"; // um texto é um objeto
//        System.out.println(java.toLowerCase()); // minuscula
//        System.out.println(java.toUpperCase()); // maiuscula
//        System.out.println(java.charAt(3)); // caractere com base na sua posição
//        System.out.println(java.indexOf("va")); // indice so primeiro caracter da substring
//        System.out.println(java.replace("v", "c")); // substitui 0 "v" por "c"
//        System.out.println(java.replaceAll("a", "i")); // substitui todos 0s "a" por "i"
//        System.out.println(java.substring(2,4)); // incide inicial, indice final + 1
//        System.out.println(java.length()); // tamanho do texto
//
//        String nome1 = "Matheus";
//        String nome2 = "MathEus";
//        System.out.println(nome1 == nome2); // compara os objetos nome1 e nome2
//        System.out.println(nome1.equals(nome2)); // compara os textos de nome1 e nome2
//        System.out.println(nome1.equalsIgnoreCase(nome2)); // compara ignorando maiusculo e minusculo
//        System.out.println("texto".equals("texto2") && "rexro2".equals("texto3"));

        Scanner scanner = new Scanner(System.in);

        String texto = "Vamos para o break retornamos as 10:35";
        System.out.println("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        if(palavra.isEmpty()) { // .isBlank
            System.out.println("Conteudo vazio");
        }
        else if(texto.contains(palavra)) {
            System.out.println("Contém");
        }
        else {
            System.out.println("Não contém");
        }

//        System.out.println(" ".isEmpty()); // false
//        System.out.println(" ".isBlank()); // true (considera os espaços)
    }
}
