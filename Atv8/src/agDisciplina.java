public class agDisciplina {
    public String nome;
    public agAluno aluno;

    public agDisciplina(String nome, agAluno aluno){
        this.nome = nome;
        this.aluno = aluno;
    }

    public agAluno getAluno(){
        return aluno;
    }

}
