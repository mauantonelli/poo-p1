import java.util.ArrayList;
import java.util.List;

public class Especialidade {

    //TODO igual na consulta
    private static int contadorId = 0;
    private int id;
    private String descricao;
    private List<Medico> medicos = new ArrayList<>();

    public Especialidade(String descricao, List<Medico> medicos) {
        this.id = ++contadorId;
        this.descricao = descricao;
        this.medicos = medicos;
    }

    public Especialidade(String descricao) {
        this.id = ++contadorId;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Medico> getMedicos() {
        return medicos;
    }

    public void setMedicos(List<Medico> medicos) {
        this.medicos = medicos;
    }

    public void adicionarMedico(Medico medico){
        this.medicos.add(medico);
    }

    public void removerMedico(Medico medico){
        this.medicos.remove(medico);
    }
}