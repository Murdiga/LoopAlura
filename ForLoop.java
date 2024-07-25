import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) throws Exception {

        @SuppressWarnings("resource")
    
        Scanner scan = new Scanner(System.in);
        
        double mediaAvlc = 0;
        double nota = 0;

        //Loop realizado na aula da alura
        for (int i = 0; i < 3; i++) {

            System.err.println("Informe a nota de avaliação para o filme");
            nota = scan.nextDouble();
            mediaAvlc += nota;
            
        }

        System.err.println("Média da avaliação deste filme é: %.2f".formatted(mediaAvlc / 3));

        mediaAvlc = 0;
        nota = 0;

        //Teste de looping feito por curiosidade minha mesmo
        for (int i = 1; i <= 4; i++) {

            System.err.println("Informe a nota do " + i +"° bimestre do aluno");
            nota = scan.nextDouble();
            mediaAvlc += nota;

        }

        System.err.println("Média da avaliação deste filme é: %.2f".formatted(mediaAvlc / 4));

    }
}
