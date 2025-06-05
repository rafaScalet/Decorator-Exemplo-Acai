package acais;

public class AcaiPequeno implements Acai {
  @Override
  public double custo() {
    return 10;
  }

  @Override
  public String mostrarDetalhes() {
    return "Açai Pequeno";
  }
}
