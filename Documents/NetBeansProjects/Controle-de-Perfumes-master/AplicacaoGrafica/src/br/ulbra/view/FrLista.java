/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.view;

import javax.swing.JOptionPane;

import br.ulbra.entity.TrabalhoPedro;

/**
 *
 * @author aluno.saolucas
 */
public class FrLista extends javax.swing.JFrame {

    /**
     * Creates new form FrLista
     */
    public FrLista() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        TXTproduto = new javax.swing.JTextField();
        BTNsalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TXTlista = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        TXTCodigo = new javax.swing.JTextField();
        BTNAlterar = new javax.swing.JButton();
        BTNExcluir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        TXTNovoNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TXTCodigoEx = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        BTNQuantidade = new javax.swing.JButton();
        BTNlimpar = new javax.swing.JButton();
        BNTorganizada = new javax.swing.JButton();
        BNTpadrao = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        TXTProcurar = new javax.swing.JTextField();
        BTNProcurar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Nome do Produto");

        TXTproduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTprodutoActionPerformed(evt);
            }
        });

        BTNsalvar.setBackground(new java.awt.Color(255, 0, 51));
        BTNsalvar.setText("SALVAR");
        BTNsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNsalvarActionPerformed(evt);
            }
        });

        TXTlista.setColumns(20);
        TXTlista.setRows(5);
        jScrollPane1.setViewportView(TXTlista);

        jLabel3.setText("Código");

        TXTCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTCodigoActionPerformed(evt);
            }
        });

        BTNAlterar.setBackground(new java.awt.Color(255, 0, 51));
        BTNAlterar.setText("ALTERAR");
        BTNAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAlterarActionPerformed(evt);
            }
        });

        BTNExcluir.setBackground(new java.awt.Color(255, 0, 51));
        BTNExcluir.setText("EXCLUIR");
        BTNExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNExcluirActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Alterar Perfume");

        TXTNovoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTNovoNomeActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Lista de Perfumes");

        jPanel1.setBackground(new java.awt.Color(255, 0, 51));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel11.setText("Perfumes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel6.setText("Perfume Novo");

        jLabel7.setText("Código");

        TXTCodigoEx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTCodigoExActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Excluir Perfume");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Botões opcionais");

        BTNQuantidade.setBackground(new java.awt.Color(255, 0, 0));
        BTNQuantidade.setText("QUANTIDADE");
        BTNQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNQuantidadeActionPerformed(evt);
            }
        });

        BTNlimpar.setBackground(new java.awt.Color(255, 0, 51));
        BTNlimpar.setText("LIMPAR LISTA");
        BTNlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNlimparActionPerformed(evt);
            }
        });

        BNTorganizada.setBackground(new java.awt.Color(255, 0, 51));
        BNTorganizada.setText("ORDENAR");
        BNTorganizada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNTorganizadaActionPerformed(evt);
            }
        });

        BNTpadrao.setBackground(new java.awt.Color(255, 0, 51));
        BNTpadrao.setText("LISTAR");
        BNTpadrao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNTpadraoActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Pesquisar");

        TXTProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTProcurarActionPerformed(evt);
            }
        });

        BTNProcurar.setBackground(new java.awt.Color(255, 0, 51));
        BTNProcurar.setText("PROCURAR");
        BTNProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNProcurarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3)
                                .addComponent(jLabel6)
                                .addComponent(TXTNovoNome, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                                .addComponent(TXTproduto)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(TXTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(BTNAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTNQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addGap(6, 6, 6)
                .addComponent(BTNsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TXTCodigoEx, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BTNExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BNTorganizada, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BNTpadrao, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel5)
                        .addGap(125, 125, 125)
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TXTProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTNProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(610, 610, 610)
                                .addComponent(jLabel10))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(582, 582, 582)
                                .addComponent(BTNlimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 229, Short.MAX_VALUE)))
                .addGap(162, 162, 162))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TXTCodigoEx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BTNExcluir))
                                .addGap(147, 147, 147)
                                .addComponent(BNTpadrao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BNTorganizada)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTNlimpar)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTNProcurar)
                            .addComponent(TXTProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(111, 111, 111))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXTproduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTNsalvar))
                        .addGap(11, 11, 11)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BTNAlterar)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(TXTCodigo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TXTNovoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(BTNQuantidade)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXTprodutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTprodutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTprodutoActionPerformed
    TrabalhoPedro bancoDeDados = new TrabalhoPedro();

    private void BTNsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNsalvarActionPerformed
        bancoDeDados.salvar(TXTproduto.getText());
        TXTlista.setText(bancoDeDados.listar());
    }//GEN-LAST:event_BTNsalvarActionPerformed

    private void TXTCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTCodigoActionPerformed

    private void BTNAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAlterarActionPerformed
        bancoDeDados.alterar(Integer.parseInt(TXTCodigo.getText()), TXTNovoNome.getText());
        TXTlista.setText(bancoDeDados.listar());
    }//GEN-LAST:event_BTNAlterarActionPerformed

    private void BTNExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNExcluirActionPerformed
        bancoDeDados.excluir(Integer.parseInt(TXTCodigoEx.getText()));
        TXTlista.setText(bancoDeDados.listar());
    }//GEN-LAST:event_BTNExcluirActionPerformed

    private void TXTNovoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTNovoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTNovoNomeActionPerformed

    private void TXTCodigoExActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTCodigoExActionPerformed
        bancoDeDados.excluir(Integer.parseInt(TXTCodigo.getText()));
        TXTlista.setText(bancoDeDados.listar());
    }//GEN-LAST:event_TXTCodigoExActionPerformed

    private void BTNQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNQuantidadeActionPerformed
        int quantidade = bancoDeDados.quantidade();
        JOptionPane.showMessageDialog(null, "Total de produtos: " + quantidade);

    }//GEN-LAST:event_BTNQuantidadeActionPerformed

    private void BTNlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNlimparActionPerformed
        bancoDeDados.limparLista();
        TXTlista.setText("");
    }//GEN-LAST:event_BTNlimparActionPerformed

    private void BNTorganizadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNTorganizadaActionPerformed
