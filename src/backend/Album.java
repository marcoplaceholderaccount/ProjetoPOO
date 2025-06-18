package backend;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Album {
    private String titulo;
    private String dataEdicao;
    private String dataFinal;
    private String tipo;
    private double progresso;
    private Produtor produtor;
    public ArrayList<Musica> musicas;
    public ArrayList<Sessao> sessoes;
    public boolean estado;
    
    
    
    public Album(String titulo, String tipo, Produtor produtor){
        this.titulo= titulo;
        this.tipo= tipo;
        //this.progresso = 0;
        this.estado = false;
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

    public double getProgresso(){
        return progresso;
    }
    
    public void setProgresso(double percent){
        this.progresso = percent;
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
    
    //calcular percentagem de sessoes (em string) concluidas do album
    public String calcularProgresso(){
        double percentagem;
        int numsessoes = this.sessoes.size();
        int sessoes_concluidas = 0;

        for(Sessao sessao : this.sessoes){
            if(sessao.isConclusao()){
                sessoes_concluidas++;
            }
        }
        
        if(numsessoes>0){
            percentagem = (sessoes_concluidas*100)/numsessoes;
            String numeroformatado = String.format("%.1f", percentagem);
            return numeroformatado;
        }
        return "";
    }
    public double calcularProgressoTotal(){
        double percentagem = 0;
        int numsessoes = this.sessoes.size();
        int sessoes_concluidas = 0;
        //calcular as sessoes concluidas
        for(Sessao sessao : this.sessoes){
            if(sessao.isConclusao()){
                sessoes_concluidas++;
            }
        }
        //verificar se a divisao e por zero
        if(numsessoes>0){
            percentagem = (sessoes_concluidas*100)/numsessoes;
            return percentagem;
        }
        return percentagem;
    }
    
    
    
    @Override
    public String toString() {
        return "Album{" + "titulo=" + titulo + ", dataEdicao=" + dataEdicao + ", tipo=" + tipo + '}';
    }
    
    
}
