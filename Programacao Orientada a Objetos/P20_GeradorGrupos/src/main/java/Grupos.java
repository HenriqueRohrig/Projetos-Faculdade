public class Grupos {

    int integrantes;
    Arquivo a;
    
    public Grupos(int integrantes) {
        this.a = new Arquivo("E:\\Desktop\\Algoritmos e Programação\\projetos\\P20_GeraradorGrupos\\src\\main\\java\\alunosPOO.csv");
        this.integrantes = integrantes;
    }

    public void GerarGrupos() {

        if (a.abrirLeitura()) {

            String x = a.lerLinha();
            
            while (x != null) {
                String[] vet = x.split(";");
                Alunos al = new Alunos (vet[0], vet[1]);
                al.
                
                
            }

        }

    }

}
