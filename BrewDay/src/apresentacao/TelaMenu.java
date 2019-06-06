package apresentacao;

public class TelaMenu extends javax.swing.JFrame {
    private String logado;
    
    public TelaMenu(String logado) {
        this.logado = logado;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botaoListarReceitas = new javax.swing.JButton();
        botaoCriarReceitas = new javax.swing.JButton();
        botaoCustomizarReceitas = new javax.swing.JButton();
        botaoLogout = new javax.swing.JButton();
        botaoBrewDay = new javax.swing.JButton();
        botaoListarIngredientes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Menu");

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apresentacao/Imagem2.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Bem Vindo!");

        botaoListarReceitas.setBackground(new java.awt.Color(255, 153, 51));
        botaoListarReceitas.setText("Listar Receitas");
        botaoListarReceitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoListarReceitasActionPerformed(evt);
            }
        });

        botaoCriarReceitas.setBackground(new java.awt.Color(255, 153, 51));
        botaoCriarReceitas.setText("Criar Receitas");
        botaoCriarReceitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCriarReceitasActionPerformed(evt);
            }
        });

        botaoCustomizarReceitas.setBackground(new java.awt.Color(255, 153, 51));
        botaoCustomizarReceitas.setText("Customizar Receitas");
        botaoCustomizarReceitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCustomizarReceitasActionPerformed(evt);
            }
        });

        botaoLogout.setBackground(new java.awt.Color(255, 153, 51));
        botaoLogout.setText("Logout");
        botaoLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLogoutActionPerformed(evt);
            }
        });

        botaoBrewDay.setBackground(new java.awt.Color(255, 153, 51));
        botaoBrewDay.setText("Brew Day");
        botaoBrewDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoBrewDayActionPerformed(evt);
            }
        });

        botaoListarIngredientes.setBackground(new java.awt.Color(255, 153, 51));
        botaoListarIngredientes.setText("Listar Ingredientes");
        botaoListarIngredientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoListarIngredientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoCriarReceitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoListarReceitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoCustomizarReceitas, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoListarIngredientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                    .addComponent(botaoBrewDay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoLogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(117, 117, 117))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoListarIngredientes, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoListarReceitas, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCriarReceitas, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoBrewDay, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCustomizarReceitas, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLogoutActionPerformed
        TelaLogin log = new TelaLogin();
        log.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoLogoutActionPerformed

    private void botaoListarReceitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoListarReceitasActionPerformed
        TelaListaReceitas lista = new TelaListaReceitas(logado);
        lista.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoListarReceitasActionPerformed

    private void botaoCriarReceitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCriarReceitasActionPerformed
        TelaCriarReceita cria = new TelaCriarReceita(logado);
        cria.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoCriarReceitasActionPerformed

    private void botaoCustomizarReceitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCustomizarReceitasActionPerformed
        TelaReceitas cria = new TelaReceitas(logado);
        cria.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoCustomizarReceitasActionPerformed

    private void botaoListarIngredientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoListarIngredientesActionPerformed
        TelaListaIngredientes cria = new TelaListaIngredientes(logado);
        cria.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoListarIngredientesActionPerformed

    private void botaoBrewDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoBrewDayActionPerformed
        TelaBrewDay brew = new TelaBrewDay(logado);
        brew.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoBrewDayActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoBrewDay;
    private javax.swing.JButton botaoCriarReceitas;
    private javax.swing.JButton botaoCustomizarReceitas;
    private javax.swing.JButton botaoListarIngredientes;
    private javax.swing.JButton botaoListarReceitas;
    private javax.swing.JButton botaoLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
