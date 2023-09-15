import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite a quantidade de disciplinas: ");
        int qtdDisciplinas = ler.nextInt();
        ler.nextLine(); 

        String[] nomesDisciplinas = new String[qtdDisciplinas];
        double[] mediaAprovacao = new double[qtdDisciplinas];
        double[][] notas = new double[qtdDisciplinas][3];

        for (int i = 0; i < qtdDisciplinas; i++) {
            System.out.print("Digite o nome da disciplina " + (i + 1) + ": ");
            nomesDisciplinas[i] = ler.nextLine();

            System.out.print("Digite a media para aprovacao na disciplina " + nomesDisciplinas[i] + ": ");
            mediaAprovacao[i] = ler.nextDouble();

            System.out.print("Digite a nota da P1 na disciplina " + nomesDisciplinas[i] + ": ");
            notas[i][0] = ler.nextDouble();

            System.out.print("Digite a nota da P2 na disciplina " + nomesDisciplinas[i] + ": ");
            notas[i][1] = ler.nextDouble();

            System.out.print("Digite a nota do trabalho na disciplina " + nomesDisciplinas[i] + ": ");
            notas[i][2] = ler.nextDouble();

            ler.nextLine();
        }

        System.out.println("Boletim do Aluno:");

        for (int i = 0; i < qtdDisciplinas; i++) {
            double mediaFinal = (notas[i][0] + notas[i][1] + notas[i][2]) / 3.0;

            System.out.println("Disciplina: " + nomesDisciplinas[i]);
            System.out.println("Media Final: " + mediaFinal);

            if (mediaFinal >= mediaAprovacao[i]) {
                System.out.println("Situacao: Aprovado");
            } else {
                System.out.println("Situacao: Reprovado");
            }

            System.out.println();
            ler.close();
        }
    }
}
