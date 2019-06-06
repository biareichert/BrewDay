package apresentacao;

import controlador.RegrasNegocio;
import dao.AditivosDAO;
import dao.ProdutosDAO;
import dao.UsuariosDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class TelaListaIngredientes extends javax.swing.JFrame {
    
    private String logado;
    
    public TelaListaIngredientes(String logado) {
        this.logado = logado;
        initComponents();
        UsuariosDAO u = RegrasNegocio.getUsuario(logado);
        int malte = 0, lupulo = 0, leveduras = 0, acucares = 0;
        if(u.getIngredientes() != null){
            malte = u.getIngredientes().getMaltes();
            lupulo = u.getIngredientes().getLupulo();
            leveduras = u.getIngredientes().getLeveduras();
            acucares = u.getIngredientes().getAcucares();
            
        }
        inputMaltes.setText(""+malte);
        inputLupulo.setText(""+lupulo);
        inputLeveduras.setText(""+leveduras);
        inputAcucares.setText(""+acucares);
       /* inputAditivos.setText(""+u.getIngredientes().get);
        inputMaltes.setText(""+u.getIngredientes().getMaltes());*/
        OrganizaTabela();
    }
    
    public void OrganizaTabela(){
        UsuariosDAO u;
        u = RegrasNegocio.getUsuario(logado);
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Aditivo");
        modelo.addColumn("Quantidade");
        modelo.addRow(new Object[]{"",null});
        
        for(int i=0;u.getIngredientes() != null && u.getIngredientes().getAditivo() != null && i<u.getIngredientes().getAditivo().size();i++){
            System.out.println(i);
            modelo.addRow(new Object[]{u.getIngredientes().getAditivo().get(i).getNome(),String.valueOf(u.getIngredientes().getAditivo().get(i).getQuantidade())});
        }
        
        tabela.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelNomeReceita = new javax.swing.JLabel();
        botaoVoltar = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        inputMaltes = new javax.swing.JTextField();
        inputLeveduras = new javax.swing.JTextField();
        inputLupulo = new javax.swing.JTextField();
        inputAcucares = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista de Ingredientes");

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apresentacao/Imagem2.png"))); // NOI18N

        labelNomeReceita.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        labelNomeReceita.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNomeReceita.setText("Sua lista de ingredientes:");

        botaoVoltar.setBackground(new java.awt.Color(255, 153, 51));
        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        botaoSalvar.setBackground(new java.awt.Color(255, 153, 51));
        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Maltes:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Leveduras:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Lúpulo:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Açúcares:");

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabela);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNomeReceita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGap(22, 22, 22)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(inputMaltes)
                                            .addComponent(inputLeveduras, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                                        .addGap(32, 32, 32)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(29, 29, 29)
                                                .addComponent(inputAcucares))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(44, 44, 44)
                                                .addComponent(inputLupulo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(50, 50, 50))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelNomeReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputLupulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4)
                        .addComponent(inputMaltes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(inputLeveduras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(inputAcucares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        TelaMenu menu = new TelaMenu(logado);
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        String maltes = inputMaltes.getText();
        String lupulo = inputLupulo.getText();
        String leveduras = inputLeveduras.getText();
        String acucares = inputAcucares.getText();
        boolean verificarAditivo;
       
        try{
            int mal = Integer.parseInt(maltes);
            int lu = Integer.parseInt(lupulo);
            int le = Integer.parseInt(leveduras);
            int a = Integer.parseInt(acucares);
            UsuariosDAO u = RegrasNegocio.getUsuario(logado);
            
            ProdutosDAO ingrediente = u.getIngredientes();
            boolean b = true;
            if(ingrediente == null){
                ingrediente = new ProdutosDAO();
                b = false;
            }
            ingrediente.setAcucares(a);
            ingrediente.setLeveduras(le);
            ingrediente.setLupulo(lu);
            ingrediente.setMaltes(mal);
            try {
                if(!b){
                    ingrediente.cadastrar(logado);
                }else{
                    AditivosDAO.removerAditivo(ingrediente.getId());
                    ingrediente.setAditivo(new ArrayList<AditivosDAO>());
                    ingrediente.alterar();
                } 
                //ArrayList<AditivosDAO> ad = u.getIngredientes().getAditivo();
                
                TableModel tm= tabela.getModel();
                for(int i = tm.getRowCount()-1;i >= 0;i--){
                    String nome = (String) tm.getValueAt(i, 0);
                    if(nome.trim().equals("")) continue;
                    System.out.println((String) tm.getValueAt(i, 1));
                    int quantidade = Integer.parseInt((String) tm.getValueAt(i, 1));     
                    AditivosDAO ad = new AditivosDAO();
                    ad.setNome(nome);
                    ad.setQuantidade(quantidade);
                    if(RegrasNegocio.consultarAditivo(ad, ingrediente)){ //se for true ainda não tem na lista
                        ad.cadastrarAditivo(u.getIngredientes().getId());
                        ingrediente.addAditivo(ad);
                    }else{
                        //mensagem de erro - aditivo com mesmo nome  
                    }
                }                
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Alteração inválida.", "Erro", 0);
            }
        }
        catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Digite um valor válido para os campos.", "Erro", 0);
        }
    }//GEN-LAST:event_botaoSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JTextField inputAcucares;
    private javax.swing.JTextField inputLeveduras;
    private javax.swing.JTextField inputLupulo;
    private javax.swing.JTextField inputMaltes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelNomeReceita;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
