/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import javax.swing.*;

import backend.GestaoSistema;
import backend.Utilizador;
import backend.Musico;
import backend.Musica;
import java.util.ArrayList;

/**
 *
 * @author marco
 */
public class criarMusica extends javax.swing.JFrame {

    GestaoSistema sistema;
    private DefaultListModel<String> modelMusicosSelecionados;

    /**
     * Creates new form criarMusica
     */
    public criarMusica(GestaoSistema lista) {
        initComponents();
        this.sistema = lista;
        this.preencherTabela();
        modelMusicosSelecionados = new DefaultListModel<>();
        lstMusicosSelecionados.setModel(modelMusicosSelecionados);
        this.setLocationRelativeTo(null);
    }

    public void preencherTabela() {
        ArrayList<Utilizador> utilizadores = this.sistema.getUtilizadores();
        int row = 0;
        for (int i = 0; i < utilizadores.size(); i++) {
            if (utilizadores.get(i) != null) {
                if (utilizadores.get(i) instanceof Musico) {
                    Musico m = (Musico) utilizadores.get(i);
                    this.tbMusicos.setValueAt(m.getNome(), row, 0);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tbMusicos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        titulo_musica = new javax.swing.JTextField();
        duracao_musica = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        adicionarMusico = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        removerMusico = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstMusicosSelecionados = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbMusicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Nome dos Musicos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbMusicos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 111, -1, 301));

        jLabel2.setText("Adicione os musicos selecionando uma linha na tabela e pressionando o botao adicionar.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 89, -1, -1));
        getContentPane().add(titulo_musica, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 49, 101, -1));
        getContentPane().add(duracao_musica, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 49, 106, -1));

        jLabel3.setText("Duracao (segundos)");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 27, -1, -1));

        jLabel4.setText("Titulo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 27, 37, -1));

        adicionarMusico.setText("Adicionar musico");
        adicionarMusico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarMusicoActionPerformed(evt);
            }
        });
        getContentPane().add(adicionarMusico, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 111, -1, -1));

        jButton2.setText("Voltar");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 457, 75, -1));

        jButton3.setText("Criar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 457, 75, -1));

        removerMusico.setText("Remover musico");
        removerMusico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerMusicoActionPerformed(evt);
            }
        });
        getContentPane().add(removerMusico, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 152, -1, -1));

        jScrollPane2.setViewportView(lstMusicosSelecionados);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 206, 119, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pexels-francesco-ungaro-281260.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adicionarMusicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarMusicoActionPerformed
        // TODO add your handling code here:
        int selectedRow = tbMusicos.getSelectedRow();
        if (selectedRow >= 0) {
            String nomeMusico = (String) tbMusicos.getValueAt(selectedRow, 0);
            if (!modelMusicosSelecionados.contains(nomeMusico)) {
                modelMusicosSelecionados.addElement(nomeMusico);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um músico na tabela primeiro.");
        }
    }//GEN-LAST:event_adicionarMusicoActionPerformed

    private void removerMusicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerMusicoActionPerformed
        // TODO add your handling code here:
        int selectedIndex = lstMusicosSelecionados.getSelectedIndex();
        if (selectedIndex >= 0) {
            modelMusicosSelecionados.remove(selectedIndex);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um músico na lista para remover.");
        }
    }//GEN-LAST:event_removerMusicoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String titulo = titulo_musica.getText().trim();
        String duracaoStr = duracao_musica.getText().trim();

        //dar erro se nao preencher algum campo
        if (titulo.isEmpty() || duracaoStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos obrigatórios.");
            return;
        }

        try {
            int duracao = Integer.parseInt(duracaoStr);
            if (duracao <= 0) {
                JOptionPane.showMessageDialog(this, "A duração deve ser maior que zero.");
                return;
            }

            //receber musicos selecionados
            DefaultListModel<String> model = (DefaultListModel<String>) lstMusicosSelecionados.getModel();
            if (modelMusicosSelecionados.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Selecione pelo menos um músico.");
                return;
            }

            //criar objeto musica
            Musica novaMusica = new Musica(titulo, duracao);

            //adicionar musicos selecionados
            ArrayList<Utilizador> utilizadores = sistema.getUtilizadores();
            for (int i = 0; i < model.size(); i++) {
                String nomeMusico = model.getElementAt(i);
                for (Utilizador u : utilizadores) {
                    if (u instanceof Musico && ((Musico) u).getNome().equals(nomeMusico)) {
                        novaMusica.musicos.add((Musico) u);
                        break;
                    }
                }
            }

            sistema.adicionarMusica(novaMusica);

            JOptionPane.showMessageDialog(this, "Música criada com sucesso!");
            this.dispose();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Duração deve ser um número válido.");
        }
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarMusico;
    private javax.swing.JTextField duracao_musica;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lstMusicosSelecionados;
    private javax.swing.JButton removerMusico;
    private javax.swing.JTable tbMusicos;
    private javax.swing.JTextField titulo_musica;
    // End of variables declaration//GEN-END:variables
}
