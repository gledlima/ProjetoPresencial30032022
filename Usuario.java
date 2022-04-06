package classes;
import java.util.List;

public class Usuario {
 
    private String name; //static
    private String login;
    private int senha;
    private String nome;
    private int date;
    private int num;
    private String statesRelacionamento;

    private List<Seguidores> seguidor;
    
    //seguidor = new List<Seguidores>();
    public Usuario(String name, String login, int senha)
    {
        this.name = name;
        this.login = login;
        this.senha = senha;
    }
    public Usuario(String nome, int date, String statesRelacionamento)
    {
        this.nome = nome;
        this.date = date;
        this.statesRelacionamento = statesRelacionamento;
    }
    public Usuario(){ // é necessario para o uso em uma subclasses
        super();
    }
    public String printInfo() //static
    {
        return "Esses são os dados do seu perfil:" +
            "\nNome: " + name +
            "\nLogin: " + login +
            "\nSenha: " + senha;
    }
    public int getSenha(){
        return senha;
    }
    public String getName(){
        return name;
    }
    public void printInfo2()
    {
        System.out.println("Seus dados são esses:");
        System.out.println("Nome:" + name);
        System.out.println("Login: "+ login);
        System.out.println("Senha: " + senha);

    }
    public void setNome(int indice, String novoName){
        this.name = novoName; 
    }
    public void setLogin(int indice, String novoLogin)
    {
        this.login = novoLogin;
    }
    public void setSenha(int indice, int novaSenha){
        this.senha = novaSenha;
    }


    //SEGUIDORES

    public void listaSeguidores()
    {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("SEGUIDORES:                         ");
        for(int i = 0; i < seguidor.size(); i++)
        {
            System.out.println();
            System.out.println("#" + i + "Nome:" + seguidor.get(i).getName());
        }    
    }
    public void addSeguidor(String nome, int num, String statesRelacionamento) // adicionar um seguidor a lista de seguidores!
    {
        seguidor.add(new Seguidores(nome, num, statesRelacionamento)); //verifique se em todas as classes, o construtor está criado!
        System.out.println("Amigo adicionado!");
    }
    public void deixarSeguir(String nomeSeguidor){
        for(int i = 0; i < seguidor.size(); i++)
        {
            if(seguidor.get(i).getName().contentEquals(nomeSeguidor))
            {
                seguidor.remove(i);
                System.out.println("Seguidor Removido");
            }
            else
            {
                System.out.println("Nenhum amigo com esse nome encontrado!");
            }
        }
    }




}
