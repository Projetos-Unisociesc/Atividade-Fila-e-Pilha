import java.util.Objects;

public class Paciente {

    private String nomePaciente;
    private int idade;
    private String descricaoSintomas;

    public Paciente() {
    }

    public Paciente(String nomePaciente, int idade, String descricaoSintomas) {
        this.nomePaciente = nomePaciente;
        this.idade = idade;
        this.descricaoSintomas = descricaoSintomas;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDescricaoSintomas() {
        return descricaoSintomas;
    }

    public void setDescricaoSintomas(String descricaoSintomas) {
        this.descricaoSintomas = descricaoSintomas;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nomePaciente='" + nomePaciente + '\'' +
                ", idade=" + idade +
                ", descricaoSintomas='" + descricaoSintomas + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Paciente)) return false;
        Paciente paciente = (Paciente) o;
        return getIdade() == paciente.getIdade() && Objects.equals(getNomePaciente(), paciente.getNomePaciente()) && Objects.equals(getDescricaoSintomas(), paciente.getDescricaoSintomas());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNomePaciente(), getIdade(), getDescricaoSintomas());
    }
}
