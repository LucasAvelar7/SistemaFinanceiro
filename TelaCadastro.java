import javax.swing.*;
import java.awt.*;
import java.util.List;

public class TelaCadastro extends JFrame {

    private List<Transacao> transacoes;

    public TelaCadastro() {
        transacoes = ArquivoTransacoes.carregar();

        setTitle("Cadastro de Transações");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(6, 2));

        JLabel lblDescricao = new JLabel("Descrição:");
        JTextField txtDescricao = new JTextField();

        JLabel lblValor = new JLabel("Valor:");
        JTextField txtValor = new JTextField();

        JLabel lblTipo = new JLabel("Tipo:");
        JComboBox<String> cbTipo = new JComboBox<>(new String[]{"Receita", "Despesa"});

        JLabel lblData = new JLabel("Data:");
        JTextField txtData = new JTextField("dd/mm/aaaa");

        JButton btnSalvar = new JButton("Salvar");
        JButton btnVoltar = new JButton("Voltar");

        add(lblDescricao);
        add(txtDescricao);
        add(lblValor);
        add(txtValor);
        add(lblTipo);
        add(cbTipo);
        add(lblData);
        add(txtData);
        add(btnSalvar);
        add(btnVoltar);

        btnSalvar.addActionListener(e -> {
            String descricao = txtDescricao.getText();
            double valor = Double.parseDouble(txtValor.getText());
            String tipo = cbTipo.getSelectedItem().toString();
            String data = txtData.getText();

            Transacao transacao = new Transacao(descricao, valor, tipo, data);
            transacoes.add(transacao);

            ArquivoTransacoes.salvar(transacoes);

            JOptionPane.showMessageDialog(this, "Transação salva com sucesso!");

            txtDescricao.setText("");
            txtValor.setText("");
            txtData.setText("");
        });

        btnVoltar.addActionListener(e -> this.dispose());
    }
}
