package backend;

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
    
    public ArrayList<Album> getAlbunsProduzidos(){
        return albunsProduzidos;
    }
    
    //SETTERS
    public void setNomep(String nomep) {
        this.nomep = nomep;
    }
    public void editarDados(String novoNome) {
    setNomep(novoNome);
    }
    
    //adicionar albuns na lista
    public void adicionarAlbum(Album album){
        this.albunsProduzidos.add(album);
    }

}
