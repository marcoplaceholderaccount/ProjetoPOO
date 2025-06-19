package backend;

import java.util.ArrayList;


public class GestaoSistema {
    
    public ArrayList<Instrumento> instrumentos;
    public ArrayList<Musico> musicos;
    public ArrayList<Sessao> sessoes;
    public ArrayList<Produtor> produtor;
    public ArrayList<Utilizador> utilizadores;
    public ArrayList<Musica> musicas;
    public ArrayList<Album> albuns;
    public ArrayList<Requisicao> requisicoes;

    //  Construtores
    public GestaoSistema() {
    this.instrumentos = new ArrayList<>();
    this.musicos = new ArrayList<>();
    this.sessoes = new ArrayList<>();
    this.produtor = new ArrayList<>();
    this.utilizadores = new ArrayList<>();
    this.musicas = new ArrayList<>();
    this.albuns = new ArrayList<>();
    this.requisicoes = new ArrayList<>();
}
    //Metodos
    
    //GETTERS
    public ArrayList<Album> getAlbuns() {
        return albuns;
    }
    
    public ArrayList<Instrumento> getInstrumentos() {
        return instrumentos;
    }
    
    public ArrayList<Requisicao> getRequisicoes() {
        return requisicoes;
    }
    
    public ArrayList<Utilizador> getUtilizadores() {
        return utilizadores;
    }

    public ArrayList<Musica> getMusicas() {
        return musicas;
    }

    public ArrayList<Musico> getMusicos() {
        return musicos;
    }
    
    public ArrayList<Sessao> getSessoes(){
        return sessoes;
    }   
    
    public void setUtilizadores(ArrayList<Utilizador> utilizadores) {
        this.utilizadores = utilizadores;
    }

    public void setInstrumentos(ArrayList<Instrumento> instrumentos) {
        this.instrumentos = instrumentos;
    }

    
    public void setMusicos(ArrayList<Musico> musicos) {
        this.musicos = musicos;
    }
    
    
    public void setSessoes(ArrayList<Sessao> sessoes) {
        this.sessoes = sessoes;
    }

    public void setProdutor(ArrayList<Produtor> produtor) {
        this.produtor = produtor;
    }

    public void setMusicas(ArrayList<Musica> musicas) {
        this.musicas = musicas;
    }

    public void setAlbuns(ArrayList<Album> albuns) {
        this.albuns = albuns;
    }

    public void setRequisicoes(ArrayList<Requisicao> requisicoes) {
        this.requisicoes = requisicoes;
    }
    
    //ADICIONAR E REMOVER DA LISTA
    
    public void adicionarAlbum(Album album){
        albuns.add(album);
        System.out.println("Album adicionado com sucesso: " + album.getTitulo());
    }
    
    public void adicionarRequisicao(Requisicao req){
        requisicoes.add(req);
    }
    
    public void adicionarInstrumento(Instrumento instrumento) {
    if (instrumento != null) {
        instrumentos.add(instrumento);
        System.out.println("Instrumento adicionado com sucesso: " + instrumento.getNome());
    } else {
        System.out.println("Instrumento inválido. Não foi adicionado.");
        }
    }
   
    public void removerInstrumento(int posicao){
        if(posicao < instrumentos.size()){
            System.out.println("Instrumento removido: " + instrumentos.get(posicao).getNome());
            instrumentos.remove(posicao);
        }
        else{
            System.out.println("Nao existe um instrumento na posicao selecionada");
        }
    }
    
    public void adicionarUtilizador(Utilizador utilizador) {
        if (utilizador == null) {
            System.out.println("Utilizador inválido.");
            return;
        }
        // Verificar se já existe
        for (Utilizador u : utilizadores) {
            if (u.getUserName().equalsIgnoreCase(utilizador.getUserName())) {
                System.out.println("O username já existe: " + utilizador.getUserName());
                return; // NÃO ADICIONA
            }
        }
        
        utilizadores.add(utilizador);

        System.out.println("Utilizador adicionado: " + utilizador.getUserName());
    }
    
    public void removerUtilizador(int posicao){
        if(posicao < utilizadores.size()){
            System.out.println("Utilizador removido: " + utilizadores.get(posicao).getUserName());
            utilizadores.remove(posicao);
        }
        else{
            System.out.println("Nao existe um utilizador na posicao selecionada");
        }
        
    }
    
    public void adicionarMusica(Musica musica) {
        this.musicas.add(musica);
    }
    
    public void adicionarSessao(Sessao sessao) {
        this.sessoes.add(sessao);
    }
    
    
}