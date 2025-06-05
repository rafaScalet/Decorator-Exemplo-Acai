package adicionais;

import acais.Acai;

public class Banana extends Adicionais {
  public Banana(Acai acai) {
    super(acai);
  }

  @Override
  public double custo() {
    return super.custo() + 3.5;
  }

  @Override
  public String mostrarDetalhes() {
    return super.mostrarDetalhes() + ", Banana";
  }
}
