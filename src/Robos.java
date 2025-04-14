public class Robos {
    private int x = 0,y = 0,numSerie,qtdPo,limPo;
    private String status;
    Robos(int x, int y, int numSerie, int qtdPo,int limPo, String status){
        this.x = x;
        this.y = y;
        this.numSerie = numSerie;
        this.qtdPo = qtdPo;
        this.limPo = limPo;
        if (status == null) {
            this.status = "Desligado";   
        }else{
            this.status = status;
        }
    }
    //getters and setters
    public void setX(int x) {
        this.x = x;
    }
    public int getX() {
        return x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getY() {
        return y;
    }
    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }
    public int getNumSerie() {
        return numSerie;
    }
    public void setQtdPo(int qtdPo) {
        this.qtdPo = qtdPo;
    }
    public int getQtdPo() {
        return qtdPo;
    }
    public void setLimPo(int limPo) {
        this.limPo = limPo;
    }
    public int getLimPo() {
        return limPo;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatus(){
        return status;
    }
    //methods of the class
    //ligar
    public void ligar(){
        this.status = "Ligado";
    }
    //desligar
    public void desligar(){
        this.status = "Desligado";
    }
    //Parar
    public String para(){
        if(status == "Andando"){
            status ="Parado";
        }
        return status;
    }
    //andando
    private String andandoXY(int xAnd, int yAnd){
        int resultX = 0, resultY = 0;
        resultX = x + xAnd;
        resultY = y + yAnd;
        if((status == "Ligado") && ((resultX != x) || (resultY != y))) {
            status = "Andando";
        }
        return status;
    }
    //andar
    public void andar(int xAnd, int yAnd){
        this.status = andandoXY(xAnd, yAnd);
        setX(getX() + xAnd);
        setY(getY() + yAnd);
    }
    //aspirar
    public String aspirar(int qtdPo){
        String tmp;
        if(qtdPo > getLimPo()){
            desligar();
            setLimPo(0);
            tmp = "Limite Excedido";
            return tmp;
        }else{
            setLimPo(getLimPo() - qtdPo);
        }
        return tmp = " Limite Atual: " + getLimPo();
    }

    public String toString(){
        return "ID: " + numSerie +" CoordX = " + getX() +" CoordY = " + getY() + 
        aspirar(qtdPo) + " Status Atual: " + status;
    }
}