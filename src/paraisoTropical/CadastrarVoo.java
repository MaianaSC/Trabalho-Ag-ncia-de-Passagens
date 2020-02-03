
package paraisoTropical;

import erros.CampoVazio;
import erros.DataInvalida;
import erros.ZeroAssentos;
import java.io.IOException;
import java.net.Socket;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Maiana
 */
public class CadastrarVoo extends javax.swing.JFrame {
    private String s = "127.0.0.1";
    private int port = 1097;
    public static ArrayList<Voos> lista = new ArrayList<>();
    private Socket cliente;

    public ArrayList<Voos> getVoos() {
        return lista;
    }

    /**
     * Creates new form Cadastrarvoo
     */
    public CadastrarVoo() {
        initComponents();
    }
    
    public int verificaData(String dataehora) throws ParseException { //função que compara a data recebida com a data atual do sistema
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm"); //seta o formato para dia/mes/ano hora:minutos
        Calendar datavoo = Calendar.getInstance(); //cria instancia de calendario
        Calendar atual = Calendar.getInstance(); //cria instancia de calendario
        
        datavoo.setTime(sdf.parse(dataehora)); //seta a primeira instancia com a string recebida e no formato definido acima
        return atual.compareTo(datavoo);
        //se datavoo for maior que atual retorna -1 se for menor retorna 1
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxOri = new javax.swing.JComboBox<>();
        jComboBoxDest = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxescala = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cadastrar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jFormattedTextDta = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFassentos = new javax.swing.JTextField();
        jTextFieldhora = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setToolTipText("Decolar");

        jLabel2.setText("Origem:");

        jLabel3.setText("Destino:");

        jComboBoxOri.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Florianópolis", "São Paulo", "Belo Horizonte", "Fortaleza", "Brasília " }));

        jComboBoxDest.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Florianópolis", "São Paulo", "Belo Horizonte", "Fortaleza", "Brasília " }));

        jLabel4.setText("Escala:");

        jComboBoxescala.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sem Escala", "Florianópolis", "São Paulo", "Belo Horizonte", "Fortaleza", "Brasília " }));

        jLabel5.setText("Horario:");

        jLabel6.setText("Data:");

        cadastrar.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        cadastrar.setText("Cadastrar");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });

        cancelar.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        try {
            jFormattedTextDta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextDta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextDtaActionPerformed(evt);
            }
        });

        jLabel7.setText("Assentos:");

        jTextFassentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFassentosActionPerformed(evt);
            }
        });

        try {
            jTextFieldhora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextFieldhora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldhoraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jComboBoxescala, javax.swing.GroupLayout.Alignment.LEADING, 0, 200, Short.MAX_VALUE)
                        .addComponent(jComboBoxOri, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jTextFieldhora, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextFassentos, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jFormattedTextDta, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBoxDest, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cadastrar)
                        .addGap(18, 18, 18)
                        .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxOri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxDest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jComboBoxescala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jFormattedTextDta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldhora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFassentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrar)
                    .addComponent(cancelar))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        try {
            if (verificaData(jFormattedTextDta.getText() + " " + jTextFieldhora.getText()) > 0) {
                throw new DataInvalida(); //se a data já passou lança a exceçao datainvalida
            }
            if (jFormattedTextDta.getText().trim().isEmpty() || jTextFieldhora.getText().trim().isEmpty() || jTextFassentos.getText().trim().isEmpty()) {
                throw new CampoVazio(); //se há campo vazio lança a exceçao campo vazio
            }
            if (Integer.parseInt(jTextFassentos.getText()) < 1) {
                throw new ZeroAssentos(); //se numero de assentos for menor que 1 lança excessao zeroassentos
            }
            if (jComboBoxOri.getSelectedItem() != jComboBoxDest.getSelectedItem()) {
                if (jComboBoxescala.getSelectedItem() == "Sem Escala") {
                    lista.add(new Voos(jComboBoxOri.getSelectedItem().toString(), jComboBoxDest.getSelectedItem().toString(),
                            jComboBoxescala.getSelectedItem().toString(), jFormattedTextDta.getText(), jTextFieldhora.getText(),
                            Integer.parseInt(jTextFassentos.getText())));
                    this.setVisible(false);
                    JOptionPane.showMessageDialog(null, "  VOÔ : " + jComboBoxOri.getSelectedItem().toString() + " - " + jComboBoxDest.getSelectedItem().toString());
                    new TelaPrincipal().setVisible(true);
                } else {//se tiver escala
                    if (jComboBoxescala.getSelectedItem() != jComboBoxOri.getSelectedItem() && jComboBoxescala.getSelectedItem() != jComboBoxDest.getSelectedItem()) {
                        lista.add(new Voos(jComboBoxOri.getSelectedItem().toString(), jComboBoxDest.getSelectedItem().toString(),
                                jComboBoxescala.getSelectedItem().toString(), jFormattedTextDta.getText(), jTextFieldhora.getText(),
                                Integer.parseInt(jTextFassentos.getText())));

                        this.setVisible(false);
                        JOptionPane.showMessageDialog(null, "  VOÔ : " + jComboBoxOri.getSelectedItem().toString() + " - " + jComboBoxescala.getSelectedItem().toString() + " - " + jComboBoxDest.getSelectedItem().toString());
                        new TelaPrincipal().setVisible(true);

                    } else {
                        JOptionPane.showMessageDialog(null, " ERRO! Tente novamente! ");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, " Lugares iguais! Tente novamente! ");
            }

            LocalArquivos.gravaVoo(lista);
            run();
        } catch (DataInvalida e) {
            JOptionPane.showMessageDialog(null, jFormattedTextDta.getText() + " " + jTextFieldhora.getText() + e.getMessage());
        } catch (ZeroAssentos | CampoVazio e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Favor Preencha Todos Os Campos!");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Apenas números inteiros positivos maiores que zero!");
        }
    }//GEN-LAST:event_cadastrarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        this.setVisible(false);
        TelaPrincipal op = new TelaPrincipal();
        op.setLocation(2, 31);
        op.setVisible(true);
        
    }//GEN-LAST:event_cancelarActionPerformed

    private void jTextFassentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFassentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFassentosActionPerformed

    private void jFormattedTextDtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextDtaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextDtaActionPerformed

    private void jTextFieldhoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldhoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldhoraActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarVoo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarVoo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarVoo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarVoo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
          
                new CadastrarVoo().setVisible(true);

            }
        });
    }
    public void run(){
        try{
            Socket meuSocket = new Socket(s,port);
            LocalArquivos.enviaArquivo("Voo.txt",meuSocket);
            System.out.println("enviou");
        }catch(Exception e){
        e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrar;
    private javax.swing.JButton cancelar;
    private javax.swing.JComboBox<String> jComboBoxDest;
    private javax.swing.JComboBox<String> jComboBoxOri;
    private javax.swing.JComboBox<String> jComboBoxescala;
    private javax.swing.JFormattedTextField jFormattedTextDta;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFassentos;
    private javax.swing.JFormattedTextField jTextFieldhora;
    // End of variables declaration//GEN-END:variables
}