import javafx.scene.control.Button;

/**
 * A classe BotaoEscolha estende a classe button,
 * com o objetivo de armazemar uma escolha e assim
 * facilitar o acesso ao capitulo que esta representanda.
 * Desta forma é possível, ao apertar o botão,
 * acionar o capítulo assossiado aquela escolha.
 */

public class BotaoEscolha extends Button
{
  private Escolha escolha;

/**
 * Construtor disponível para a classe,
 * o qual necessita de uma escolha com parámetro.
 * @param escolha
 */

  public BotaoEscolha(Escolha escolha)
  {
    super(escolha.getTextoMostrado());
    this.escolha = escolha;
  }

/**
 * Método getEscolha() para dar acesso à escolha usada no construtor.
 * @return o objeto do tipo Escolha assossiado ao botão
 */

  public Escolha getEscolha()
  {
    return this.escolha;
  }
}
