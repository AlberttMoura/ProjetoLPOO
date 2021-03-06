package br.com.poli.melhorlig4;

public class Tabuleiro {
    private final int[][] gameArray;
    private int yPos = 0;
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


    //Verifica se a coluna está cheia e retorna a posição da peça
    public int verificarColuna(int pos)
    {
        for(int linha = gameArray.length - 1; linha >= 0; linha--){
            if(gameArray[linha][pos] == 0){
                yPos = linha;
                return yPos;//Retorna a LINHA em que a peça do jogador ficou

            }
        }
        return -1;
    }

    //Verificar Vitória
    public boolean verificarVitoria(Jogador jogadorAtual){
        final int sequencia = 4;//QUANTIDADE DE PEÇAS DO MESMO JOGADOR NECESSÁRIA PARA VENCER

        //VERIFICA TODAS AS CASA, INDEPENDENTE DA JOGADA
        for(int linha = 0; linha < gameArray.length; linha++){
            for(int coluna = 0; coluna < gameArray[0].length; coluna++){
                //Verificação Horizontal
                int contx = 0;
                if(coluna <= gameArray[0].length - sequencia) {
                    for (int i = 0; i < sequencia; i++) {
                        if (gameArray[linha][coluna + i] == jogadorAtual.getId()) {
                            contx++;
                        } else {
                            break;
                        }
                    }
                }
                //Verificação Vertical
                int conty = 0;
                if(linha  <= gameArray.length - sequencia) {
                    for (int i = 0; i < sequencia; i++) {
                        if (gameArray[linha + i][coluna] == jogadorAtual.getId()) {
                            conty++;
                        } else {
                            break;
                        }
                    }
                }
                //Verificação DiagonalSup
                //conta as casa de baixo para cima ate a linha 4 e a coluna 2 (contando de 1 a 7)
                int contxySup = 0;
                if(linha <= gameArray.length - sequencia && coluna <= gameArray[0].length - sequencia) {
                    for (int i = 0; i < 4; i++) {
                        if (gameArray[linha + i][coluna + i] == jogadorAtual.getId()) {
                            contxySup++;
                        } else {
                            break;
                        }
                    }
                }
                //Verificação DiagonalInf
                //conta as casas de cima para baixo ate a linha 4 e a coluna 3 (contando de 1 a 7)
                int contxyInf = 0;
                if(linha >= 4 && coluna <= gameArray[0].length - sequencia) {
                    for (int i = 0; i < sequencia; i++) {
                        if (gameArray[linha - i][coluna + i] == jogadorAtual.getId()) {
                            contxyInf++;
                        } else {
                            break;
                        }
                    }
                }
                //Caso alguma das verificações obtenha uma contagem igual à sequência necessária para vencer
                if(contx == sequencia || conty == sequencia || contxySup == sequencia || contxyInf == sequencia){
                    return true;//Altera o valor do atributo acabou para True
                }
            }
        }
        return false;//Caso o contrário, acabou continua False
    }
}
