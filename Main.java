import classes.Seguidores;
import classes.Usuario;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        String name;
        String login;
        int senha;
        //String loginTest;
        int opção = 0;
        int opção2 = 0;
        int tamanho = 0;
        //String novoNome;
        //String camparar;
        int i = 0;
        int cont01, cont02 = 0;
        //int cont03 = 0;


        //ArrayList<Usuario> Seguidor = new ArrayList<Usuario>();

        ArrayList<Usuario> contaiface = null; // INICIALIZANDO O ARRAY
        contaiface = new ArrayList<Usuario>();

        Scanner Ler = new Scanner(System.in); 
        Scanner numScanner = new Scanner(System.in);

        do
        {

        System.out.println("==================");
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Criar conta no iFace:");
        System.out.println("2 - Faça login no iFace:");
        System.out.println("0 - Sair das opções e fechar a página:");
        opção = numScanner.nextInt();
        numScanner.nextLine(); //para limpar o buffer

        //tamanho = contaiface.size(); //tamanho da lista
         
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
                senha = numScanner.nextInt();

                Usuario conta1 = new Usuario(name, login, senha);
                contaiface.add(conta1);

                //conta1.printInfo2();
                

            }
            else if(opção == 2)
            {
                System.out.println("Digite seu login:");
                login = Ler.nextLine();

                System.out.println("Digite sua senha:");
                senha = numScanner.nextInt();
                cont01 = 0;    
                for(i = 0; i < contaiface.size(); i++)
                {   
                    Usuario p = contaiface.get(i);
                    //System.out.println("CHEGOUUU");
                    if(p.getSenha() == senha) // PONHA NUMEROS PARA COMPARAR
                    {
                        //p.printInfo(); //Usuario.printInfo();

                        System.out.println("Senha correta! Bem vindo a sua conta!");

                        cont01 = 1;

                        while(cont02 != 4)
                        {

                            System.out.println("1 - Quero editar o meu perfil:");
                            System.out.println("2 - Quero verificar as minhas mensagens:");
                            System.out.println("3 - Quero ver a minha lista de amigos:");
                            System.out.println("4 - Quero sair do meu perfil: ");
                            cont02 = numScanner.nextInt();
                            Ler.nextLine(); //para limpar o buffer

                            switch(cont02){

                                case 1:
                                System.out.println("Digite seu novo nome:");
                                name = Ler.nextLine(); //novoLogin
                                p.setNome(i, name); // set é para modificar e get é para retornar

                                System.out.println("Digite seu novo login:");
                                login = Ler.nextLine();
                                p.setLogin(i, login);

                                System.out.println("Digite sua nova senha:");
                                senha = Ler.nextInt();
                                p.setSenha(i, senha);
                                //p.printInfo2();
                                System.out.println("Dados totalmente alterados!");

                                case 3:

                                System.out.println("---------------------------------------");
                                System.out.println("Seus seguidores:");
                                //contaiface.get()

                                case 4:
                                break;
                            }
                        }
                    }

                }
                if(cont01 == 0)
                {
                    System.out.println("Senha incorreta, tente novamente:");
                }
                //opção2 = numScanner.nextInt();
                //numScanner.nextLine(); //para limpar o buffer
            }

        }
        while(opção != 0);

    }
    
}
