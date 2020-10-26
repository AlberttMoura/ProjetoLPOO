//ALUNOS: FERNANDA BARBOSA DE PINHO E JOSÉ ALBERTO OLIVEIRA MOURA FILHO

package br.com.poli.melhorlig4;

public class Tabuleiro {
    private final int[][] gameArray;
    private int yPos=0;
//testestes
    public Tabuleiro(){
        gameArray = new int[6][7];//Define as dimensões da natriz do Tabuleiro
    }

    public int getYpos()
    {
        return this.yPos;
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
                System.out.print("|" + (gameArray[linha][coluna] == 0 ? " " : gameArray[linha][coluna]));
            }
            System.out.println("|");
        }
        System.out.println("=0=1=2=3=4=5=6=");
    
    }

    //Verifica se a coluna esta completa
    public int verificarColuna(int casa)
    {
        for(int linha = gameArray.length - 1; linha >= 0; linha--){
            if(gameArray[linha][casa] == 0){
                yPos = linha;
                return yPos;
            }
        }
        return -1;
    }

    //Verificar Vitória
    public boolean verificarVitoria(Jogador jogadorAtual){
        for(int linha = 0; linha < gameArray.length; linha++){
            for(int coluna = 0; coluna < gameArray[0].length; coluna++){
                //Horizontal
                int contx = 1;
                if(coluna < gameArray[0].length - 4) {
                    for (int i = 1; i < 4; i++) {
                        if (gameArray[linha][coluna + i] == 1) {
                            contx++;
                        } else {
                            contx = 0;
                            break;
                        }
                    }
                }
                //Vertical
                int conty = 1;
                if(linha  < gameArray.length - 4) {
                    for (int i = 1; i < 4; i++) {
                        if (gameArray[linha + i][coluna] == jogadorAtual.getId()) {
                            conty++;
                        } else {
                            conty = 0;
                            break;
                        }
                    }
                }
                //DiagonalSup
                int contxySup = 1;
                if(linha < gameArray.length - 4 && coluna < gameArray[0].length - 4) {
                    for (int i = 1; i < 4; i++) {
                        if (gameArray[linha + i][coluna + i] == jogadorAtual.getId()) {
                            contxySup++;
                        } else {
                            contxySup = 0;
                            break;
                        }
                    }
                }
                //DiagonalInf
                int contxyInf = 1;
                if(linha > 4 && coluna < gameArray[0].length - 4) {
                    for (int i = 1; i < 4; i++) {
                        if (gameArray[linha - i][coluna + i] == jogadorAtual.getId()) {
                            contxyInf++;
                        } else {
                            contxyInf = 0;
                            break;
                        }
                    }
                }
                if(contx == 4 || conty == 4 || contxySup == 4 || contxyInf == 4){
                    return true;
                }
            }
        }
        return false;
    }
}
