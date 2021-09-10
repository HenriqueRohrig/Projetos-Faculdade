
public class Main {

    public static void main(String[] args) {

        Arquivo a = new Arquivo("E:\\Desktop\\Algoritmos e Programação\\projetos\\P20_GeraradorGrupos\\src\\main\\java\\alunosPOO.csv");

        if (a.abrirLeitura()) {

            String x = a.lerLinha();

            while (x != null) {
                String[] vet = x.split(";");
                for (int i = 0; i < vet.length; i++) {
                    System.out.println(vet[i]);
                }

            }
            a.fecharArquivo();
        }

    }
}
