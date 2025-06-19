package backend;
import java.io.*;

public class Instrumento implements Serializable {
    public String nome;
    public String tipo;
    public boolean estado;
    
    public Instrumento(String nome, String tipo){
        this.nome= nome;
        this.tipo= tipo;
        this.estado= true;     
    }
    
    public Instrumento() {};
    
    //GETTERS
    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean getEstado() {
        return estado;
    }
    //SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
   
    
}
    
    
    

