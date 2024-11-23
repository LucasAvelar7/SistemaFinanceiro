import javax.swing.*;
import java.awt.*;
import java.util.List;

public class TelaRelatorios extends JFrame {

    public TelaRelatorios() {
        setTitle("Relatórios Financeiros");
        setSize(500, 400);
        setLocationRelativeTo(null);

        List<Transacao> transacoes = ArquivoTransacoes.carregar();

        String[] colunas = {"Descrição", "Valor", "Tipo", "Data"};

        Object[][] dados = new Object[transacoes.size()][4];
        for (int i = 0; i < transacoes.size(); i++) {
            Transacao t = transacoes.get(i);
            dados[i][0] = t.getDescricao();
            dados[i][1] = t.getValor();
            dados[i][2] = t.getTipo();
            dados[i][3] = t.getData();
        }

        JTable tabela = new JTable(dados, colunas);
        JScrollPane scrollPane = new JScrollPane(tabela);

        add(scrollPane, BorderLayout.CENTER);

        JButton btnVoltar = new JButton("Voltar");
        add(btnVoltar, BorderLayout.SOUTH);

        btnVoltar.addActionListener(e -> this.dispose());
    }
}
