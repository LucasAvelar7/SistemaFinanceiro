import javax.swing.*;
import java.awt.*;

public class TelaConfiguracoes extends JFrame {
    public TelaConfiguracoes() {
        setTitle("Configurações");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        JLabel lblMoeda = new JLabel("Moeda:");
        JComboBox<String> cbMoeda = new JComboBox<>(new String[]{"BRL", "USD", "EUR"});

        JLabel lblCategoria = new JLabel("Categoria Padrão:");
        JTextField txtCategoria = new JTextField();

        JButton btnSalvar = new JButton("Salvar Configurações");
        JButton btnVoltar = new JButton("Voltar");

        add(lblMoeda);
        add(cbMoeda);
        add(lblCategoria);
        add(txtCategoria);
        add(new JLabel());
        add(new JLabel());
        add(btnSalvar);
        add(btnVoltar);

        btnSalvar.addActionListener(e -> JOptionPane.showMessageDialog(this, "Configurações salvas!"));
        btnVoltar.addActionListener(e -> this.dispose());
    }
}