// Ordena a lista de produtos alfabeticamente
    bancoDeDados.ordenarAlfabeticamente();

    // Cria uma string com os produtos ordenados
    StringBuilder listaFinal = new StringBuilder("Lista de produtos ordenada:\n");
    for (String produto : bancoDeDados.listaOrganizada) {
        listaFinal.append(produto).append("\n");
    }

    // Atualiza o campo de texto com a lista ordenada
    TXTlista.setText(listaFinal.toString());
    }//GEN-LAST:event_BNTorganizadaActionPerformed

    private void BNTpadraoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNTpadraoActionPerformed
        bancoDeDados.resetarLista();

    // Cria uma string com os produtos na ordem original
    StringBuilder listaFinal = new StringBuilder("Lista de produtos na ordem original:\n");
    for (String produto : bancoDeDados.listaPadrao) {
        listaFinal.append(produto).append("\n");
    }

    // Atualiza o campo de texto com a lista na ordem original
    TXTlista.setText(listaFinal.toString());;    }//GEN-LAST:event_BNTpadraoActionPerformed

    private void TXTProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTProcurarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTProcurarActionPerformed

    private void BTNProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNProcurarActionPerformed
        String produtoBuscado = TXTProcurar.getText().trim();  // Pega o produto digitado no campo de texto

    // Verifica se o campo não está vazio
    if (!produtoBuscado.isEmpty()) {
        boolean encontrado = false; // Flag para saber se encontrou o produto

        // Itera sobre a lista de produtos
        for (String produto : bancoDeDados.listaOrganizada) {
            // Verifica se o produto digitado está na lista (ignora maiúsculas/minúsculas)
            if (produto.equalsIgnoreCase(produtoBuscado)) {
                JOptionPane.showMessageDialog(null, "Produto encontrado: " + produto);
                encontrado = true;
                break;  // Interrompe o loop se o produto for encontrado
            }
        }

        // Caso o produto não tenha sido encontrado
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "Produto não encontrado.");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Digite um produto para procurar.");
    }//GEN-LAST:event_BTNProcurarActionPerformed
    }
    
    
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
            java.util.logging.Logger.getLogger(FrLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrLista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BNTorganizada;
    private javax.swing.JButton BNTpadrao;
    private javax.swing.JButton BTNAlterar;
    private javax.swing.JButton BTNExcluir;
    private javax.swing.JButton BTNProcurar;
    private javax.swing.JButton BTNQuantidade;
    private javax.swing.JButton BTNlimpar;
    private javax.swing.JButton BTNsalvar;
    private javax.swing.JTextField TXTCodigo;
    private javax.swing.JTextField TXTCodigoEx;
    private javax.swing.JTextField TXTNovoNome;
    private javax.swing.JTextField TXTProcurar;
    private javax.swing.JTextArea TXTlista;
    private javax.swing.JTextField TXTproduto;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
