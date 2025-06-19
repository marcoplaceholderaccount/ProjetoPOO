package backend;

import java.io.Serializable;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Sessao implements Serializable {
        public Album album;
        public boolean conclusao;
        public String dataI;
        public String dataf;
        public ArrayList<Requisicao> listareq;
      
        
    public Sessao(Album album,String dataI){
        this.dataI = dataI;
        this.album = album;
        this.conclusao = false;
        this.listareq = new ArrayList<>();
    }

    public Sessao(){}


    //GETTERS

    public boolean isConclusao(){
        return conclusao;
        
    }
    
    public Album getAlbum(){
        return album;
    }

    public String getDataf() {
        return dataf;
    }
    
    public String getDataI(){
        return dataI;
    }

    //SETTERS
   
    public void adicionarRequisicao(Requisicao requisicao) {
        listareq.add(requisicao);
    }
   

    public void Concluir() {
        this.conclusao = true;
        LocalDateTime data = LocalDateTime.now();
        DateTimeFormatter dataformatada = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String datanova = data.format(dataformatada);
        this.dataf = datanova;
    }

        


}
