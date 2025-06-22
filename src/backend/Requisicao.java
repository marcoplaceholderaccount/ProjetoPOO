package backend;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Requisicao implements Serializable{
    public Sessao sessao;
    public Musico musico;
    public String data;
    public String estado;
    public ArrayList<Instrumento> instrumentos_req;
        
    public Requisicao(Sessao sessao, Musico musico){
        this.musico = musico;
        this.sessao = sessao;
        this.estado = "Pendente";
        this.instrumentos_req = new ArrayList<>();
        LocalDateTime dataN = LocalDateTime.now();
        DateTimeFormatter dataformatada = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String datanova = dataN.format(dataformatada);
        this.data = datanova;
        
    }
    
    //GETTERS
    public Sessao getSessao() {
        return sessao;
    }

    public Musico getMusico() {
        return musico;
    }
    
    public String getData() {
        return data;
    }
    
    public ArrayList<Instrumento> getInstrumento() {
        return instrumentos_req;
    }
  
    public String getEstado() {
        return estado;
    }
    
    //Aceitar e recusar requisicoes
    public void aceitarReq(){
        this.estado = "Atribuido";
    }
    public void recusarReq(){
        this.estado = "Recusado";
    }
    
    //SETTERS
    public void setSessao(Sessao sessao){
        this.sessao = sessao;
    }
    
    public void setMusico(Musico musico){
        this.musico = musico;
    }
    
    /** 
    *
    * @param instrumento instancia do tipo instrumento
    * <p>Adicione um instrumento na lista de instrumento da requisicao e torna o indisponivel</p>
    */
    public void adicionarInstrumento(Instrumento instrumento) {
        if (instrumento.getEstado()){
            instrumento.setEstado(false);
            instrumentos_req.add(instrumento);
            System.out.println("Instrumento requerido com sucesso: " + instrumento.getNome());
        } else {
            System.out.println("Instrumento ja foi requerido.");
        }
    }
    
    /** 
    *
    * <p>Remove os instrumentos da lista de instrumentos da requisicao e torna os disponiveis novamente</p>
    */
    public void liberarInstrumentos(){
        for (Instrumento i : instrumentos_req){
            i.setEstado(true);
        }
        instrumentos_req.clear();
    }
    
    
    
    
   

}