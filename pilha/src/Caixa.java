import java.util.Objects;

public class Caixa {

    private String identificador;
    private double altura;
    private double largura;
    private double profundidade;
    private boolean fragil;

    public Caixa() {
    }

    public Caixa(String identificador, double altura, double largura, double profundidade, boolean fragil) {
        this.identificador = identificador;
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;
        this.fragil = fragil;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }

    public boolean isFragil() {
        return fragil;
    }

    public void setFragil(boolean fragil) {
        this.fragil = fragil;
    }

    @Override
    public String toString() {
        return "Caixa{" +
                "identificador='" + identificador + '\'' +
                ", altura=" + altura +
                ", largura=" + largura +
                ", profundidade=" + profundidade +
                ", fragil=" + fragil +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Caixa)) return false;
        Caixa caixa = (Caixa) o;
        return Double.compare(caixa.getAltura(), getAltura()) == 0 && Double.compare(caixa.getLargura(), getLargura()) == 0 && Double.compare(caixa.getProfundidade(), getProfundidade()) == 0 && isFragil() == caixa.isFragil() && Objects.equals(getIdentificador(), caixa.getIdentificador());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdentificador(), getAltura(), getLargura(), getProfundidade(), isFragil());
    }
}
