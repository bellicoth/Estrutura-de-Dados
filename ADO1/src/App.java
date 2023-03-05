import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner grava = new Scanner(System.in);
        String nomeTeste = "";
        System.out.println("Digite o nome do Aluno: ");
        nomeTeste = grava.next();
        var aluno = new Aluno(nomeTeste);
        
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        int menu = 0;

        do{
            System.out.println("\nMenu \n 1 - Adicionar Dados \n 2 - Alterar Dados \n 3 - Calcular Media \n 4 - Exibir notas \n 5 - Status Aluno \n 6 - Sair \n\n Digite um numero: \n");
            menu = grava.nextInt();
            switch(menu){

                case 1:
                System.out.println("\nAdicionando notas!\n");

                System.out.println("Digite a nota 1: ");
                nota1 = grava.nextDouble();

                System.out.println("Digite a nota 2: ");
                nota2 = grava.nextDouble();

                System.out.println("Digite a nota 3: ");
                nota3 = grava.nextDouble();

                System.out.println("Digite a nota 4: ");
                nota4 = grava.nextDouble();


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
                        int aux = 0;
                        System.out.println("Alterando os dados!!!");

                        System.out.println("Escolha: \n 1 - Alterar nota 1 \n 2 - Alterar nota 2 \n 3 - Alterar nota 3 \n 4 - Alterar nota 4 \n 5 - Sair \n\n Informe a nota que você deseja alterar: ");
                        aux = grava.nextInt();

                        if(aux == 1){

                                aluno.removerTarefa(0);
                                System.out.println("Nota 1 - Removida! \nInforme o novo valor: ");
                                nota1 = grava.nextDouble();
                                aluno.adicionaPosicao(nota1, 0);
                                
                                break;
                            }
                        if(aux == 2){
                                aluno.removerTarefa(0);
                                System.out.println("Nota 2 - Removida! \nInforme o novo valor: ");
                                nota2 = grava.nextDouble();
                                aluno.adicionaPosicao(nota2, 1);
                                break;
                            }
                        if(aux == 3){
                                aluno.removerTarefa(0);
                                System.out.println("Nota 3 - Removida! \nInforme o novo valor: ");
                                nota3 = grava.nextDouble();
                                aluno.adicionaPosicao(nota3, 2);
                                break;
                            }
                        if(aux == 4){
                                aluno.removerTarefa(0);
                                System.out.println("Nota 4 - Removida! \nInforme o novo valor: ");
                                nota4 = grava.nextDouble();
                                aluno.adicionaPosicao(nota4, 3);
                                break;
                            }
                        if(aux == 5){
                                System.out.println("Você escolheu sair!!!");
                                break;
                            }
                        if(aux == 0 || aux >=6){
                                System.out.println("Operação invalida!!!");

                                break;
                            }

                case 3:
                        System.out.println("O Aluno " + aluno.getNome() + " teve uma media de: ");
                        System.out.println(aluno.mediaNota());
                break;

                case 4:
                        System.out.println("As notas do aluno foram: \n");
                        System.out.println(aluno.toString());
                break;

                case 5:
                        System.out.println("O Aluno foi: \n");
                        aluno.aprovacaoAluno();
                break;

                case 6:
                        System.out.println("Saindo do Sistema!\n");
                break;

                default:
                        System.out.println("Operação Invalida!");
                break;
            }


        } while(menu != 5);
        
        
    }
}
