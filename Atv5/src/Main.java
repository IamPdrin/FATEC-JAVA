import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int escolha = 0;

        System.out.println("---------------------------------------");
        System.out.println("    POO: Entidade, Atributo e Metodo   ");
        System.out.println("---------------------------------------");

        System.out.println("    Selecione uma das opcoes: \n");
        System.out.println(" 1-Professor\n 2-Aplicativo\n 3-Thor\n 4-Genetica\n 5-Pintura\n 6-Celula\n 7-Planta\n 8-Idade Media\n 9-Arte Digital\n 10-Filme\n");
        escolha = ler.nextInt();
        ler.nextLine();

        switch(escolha){
            
            case 1:
            //Professor:
            Professor prof1 = new Professor();
                prof1.formacao = "Eng. Computacao (USP)";
                prof1.id_professor = 237;
                prof1.turma = "DSM I";
            System.out.println("Atributos do Objeto prof1: \n");
                System.out.println("Formacao: " + prof1.formacao);
                System.out.println("ID do professor: " + prof1.id_professor);
                System.out.println("Turma: " + prof1.turma + "\n");

            System.out.println("Funcoes do Professor: \n");
            System.out.println("O professor esta...");
                prof1.ensinar();
                prof1.avaliar();
                prof1.pesquisar();
            System.out.println("\n");
            break;

            case 2:
            //Aplicativo:
            Aplicativo app1 = new Aplicativo();
                app1.nomeApp = "PingSearch";
                app1.tamanhoApp = "500mb";
                app1.linguagemProgApp = "Python";
                app1.interfaceApp = "Responsiva, Clara e Eficiente";            
                app1.versaoApp = 1.5;

            System.out.println("Atributos do objeto app1: \n");
                System.out.println("Nome: " + app1.nomeApp);
                System.out.println("Tamanho: " + app1.tamanhoApp);
                System.out.println("Linguagem utilizada: " + app1.linguagemProgApp);
                System.out.println("Caracteristicas da Interface: " + app1.interfaceApp);
                System.out.println("Versao: " + app1.versaoApp + "\n");

            System.out.println("Funcoes do Aplicativo: \n");
            System.out.print("Abrir: ");
                app1.abrir();
            System.out.print("\nFechar: ");
                app1.fechar();
            System.out.print("\nArmazenar: ");
                app1.armazenarDados();
            System.out.print("Atualizar: ");
                app1.atualizar();
            System.out.println("\n");
            break;

            case 3:
            //Thor:
            Thor thorPadrao = new Thor();

                thorPadrao.deus = "Deus do Trovao";
                thorPadrao.martelo = "Mjolnir";
                thorPadrao.forca = "Inquantificavel";

            System.out.println("Atributos do objeto thorPadrao: \n");
                System.out.println("Deus: " + thorPadrao.deus);
                System.out.println("Martelo: " + thorPadrao.martelo);
                System.out.println("Forca: " + thorPadrao.forca + "\n");
            
            System.out.println("Funcoes do Thor: \n");
            System.out.print("Envocar Raios: ");
                thorPadrao.envocarRaios();        
            System.out.print("Voar:");
                thorPadrao.voar();
            System.out.print("Girar martelo: ");
                thorPadrao.girarMartelo();
            System.out.print("Jogar Fortnite: ");
                thorPadrao.jogarFortnite();
            System.out.println("\n");
            break;

            case 4:
            //Genética:
            Genetica geneticaPadrao = new Genetica();

                geneticaPadrao.gene = "Completamente Estruturados.";
                geneticaPadrao.fenotipo = "Saudavel, 40 anos.";
                geneticaPadrao.genotipo = "Saudavel, realizando processos normalmente.";
                geneticaPadrao.cromosssomo = "46 cromossomos sem deformacoes.";

            System.out.println("Atributos do objeto geneticaPadrao: \n");
                System.out.println("Status gene: " + geneticaPadrao.gene);
                System.out.println("Status fenotipo: " + geneticaPadrao.fenotipo);
                System.out.println("Status genotipo: " + geneticaPadrao.genotipo);
                System.out.println("Status cromossomo: " + geneticaPadrao.cromosssomo + "\n");
            
            System.out.println("Funcoes da Genetica: \n");
            System.out.print("Mapear Genes: ");
                geneticaPadrao.mapearGenes();
            System.out.print("Clonar DNA: ");
                geneticaPadrao.clonarDna();
            System.out.print("Estudar Moleculas: ");
                geneticaPadrao.estudarMoleculas();
            System.out.println("\n");
            break;

            case 5:
            //Pintura: 
            Pintura pintura1 = new Pintura();

                pintura1.autor = "Van Gogh";
                pintura1.tipoPintura = "Pos-impressionista";
                pintura1.cores = "Azul, Amarelo, Verde, Branco e Turquesa";
                pintura1.materiais = "Tinta, Óleo, Pínceis, Paleta, Solventes, Fixadores e Tela";

            System.out.println("Atributos do objeto pintura1: \n");
                System.out.println("Autor: " + pintura1.autor);
                System.out.println("Tipo: " + pintura1.tipoPintura);
                System.out.println("Cores: " + pintura1.cores);
                System.out.println("Materiais: " + pintura1.materiais + "\n");

            System.out.println("Funcoes da Pintura: \n");
            System.out.print("Expressar: ");
                pintura1.expressar();
            System.out.print("Comunicar: ");
                pintura1.comunicar();
            System.out.print("Decorar: ");
                pintura1.decorar();
            System.out.println("\n");
            break;

            case 6:
            //Célula:
            Celula celulaPadrao = new Celula();

                celulaPadrao.dna = "Adenina (A), Timina (T), Citosina (C) e Guanina (G), 100%";
                celulaPadrao.rna = "Adenina (A), Uracila (U), Citosina (C) e Guanina (G), 100%";

            System.out.println("Atributo do objeto celulaPadrao: \n");
                System.out.println("DNA: " + celulaPadrao.dna);
                System.out.println("RNA: " + celulaPadrao.rna + "\n");

            System.out.println("Funcoes da Celula: \n");
            System.out.print("Replicar: ");
                celulaPadrao.replicar();
            System.out.print("Transportar Substancias: ");
                celulaPadrao.transportarSusbtancias();
            System.out.print("Produzir Energia: ");
                celulaPadrao.produzirEnergia();
            System.out.print("Teste de Cancer: ");
                celulaPadrao.testeCancer();
            System.out.print("Teste de Celula: ");
                celulaPadrao.testeCel();
            System.out.println("\n");
            break;

            case 7:
            //Planta: 
            Planta planta1 = new Planta();

                planta1.nome = "Orquidea";
                planta1.especie = "Orchidaceae";
                planta1.cor = "Branca";
                planta1.cheiro = "Suave e Agradavel";

            System.out.println("Atributos do objeto planta1: \n");
                System.out.println("Nome: " + planta1.nome);
                System.out.println("Especie: " + planta1.especie);
                System.out.println("Cor: " + planta1.cor);
                System.out.println("Cheiro: " + planta1.cheiro + "\n");

            System.out.println("Funcoes da Planta: \n");
            System.out.print("Fotossintese: ");
                planta1.realizarFotossintese();
            System.out.print("Crescer: ");
                planta1.crescer();
            System.out.print("Respirar: ");
                planta1.respirar();
            System.out.println("\n");
            break;
            
            case 8:
            //Idade Média:
            IdadeMedia idadeMedia = new IdadeMedia();

                idadeMedia.pesteNegra = "A Peste Negra, uma pandemia de peste bubonica que assolou a Europa durante o seculo XIV, matou de 25 a 30 milhoes de pessoas.";
                idadeMedia.feudalismo = "O feudalismo foi um sistema socioeconomico e politico que predominou na Europa medieval, particularmente durante os periodos aproximados do seculo IX ao XV.";
                idadeMedia.periodo = "Seculo V ate o século XV.";

            System.out.println("Atributos do objeto idadeMedia: \n");
                System.out.println("Peste Negra: " + idadeMedia.pesteNegra);
                System.out.println("Feudalismo: " + idadeMedia.feudalismo);
                System.out.println("Periodo: " + idadeMedia.periodo + "\n");

            case 9:
            //Arte Digital: 
            ArteDigital arte1 = new ArteDigital();

                arte1.autor = "Zachary Lieberman ";
                arte1.nome = "Play the World";
                arte1.formato = "Plataforma desenvolvida pelo Google Creative Lab";
                arte1.tamanho = "";
                arte1.preco = 0;
            
            System.out.println("Atributos do objeto arte1: \n");
                System.out.println("Autor: " + arte1.autor);                
                System.out.println("Nome: " + arte1.nome);
                System.out.println("Formato: " + arte1.formato);
                System.out.println("Preco: nao esta a venda..\n");
                
            System.out.println("Funcoes da Arte Digital: \n");
            System.out.print("Expressar Sentimentos: ");
                arte1.expressarSentimentos();
            System.out.println("\n");
            break;

            case 10:
            //Filme:
            Filme filme1 = new Filme();

                filme1.titulo = "Vingadores";
                filme1.anoLancamento = 2012;
                filme1.genero = "Acao, Aventura e Ficcao Ciencifica";
                filme1.diretor = "Joss Whedon";
                filme1.sinopse = "\nOs Vingadores e um filme que reune alguns dos super-herois mais populares do universo Marvel.\nQuando uma ameaça alienigena conhecida como Loki ameaça a Terra, Nick Fury, diretor da S.H.I.E.L.D.,\nreune um grupo de herois para formar uma equipe e defender o planeta.";
                filme1.duracaoMin = 143;

            System.out.println("Atributos do objeto filme1: \n");
                System.out.println("Titulo: " + filme1.titulo);
                System.out.println("Ano de lancamento: " + filme1.anoLancamento);
                System.out.println("Genero: " + filme1.genero);
                System.out.println("Diretor: " + filme1.diretor + "\n");
                
            System.out.println("Funcoes do Filme: \n");
            System.out.print("Ser exibido: ");
                filme1.serExibido();
            System.out.print("Vender: ");
                filme1.vender();
            System.out.print("Entreter: ");
                filme1.entreter();
            System.out.print("Fazer refletir: ");
                filme1.fazerRefletir();
            System.out.println("\n");

            System.out.println("Gostaria de ler a sinopse? [sim/nao]");
            String r = ler.nextLine();
            ler.close();
                    if(r.equalsIgnoreCase("sim") || r.equalsIgnoreCase("s")){
                        System.out.println(filme1.sinopse + "\n");
                    }
            break;

            default:
            System.out.println("Selecione um numero valido.");
        }
    }
}
