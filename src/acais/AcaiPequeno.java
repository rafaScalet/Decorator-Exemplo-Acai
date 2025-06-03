package acais;

public class AcaiPequeno implements Acai {
  @Override
  public double custo() {
    return 5;
  }

  @Override
  public String mostrarDetalhes() {
    return "Açai Pequeno";
  }
}
