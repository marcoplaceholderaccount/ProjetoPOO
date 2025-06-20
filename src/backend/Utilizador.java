package backend;
import java.io.*;

public abstract class Utilizador implements Serializable{
    private String username;
    private String senha;
    
    
    public Utilizador(String username, String senha){
        this.username= username;
        this.senha= senha;

    }

    public Utilizador(){}

    //GETTERS
    public String getUserName() {
        return username;
    }

    public String getSenha() {
        return senha;
    }

    //SETTERS
    public void setUsername(String username) {
        this.username = username;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }    
 }    
    
       

