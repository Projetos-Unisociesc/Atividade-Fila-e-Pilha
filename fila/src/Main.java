import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean sair = false;

        do {

            Service.exibeMenuPrincipal();

            switch (scanner.next()) {

                case "1":

                    Service.adicionaPaciente(Service.informarPaciente(scanner));

                    break;
                case "2":

                    Service.removePaciente(scanner.next());

                    break;

                case "3":

                    Service.exibePacientes();

                    break;

                case "4":

                    sair = true;

                    break;

                default: {

                    System.err.println("Opção não reconhecida");

                }


            }


        } while (!sair);
    }

}
