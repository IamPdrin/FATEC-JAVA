public class Filme {
    String titulo;
    String genero;
    String diretor;
    String sinopse;
    int duracaoMin;
    int anoLancamento;

    void serExibido (){
        System.out.println("O filme está sendo exibido, assista!");
    }

    void vender(){
        System.out.println("O filme atingiu recordes de bilheteria!");
    }

    void entreter(){
        System.out.println("O feedback desse filme é muito bom, parece que os telespectadores estão se divertindo!");
    }

    void fazerRefletir(){
        System.out.println("Caramba, que filme profundo. O que você achou?");
    }
}
