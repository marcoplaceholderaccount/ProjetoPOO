/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import javax.swing.*;

import projetofinal.GestaoSistema;
import projetofinal.Musica;
import projetofinal.Album;
import projetofinal.Utilizador;
import projetofinal.Produtor;
import java.util.ArrayList;

/**
 *
 * @author marco
 */
public class registoAlbum extends javax.swing.JFrame {

    /**
     * Creates new form registoAlbum
     */
    
    GestaoSistema sistema;
    private DefaultListModel<String> modelMusicasSelecionadas;

    
    public registoAlbum(GestaoSistema lista) {
        initComponents();
        this.sistema = lista;
        this.preencherTabela();
        modelMusicasSelecionadas = new DefaultListModel<>();
        lstMusicasSelecionadas.setModel(modelMusicasSelecionadas);
    }
    
    public void preencherTabela() {
        //Preencher a tabela de musicas
        ArrayList<Musica> musicas = this.sistema.getMusicas();
        for (int i = 0; i < musicas.size(); i++) {
            if (musicas.get(i) != null) {
                this.tbMusicas.setValueAt(musicas.get(i).getTitulo(), i, 0);
                this.tbMusicas.setValueAt(musicas.get(i).getDuracao(), i, 1);
            }
        }
        //Preencher a tabela de produtores
        ArrayList<Utilizador> utilizadores = this.sistema.getUtilizadores();
        int row = 0;
        for (int i = 0; i < utilizadores.size(); i++) {
            if (utilizadores.get(i) != null) {
                if (utilizadores.get(i) instanceof Produtor) {
                    Produtor prod = (Produtor) utilizadores.get(i);
                    this.tbProdutores.setValueAt(prod, row, 0);
                    this.tbProdutores.setValueAt(prod.getNomep(), row, 1);
                    row++;
                }
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

        titulo_album = new javax.swing.JTextField();
        tipo_album = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstMusicasSelecionadas = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbMusicas = new javax.swing.JTable();
        adicionarMusicas = new javax.swing.JButton();
        removerMusicas = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbProdutores = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Titulo");

        jLabel2.setText("Tipo");

        jScrollPane1.setViewportView(lstMusicasSelecionadas);

        tbMusicas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Titulo", "Duracao"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbMusicas);

        adicionarMusicas.setText("Adicionar");
        adicionarMusicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarMusicasActionPerformed(evt);
            }
        });

        removerMusicas.setText("Remover");
        removerMusicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerMusicasActionPerformed(evt);
            }
        });

        jLabel3.setText("Musicas selecionadas");

        jButton3.setText("Criar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Cancelar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        tbProdutores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Nome do Produtor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tbProdutores);
        if (tbProdutores.getColumnModel().getColumnCount() > 0) {
            tbProdutores.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel4.setText("Selecione o produtor que produz o album");

        jLabel5.setText("Selecione as musicas que pertencem ao album");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(titulo_album, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tipo_album, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE))))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(adicionarMusicas)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(removerMusicas, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(36, 36, 36)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(titulo_album, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(tipo_album, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(removerMusicas)
                            .addComponent(adicionarMusicas))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adicionarMusicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarMusicasActionPerformed
        // TODO add your handling code here:
        int selectedRow = tbMusicas.getSelectedRow();
        if (selectedRow >= 0) {
            String nomeMusico = (String) tbMusicas.getValueAt(selectedRow, 0);
            if (!modelMusicasSelecionadas.contains(nomeMusico)) {
                modelMusicasSelecionadas.addElement(nomeMusico);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um músico na tabela primeiro.");
        }
    }//GEN-LAST:event_adicionarMusicasActionPerformed

    private void removerMusicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerMusicasActionPerformed
        // TODO add your handling code here:
        int selectedIndex = lstMusicasSelecionadas.getSelectedIndex();
        if (selectedIndex >= 0) {
            modelMusicasSelecionadas.remove(selectedIndex);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um músico na lista para remover.");
        }
    }//GEN-LAST:event_removerMusicasActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String titulo = titulo_album.getText().trim();
        String tipo = tipo_album.getText().trim();

        //dar erro se nao preencher algum campo
        if (titulo.isEmpty() || tipo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos obrigatórios.");
            return;
        }

        //receber musicas selecionados
        DefaultListModel<String> model = (DefaultListModel<String>) lstMusicasSelecionadas.getModel();
        if (modelMusicasSelecionadas.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Selecione pelo menos uma musica.");
            return;
        }
        
        //escolher o produtor responsavel pelo album
        int selecao = tbProdutores.getSelectedRow();
        Produtor produtor = (Produtor) tbProdutores.getValueAt(selecao, 0);
       
        //criar objeto album
        Album novoAlbum = new Album(titulo, tipo, produtor);

        //adicionar musicas selecionadas
        ArrayList<Musica> musicas = sistema.getMusicas();
        for (int i = 0; i < model.size(); i++) {
            String tituloMusica = model.getElementAt(i);
            for (Musica m : musicas) {
                if (m.getTitulo().equals(tituloMusica)) {
                    novoAlbum.musicas.add(m);
                    break;
                }
            }
        }
        
        //adicionar album no sistema e na lista do produtor
        sistema.adicionarAlbum(novoAlbum);
        produtor.adicionarAlbum(novoAlbum);

        JOptionPane.showMessageDialog(this, "Album criado com sucesso!");
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarMusicas;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> lstMusicasSelecionadas;
    private javax.swing.JButton removerMusicas;
    private javax.swing.JTable tbMusicas;
    private javax.swing.JTable tbProdutores;
    private javax.swing.JTextField tipo_album;
    private javax.swing.JTextField titulo_album;
    // End of variables declaration//GEN-END:variables
}
