import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.UUID;

public class Service {

    private static final int QUANTIDADE_MAXIMA_CAIXAS = 10;

    private static Set<Caixa> caixas = new HashSet<>();

    public static void adicionarCaixa(Caixa caixa) {

        if (caixas.size() >= QUANTIDADE_MAXIMA_CAIXAS) {

            System.err.println("Limite maximo de caixas foi excedida");
        } else {
            caixas.add(caixa);
        }
    }

    public static void removerCaixa(String identificador) {

        caixas.forEach(caixa -> {

            if (caixa.getIdentificador().equalsIgnoreCase(identificador)) {

                caixas.remove(caixa);

                System.out.println("Caixa remocida com sucesso");

            } else {

                System.err.println("Caixa não encontrada");
            }
        });
    }

    public static Caixa informarCaixa(Scanner scanner) {

        Caixa caixa = new Caixa();

        System.out.println("Insira a altura da caixa");
        caixa.setAltura(scanner.nextDouble());

        System.out.println("Insira a largura da caixa");
        caixa.setLargura(scanner.nextDouble());

        System.out.println("Insira a profundidade da caixa");
        caixa.setProfundidade(scanner.nextDouble());

        System.out.println("O conteúdo é fragil? (Y | N)");
        caixa.setFragil((scanner.next().equalsIgnoreCase("y")) ? true : false);

        caixa.setIdentificador(UUID.randomUUID().toString());

        return caixa;
    }

    public static void listarCaixas() {

        System.out.println("       UUID       |    Largura    |    Altura    |    Profundidade    |    Fragil?");

        if (caixas.isEmpty()) {

            System.out.println("------------------------");
            System.err.println("Não tem pilha de caixas");
        } else {
            for (Caixa caixa : caixas) {

                System.out.println(caixa.getIdentificador() + "," +
                        caixa.getLargura() + "," +
                        caixa.getAltura() + "," +
                        caixa.getProfundidade() + "," +
                        ((caixa.isFragil()) ? "Sim" : "Não"));
            }
        }
    }

    public static void exibeMenuPrincipal() {

        System.out.println("Escolha uma das opções");

        System.out.println("1. Adicionar Caixa");
        System.out.println("2. Remover Caixa");
        System.out.println("3. Lista de caixas");
        System.out.println("4. Sair");
    }
}
