//import classes.Seguidores;
//import classes.Usuario;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        String name;
        String login;
        int senha = 0;
        //String loginTest;
        int opção = 111;
        //int opção2 = 0;
        int tamanho = 0;
        String nameMensagem; 
        String remetente;
        String texto; 
        int g = 1, m = 0;
        int i = 0, r = 0, j = 0;
        int cont02 = 80;
        int contador = 0; 
        int contador1 = 0;
        //int v = 0;
        //int cont03 = 0;
        String name01;
        int senha01;

        ArrayList<Usuario> contaiface = null; 
        contaiface = new ArrayList<Usuario>();

        Scanner Ler = new Scanner(System.in); 
        Scanner numScanner = new Scanner(System.in);
        Scanner saber = new Scanner(System.in);

        opção = 9;
        //do
        while(opção != 0)
        {
        opção = 9;
        i = 0; // ZERA AS VARIAVEIS PARA NÃO HAVER GARGALOS 
        cont02 = 0;
        senha = 0;
        //r = 0;

        System.out.println("==============================");
        System.out.println("Bem vindo a rede social Iface!");
        System.out.println("==============================");
        System.out.println();
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Criar conta no iFace:");
        System.out.println("2 - Excluir a minha do iFace:");
        System.out.println("3 - Faça login no iFace:");
        System.out.println("0 - Sair das opções e fechar a página:");
        opção = numScanner.nextInt();

            if(opção == 0)
            {
                break;
            }
            else if(opção == 1)
            {    
                numScanner.nextLine(); // boa pratica
                System.out.println("Digite seu nome:");
                name = Ler.nextLine();
            
                System.out.println("Digite um login:");
                login = Ler.nextLine();

                System.out.println("Digite uma senha:");
                senha = numScanner.nextInt();

                Usuario conta1 = new Usuario(name, login, senha);
                contaiface.add(conta1);

                System.out.println("CONTA CRIADA!");
            }
            else if(opção == 2)
            {
                senha01 = 0;
                j = 0;
                System.out.println("Para excluir sua conta digite login e senha:");
                System.out.println();
                System.out.println("Digite seu LOGIN:");
                name01 = Ler.nextLine();
                System.out.println("Digite sua SENHA: ");
                senha01 = numScanner.nextInt();
                
                for(j = 0; j < contaiface.size(); j++)
                {
                    Usuario h = contaiface.get(j); // ESSE ELEMENTO DEVE ESTAR DENTRO
                    if(h.getName().equals(name01))
                    {
                        if(senha01 == h.getSenha())
                        {
                            contaiface.remove(j);
                            System.out.println("USUARIO EXCLUIDA!");
                            contador1 = 1;
                            break;
                        }
                    }
                }
                if(contador1 == 0)
                {
                    System.out.println("SENHA OU LOGIN INCORRETO, TENTE NOVAMENTE");
                }
            }
            else if(opção == 3)
            {

                // FAZER LOGIN NO IFACE

                System.out.println("Digite seu login:");
                login = Ler.nextLine();

                System.out.println("Digite sua senha numerica:");
                senha = numScanner.nextInt(); // =======

                //tamanho = contaiface.size();   
                for(i = 0; i < contaiface.size(); i++)
                {   
                    //System.out.println("CHEGOUUU");
                    Usuario p = contaiface.get(i);
                    
                    if(p.getSenha() == senha) // PONHA NUMEROS PARA COMPARAR
                    {
                        //p.printInfo2(); //Usuario.printInfo();
                        name01 = p.getName();

                        System.out.println();
                        System.out.println("Senha correta! Bem vindo a sua conta!");
                        System.out.println();

                        //p.indicador(i); // PARA INDICAR SE TEM MENSAGEM OU NÃO
                        p.indi(name01); //c

                        while(cont02 != 9)
                        {
                            System.out.println("1 - Quero editar o meu perfil:");
                            System.out.println("2 - Quero enviar uma mensagem para outro usuário:");
                            System.out.println("3 - Quero verificar minha caixa de mensagens.");
                            System.out.println("4 - Quero ver a minha lista de amigos:");
                            System.out.println("9 - Quero sair do meu perfil:");
                            cont02 = numScanner.nextInt();
                            //Ler.nextLine(); //para limpar o buffer
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


                                case 2:

                                contador = 1;
                                System.out.println("~~~~~~~~~~~~~~~~~~~~~");
                                System.out.println("Lista de Usuarios do Iface:");
                                remetente = p.getName(); // ISSO SERVE PARA SABER QUEM ESTÁ ENVIANDO A MENSAGEM

                                System.out.println("~~~~~~~~~~~~~~~~~~~~~");

                                for(i = 0; i < contaiface.size(); i++) //i
                                {
                                    p = contaiface.get(i); //p
                                    System.out.println(i + " - " +  p.getName());
                                    //System.out.println(i + " - " + p.getSenha());
                                }
                                
                                //System.out.println("\n");
                                System.out.println("Digite o nome do usuario que você deseja mandar mensagem:");

                                
                                nameMensagem = Ler.nextLine();

                                Usuario c = contaiface.get(r);

                                for(r = 0; r < contaiface.size(); r++) //i
                                {
                                    //Usuario c = contaiface.get(r);
                                    if(c.getName().equals(nameMensagem)) // p
                                    {
                                        System.out.println("Digite a mensagem que você deseja enviar:");
                                        texto = Ler.nextLine();
                                        c.Mensagem(nameMensagem, remetente, texto, g); // p                                      
                                        System.out.println("Mensagem enviada!");

                                        break;
                                    }
                                }
                                

                                case 3:

                                System.out.println("---------------------------------------");
                                System.out.println("Suas mensagens são as seguintes:");



                            }
                        }
                    }

                }
                if(contador == 0)
                {
                    System.out.println("Senha incorreta tente novamenteee");
                }
            }
        //opção = 755;
        //saber.close();        
        }

        //while(opção != 0);
        saber.close();
        Ler.close();
        numScanner.close();
    }
}
