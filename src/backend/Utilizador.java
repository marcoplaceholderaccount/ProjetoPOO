package backend;


public abstract class Utilizador {
    private String username;
    private String senha;
    
    
    public Utilizador(String username, String senha){
        this.username= username;
        this.senha= senha;

    }

    public Utilizador(){}

    public String getUserName() {
        return username;
    }

    public String getSenha() {
        return senha;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }    
 }    
    
       

