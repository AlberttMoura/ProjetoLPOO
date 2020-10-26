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
                System.out.print("|" + gameArray[linha][coluna] );
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

    public int valorCasa(int x, int y)
    {
        for(int linha = gameArray.length-1; linha>= y;linha--)
        {
            for(int coluna = gameArray[0].length-1; coluna>= x;coluna--)
            {
                valor = gameArray[linha][coluna];
            }
        }

        return valor;
    }

        //Verifica se a jogada feita acarretou em vitoria
        public boolean jogadaVencedora(int posX, Jogador jogadorAtual)
        {
            for(int linha = 0;linha < gameAgameArray.length; linha++)
            {
                for(int coluna = 0; coluna < gameArray[0].length; linha++)
                {
                    //vertical
                    if(linha<gameArray.length - 4)
                    {
                        int conty=1;
                        for(int i=1;i<4;i++)
                        {
                            if(gameArray[linha+i][coluna] == jogadorAtual.getId())
                            {
                                conty++;
                            }
                            else{
                                conty = 0; // acho q n precisa ja que tamo dentro do loop e a variavel ta setada dentro do loop (oq eu tb n sei se ta certo)
                                break;
                            }
                        }
                    }

                    //Horizontal
                    if(coluna < gameArray[0].length - 4)
                    {
                        int contx=1;
                        for(int i = 1;i<4;i++ )
                        {
                            if(gameArray[linha][coluna+i]== jogadorAtual.getId())
                            {
                                contx++;
                            }
                            else break;
                        }
                    }

                    //diagonal descendo
                    if(coluna < gameArray[0].length -4 && linha < gameArray.length-4)
                    {
                        int contInf=1;
                        for(int i=1; i<4;i++)
                        {
                            if(gameArray[linha+i][coluna+i] == jogadorAtual.getId())
                            {
                                contInf++
                            }
                            else break;
                        }
                    }

                    //diagonal subindo
                    if(linha > gameArray.length -3 && coluna > gameArray.length -4 )
                    {
                        int contSup=1;
                        for(int i=1;i<4;i++)
                        {
                            if(gameArray[linha-1][coluna-i] == jogadorAtual.getId())
                            {
                                contSup++;
                            }
                            else break;
                        }
                    }
                }
            }
            if(contx == 4 || conty == 4 || contInf == 4 || contSup == 4)
            {
                return true;
            }
            return false;
        }


}
