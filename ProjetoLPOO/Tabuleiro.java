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

        }
    }


    public void desenharTabuleiro(){
        for(int linha = 0; linha < gameArray.length; linha++){
            for(int coluna = 0; coluna < gameArray[0].length; coluna++){
                System.out.print("|" + gameArray[linha][coluna]);
            }
            System.out.print("|\n");
        }
    }
}
