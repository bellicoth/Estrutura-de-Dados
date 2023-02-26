import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner grava = new Scanner(System.in);
        String nomeTeste = "";
        System.out.println("Digite o nome do Aluno: ");
        nomeTeste = grava.next();
        var aluno = new Aluno(nomeTeste);
        
        int menu = 0;

        do{
            System.out.println("\nMenu \n 1 - Adicionar Dados \n 2 - Calcular Media \n 3 - Exibir notas \n 4 - Status Aluno \n 5 - Sair \n\n Digite um numero: \n");
            menu = grava.nextInt();
            switch(menu){

                case 1:
                System.out.println("\nAdicionando notas!\n");

                System.out.println("Digite a nota 1: ");
                double nota1 = grava.nextDouble();

                System.out.println("Digite a nota 2: ");
                double nota2 = grava.nextDouble();

                System.out.println("Digite a nota 3: ");
                double nota3 = grava.nextDouble();

                System.out.println("Digite a nota 4: ");
                double nota4 = grava.nextDouble();


                    try {

                        aluno.adiciona(nota1);
                        aluno.adiciona(nota2);
                        aluno.adiciona(nota3);
                        aluno.adiciona(nota4);
                        
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                break;

                case 2:
                        System.out.println("O Aluno " + aluno.getNome() + " teve uma media de: ");
                        System.out.println(aluno.mediaNota());
                break;

                case 3:
                        System.out.println("As notas do aluno foram: \n");
                        System.out.println(aluno.toString());
                break;

                case 4:
                    System.out.println("O Aluno foi: \n");
                    aluno.aprovacaoAluno();
                break;

                case 5:
                    System.out.println("Saindo do Sistema!\n");
                break;

                default:
                    System.out.println("Operação Invalida!");
                break;
            }


        } while(menu != 5);
        
        
    }
}
