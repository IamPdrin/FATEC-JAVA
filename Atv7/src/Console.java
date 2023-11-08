//Classe criada somente para executar uma função para limpar o console durante a execução do código
public class Console {
    public void limparConsole(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); 
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
