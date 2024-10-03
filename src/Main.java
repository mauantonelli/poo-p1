import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cidade cidade1 = new Cidade("São Carlos", "SP");
        Cidade cidade2 = new Cidade("São José do Rio Preto", "SP");

        Especialidade especialidade1 = new Especialidade("Ortopedia");

        Medico medico1 = new Medico("434", "Maurício", cidade1, "1414", especialidade1);
        Medico medico2 = new Medico("433", "Laura", cidade2, "1314", especialidade1);

        especialidade1.adicionarMedico(medico1);
        especialidade1.adicionarMedico(medico2);

        Paciente paciente1 = new Paciente("111", "Giulia", cidade1, "16991923");
        Paciente paciente2 = new Paciente("121", "Giuliano", cidade2, "16992223");

        Consulta consulta1 = new Consulta(LocalDate.of(2024, 9, 1), LocalTime.of(14, 30), 250, paciente1, medico1);
        Consulta consulta2 = new Consulta(LocalDate.of(2024, 9, 1), LocalTime.of(15, 30), 250, paciente2, medico2);

        paciente1.adicionarConsulta(consulta1);
        paciente2.adicionarConsulta(consulta2);

        System.out.println(especialidade1.getMedicos());

        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(paciente1);
        pessoas.add(paciente2);
        pessoas.add(medico1);
        pessoas.add(medico2);

        for (Pessoa pessoa: pessoas){
            System.out.println(pessoa.obterDados());
        }
    }
}