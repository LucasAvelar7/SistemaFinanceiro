import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TelaInicial extends JFrame {
    public TelaInicial() {
        setTitle("Sistema de Gestão Financeira");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JLabel label = new JLabel("Bem-vindo ao Sistema Financeiro!", SwingConstants.CENTER);
        add(label, BorderLayout.CENTER);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));

        JButton btnCadastro = new JButton("Cadastro de Transações");
        JButton btnRelatorios = new JButton("Relatórios");
        JButton btnConfiguracoes = new JButton("Configurações");
        JButton btnSair = new JButton("Sair");

        panel.add(btnCadastro);
        panel.add(btnRelatorios);
        panel.add(btnConfiguracoes);
        panel.add(btnSair);

        add(panel, BorderLayout.SOUTH);

        btnCadastro.addActionListener(e -> new TelaCadastro().setVisible(true));
        btnRelatorios.addActionListener(e -> new TelaRelatorios().setVisible(true));
        btnConfiguracoes.addActionListener(e -> new TelaConfiguracoes().setVisible(true));
        btnSair.addActionListener(e -> System.exit(0));
    }
}
