import java.util.Map;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        LeitorDeArquivos leitor = new LeitorDeArquivos();
        Scanner escaneador = new Scanner(System.in, "UTF-8");

        Map<String, Personagem> personagens = leitor.carregarPersonagens("Personagens.txt");
        Map<String, Capitulo> capitulos = leitor.carregarCapitulos("Capitulos.txt", personagens, escaneador);

        System.out.println("Carregamento finalizado\n\n...\n\n");
        
        Capitulo raiz = capitulos.get("Raiz");
        raiz.executar();

        escaneador.close();

    }

}