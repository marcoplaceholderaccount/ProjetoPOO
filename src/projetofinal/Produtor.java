package projetofinal;

import java.util.ArrayList;

public class Produtor extends Utilizador {
    public String nomep;
    public Sessao sessao;
    private ArrayList<Album> albunsProduzidos;
   
    
    public Produtor(String username ,String senha,String nomep){
        super(username,senha);
        this.nomep = nomep;
        this.albunsProduzidos = new ArrayList<>();

    }
     
    //GETTERS
    public String getNomep() {
        return nomep;
    }   
    //SETTERS
    public void setNomep(String nomep) {
        this.nomep = nomep;
    }
    public void editarDados(String novoNome) {
    setNomep(novoNome);
    }
    
    public ArrayList<Album> getAlbunsProduzidos(){
        return albunsProduzidos;
    }
 
/*
public Album iniciarEdicaoAlbum(String titulo, String dataEdicao, String tipo) {
    Album novoAlbum = new Album(titulo, dataEdicao, tipo, this);
    albunsProduzidos.add(novoAlbum);
    System.out.println("Álbum criado com sucesso: " + titulo);
    return novoAlbum;
}
  
    
PARA SER TESTADO!!!!!!!!!
    public void editarAlbum(Album album, String novoTitulo, String novaData, String novoTipo) {
    if (albunsProduzidos.contains(album)) {
        album.setTitulo(novoTitulo);
        album.setDataEdicao(novaData);
        album.setTipo(novoTipo);
        System.out.println("Álbum editado com sucesso: " + novoTitulo);
    } else {
        System.out.println("Este álbum não está associado a este produtor.");
    }
}

    public void ConcluirSessao(Sessao sessao){
           if(sessao.isConclusao()== true){
               System.out.println("A sessao ja se econtra concluida");
           }else{
              sessao.Concluir();
               System.out.println("Sessao concluida com sucesso");
           }
    }
    
public void listarAlbunsProduzidos() {
    if (albunsProduzidos.isEmpty()) {
        System.out.println("Ainda não produziu nenhum álbum.");
        return;
    }

    System.out.println("--- Álbuns produzidos ---");
    for (Album album : albunsProduzidos) {
        System.out.println("Título: " + album.getTitulo());
        System.out.println("Tipo: " + album.getTipo());
        System.out.println("Data de edição: " + album.getDataEdicao());
        System.out.println("------------------------------");
    }
}


public void listarSessoesAgendadasPorData(String data) {
    boolean encontrou = false;
    System.out.println("Sessões agendadas para o dia: " + data);

    for (Album album : albunsProduzidos) {
        for (Sessao s : album.getSessoes()) {
            if (s.getDataf().equals(data) && !s.isConclusao()) {
                System.out.println("- Álbum: " + album.getTitulo() + " | Sessão em: " + s.getDataf());
                encontrou = true;
            }
        }
    }

    if (!encontrou) {
        System.out.println("Nenhuma sessão agendada encontrada para esse dia.");
    }
}

PARA SER TESTADO!!!!!!!!!*/




}
