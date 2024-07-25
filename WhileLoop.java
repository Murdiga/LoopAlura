import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
    
        Scanner scan = new Scanner(System.in);

        double mediaAvlc = 0;
        double nota = 0;
        int totalNota = 0, escolha = 0;

        while (escolha != 3) {
            System.out.println("""
            \n********************************************
                                MENU
                                        
                    1 - Informar nota do Filme
                    2 - Exibir media do Filme
                    3 - Sair do Aplicativo

            ********************************************""");
            
            escolha = scan.nextInt();

            if (escolha == 1) {

                System.out.println("""
                            \n************************************************

                                    Informe a nota do filme (0 - 10)

                            ************************************************""");

                nota = scan.nextDouble();

                if (nota >= 0 && nota <= 10) {

                    mediaAvlc += nota;
                    totalNota++;
                    
                }else{
                    System.out.println("""
                            \n*****************************************

                                    Nota informada é invalida

                            *****************************************""");
                }
            
            }else if (escolha == 2) {

                if (mediaAvlc !=0) {

                    System.out.println("""
                            \n******************************************

                                    Nota atual do filme : %.2f

                            ******************************************
                            """.formatted(mediaAvlc / totalNota));

                }else{

                    System.out.println("""
                            \n******************************************

                                    Nenhuma nota foi informada

                            ******************************************
                            """);

                }

            }else if (escolha == 3){

                System.out.println("""
                \n******************************************

                            SISTEMA FINALIZADO

                ******************************************""");

            }else{

                System.out.println("""
                \n**************************************

                            Opção Invalida

                **************************************""");

            }
            
        }
        
    }
}
