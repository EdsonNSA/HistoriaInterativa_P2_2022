import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

/**
 * Classe que armazena todaas as informaççoes relativas
 * a um capitulo. As informações são:
 * <ul>
 * <li> private String texto;
 * <li> protected ArrayList<Escolha> escolha;
 * <li> private Personagens personagem1;
 * <li> private Personagens personagem2;
 * <li> private int variacaoEnergiapersonagem1;
 * <li> private int variacaoEnergiapersonagem2;
 * </ul>
 */

public class Capitulo {
  private String texto;
  protected ArrayList<Escolha> escolhas;
  private Personagem personagem1;
  private Personagem personagem2;
  private int variacaoEnergiaPersonagem1;
  private int variacaoEnergiaPersonagem2;
  
/**
 * mostrar escolhas.
 */
  protected Capitulo() {
    this.texto = "";
    this.escolhas = new ArrayList<Escolha>();
  }
/**
 * imformações do codigo.
 * @param texto
 * @param personagem1
 * @param personagem2
 * @param variacaoEnergiaPersonagem1
 * @param variacaoEnergiaPersonagem2
 */
  public Capitulo(String texto, Personagem personagem1,
   Personagem personagem2, int variacaoEnergiaPersonagem1,
      int variacaoEnergiaPersonagem2) {
    this.texto = texto;
    this.personagem1 = personagem1;
    this.personagem2 = personagem2;
    this.variacaoEnergiaPersonagem1 = variacaoEnergiaPersonagem1;
    this.variacaoEnergiaPersonagem2 = variacaoEnergiaPersonagem2;
    this.escolhas = new ArrayList<Escolha>();

  }

  public Capitulo(
    Map<String, Personagem> personagens,
     Scanner escaneadorDeArquivo) 
  {
    this.LerCapitulo(personagens, escaneadorDeArquivo);
    this.escolhas = new ArrayList<Escolha>();
  }

  public String getTexto()
  {
    return this.texto;
  }
  /**
   * o LerCapitulo ira tanto dar nome como gerencicar as variações
   * de energia que os personagens sofrem.
   * @param personagens
   * @param escaneadorDeArquivo
   */
  protected void LerCapitulo(
    Map<String, Personagem> personagens,
     Scanner escaneadorDeArquivo) {

    escaneadorDeArquivo.nextLine();
    String idPersonagem1 = escaneadorDeArquivo.nextLine();
    String idPersonagem2 = escaneadorDeArquivo.nextLine();
    this.personagem1 = personagens.get(idPersonagem1);
    this.personagem2 = personagens.get(idPersonagem2);

    escaneadorDeArquivo.nextLine();
    String linha = escaneadorDeArquivo.nextLine();
    this.texto = "";
    while (!linha.equals("VARIACOES")) {

      if (linha.equals(idPersonagem1)) {
        texto = texto + personagem1.getNome();
      } else if (linha.equals(idPersonagem2)) {
        texto = texto + personagem2.getNome();
      } else {
        texto = texto + linha;
      }
      linha = escaneadorDeArquivo.nextLine();

    }
    this.variacaoEnergiaPersonagem1 =
     Integer.parseInt(escaneadorDeArquivo.nextLine());
    this.variacaoEnergiaPersonagem2 =
     Integer.parseInt(escaneadorDeArquivo.nextLine());

  }

  public void adicionarEscolha(Escolha escolha) {
    escolhas.add(escolha);

  }

  public ArrayList<Escolha> getEscolhas() {
    return escolhas;
  }

  public void atualizarEnergiaPersonagens() {
    personagem1.ajustarEnergia(variacaoEnergiaPersonagem1);
    personagem2.ajustarEnergia(variacaoEnergiaPersonagem2);
  }
  
}