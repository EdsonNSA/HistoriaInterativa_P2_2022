import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

/**
 * A classe CapituloImagem tem a função de converter o ASCII 
 * que se encontra no Capitulos.txt e mostra-la no no terminal.
 */
public class CapituloImagem extends Capitulo {
  private String imagem;

  public CapituloImagem(
    Map<String, Personagem> personagens,
    Scanner escaneadorDeArquivo) {
    super();
    this.lerCapitulo(personagens, escaneadorDeArquivo);
    this.escolhas = new ArrayList<Escolha>();
  }
/**
 * Aqui será determinado onde a imagem ASCII deverá aparecer.
 * @param personagens
 * @param escaneadorDeArquivo
 */
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
