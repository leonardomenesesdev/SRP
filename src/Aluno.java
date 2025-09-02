public class Aluno {
    private String nome;
    private String matricula;
    private double nota;

    public Aluno() {

    }
    public Aluno(String nome, String matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getNota() {
        return nota;
    }
}
