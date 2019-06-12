package apresentacao;

import controlador.RegrasNegocio;
import dao.AditivosDAO;
import dao.ReceitasDAO;
import dao.UsuariosDAO;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaMostrarReceita extends javax.swing.JFrame {
   
    private String logado;
    private ReceitasDAO receita;
    
    public TelaMostrarReceita(ReceitasDAO receita, String cpf) {
        UsuariosDAO u;
        this.receita = receita;
        this.logado = cpf;
        initComponents();
        u = RegrasNegocio.getUsuario(logado);
       // System.out.println("nome "+receita.getNome());

        inputNomeReceita.setText(""+receita.getNome());
        inputAcucares.setText(""+receita.getAcucares());
        inputLeveduras.setText(""+receita.getLeveduras());
        inputMaltes.setText(""+receita.getMaltes());
        inputLupulo.setText(""+receita.getLupulo());
        ArrayList<AditivosDAO> add = receita.getAditivo();
        if(add.size() > 0){
            inputQuantidade.setText(""+add.get(0).getQuantidade());
            inputAditivo.setText(""+add.get(0).getNome());
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        botaoVoltar = new javax.swing.JButton();
        botaoFabricar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        inputLupulo = new javax.swing.JTextField();
        inputMaltes = new javax.swing.JTextField();
        inputAditivo = new javax.swing.JTextField();
        inputAcucares = new javax.swing.JTextField();
        inputQuantidade = new javax.swing.JTextField();
        inputNomeReceita = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        inputLeveduras = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Receita");

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apresentacao/Imagem2.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Receita:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Maltes:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Lúpulo:");

        botaoVoltar.setBackground(new java.awt.Color(255, 153, 51));
        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        botaoFabricar.setBackground(new java.awt.Color(255, 153, 51));
        botaoFabricar.setText("Fabricar");
        botaoFabricar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFabricarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("Leveduras:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("Açúcares:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("Aditivos:");

        inputLupulo.setEditable(false);
        inputLupulo.setToolTipText("");

        inputMaltes.setEditable(false);

        inputAditivo.setEditable(false);

        inputAcucares.setEditable(false);

        inputQuantidade.setEditable(false);

        inputNomeReceita.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        inputNomeReceita.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setText("Quantidade:");

        inputLeveduras.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(245, 245, 245))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(inputMaltes, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(jLabel9)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(inputAditivo)
                                            .addComponent(inputLupulo, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel7)
                                                    .addComponent(jLabel8))
                                                .addGap(28, 28, 28))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel10)
                                                .addGap(18, 18, 18)))
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(inputAcucares, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(inputQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(inputNomeReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addComponent(botaoFabricar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10))
                                            .addComponent(inputLeveduras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 39, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jLabel1)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputNomeReceita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(inputMaltes, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(inputAcucares, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(inputLupulo))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputLeveduras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(inputAditivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botaoFabricar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(inputQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))))
                        .addGap(20, 20, 20))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        TelaMenu menu = new TelaMenu(logado);
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void botaoFabricarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFabricarActionPerformed
        String maltes = inputMaltes.getText();
        String lupulo = inputLupulo.getText();
        String leveduras = inputLeveduras.getText();
        String acucares = inputAcucares.getText();
        String qnt = inputQuantidade.getText();
        String aditivos  = inputAditivo.getText();
        String nome = inputNomeReceita.getText();
        
        try{
            int mal = Integer.parseInt(maltes);
            int lu = Integer.parseInt(lupulo);
            int le = Integer.parseInt(leveduras);
            int a = Integer.parseInt(acucares);
            int quantidade = 0;
            if(!qnt.equals("")){
                quantidade = Integer.parseInt(qnt);
            }
            
            UsuariosDAO u = RegrasNegocio.getUsuario(logado);
            boolean j = RegrasNegocio.validarFabricacao(mal,le,lu,a,aditivos,quantidade,u);
            
            if(j){
                u.getIngredientes().setMaltes(u.getIngredientes().getMaltes() - mal);
                u.getIngredientes().setAcucares(u.getIngredientes().getAcucares() - a);
                u.getIngredientes().setLupulo(u.getIngredientes().getLupulo() - lu);
                u.getIngredientes().setLeveduras(u.getIngredientes().getLeveduras() - le);
                u.getIngredientes().alterar();
                
                if(quantidade != 0){
                     for(AditivosDAO ad : u.getIngredientes().getAditivo()){
                         if(ad.getNome().equals(aditivos)){
                            //aditivo = ad;
                            ad.setQuantidade(ad.getQuantidade() - quantidade);
                            ad.alterarAditivo();
                            break;
                             
                         }
                     }
                  
                    //AditivosDAO aditivo = AditivosDAO.getAditivosProdutoNome(u.getIngredientes().getId(), aditivos); 
                    
                }
                
                JOptionPane.showMessageDialog(null, "Receita fabricada com sucesso!", "Fabricar", 1);
                TelaMenu menu = new TelaMenu(logado);
                menu.setVisible(true);
                dispose();
              
            }else{
                JOptionPane.showMessageDialog(null, "Quantidade insuficiente para fabricação.", "Erro", 0);
            }
            
        }
        catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Digite um valor válido para os campos.", "Erro", 0);
        } catch (Exception ex) {
            Logger.getLogger(TelaMostrarReceita.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botaoFabricarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoFabricar;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JTextField inputAcucares;
    private javax.swing.JTextField inputAditivo;
    private javax.swing.JTextField inputLeveduras;
    private javax.swing.JTextField inputLupulo;
    private javax.swing.JTextField inputMaltes;
    private javax.swing.JLabel inputNomeReceita;
    private javax.swing.JTextField inputQuantidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
