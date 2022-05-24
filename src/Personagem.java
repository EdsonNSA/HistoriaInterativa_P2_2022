/**
 * A classe Personagem é responsavel por dar nome e
 * gerenciar a energia do protagonista e do antagonista.
 */

public class Personagem {

  private String nome;
  private int energia;

  public Personagem(String nome, int energia) {

    this.nome = nome;
    this.energia = energia;
  }

  public Personagem(String nome) {
    this.nome = nome;
    this.energia = 100;

  }
/**
 * Aqui é ajustada a energia do protagonista e do antagonista.
 * @param variacao
 */
  public void ajustarEnergia(int variacao) {
    if (variacao != 0) {
      setEnergia(this.energia + variacao);
      System.out.println("a energia de " + this.nome + " foi para " + this.energia);

    }
  }

  public void setEnergia(int energia) {
    this.energia = energia;
    if (this.energia < 0) {
      this.energia = 0;
    }

  }

  public int getEnergia() {
    return this.energia;
  }

  public String getNome() {
    return this.nome;
  }

}
