package acais;

public class AcaiGrande implements Acai {
  @Override
  public double custo() {
    return 10;
  }

  @Override
  public String mostrarDetalhes() {
    return "Açai Grande";
  }
}
