package projetofinal;

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

    @Override
    public String toString() {
        return "Musico{" + "nome=" + nome + ", dataNascimento=" + dataNascimento + ", morada=" + morada + ", numeroidentificacao=" + numeroidentificacao + ", instrumentos=" + instrumentos + ", requisicoes=" + requisicoes + '}';
    }
    
    
 public void editarDados(String novoNome, String novaMorada, String novaData, String novoNumero ) {
    setNome(novoNome);
    setMorada(novaMorada);
    setDataNascimento(novaData);
    setNumeroidentificacao(novoNumero);
 }


//listar as requisicoes
  public void listarRequisicoesPorEstado(String estado) {
    boolean encontrou = false;
    System.out.println("Requisições com estado: " + estado);

    for (Requisicao r : requisicoes) {
        if (r.getEstado().equals(estado)) {
            System.out.println("- Data: " + r.getData() + ", Músico: "+ r.getMusico().getUserName());
            encontrou = true;
        }
    }

    if (!encontrou) {
        System.out.println("Nenhuma requisição encontrada com o estado \"" + estado + "\".");
    }
}
  // ver albuns associados
public ArrayList<Album> getAlbunsAssociados(ArrayList<Album> todosAlbuns) {
    ArrayList<Album> albuns = new ArrayList<>();

    
    for (Album album : todosAlbuns) {
        for (Musica musica : album.getMusicas()) {
            if (musica.getMusicos().contains(this)) {
               albuns.add(album);
                break;
            }
        }
    }

    return albuns;
}

// ver sessoes agendadas
public ArrayList<Sessao> getSessoesAgendadas() {
    ArrayList<Sessao> sessoes = new ArrayList<>();

    for (Requisicao r : requisicoes) {
        Sessao sessao = r.getSessao();
        if (!sessao.isConclusao() && !sessoes.contains(sessao)) {
            sessoes.add(sessao);
        }
    }
    return sessoes;
}


public void adicionarRequesicao(Requisicao requesicao){
    requisicoes.add(requesicao);
}



 
}




