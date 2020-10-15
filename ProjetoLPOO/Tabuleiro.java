//ALUNOS: FERNANDA BARBOSA DE PINHO E JOSÉ ALBERTO OLIVEIRA MOURA FILHO
package ProjetoLPOO;

public class Tabuleiro {
    private final int[][] gameArray;
//testestes
    public Tabuleiro(){
        gameArray = new int[6][7];//Define as dimensões da natriz do Tabuleiro
    }


    public void preencherTabuleiro(int pos, int id){
        for(int linha = gameArray.length - 1; linha >= 0; linha--){
            if(gameArray[linha][pos] == 0){
                gameArray[linha][pos] = id;
                break;
            }
            else if(gameArray[0][pos] != 0){
                System.out.println("Coluna Cheia! Escolha outra coluna para jogar.");
                break;
            }

        }
    }


    public void desenharTabuleiro(){
        for(int linha = 0; linha < gameArray.length; linha++){
            for(int coluna = 0; coluna < gameArray[0].length; coluna++){
                System.out.print("|" + (gameArray[linha][coluna] == 0 ? " " : gameArray[linha][coluna]));
            }
            System.out.println("|");
        }
        System.out.println("=1=2=3=4=5=6=7=");
    }
}