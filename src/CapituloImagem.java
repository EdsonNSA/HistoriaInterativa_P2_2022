import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class CapituloImagem extends Capitulo {
  private String imagem;

  public CapituloImagem(
    Map<String, Personagem> personagens,
    Scanner escaneadorDeArquivo) {
    super();
    this.lerCapitulo(personagens, escaneadorDeArquivo);
    this.escolhas = new ArrayList<Escolha>();
  }

  protected void lerCapitulo(
    Map<String, Personagem> personagens,
    Scanner escaneadorDeArquivo) {
    super.LerCapitulo(personagens, escaneadorDeArquivo);

    escaneadorDeArquivo.nextLine();
    String linha = escaneadorDeArquivo.nextLine();
    this.imagem = "";
    while (!linha.equals("IMAGEM_FIM")) {
      this.imagem = imagem + "\n" + linha ;
      linha = escaneadorDeArquivo.nextLine();
    }
  }
}
