package paraisoTropical;

import erros.AviaoLotado;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Maiana
 */
public class TelaPercursoVoo extends javax.swing.JFrame {

    //criaum arraylist do tipo voo;
    public static ArrayList<Voos> lista;

    // metodo ocupa é usado na interface AssentosDisponiveis para colocar os dados do cliente dentro do vetor de poltronas
    //do voo que esta no arraylist de voos lista.
    public void ocupa(int voo,int poltrona, String nome, String cpf){
        lista.get(voo).poltronas.get(poltrona).setNome(nome);
        lista.get(voo).poltronas.get(poltrona).setCpf(cpf);
        lista.get(voo).poltronas.get(poltrona).ocupar();
        LocalArquivos.gravaVoo(lista);
    }

    public TelaPercursoVoo() { //construtor 
        TelaPercursoVoo.lista = LocalArquivos.lerVoo(); //inicia o arraylist com a lista lida do arquivo na classe LocalArquivos
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxOrigem = new javax.swing.JComboBox<>();
        jComboBoxDEstino = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        avanca = new javax.swing.JButton();
        volta = new javax.swing.JButton();
        busca = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Seleção de Percurso");

        jLabel2.setText("Origem:");

        jLabel3.setText("Destino:");

        jComboBoxOrigem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Florianópolis", "São Paulo", "Belo Horizonte", "Fortaleza", "Brasília " }));

        jComboBoxDEstino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Florianópolis", "São Paulo", "Belo Horizonte", "Fortaleza", "Brasília " }));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Origem", "Destino", "Escala", "Horario", "Data", "Assentos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        avanca.setText("Avançar");
        avanca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avancaActionPerformed(evt);
            }
        });

        volta.setText("Voltar");
        volta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltaActionPerformed(evt);
            }
        });

        busca.setText("Pesquisar");
        busca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxDEstino, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(busca, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(avanca)
                .addGap(18, 18, 18)
                .addComponent(volta)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBoxOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBoxDEstino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)
                                .addComponent(busca))))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(volta)
                    .addComponent(avanca))
                .addGap(33, 33, 33))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void avancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avancaActionPerformed
        try { //trycatch faz o botao AVANÇAR ser ativado se uma linha da tabela de voos foi selecionada
            int linha = jTable1.getSelectedRow();  //pegar a linha que o usuario selecionou
            if(lista.get(linha).vagos().length == 0) {
                throw new AviaoLotado();
            }
            String x = jTable1.getValueAt(linha, 0).toString();
            AssentosDisponiveis a = new AssentosDisponiveis();
            //abaixo estão os comandos para mostrar os dados do voo selecionado para o cliente
            a.setOrigem(jTable1.getValueAt(linha, 0).toString()); //mostra a origem
            a.setDestino(jTable1.getValueAt(linha, 1).toString()); //mostra o destino
            a.setEscala(jTable1.getValueAt(linha, 2).toString()); //mostra a escala
            a.setData(jTable1.getValueAt(linha, 4).toString()); //mostra a data
            a.setHorario(jTable1.getValueAt(linha, 3).toString()); //mostra o horario
            a.setVooAtual(linha); // envia para a interface AssentosDisponiveis o indice do voo na lista de voos
            a.qtdAssentos(lista.get(linha).vagos()); // envia para a interface AssentosDisponiveis um vetor de poltronas disponiveis
                                                    //do voo selecionado.
            this.setVisible(false);  //esconde esta janela
            a.setLocation(2,31);
            a.setVisible(true);      //exibe a interface AssentosDisponiveis
            
        } catch (Exception e) {
            if(e.getMessage()=="Não há assentos disponíveis neste voo!"){ //caso entrar no ERRO aviaoLotado mostra a mensagem
                JOptionPane.showMessageDialog(null,e.getMessage());
            }else{ //caso nao for aviaolotado, deverá ser voo nao selecionado, entao exibira a mensagem
                JOptionPane.showMessageDialog(null,"Favor Selecionar um Voo!");
            }
        }

    }//GEN-LAST:event_avancaActionPerformed

    private void voltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltaActionPerformed
        TelaPrincipal op = new TelaPrincipal();
        op.setLocation(2, 31);
        op.setVisible(true);          //Volta para a janela Opçoes.
        this.setVisible(false);
    }//GEN-LAST:event_voltaActionPerformed

    private void buscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaActionPerformed
         DefaultTableModel val = (DefaultTableModel) jTable1.getModel();// implementa metodos de uma tabela

        val.setNumRows(0);    //zera a tabela para nova pesquisa

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getOrigem().equals(jComboBoxOrigem.getSelectedItem().toString())
                    && lista.get(i).getDestino().equals(jComboBoxDEstino.getSelectedItem().toString())) {
                //vai preencher a tabela se passar pela condicao
                val.addRow(new String[]{lista.get(i).getOrigem(), lista.get(i).getDestino(),
                lista.get(i).getEscala(), lista.get(i).getData(), lista.get(i).getHorario(),
                Integer.toString(lista.get(i).getAssentos())});
            }
        }
    }//GEN-LAST:event_buscaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPercursoVoo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPercursoVoo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPercursoVoo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPercursoVoo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPercursoVoo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton avanca;
    private javax.swing.JButton busca;
    private javax.swing.JComboBox<String> jComboBoxDEstino;
    private javax.swing.JComboBox<String> jComboBoxOrigem;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTable1;
    private javax.swing.JButton volta;
    // End of variables declaration//GEN-END:variables
}
