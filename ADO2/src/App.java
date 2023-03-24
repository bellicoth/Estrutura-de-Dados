import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

       int menu = 0;
       int auxFila = 0;
       var fila = new Fila();
       Scanner grava = new Scanner(System.in);

        do{
            System.out.println("Menu - Laboratório \n 1 - Cadastrar Paciente \n 2 - Exibir Fila \n 3 - Remover da Fila \n 4 - Sair");
            menu = grava.nextInt();

        switch(menu){

            case 1:


            System.out.println("Digite o nome do Paciente: ");
            String nome = grava.next();
            System.out.println("Informe se o paciente é: \n P - Paciente \n N - Não Paciente");
            String tipo = grava.next();

            if(tipo.toUpperCase().equals("P")){

              
                var paciente = new Paciente(nome, tipo);
                fila.enfilerar(auxFila, paciente);
                auxFila++;

            } else if( tipo.toUpperCase().equals("N")){

                var paciente = new Paciente(nome, tipo);
                fila.enfilerar(paciente);
                
            } else{

                System.out.println("Entrada Incorreta! \nDigite novamente.");
                
            }
            break;

            case 2:

            System.out.println(fila);

            break;

            case 3:

            fila.desfilerar(0);

            break;

            case 4:
            System.out.println("Saindo do Sistema!");
            break;

            default:
            System.out.println("Opção Invalida");
            break;
       }

    }while(menu != 4);

    }
}
