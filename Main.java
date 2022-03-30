//import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        String name;
        String login;
        String senha;
        int opção = 0;


        ArrayList<Usuario> contaiface = null; // INICIALIZANDO O ARRAY
        contaiface = new ArrayList<Usuario>();

        Scanner Ler = new Scanner(System.in); 
        Scanner numScanner = new Scanner(System.in);

        do
        {

        System.out.println("==================");
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Criar conta no iFace:");
        System.out.println("0 - Sair das opições e fechar a página:");
        opção = numScanner.nextInt();
        numScanner.nextLine(); //para limpar o buffer
         
            switch(opção)
            {
                case 0:
                break;
            }
            if(opção == 1)
            {
                System.out.println("Digite seu nome:");
                name = Ler.nextLine();

                System.out.println("Digite um login:");
                login = Ler.nextLine();

                System.out.println("Digite uma senha:");
                senha = Ler.nexLine();

                Usuario conta1 = new Usuario(name, login, senha);

                contaiface.add(conta1);
            }

        }
        while(opção != 0);



    }
    
}
