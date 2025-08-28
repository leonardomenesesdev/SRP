import java.util.ArrayList;
import java.util.List;

public class TurmaDao {
    public List<Aluno> load(){
        List<Aluno> listaDao = new ArrayList<Aluno>();
        listaDao.add(new Aluno("Leo", "2121"));
        listaDao.add(new Aluno("Saulo", "1111"));
        listaDao.add(new Aluno("Enzo", "314312"));
        listaDao.add(new Aluno("Anderson", "312120"));
        return listaDao;
    }
    public void save(){

    }
    public void update(){

    }
    public void delete(){

    }
}
