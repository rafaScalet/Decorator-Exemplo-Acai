package adicionais;

import acais.Acai;

public class Nutela extends Adicionais {
  public Nutela(Acai acai) {
    super(acai);
  }

  @Override
  public double custo() {
    return super.custo() + 5;
  }

  @Override
  public String mostrarDetalhes() {
    return super.mostrarDetalhes() + ", Nutela";
  }
}
