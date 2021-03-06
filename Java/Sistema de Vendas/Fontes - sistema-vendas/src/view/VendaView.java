package view;

import controller.VendasController;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author Willian Carlos Gomes
 */
public class VendaView extends javax.swing.JFrame {
    VendasController controller = new VendasController(VendaView.this);
    /**
     * Creates new form CompraView
     */
    public VendaView() {
        initComponents();
        controller.bloqueioInicial();
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelInformacoes = new javax.swing.JPanel();
        lbCliente = new javax.swing.JLabel();
        lbFuncionario = new javax.swing.JLabel();
        cbxClientes = new javax.swing.JComboBox();
        cbxFuncionarios = new javax.swing.JComboBox();
        btIniciarVenda = new javax.swing.JButton();
        jPanelDados = new javax.swing.JPanel();
        lbFormaPagamento = new javax.swing.JLabel();
        cbxFormaPagamento = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePagamento = new javax.swing.JTable();
        btIncluir = new javax.swing.JButton();
        btExcluirPagamento = new javax.swing.JButton();
        jPanelValorTotal = new javax.swing.JPanel();
        btSairVenda = new javax.swing.JButton();
        btConfirmarVenda = new javax.swing.JButton();
        btCancelarVenda = new javax.swing.JButton();
        lbDescontoPagamento = new javax.swing.JLabel();
        tfDescontoPagamento = new javax.swing.JTextField();
        jPanelProdutos = new javax.swing.JPanel();
        lbDescricao = new javax.swing.JLabel();
        cbxProdutos = new javax.swing.JComboBox();
        lbQuantidade = new javax.swing.JLabel();
        tfQuantidade = new javax.swing.JTextField();
        btSalvarProduto = new javax.swing.JButton();
        btExcluirProduto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCompra = new javax.swing.JTable();
        lbDescontoProduto = new javax.swing.JLabel();
        tfDescontoProduto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Controle de Vendas");
        setAlwaysOnTop(true);
        setPreferredSize(new java.awt.Dimension(860, 636));

        jPanelInformacoes.setBorder(javax.swing.BorderFactory.createTitledBorder("Informa????es Cliente/Funcion??rio"));
        jPanelInformacoes.setPreferredSize(new java.awt.Dimension(853, 135));

        lbCliente.setText("Cliente:");

        lbFuncionario.setText("Funcion??rio:");

        cbxClientes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Selecione Cliente -", "Exemplo Cliente 1", "Exemplo Cliente 2", "Exemplo Cliente 3" }));
        cbxClientes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxClientesItemStateChanged(evt);
            }
        });
        cbxClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxClientesActionPerformed(evt);
            }
        });

        cbxFuncionarios.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Selecione Funcion??rio -", "Funcion??rio Exemplo 1", "Funcion??rio Exemplo 2", "Funcion??rio Exemplo 3" }));
        cbxFuncionarios.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxFuncionariosItemStateChanged(evt);
            }
        });

        btIniciarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/comprar.png"))); // NOI18N
        btIniciarVenda.setText("INICIAR VENDA");
        btIniciarVenda.setPreferredSize(new java.awt.Dimension(440, 40));
        btIniciarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIniciarVendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelInformacoesLayout = new javax.swing.GroupLayout(jPanelInformacoes);
        jPanelInformacoes.setLayout(jPanelInformacoesLayout);
        jPanelInformacoesLayout.setHorizontalGroup(
            jPanelInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInformacoesLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanelInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbFuncionario)
                    .addComponent(lbCliente))
                .addGap(18, 18, 18)
                .addGroup(jPanelInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxClientes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxFuncionarios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInformacoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btIniciarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203))
        );
        jPanelInformacoesLayout.setVerticalGroup(
            jPanelInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInformacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCliente)
                    .addComponent(cbxClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanelInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFuncionario)
                    .addComponent(cbxFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btIniciarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanelDados.setBorder(javax.swing.BorderFactory.createTitledBorder("Formas de pagamento"));
        jPanelDados.setPreferredSize(new java.awt.Dimension(853, 230));

        lbFormaPagamento.setText("Forma de Pagamento:");

        cbxFormaPagamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Selecione a forma de pagamento -", "Forma 1", "Forma 2", "Forma 3" }));
        cbxFormaPagamento.setPreferredSize(new java.awt.Dimension(450, 20));
        cbxFormaPagamento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxFormaPagamentoItemStateChanged(evt);
            }
        });

        jTablePagamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FORMA DE PAGAMENTO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablePagamento.setPreferredSize(new java.awt.Dimension(550, 0));
        jScrollPane2.setViewportView(jTablePagamento);

        btIncluir.setText("INCLUIR");
        btIncluir.setPreferredSize(new java.awt.Dimension(260, 30));
        btIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIncluirActionPerformed(evt);
            }
        });

        btExcluirPagamento.setText("EXCLUIR");
        btExcluirPagamento.setPreferredSize(new java.awt.Dimension(260, 30));
        btExcluirPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirPagamentoActionPerformed(evt);
            }
        });

        jPanelValorTotal.setBorder(javax.swing.BorderFactory.createTitledBorder("Valor Total"));

        javax.swing.GroupLayout jPanelValorTotalLayout = new javax.swing.GroupLayout(jPanelValorTotal);
        jPanelValorTotal.setLayout(jPanelValorTotalLayout);
        jPanelValorTotalLayout.setHorizontalGroup(
            jPanelValorTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 168, Short.MAX_VALUE)
        );
        jPanelValorTotalLayout.setVerticalGroup(
            jPanelValorTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btSairVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        btSairVenda.setText("SAIR");
        btSairVenda.setPreferredSize(new java.awt.Dimension(200, 50));
        btSairVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairVendaActionPerformed(evt);
            }
        });

        btConfirmarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/venda.gif"))); // NOI18N
        btConfirmarVenda.setText("CONFIRMAR");
        btConfirmarVenda.setPreferredSize(new java.awt.Dimension(200, 50));
        btConfirmarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarVendaActionPerformed(evt);
            }
        });

        btCancelarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        btCancelarVenda.setText("CANCELAR");
        btCancelarVenda.setPreferredSize(new java.awt.Dimension(200, 50));
        btCancelarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarVendaActionPerformed(evt);
            }
        });

        lbDescontoPagamento.setText("Desconto:");

        tfDescontoPagamento.setPreferredSize(new java.awt.Dimension(130, 20));

        javax.swing.GroupLayout jPanelDadosLayout = new javax.swing.GroupLayout(jPanelDados);
        jPanelDados.setLayout(jPanelDadosLayout);
        jPanelDadosLayout.setHorizontalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addComponent(btIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btExcluirPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addComponent(lbFormaPagamento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbxFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbDescontoPagamento)
                                .addGap(18, 18, 18)
                                .addComponent(tfDescontoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2))
                        .addGap(43, 43, 43)
                        .addComponent(jPanelValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addComponent(btConfirmarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btCancelarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)
                        .addComponent(btSairVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelDadosLayout.setVerticalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosLayout.createSequentialGroup()
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbFormaPagamento)
                            .addComponent(cbxFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbDescontoPagamento)
                            .addComponent(tfDescontoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btExcluirPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                    .addComponent(jPanelValorTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSairVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancelarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConfirmarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanelProdutos.setBorder(javax.swing.BorderFactory.createTitledBorder("Produtos"));
        jPanelProdutos.setPreferredSize(new java.awt.Dimension(853, 235));

        lbDescricao.setText("Descri????o:");

        cbxProdutos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Selecione um produto -", "Produto Exemplo 1", "Produto Exemplo 2", "Produto Exemplo 3" }));
        cbxProdutos.setPreferredSize(new java.awt.Dimension(350, 20));
        cbxProdutos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxProdutosItemStateChanged(evt);
            }
        });
        cbxProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxProdutosActionPerformed(evt);
            }
        });

        lbQuantidade.setText("Quantidade:");

        tfQuantidade.setPreferredSize(new java.awt.Dimension(130, 20));

        btSalvarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar.png"))); // NOI18N
        btSalvarProduto.setText("SALVAR PRODUTO");
        btSalvarProduto.setPreferredSize(new java.awt.Dimension(180, 40));
        btSalvarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarProdutoActionPerformed(evt);
            }
        });

        btExcluirProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/excluir.png"))); // NOI18N
        btExcluirProduto.setText("EXCLUIR PRODUTO");
        btExcluirProduto.setPreferredSize(new java.awt.Dimension(180, 40));

        jTableCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descri????o", "Quantidade", "Valor Unit??rio", "Desconto", "Valor Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableCompra);

        lbDescontoProduto.setText("Desconto:");

        tfDescontoProduto.setPreferredSize(new java.awt.Dimension(130, 20));

        javax.swing.GroupLayout jPanelProdutosLayout = new javax.swing.GroupLayout(jPanelProdutos);
        jPanelProdutos.setLayout(jPanelProdutosLayout);
        jPanelProdutosLayout.setHorizontalGroup(
            jPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProdutosLayout.createSequentialGroup()
                .addGroup(jPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelProdutosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanelProdutosLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lbDescricao)
                        .addGap(18, 18, 18)
                        .addComponent(cbxProdutos, 0, 1, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(lbQuantidade)
                        .addGap(18, 18, 18)
                        .addComponent(tfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbDescontoProduto)
                        .addGap(18, 18, 18)
                        .addComponent(tfDescontoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelProdutosLayout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(btSalvarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143)
                        .addComponent(btExcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(167, 167, 167)))
                .addContainerGap())
        );
        jPanelProdutosLayout.setVerticalGroup(
            jPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProdutosLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbQuantidade)
                        .addComponent(tfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbDescontoProduto)
                        .addComponent(tfDescontoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbDescricao)
                        .addComponent(cbxProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btExcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSalvarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelInformacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(881, 663));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbxClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxClientesActionPerformed

    private void btIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIncluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btIncluirActionPerformed

    private void btExcluirPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirPagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btExcluirPagamentoActionPerformed

    private void cbxProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxProdutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxProdutosActionPerformed

    private void btSairVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairVendaActionPerformed
        controller.acaoBotaoSair();
    }//GEN-LAST:event_btSairVendaActionPerformed

    private void btConfirmarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarVendaActionPerformed
        // TODO add your handling code here:
        controller.acaoBotaoConfirmar();
    }//GEN-LAST:event_btConfirmarVendaActionPerformed

    private void cbxClientesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxClientesItemStateChanged
        controller.desbloqueiaCbxFuncionarios();
        
    }//GEN-LAST:event_cbxClientesItemStateChanged

    private void cbxFuncionariosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxFuncionariosItemStateChanged
        controller.desbloqueiaBtIniciarVenda();
    }//GEN-LAST:event_cbxFuncionariosItemStateChanged

    private void btIniciarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIniciarVendaActionPerformed
        controller.desbloqueiaComboProdutos();
        controller.bloqueiaCbxClienteFuncionario();
    }//GEN-LAST:event_btIniciarVendaActionPerformed

    private void btSalvarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarProdutoActionPerformed
        controller.acaoSalvarProduto();
    }//GEN-LAST:event_btSalvarProdutoActionPerformed

    private void cbxFormaPagamentoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxFormaPagamentoItemStateChanged
        controller.desbloqueiaIncluirExcluir();
        controller.desbloqueiaConfirmar();
    }//GEN-LAST:event_cbxFormaPagamentoItemStateChanged

    private void btCancelarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarVendaActionPerformed
        controller.acaoBotaoCancelar();
    }//GEN-LAST:event_btCancelarVendaActionPerformed

    private void cbxProdutosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxProdutosItemStateChanged
        controller.desbloqueiaProdutos();
    }//GEN-LAST:event_cbxProdutosItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelarVenda;
    private javax.swing.JButton btConfirmarVenda;
    private javax.swing.JButton btExcluirPagamento;
    private javax.swing.JButton btExcluirProduto;
    private javax.swing.JButton btIncluir;
    private javax.swing.JButton btIniciarVenda;
    private javax.swing.JButton btSairVenda;
    private javax.swing.JButton btSalvarProduto;
    private javax.swing.JComboBox cbxClientes;
    private javax.swing.JComboBox cbxFormaPagamento;
    private javax.swing.JComboBox cbxFuncionarios;
    private javax.swing.JComboBox cbxProdutos;
    private javax.swing.JPanel jPanelDados;
    private javax.swing.JPanel jPanelInformacoes;
    private javax.swing.JPanel jPanelProdutos;
    private javax.swing.JPanel jPanelValorTotal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCompra;
    private javax.swing.JTable jTablePagamento;
    private javax.swing.JLabel lbCliente;
    private javax.swing.JLabel lbDescontoPagamento;
    private javax.swing.JLabel lbDescontoProduto;
    private javax.swing.JLabel lbDescricao;
    private javax.swing.JLabel lbFormaPagamento;
    private javax.swing.JLabel lbFuncionario;
    private javax.swing.JLabel lbQuantidade;
    private javax.swing.JTextField tfDescontoPagamento;
    private javax.swing.JTextField tfDescontoProduto;
    private javax.swing.JTextField tfQuantidade;
    // End of variables declaration//GEN-END:variables

    public JButton getBtIniciarVenda() {
        return btIniciarVenda;
    }

    public void setBtIniciarVenda(JButton btIniciarVenda) {
        this.btIniciarVenda = btIniciarVenda;
    }

    public JButton getBtCancelarVenda() {
        return btCancelarVenda;
    }

    public void setBtCancelarVenda(JButton btCancelarVenda) {
        this.btCancelarVenda = btCancelarVenda;
    }

    public JButton getBtConfirmarVenda() {
        return btConfirmarVenda;
    }

    public void setBtConfirmarVenda(JButton btConfirmarVenda) {
        this.btConfirmarVenda = btConfirmarVenda;
    }

    public JButton getBtExcluirPagamento() {
        return btExcluirPagamento;
    }

    public void setBtExcluirPagamento(JButton btExcluirPagamento) {
        this.btExcluirPagamento = btExcluirPagamento;
    }

    public JButton getBtExcluirProduto() {
        return btExcluirProduto;
    }

    public void setBtExcluirProduto(JButton btExcluirProduto) {
        this.btExcluirProduto = btExcluirProduto;
    }

    public JButton getBtIncluir() {
        return btIncluir;
    }

    public void setBtIncluir(JButton btIncluir) {
        this.btIncluir = btIncluir;
    }

    public JButton getBtSairVenda() {
        return btSairVenda;
    }

    public void setBtSairVenda(JButton btSairVenda) {
        this.btSairVenda = btSairVenda;
    }

    public JButton getBtSalvarProduto() {
        return btSalvarProduto;
    }

    public void setBtSalvarProduto(JButton btSalvarProduto) {
        this.btSalvarProduto = btSalvarProduto;
    }

    public JComboBox getCbxClientes() {
        return cbxClientes;
    }

    public void setCbxClientes(JComboBox cbxClientes) {
        this.cbxClientes = cbxClientes;
    }

    public JComboBox getCbxFormaPagamento() {
        return cbxFormaPagamento;
    }

    public void setCbxFormaPagamento(JComboBox cbxFormaPagamento) {
        this.cbxFormaPagamento = cbxFormaPagamento;
    }

    public JComboBox getCbxFuncionarios() {
        return cbxFuncionarios;
    }

    public void setCbxFuncionarios(JComboBox cbxFuncionarios) {
        this.cbxFuncionarios = cbxFuncionarios;
    }

    public JComboBox getCbxProdutos() {
        return cbxProdutos;
    }

    public void setCbxProdutos(JComboBox cbxProdutos) {
        this.cbxProdutos = cbxProdutos;
    }

    public JTextField getTfDescontoPagamento() {
        return tfDescontoPagamento;
    }

    public void setTfDescontoPagamento(JTextField tfDescontoPagamento) {
        this.tfDescontoPagamento = tfDescontoPagamento;
    }

    public JTextField getTfDescontoProduto() {
        return tfDescontoProduto;
    }

    public void setTfDescontoProduto(JTextField tfDescontoProduto) {
        this.tfDescontoProduto = tfDescontoProduto;
    }

    public JTextField getTfQuantidade() {
        return tfQuantidade;
    }

    public void setTfQuantidade(JTextField tfQuantidade) {
        this.tfQuantidade = tfQuantidade;
    }




}
