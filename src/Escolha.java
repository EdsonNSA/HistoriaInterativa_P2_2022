
/**
 * A classe escolha ira nos da opções de escolhas para a historia.
 */

public class Escolha {
  private String textoDigitado;
  private String textoMostrado;
  private Capitulo proximo;

  public Escolha(String textoDigitado,
   String textoMostrado, Capitulo proximo) {
    this.textoDigitado = textoDigitado;
    this.textoMostrado = textoMostrado;
    this.proximo = proximo;
  }
/**
 * Codigo referente ao Texto digitado.
 * @return
 */
  public String getTextoDigitado() {
    return textoDigitado;
  }
/**
 * Codigo referente ao texto mostrado.
 * @return
 */
  public String getTextoMostrado() {
    return textoMostrado;
  }
/**
 * codigo responsavel por passar o capitulo.
 * @return
 */
  public Capitulo getProximo() {
    return proximo;
  }

}