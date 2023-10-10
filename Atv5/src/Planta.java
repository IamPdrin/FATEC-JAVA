public class Planta {
    String nome; 
    String especie;
    String cor;
    String cheiro;
    boolean statusFotossintese = false;

    void realizarFotossintese(){
        System.out.print("Fase Clara - > Fase Escura...");
        statusFotossintese = true;
        if(statusFotossintese == true){
            System.out.println("Fotossíntese completa");
        }
    }

    void crescer(){
        System.out.println("Crescendo...");
    }

    void respirar(){
        System.out.println("Respirando...");
    }
}
