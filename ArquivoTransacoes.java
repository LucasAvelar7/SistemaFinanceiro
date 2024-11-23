import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArquivoTransacoes {

    private static final String ARQUIVO = "transacoes.dat";

    public static void salvar(List<Transacao> transacoes) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARQUIVO))) {
            oos.writeObject(transacoes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Transacao> carregar() {
        File file = new File(ARQUIVO);
        if (!file.exists()) {
            return new ArrayList<>();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ARQUIVO))) {
            return (List<Transacao>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
