package backend;

import java.util.ArrayList;

public class Musico extends Utilizador{

private String nome;
private String dataNascimento;
private String morada;
private String numeroidentificacao;
private ArrayList<Instrumento> instrumentos;
private ArrayList<Requisicao> requisicoes;




public Musico(String username,String senha,String nome, String morada, String dataNascimento, String numeroidentificacao){
    super(username,senha);
    this.nome= nome;
    this.morada= morada;
    this.dataNascimento= dataNascimento;
    this.numeroidentificacao= numeroidentificacao;
    this.instrumentos= new ArrayList<>();
    this.requisicoes= new ArrayList<>();
    
}

public Musico(){}

    //GETTERS
    
     public String getDataNascimento() {
        return dataNascimento;
    }
    public String getMorada() {
        return morada;
    }
    public String getNumeroidentificacao() {
        return numeroidentificacao;
    } 
    
    public String getNome() {
        return nome;
    }

    public ArrayList<Instrumento> getInstrumentos() {
        return instrumentos;
    }

    public ArrayList<Requisicao> getRequisicoes() {
        return requisicoes;
    }

    //SETTERS
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }
    public void setNumeroidentificacao(String numeroidentificacao) {
        this.numeroidentificacao = numeroidentificacao;
    }

  
    public void setNome(String nome) {
        this.nome = nome;
    }

    /*
    @Override
    public String toString() {
        return "Musico{" + "nome=" + nome + ", dataNascimento=" + dataNascimento + ", morada=" + morada + ", numeroidentificacao=" + numeroidentificacao + ", instrumentos=" + instrumentos + ", requisicoes=" + requisicoes + '}';
    }
    */
    
 public void editarDados(String novoNome, String novaMorada, String novaData, String novoNumero ) {
    setNome(novoNome);
    setMorada(novaMorada);
    setDataNascimento(novaData);
    setNumeroidentificacao(novoNumero);
 }

 
 // ver albuns associados
public ArrayList<Album> getAlbunsAssociados(ArrayList<Album> todosAlbuns) {
    ArrayList<Album> albuns = new ArrayList<>();
    
    for (Album album : todosAlbuns) {
        for (Musica musica : album.getMusicas()) {
            // Verifica se o músico atual está na lista de músicos da música
            for (Musico musicoDaMusica : musica.getMusicos()) {
                if (musicoDaMusica.getNome().equals(this.getNome())) {       
                    albuns.add(album);
                    break;  // Sai do loop interno se encontrou
                }
            }
        }
    }
    return albuns;
}

// ver sessoes agendadas nos albuns em que 
public ArrayList<Sessao> getSessoesAgendadas(ArrayList<Album> todosAlbuns) {
    ArrayList<Sessao> sessoesAgendadas = new ArrayList<>();
    
    for (Album album : todosAlbuns) {
        if (!album.getEstado()) { // Se o álbum não está concluído
            for (Sessao sessao : album.getSessoes()) {
                if (!sessao.isConclusao() && !sessoesAgendadas.contains(sessao)) {
                    sessoesAgendadas.add(sessao);
                }
            }
        }
        else{
            System.out.println("O album "+ album.getTitulo() + " já foi concluido");
        }
        
    }
    
    return sessoesAgendadas;
}

 
}




