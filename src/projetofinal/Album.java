package projetofinal;

import java.util.ArrayList;

public class Album {
    private String titulo;
    private String dataEdicao;
    private String tipo;
    private Produtor produtor;
    private ArrayList<Musica> musicas;
    private ArrayList<Sessao> sessoes;

    
    
    
    public Album(String titulo, String dataEdicao, String tipo, Produtor produtor){
        this.titulo= titulo;
        this.dataEdicao= dataEdicao;
        this.tipo= tipo;
        this.produtor= produtor;
        this.musicas= new ArrayList<>();
        this.sessoes= new ArrayList<>();
      
    }
    
    //GETTERS

    public ArrayList<Musica> getMusicas() {
        return musicas;
    }
    
    
    public String getTitulo() {
        return titulo;
    }
    public String getDataEdicao() {
        return dataEdicao;
    }
    public String getTipo() {
        return tipo;
        
    }

    public Produtor getProdutor() {
        return produtor;
    }

    public ArrayList<Sessao> getSessoes() {
        return sessoes;
    }
    
    
//SETTErS
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setDataEdicao(String dataEdicao) {
        this.dataEdicao = dataEdicao;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setProdutor(Produtor produtor) {
        this.produtor = produtor;
    }

    public void setSessoes(ArrayList<Sessao> sessoes) {
        this.sessoes = sessoes;
    }
    
    

    
    //adicionar musica no album
    public void adicionarMusica(Musica musica){
        this.musicas.add(musica);
    }
    
    // adicionar sessoes
    public void adicionarSessoes(Sessao sessao){
        this.sessoes.add(sessao);
    }
    
    @Override
    public String toString() {
        return "Album{" + "titulo=" + titulo + ", dataEdicao=" + dataEdicao + ", tipo=" + tipo + '}';
    }
    
    
}
