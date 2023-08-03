package aula_020823;

//    POO (Programação Orientada a Objetos)
//    Classes -> Fruta (Modelagem)
//    Objetos -> Maça, Pera, Banana, Goiaba
//    Instância -> Processo que constrói um objeto a partir de uma classe
//    Atributo/Propriedade -> Um valor deferido na classe incorporado no objeto
//    Métodos/Função -> Uma rotina/procedimento/tarefa que é feito pelo objeto

public class EstudoClasses {

    public static void main(String[] args) {

        Fruta maca = new Fruta(); // criar/instancia um objeto
        maca.nome = "Maçã";
        maca.cor = "Vermelha";
        maca.acidez = 7;
        maca.suculencia = true;
        maca.amadurecer(37);
        maca.vitaminas = new String[3];
        maca.vitaminas[0] = "Vitamina A";
        maca.vitaminas[1] = "Vitamina D";
        maca.vitaminas[2] = "Vitamina G";

        System.out.println(maca.maduro);

        System.out.println(maca);
    }
}
