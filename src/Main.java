import acais.Acai;
import acais.AcaiGrande;
import adicionais.Banana;
import adicionais.Mel;
import adicionais.Morango;
import adicionais.Nutela;

class Main {
  public static void main(String[] args) {
    Acai acaiGrande = new AcaiGrande();

    acaiGrande = new Banana(acaiGrande);
    acaiGrande = new Mel(acaiGrande);
    acaiGrande = new Morango(acaiGrande);
    acaiGrande = new Nutela(acaiGrande);

    System.out.println(acaiGrande.mostrarDetalhes() + "\ncusta: " + acaiGrande.custo());
  }
}
