package adicionais;

import acais.Acai;

public class Mel extends Adicionais {
  public Mel(Acai acai) {
    super(acai);
  }

  @Override
  public double custo() {
    return super.custo() + 3.5;
  }

  @Override
  public String mostrarDetalhes() {
    return super.mostrarDetalhes() + ", Mel";
  }
}
