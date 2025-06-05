package projetofinal;

//import java.util.ArrayList;
import java.time.LocalDateTime;


public class Sessao {
        public Album album;
        public boolean conclusao;
        public LocalDateTime dataf;
        //public ArrayList<Requisicao> listareq = new ArrayList<Requisicao>();
      
        
    public Sessao(Album album){
        this.album = album;
        this.conclusao = false;
        
    }

    public Sessao(){}


    //GETTERS

    public boolean isConclusao(){
        return conclusao;
        
    }

    public LocalDateTime getDataf() {
        return dataf;
    }
    

    //SETTERS
    /*VERIFICAR ESTA PARCELA DE CODIGO!
    public void adicionarRequisicao(Requisicao requisicao) {
        listareq.add(requisicao);
    }
    ---------------------------------------*/

    public void setAlbum(Album album) {
        this.album = album;
    }

    public void Concluir() {
        this.conclusao = true;
        this.dataf = LocalDateTime.now();
    }

        


}
