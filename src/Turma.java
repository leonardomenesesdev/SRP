import java.util.List;

public class Turma {
    private List <Aluno> alunos;
    private TurmaDao tDao;

    public Turma() {
        tDao = new TurmaDao();
        alunos = tDao.load();
    }

    public double calcMedia(){
        return 0.0;
    }

    public List getAlunos(){
        return alunos;
    }

    public int getTotalAlunos(){
        int tamanho = alunos.size();
        return tamanho;
    }

    public Aluno add(Aluno a){
        return a;
    }
    public void delete(Aluno a){}

}
