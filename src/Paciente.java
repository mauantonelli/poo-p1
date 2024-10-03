import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Paciente extends Pessoa {
    private String telefone;
    private List<Consulta> consultas = new ArrayList<>();

    public Paciente(String cpf, String nome, Cidade cidade, String telefone, List<Consulta> consultas) {
        super(cpf, nome, cidade);
        this.telefone = telefone;
        this.consultas = consultas;
    }

    //TODO igual na Especialidade
    public Paciente(String cpf, String nome, Cidade cidade, String telefone) {
        super(cpf, nome, cidade);
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    public void adicionarConsulta(Consulta consulta){
        this.consultas.add(consulta);
    }

    public void removerConsulta(Consulta consulta){
        this.consultas.remove(consulta);
    }

    public double calcularTotalGasto(){
        double total=0;
        for(Consulta consulta: consultas){
            total+=consulta.getValorConsulta();

        }
        return total;

    }

    public List<Consulta> obterConsultas(LocalDate dataInicio, LocalDate dataFim){

        List<Consulta> consultas = new ArrayList<>();


        for(Consulta consulta: this.consultas){
            if(consulta.getData().isAfter(dataInicio) && consulta.getData().isBefore(dataFim)){
                consultas.add(consulta);
            }
        }
        return consultas;
    }

    public List<Consulta> obterConsultas(Especialidade especialidade){

        List<Consulta> consultas = new ArrayList<>();

        for(Consulta consulta: this.consultas){
            if(consulta.getMedico().getEspecialidade() == especialidade){
                consultas.add(consulta);
            }
        }

        return consultas;
    }


    public List<Consulta> obterConsultas(Medico medico){

        List<Consulta> consultas = new ArrayList<>();

        for(Consulta consulta: this.consultas){
            if (consulta.getMedico() == medico){
                consultas.add(consulta);
            }
        }
        return consultas;
    }


    @Override
    public String obterDados() {
        return "cpf='" + this.getCpf() + '\'' +
                ", nome='" + this.getNome() + '\'' +
                ", cidade=" + this.getCidade().getNome() +
                ", telefone='" + this.getTelefone() + '\'' +
                ", consultas='" + this.getConsultas() + '\'' +
                '}';
    }
}