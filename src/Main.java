import acais.*;
import adicionais.*;

class Main {
  public static void main(String[] args) {
    Acai acai1 = new AcaiGrande();

    acai1 = new Banana(acai1);
    acai1 = new Mel(acai1);
    acai1 = new Morango(acai1);
    acai1 = new Nutela(acai1);

    System.out.println(acai1.mostrarDetalhes() + "\ncusta: " + acai1.custo());

    Acai acai2 = new AcaiPequeno();

    acai2 = new Banana(acai2);
    acai2 = new Banana(acai2);

    System.out.println(acai2.mostrarDetalhes() + "\ncusta: " + acai2.custo());
  }
}
