package adicionais;

import acais.Acai;

public class Adicionais implements Acai {
  Acai acai;

  public Adicionais(Acai acai) {
    this.acai = acai;
  }

  @Override
  public double custo() {
    return acai.custo();
  }

  @Override
  public String mostrarDetalhes() {
    return acai.mostrarDetalhes();
  }
}
