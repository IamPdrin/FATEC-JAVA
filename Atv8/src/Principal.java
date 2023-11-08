public class Principal {
    public static void main(String[] args) throws Exception {
                // Criando objetos das classes Pessoa e Endereco (Composição)
                cpEndereco endereco = new cpEndereco("Rua ABC", "Cidade XYZ");
                cpPessoa pessoa = new cpPessoa("João", endereco);
                
                // Criando objetos das classes Disciplina e Aluno (Agregação)
                agAluno aluno1 = new agAluno("Alice", 12345);
                agDisciplina disciplina1 = new agDisciplina("Matemática", aluno1);
        
                // Criando objetos das classes Compra e Cupom (Dependência)
                dpCupom cupom = new dpCupom("CUP123");
                dpCompra compra = new dpCompra(1);

    }
}
