//package classes;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
 
    private String name;
    private String login;
    private int senha;
    int j = 0;
    

    private String birthdate; //data de nascimento
    private int date;
    private int num;
    private String relationship;

    private List<String> Mensagens; //new ArrayList<String>();
    private List<Seguidores> Seguidor; //new ArrayList<Seguidores>();
    private ArrayList<Mensagens> Mensagem; //= new ArrayList<Mensagens>(); *****
    
    //seguidor = new List<Seguidores>();
    public Usuario(String name, String login, int senha)
    {
        this.name = name;
        this.login = login;
        this.senha = senha;
        this.Seguidor = new ArrayList<Seguidores>();
        this.Mensagem = new ArrayList<Mensagens>();
    }
    public Usuario(String name, String birthdate, String relationship){
        this.name = name;
        this.birthdate = birthdate;
        this.relationship = relationship;
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
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Seus dados são esses:");
        System.out.println("Nome:" + name);
        System.out.println("Login: "+ login);
        System.out.println("Senha: " + senha);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");

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
    public String getLogin()
    {
        return login;
    }
    public void getMensagens(String mensagens) {
        Mensagens.add(mensagens);
	}
    public void Mensagem(String dono, String remetente, String mensagem, int i)
    {
        Mensagens nova = new Mensagens(dono, remetente, mensagem, i);
        Mensagem.add(nova);
    }
    public void indi(String oooo)
    {
        //int tamanho = Mensagem.size();
        int g = 0;
        if(Mensagem.isEmpty())
        {
            System.out.println("Sua caixa de mensagens está vazia!");
        }
        else
        {
            for(g = 0; g < Mensagem.size(); g++)
            {
                if(oooo.equals(Mensagem.get(g).getDono()))
                {
                    System.out.println("==================");
                    System.out.println(Mensagem.get(g).getRemetente() + " lhe enviou a seguinte mensagem:");
                    //System.out.println(Mensagem.get(0).getDono());
                    System.out.println(Mensagem.get(g).getMensagem());
                    System.out.println("~~~~~~~~~~~~~~~~~~");    
                }
            }
        }
    }
    public void indicador() // String nomee
    {
        //int w = 0;
        Mensagens men = Mensagem.get(j);
        
        if(Mensagem.isEmpty())
        {
            if(men.getIndicador() == 1)
            {
                System.out.println("Você tem uma nova mensagem!");
            }
        }
        else
        {
            System.out.println("Não tem nenhuma mensagem na lista");
        }
    }
}
