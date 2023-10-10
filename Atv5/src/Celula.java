public class Celula {
    
    boolean membrana = true;
    boolean cancerigena = false;
    String dna;
    String rna;

    void replicar(){
        System.out.println("Divindo-se e replicando-se, essas são as células...");
    }

    void transportarSusbtancias (){
        System.out.println("Regulando a entrada e saída de substâncias...");
    }

    void produzirEnergia(){
        System.out.println("Processando nutriente, gerando energia e garantindo o metabolismo");
    }

    void testeCancer(){
        if(cancerigena == true){
            System.out.println("Irmão, 'cê 'tá com câncer");
        } else {
            System.out.println("Suas células 'tão suave");
        }
    }

    void testeCel(){
        if(membrana == true){
            System.out.println("É célula, de fato!");
        } else{
            System.out.println("Não é célula, poser!");
        }
    }

}
