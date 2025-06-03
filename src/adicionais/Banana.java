package adicionais;

import acais.Acai;

public class Banana extends Adicionais {
  public Banana(Acai acai) {
    super(acai);
  }

  @Override
  public double custo() {
    return super.custo() + 2;
  }

  @Override
  public String mostrarDetalhes() {
    return super.mostrarDetalhes() + ", Banana";
  }
}
