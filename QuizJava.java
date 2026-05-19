import java.util.Scanner;
public class QuizJava {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        final int qtdPerguntas=5;
        int pontoQuestao=2;
        char[] gabarito={'b','b','a','c','a'};

        String[] perguntas={
            "Qual é o tipo de dado usado para armazenar números inteiros em Java?",
            "O que o comando System.out.println() faz?",
            "Qual dessas opções cria corretamente um objeto da classe Scanner para ler dados do teclado?",
            "Qual palavra-chave é usada para definir uma classe em Java?",
            "O que significa o método public static void main(String[] args)?"
        };

        String[] alternativas = {
            "a)double  |  b)int  | c)String",
            "a)Lê um valor do teclado    |  b)Imprime um valor na tela e pula uma linha    | c)Declara uma variável",
            "a)Scanner teclado = new Scanner(System.in);   |  b)Scanner teclado = Scanner(System.out);   | c)Scanner teclado(System.in);",
            "a)define  |  b)new | c)class",
            "a)É o ponto de entrada do programa Java  |  b) Exibe uma mensagem  | c)Finaliza a execução",
        };

        char[] respostas=new char[qtdPerguntas];
        char resp;
        int nota=0;
        String aluno;

        System.out.print("Digite seu nome: ");
        aluno=scan.nextLine();

        for(int i=0; i<qtdPerguntas;i++){
            System.out.println("----------------------------");
            System.out.printf("Pergunta %d%n",i+1);
            System.out.printf("%s%n",perguntas[i]);
            System.out.printf("%s%n",alternativas[i]);
            resp=scan.nextLine().charAt(0);
            respostas[i]=resp;
        }
        System.out.printf("%s%n","Prova encerrada! Vamos conferir o resultado.");

        for(int i=0;i<qtdPerguntas;i++){
            if(gabarito[i]==respostas[i]){
                nota+=pontoQuestao;
            }
        }
        System.out.printf("%s, sua nota foi de %d, você foi %s",aluno,nota,nota>=6?"Aprovado!":"Reprovado!");
    }
}
