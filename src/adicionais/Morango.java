package adicionais;

import acais.Acai;

public class Morango extends Adicionais {
  public Morango(Acai acai) {
    super(acai);
  }

  @Override
  public double custo() {
    return super.custo() + 5;
  }

  @Override
  public String mostrarDetalhes() {
    return super.mostrarDetalhes() + ", Morango";
  }
}
