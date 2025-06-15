package projetofinal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Album {
    private String titulo;
    private String dataEdicao;
    private String dataFinal;
    private String tipo;
    private Produtor produtor;
    public ArrayList<Musica> musicas;
    public ArrayList<Sessao> sessoes;
    public boolean estado;
    
    
    public Album(String titulo, String tipo, Produtor produtor){
        this.titulo= titulo;
        this.tipo= tipo;
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
    
    public String getDataFinal() {
        return dataFinal;
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
    
    //teste de estados vvvvvv
    public boolean getEstado(){
        return estado;
    }
    
    public void setEstado(boolean estado){
        this.estado = estado;
    }
    //teste de estados^^^^^
    
    
    //SETTERS
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void setDataEdicao() {
        LocalDateTime data = LocalDateTime.now();
        DateTimeFormatter dataformatada = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String datanova = data.format(dataformatada);
        this.dataEdicao = datanova;
    }
    
    public void setDataFinal(){
        LocalDateTime dataf = LocalDateTime.now();
        DateTimeFormatter dataf_formatada = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String datafnova = dataf.format(dataf_formatada);
        this.dataFinal = datafnova;
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
