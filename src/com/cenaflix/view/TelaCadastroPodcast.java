/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.cenaflix.view;

import com.cenaflix.model.dao.PodcastDAO;
import com.cenaflix.model.entity.Podcast;
import javax.swing.JOptionPane;

/**
 * Tela responsável pela interface de cadastro de novos podcasts.
 * Permite a inserção de dados e a persistência via PodcastDAO.
 * @author Cavinho
 */
public class TelaCadastroPodcast extends javax.swing.JFrame {

    
    /**
     * Referência à tela de listagem para que possamos atualizá-la após o cadastro.
     */
    private final TelaListagemProd telaListagem;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaCadastroPodcast.class.getName());
    // Construtor principal que recebe a referência da listagem
   
    /**
 * Construtor principal da tela de cadastro.
 * @param listagem Referência da tela de listagem para atualização após o cadastro.
 */
    public TelaCadastroPodcast(TelaListagemProd listagem) {
        initComponents();
        this.telaListagem = listagem;
        this.setLocationRelativeTo(null); // Centraliza a tela
        

        
        // Adiciona a ação para o botão Ver Listagem/Voltar
        adicionarAcaoVerListagem();
    }
    

    /**
    * Construtor padrão, necessário para o NetBeans Design View.
    */
    public TelaCadastroPodcast() {
        initComponents();
        this.telaListagem = null; 
    }



     /**
     * Adiciona a ação para o botão "Ver Listagem" (Voltar).
     */
    private void adicionarAcaoVerListagem() {
        btnVerListagem.addActionListener(e -> {
            // Apenas fecha a tela de cadastro
            this.dispose(); 
            // Se a tela de listagem foi aberta por aqui, ela continua visível.
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtProdutor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNomeEpisodio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        numEpisodioTexto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDuracao = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtUrlRepositorio = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnVerListagem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("CENAFLIX");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("CADASTRAR PODCAST");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Produtor");

        txtProdutor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Nome do Episódio");

        txtNomeEpisodio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Nº do Episódio");

        numEpisodioTexto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        numEpisodioTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numEpisodioTextoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("Duração");

        txtDuracao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setText("URL do repositório");

        txtUrlRepositorio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        btnCadastrar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnVerListagem.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnVerListagem.setText("Ver Listagem");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(btnVerListagem)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7)
                                .addComponent(txtUrlRepositorio, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addComponent(jLabel4)
                                .addComponent(txtNomeEpisodio)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(numEpisodioTexto))
                                .addComponent(txtProdutor, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtProdutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNomeEpisodio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(numEpisodioTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUrlRepositorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadastrar)
                    .addComponent(btnVerListagem))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numEpisodioTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numEpisodioTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numEpisodioTextoActionPerformed
    /**
     * Manipula a ação do botão "Cadastrar".
     * Coleta os dados, valida, cria o objeto Podcast e o persiste no BD.
     * @param evt Evento de ação
     */
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
    btnCadastrar.addActionListener(e -> {
            
            // --- CÓDIGO DO btnCadastrarActionPerformed FOI MOVIDO PARA CÁ ---
            
            // 1. Coletar dados
            String produtor = txtProdutor.getText();
            String nomeEpisodio = txtNomeEpisodio.getText();
            String duracao = txtDuracao.getText();
            String urlRepo = txtUrlRepositorio.getText();
            
            // CORREÇÃO 1: Coleta o texto do campo (numEpisodioTexto)
            String numEpisodioTextoCampo = numEpisodioTexto.getText(); 
            
            // 2. Validação básica (garante que o campo Num Episódio seja um número)
            Integer numEpisodio;
            
            // Verifica se todos os campos estão preenchidos
            if (produtor.trim().isEmpty() || nomeEpisodio.trim().isEmpty() || 
                duracao.trim().isEmpty() || urlRepo.trim().isEmpty() || 
                numEpisodioTextoCampo.trim().isEmpty()) { // Usa a variável String
                
                JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            // Tenta converter o número do episódio
            try {
                // CORREÇÃO 2: Usa a String coletada para conversão
                numEpisodio = Integer.parseInt(numEpisodioTextoCampo); 
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "O campo 'Nº do Episódio' deve ser um número inteiro.", "Erro de Validação", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // 3. Criação da Entidade Podcast
            Podcast novoPodcast = new Podcast(produtor, nomeEpisodio, numEpisodio, duracao, urlRepo);

            // 4. Persistência (Salvando no banco de dados via JPA)
            try {
                PodcastDAO dao = new PodcastDAO();
                dao.salvar(novoPodcast);
                
                JOptionPane.showMessageDialog(this, "Podcast cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                
                // 5. Atualizar a listagem e fechar a tela
                if (telaListagem != null) {
                    telaListagem.atualizarListagem();
                }
                this.dispose(); // Fecha a janela de cadastro
                
            } catch (Exception ex) {
                logger.log(java.util.logging.Level.SEVERE, "Erro de persistência ao cadastrar podcast", ex);
                JOptionPane.showMessageDialog(this, "Erro ao salvar o podcast: " + ex.getMessage(), "Erro de Persistência", JOptionPane.ERROR_MESSAGE);
            }
            
            // --- FIM DO CÓDIGO MOVIDO ---
            
        }); // Fecha o addActionListener
    }//GEN-LAST:event_btnCadastrarActionPerformed




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnVerListagem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField numEpisodioTexto;
    private javax.swing.JTextField txtDuracao;
    private javax.swing.JTextField txtNomeEpisodio;
    private javax.swing.JTextField txtProdutor;
    private javax.swing.JTextField txtUrlRepositorio;
    // End of variables declaration//GEN-END:variables
}
