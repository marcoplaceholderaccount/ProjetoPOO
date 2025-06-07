package projetofinal;

import java.util.ArrayList;


public class GestaoSistema {
    
    public ArrayList<Instrumento> instrumentos;
    public ArrayList<Musico> musicos;
    public ArrayList<Sessao> sessao;
    public ArrayList<Produtor> produtor;
    public ArrayList<Utilizador> utilizadores;
    public ArrayList<Musica> musicas;
    public ArrayList<Album> albuns;

    //  Construtores
    public GestaoSistema() {
    this.instrumentos = new ArrayList<>();
    this.musicos = new ArrayList<>();
    this.sessao = new ArrayList<>();
    this.produtor = new ArrayList<>();
    this.utilizadores = new ArrayList<>();
    this.musicas = new ArrayList<>();
    this.albuns = new ArrayList<>();
}
    //Metodos
    
    public ArrayList<Album> getAlbuns() {
        return albuns;
    }
    
    public void adicionarAlbum(Album album){
        albuns.add(album);
        System.out.println("Album adicionado com sucesso: " + album.getTitulo());
    }
    
    public ArrayList<Instrumento> getInstrumentos() {
        return instrumentos;
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
    
    
    //Adicionar utilizador
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

    // Adicionar à lista geral
    utilizadores.add(utilizador);

    // Adicionar à lista específica
    if (utilizador instanceof Musico) {
        musicos.add((Musico) utilizador);
    } else if (utilizador instanceof Produtor) {
        produtor.add((Produtor) utilizador);
    }

    System.out.println("Utilizador adicionado: " + utilizador.getUserName());
    }
    
    public void removerUtilizador(int posicao){
        utilizadores.remove(posicao);
    }
    
    public ArrayList<Utilizador> getUtilizadores() {
        return utilizadores;
    } 
    
    public Utilizador procurarUtilizador(String username) {
        for (Utilizador u : utilizadores) {
            if (u.getUserName().equals(username)) {
                return u;
            }
        }
        return null;
    }
    
    public void adicionarMusica(Musica musica) {
        this.musicas.add(musica);
    }
    
    public ArrayList<Musica> getMusicas() {
        return musicas;
    }
    
}

    
    
    
    

