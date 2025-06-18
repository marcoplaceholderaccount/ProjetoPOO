package projetofinal;

import java.util.ArrayList;


public class Musica {
 public String titulo;
 public int duracao;
 public ArrayList<Musico> musicos;
 
 

public Musica(String titulo, int duracao){
    this.titulo = titulo;
    this.duracao = duracao;
    this.musicos = new ArrayList<>();
 }
 
 public Musica(){}
    //GETTERS
    public String getTitulo() {
        return titulo;
    }
    public int getDuracao() {
        return duracao;
    }

    public ArrayList<Musico> getMusicos() {
        return musicos;
    }
    
    
    //SETTERS
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
       
   
    public void adicionarMusico(Musico musico){
        this.musicos.add(musico);
    }
    
    
  }
    
    

 
 

