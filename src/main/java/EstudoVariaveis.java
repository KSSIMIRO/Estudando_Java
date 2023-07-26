public class EstudoVariaveis {
    // variavel = container de dados
    // fortemente tipada = definir o tipo de cada variável
    public static void main(String[] args) {
        // para definir um variavel
        // <tipo> <nome> = <valor>;

        // Tipos primitivos (surgiram com a linguagem): int, long, char, booleam, double, float
        // Tipos não-primitivos (foram implementados depois): String, List

        // Como declarar cariáveis?
        int estoque = 150; // até 2 bilhões
        // L = sulfixo para representar long
        long populacaoTerra = 7900000000L; // até  na casa dos quintilhoes
        double salarioDev = 5500.99; // até 15 casas de precissão
        // F = sulfixo para representar float
        float nota = 7.5F; // até 7 casas de precissão
        boolean ativo = true; // true, false
        String nome = "Matheus Cassimiro"; // Usamos aspas uplas sempre
        char letra = 'A'; // char = representa um único caracter

        // Tipagem forte
        int a = 1000;
        a = 2000; // reatribuição/atualização
        // a = "batata"; // imposivel atribuir outro tipo

        System.out.println("Estoque: " + estoque);
        System.out.println("População da Terra " + populacaoTerra);
        System.out.println(nome);

    }
}
