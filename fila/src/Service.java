import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Service {

    // Properties
    private static final int QUANTIDADE_MAXIMA_PACIENTES = 20;

    // Quando usamos o Set não permitimos dados duplicados
    static Set<Paciente> pacientes = new HashSet<>();

    public static void adicionaPaciente(Paciente paciente) {

        if (pacientes.size() >= QUANTIDADE_MAXIMA_PACIENTES) {
            System.err.println("Limite maximo de pacientes ecxedido");
        } else if (pacientes.contains(paciente)) {
            System.err.println("Já existe o paciente" + paciente.getNomePaciente());
        } else {
            pacientes.add(paciente);
        }
    }

    public static void removePaciente(String nome) {

        pacientes.forEach(paciente -> {
            if (paciente.getNomePaciente().equalsIgnoreCase(nome)){
                pacientes.remove(paciente);

                System.out.println("Paciente removido com sucesso");
            }else {
                System.err.println("Não foi encontrado nenhum paciente com esse nome");
            }
        });

    }

    public static void exibePacientes() {

        System.out.println("    Nome    | Idade | Sintomas");

        if (pacientes.isEmpty()) {

            System.out.println("------------------------");
            System.err.println("Não existem pcaientes cadastrados");
        } else {
            for (Paciente paciente : pacientes) {

                System.out.println(paciente.getNomePaciente() + "," + paciente.getIdade() + "," + paciente.getDescricaoSintomas());
            }
        }
    }

    public static Paciente informarPaciente(Scanner scanner) {

        Paciente paciente = new Paciente();

        System.out.println("Informe o nome:");
        paciente.setNomePaciente(scanner.next());

        System.out.println("Informe a idade:");
        paciente.setIdade(scanner.nextInt());

        System.out.println("Informe os sintomas: ");
        paciente.setDescricaoSintomas(scanner.next());

        return paciente;
    }


    public static void exibeMenuPrincipal() {

        System.out.println("Escolha uma das opções");

        System.out.println("1. Incluir paciente");
        System.out.println("2. Atender paciente");
        System.out.println("3. Lista de pacientes");
        System.out.println("4. Sair");
    }
}
