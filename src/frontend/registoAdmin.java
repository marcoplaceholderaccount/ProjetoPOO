/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;
import java.io.*;
import java.util.ArrayList;
import backend.*;
import javax.swing.*;


/**
 *
 * @author marco
 */
public class registoAdmin extends javax.swing.JFrame {

    /**
     * Creates new form registoAdmin
     */
    
    GestaoSistema sistema;
    
    public registoAdmin(GestaoSistema lista) {
        initComponents();
        this.sistema = lista;
        this.setLocationRelativeTo(null);
    }
    
    public void gravar2() throws IOException
    {
        ObjectOutputStream out_user = null;
        ObjectOutputStream out_instrumento = null;
        ObjectOutputStream out_albuns = null;
        ObjectOutputStream out_musicas = null;
        ObjectOutputStream out_sessoes = null;
        ObjectOutputStream out_requisicoes = null;
        
        try {
          out_user = new ObjectOutputStream(new BufferedOutputStream (new FileOutputStream("Utilizadores")));
          out_instrumento = new ObjectOutputStream(new BufferedOutputStream (new FileOutputStream("Instrumentos")));
          out_albuns = new ObjectOutputStream(new BufferedOutputStream (new FileOutputStream("Albuns")));
          out_musicas = new ObjectOutputStream(new BufferedOutputStream (new FileOutputStream("Musicas")));
          out_sessoes = new ObjectOutputStream(new BufferedOutputStream (new FileOutputStream("Sessoes")));
          out_requisicoes = new ObjectOutputStream(new BufferedOutputStream (new FileOutputStream("Requisicoes")));
          
          out_user.writeObject(this.sistema.getUtilizadores());
          out_instrumento.writeObject(this.sistema.getInstrumentos());
          out_albuns.writeObject(this.sistema.getAlbuns());
          out_musicas.writeObject(this.sistema.getMusicas());
          out_sessoes.writeObject(this.sistema.getSessoes());
          out_requisicoes.writeObject(this.sistema.getRequisicoes());
          
        }
        finally {
          if (out_user != null && out_instrumento != null && out_albuns != null && out_musicas != null && out_sessoes != null && out_requisicoes!=null)
          { out_user.close(); out_instrumento.close(); out_albuns.close(); out_musicas.close(); out_sessoes.close(); out_requisicoes.close();
               JOptionPane.showMessageDialog(this, "Os dados foram salvos no sistema");
          }
        }
    }
    
    public void ler2() throws IOException
    {
        this.sistema.getUtilizadores().clear();
        this.sistema.getInstrumentos().clear();
        this.sistema.getAlbuns().clear();
        this.sistema.getMusicas().clear();
        this.sistema.getSessoes().clear();
        this.sistema.getRequisicoes().clear();
        
        ObjectInputStream in_user = null;
        ObjectInputStream in_instrumento = null;
        ObjectInputStream in_albuns = null;
        ObjectInputStream in_musicas = null;
        ObjectInputStream in_sessoes = null;
        ObjectInputStream in_requisicoes = null;
        
        try {
          //ficheiro utilizadores
          in_user = new ObjectInputStream(new BufferedInputStream (new FileInputStream("Utilizadores")));
          ArrayList<Utilizador> lista_user = (ArrayList<Utilizador>)in_user.readObject();
          this.sistema.setUtilizadores(lista_user);
          //ficheiro instrumentos
          in_instrumento = new ObjectInputStream(new BufferedInputStream (new FileInputStream("Instrumentos")));
          ArrayList<Instrumento> lista_instrumento = (ArrayList<Instrumento>)in_instrumento.readObject();
          this.sistema.setInstrumentos(lista_instrumento);
          //ficheiro albuns
          in_albuns = new ObjectInputStream(new BufferedInputStream (new FileInputStream("Albuns")));
          ArrayList<Album> lista_albuns = (ArrayList<Album>)in_albuns.readObject();
          this.sistema.setAlbuns(lista_albuns);
          //ficheiro musicas
          in_musicas = new ObjectInputStream(new BufferedInputStream (new FileInputStream("Musicas")));
          ArrayList<Musica> lista_musicas = (ArrayList<Musica>)in_musicas.readObject();
          this.sistema.setMusicas(lista_musicas);
          //ficheiro sessoes
          in_sessoes = new ObjectInputStream(new BufferedInputStream (new FileInputStream("Sessoes")));
          ArrayList<Sessao> lista_sessoes = (ArrayList<Sessao>)in_sessoes.readObject();
          this.sistema.setSessoes(lista_sessoes);
          //ficheiro requisicoes
          in_requisicoes = new ObjectInputStream(new BufferedInputStream (new FileInputStream("Requisicoes")));
          ArrayList<Requisicao> lista_requisicoes = (ArrayList<Requisicao>)in_requisicoes.readObject();
          this.sistema.setRequisicoes(lista_requisicoes);
        }
        catch (Exception ex)
        {
        }
        finally {
          if (in_user != null && in_instrumento != null && in_albuns != null && in_musicas!=null && in_sessoes!=null)
          { in_user.close(); in_instrumento.close(); in_albuns.close(); in_musicas.close(); in_sessoes.close(); 
            JOptionPane.showMessageDialog(this, "Os dados foram carregados com sucesso");
          }
          
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        Carregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Terminar_Sessao-removebg-preview.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 100, 30));

        Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Screenshot 2025-06-20 190008 (2).png"))); // NOI18N
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 100, 30));

        Carregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Screenshot 2025-06-20 190730.png"))); // NOI18N
        Carregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarregarActionPerformed(evt);
            }
        });
        getContentPane().add(Carregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 100, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Morabeza Administrador 640x360.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 360));

        jMenu2.setText("Registar");

        jMenuItem3.setText("Album");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Instrumento");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem6.setText("Utilizador");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Gerir");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem5.setText("Utilizadores");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem7.setText("Lista de Instrumentos");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuItem2.setText("Lista de Albuns");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem1.setText("Lista de Requisicoes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        jMenu1.setText("Estatisticas");

        jMenuItem8.setText("Totais");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuItem9.setText("No mes");
        jMenu1.add(jMenuItem9);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        adicionarInstrumento in = new adicionarInstrumento(sistema);
        in.setVisible(true);
 
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        listaUtilizadores lisUser = new listaUtilizadores(sistema);
        lisUser.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        listadeInstrumetos in = new listadeInstrumetos(sistema);
        in.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        telaLogin adm = new telaLogin(sistema);
        adm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        registoAlbum ral = new registoAlbum(sistema);
        ral.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        registoUtilizador ru = new registoUtilizador(sistema);
        ru.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        listaAlbuns la = new listaAlbuns(sistema);
        la.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        listaRequisicoes lr = new listaRequisicoes(sistema);
        lr.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        estatisticaTotal et = new estatisticaTotal(sistema);
        et.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        // TODO add your handling code here:
        try {
            gravar2();
        } catch (IOException ex) {
            System.out.println("Erro ao gravar no Ficheiro");
        }
    }//GEN-LAST:event_GuardarActionPerformed

    private void CarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarregarActionPerformed
        // TODO add your handling code here:
        try {
            ler2();
        } catch (IOException ex) {
            System.out.println("Erro ao ler o Ficheiro");
        }
    }//GEN-LAST:event_CarregarActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Carregar;
    private javax.swing.JButton Guardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
