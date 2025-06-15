package projetofinal;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Requisicao {
    public Sessao sessao;
    public Musico musico;
    public LocalDateTime data;
    public String estado;
    public ArrayList<Instrumento> instrumentos_req;
        
    public Requisicao(Sessao sessao, Musico musico){
        this.musico = musico;
        this.sessao = sessao;
        this.estado = "Pendente";
        this.instrumentos_req = new ArrayList<>();
        this.data = LocalDateTime.now();
        
    }
    
    //GETTERS
    public Sessao getSessao() {
        return sessao;
    }

    public Musico getMusico() {
        return musico;
    }

    
    public LocalDateTime getData() {
        return data;
    }
    
  
    public String getEstado() {
        return estado;
    }
    
    
    //SETTERS
    public void setSessao(Sessao sessao){
        this.sessao = sessao;
    }
    
    public void setMusico(Musico musico){
        this.musico = musico;
    }

    public ArrayList<Instrumento> getInstrumento() {
        return instrumentos_req;
    }


    public void adicionarInstrumento(Instrumento instrumento) {
        if (instrumento.getEstado()){
            instrumento.setEstado(false);
            instrumentos_req.add(instrumento);
            System.out.println("Instrumento requerido com sucesso: " + instrumento.getNome());
        } else {
            System.out.println("Instrumento ja foi requerido.");
        }
    }
     
    public void liberarInstrumentos(){
        for (Instrumento i : instrumentos_req){
            i.setEstado(true);
        }
        instrumentos_req.clear();
    }
    
    
    
    
   

}