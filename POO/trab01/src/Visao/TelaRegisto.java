package Visao;

import Controle.FicheiroDados;
import Visao.DadosTalentos;
import static Visao.TelaCliente.intcodigo;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class TelaRegisto extends javax.swing.JFrame {
  private String categoria,titulo,data;
   private int numerobilhete;
    static  DadosTalentos c;
 static JTable tabela;
 static String pesquisa;
static int intcodigo;  
   
   
  
public TelaRegisto() {
        initComponents();
     
         jTProdutos.setSize(new Dimension(500,300));
     DefaultTableModel m= (DefaultTableModel) jTProdutos.getModel();
     FicheiroDados.ler();
     
        int tamanho=FicheiroDados.array.size();
        System.out.println(tamanho);
        
    for(int i=0;i<FicheiroDados.array.size();i++){
        
         titulo=FicheiroDados.array.get(i).getData();
         data=FicheiroDados.array.get(i).getTitulo();
          categoria=FicheiroDados.array.get(i).getCategoria();
         numerobilhete=FicheiroDados.array.get(i).getNumeroBilhetes();
             
      Object[] dados= { titulo,data,categoria,numerobilhete};
     m.addRow(dados);
     } 
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbltitulo = new javax.swing.JLabel();
        jtftitulo = new javax.swing.JTextField();
        btncategoria = new javax.swing.JLabel();
        cbCategoria = new javax.swing.JComboBox<>();
        lblData = new javax.swing.JLabel();
        jtfData = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtfNumero = new javax.swing.JTextField();
        btnEventosesgotados = new javax.swing.JButton();
        btnPesquisa = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jtfPesquisa = new javax.swing.JTextField();
        btnRemover = new javax.swing.JButton();
        lblregisto = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTProdutos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbltitulo.setText("Titulo");

        btncategoria.setText("Categoria");

        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Show", "Teatro", "Palestra", " " }));

        lblData.setText("Data da realizacao");

        jLabel1.setText("Numero de bilhetes");

        btnEventosesgotados.setText("Eventos esgotados");
        btnEventosesgotados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEventosesgotadosActionPerformed(evt);
            }
        });

        btnPesquisa.setText("Pesquisa");
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbltitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(152, 152, 152)
                                .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 41, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                                .addComponent(jtfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                                .addComponent(btncategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                    .addComponent(btnPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbCategoria, 0, 201, Short.MAX_VALUE)
                                    .addComponent(btnEventosesgotados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtftitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jtfData, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtftitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfData, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEventosesgotados, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        lblregisto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblregisto.setText("Registar os eventos");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo", "Data", "Categoria", "Numero"
            }
        ));
        jTProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTProdutos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addComponent(lblregisto, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblregisto, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(856, 517));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

     private void inicializarObjecto() {
           c.setTitulo(jtftitulo.getText().trim()); 
     c.setData(jtfData.getText().trim());
     c.setCategoria(cbCategoria.getSelectedItem().toString());
     c.setNumeroBilhetes(Integer.parseInt(jtfNumero.getText().trim()));
      
        
             
            } 
    
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

            // TODO add your handling code here:
         FicheiroDados.ler();
  
          c=new DadosTalentos();
           c.setTitulo(jtftitulo.getText().trim());
          c.setData(jtfData.getText().trim());
           c.setCategoria(cbCategoria.getSelectedItem().toString());
          c.setNumeroBilhetes(Integer.parseInt(jtfNumero.getText().trim()));
         
              FicheiroDados.gravar(c);
           
            int codigo=-1;
            
            this.dispose();
            new TelaRegisto().setVisible(true);
    }//GEN-LAST:event_btnSalvarActionPerformed

   

  
    
   
    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
         pesquisa=jtfPesquisa.getText().trim();
                 
                 if(pesquisa.equalsIgnoreCase(""))
                 actualizar();
                 else
            actualizarPesquisa(); //To change body of generated methods, choose Tools | Templates.
            
             intcodigo=-1;
                    
                 
                 
    }//GEN-LAST:event_btnPesquisaActionPerformed

  
    
   private void actualizar(){
        jTProdutos=new JTable();
        jPanel2.removeAll();
        jPanel2.add(jTProdutos);
        jPanel2.validate();
        jPanel2.repaint();
    }
  
     
       public void actualizarPesquisa(){
           jTProdutos=new JTable();
        jPanel2.removeAll();
        jPanel2.add(jTProdutos);
        jPanel2.validate();
        jPanel2.repaint(); 
       } 
    
   
   
  
    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
       if (jTProdutos.getSelectedRow() != -1){
      
            DefaultTableModel dtmProdutos = (DefaultTableModel)jTProdutos.getModel();
            dtmProdutos.removeRow(jTProdutos.getSelectedRow());
       }else{
            JOptionPane.showMessageDialog(null, "Seleccione uma linha para remover");
       }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void jTProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTProdutosMouseClicked
       if (jTProdutos.getSelectedRow() != -1){
           jtftitulo.setText(jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 0).toString());
           jtfData.setText(jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 1).toString());
           cbCategoria.setSelectedItem(jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 2).toString());
           jtfNumero.setText(jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 3).toString());
       }
    }//GEN-LAST:event_jTProdutosMouseClicked

    private void btnEventosesgotadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEventosesgotadosActionPerformed
         FicheiroDados.ler();
        int eventosEsgatados=0;
                 for (DadosTalentos c : FicheiroDados.array) {
                   if(c.getTitulo().equalsIgnoreCase("0"))
                       if(c.getEstado().equalsIgnoreCase("Nao"))
                       eventosEsgatados+=1;
                 }
                 
                 JOptionPane.showMessageDialog(null, eventosEsgatados);
            intcodigo=-1;
    }//GEN-LAST:event_btnEventosesgotadosActionPerformed

       
     
    
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
            java.util.logging.Logger.getLogger(TelaRegisto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRegisto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRegisto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRegisto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRegisto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEventosesgotados;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel btncategoria;
    private javax.swing.JComboBox<String> cbCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTProdutos;
    private javax.swing.JTextField jtfData;
    private javax.swing.JTextField jtfNumero;
    private javax.swing.JTextField jtfPesquisa;
    private javax.swing.JTextField jtftitulo;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblregisto;
    private javax.swing.JLabel lbltitulo;
    // End of variables declaration//GEN-END:variables
}
