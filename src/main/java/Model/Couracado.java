package Model;

public class Couracado  extends Barco{
    static final int tamanho = 4;
    private int partes = 4;
    private boolean vertical = false;
    private int posicaoPartes[][] = new int[4][2];

    // posicao inicial
    private int x;
    private int y;

    // static final int quantidade = 2;
    static final String nome = "Couracado";

    public int getTamanho() {
        return tamanho;
    }

    public String getNome() {
        return nome;
    }

    public Couracado() {
        super();
    }

    public int getPartes() {
        return partes;
    }

    public void setPartes(int partes) {
        this.partes = partes;
    }

    public boolean isVertical() {
        return vertical;
    }

    public void setVertical(boolean vertical) {
        this.vertical = vertical;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[][] getPosicaoPartes() {
        return posicaoPartes;
    }

    public void setPosicaoPartes() {
        if(!isVertical()){
            this.posicaoPartes[0][0] = this.x;
            this.posicaoPartes[0][1] = this.y;
            this.posicaoPartes[1][0] = this.x;
            this.posicaoPartes[1][1] = this.y+1;
        }else{
            this.posicaoPartes[0][0] = this.x;
            this.posicaoPartes[0][1] = this.y;
            this.posicaoPartes[1][0] = this.x+1;
            this.posicaoPartes[1][1] = this.y;
        }
    }

    
    
}
