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


    /** 
    *
    * @param novoNome parametro do tipo string 
    * @param novaMorada parametro do tipo string
    * @param novaData parametro do tipo string
    * @param novoNumero parametro do tipo string
    * <p>Editar dados do musico</p>
    */    
 public void editarDados(String novoNome, String novaMorada, String novaData, String novoNumero ) {
    setNome(novoNome);
    setMorada(novaMorada);
    setDataNascimento(novaData);
    setNumeroidentificacao(novoNumero);
 }

 
    /** 
    *
    * @param todosAlbuns lista de todos os albuns do sistema
    * <p>Filtra os albuns em que o musico participa de pelo menos uma musica</p>
    */
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

/** 
    *
    * @param todosAlbuns lista de todos os albuns do sistema
    * <p>Filtra as sessoes em que o musico participa e que nao estao concluidas</p>
    */
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




