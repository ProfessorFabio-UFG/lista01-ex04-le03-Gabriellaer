public class MainRobos {
    public static void main(String[] args) {
        Robos rob1 = new Robos(0, 0, 1, 0, 0, null);
        Robos rob2 = new Robos(0, 0, 2, 0, 0, null);
        //Mostrando que os robos estão instanciados
        /*
        System.out.println(rob1.toString());
        System.out.println(rob2.toString());
        System.out.println("----------------------------------");
        */
        //Usando os metodos para mudar os atributos do Robo 1
        System.out.println("Simulando as operacoes do Robo 1");
        rob1.setX(10);
        rob1.setY(10);
        rob1.setNumSerie(1111);
        rob1.setQtdPo(0);
        rob1.setLimPo(100);
        rob1.setStatus("Desligado");
        //Prints apos cada operação
        System.out.println(rob1.toString());
        rob1.ligar();
        System.out.println(rob1.toString());
        rob1.andar(-5, -8);
        rob1.aspirar(10);
        System.out.println(rob1.toString());
        rob1.aspirar(10);
        rob1.para();
        System.out.println(rob1.toString());
        rob1.desligar();
        System.out.println(rob1.toString());
        System.out.println("----------------------------------");

        //Usando os metodos para mudar os atributos do Robo 2
        System.out.println("Simulando as operacoes do Robo 2");
        rob2.setX(0);
        rob2.setY(0);
        rob2.setNumSerie(2222);
        rob2.setQtdPo(0);
        rob2.setLimPo(200);
        rob2.setStatus("Desligado");
        System.out.println(rob2.toString());
        rob2.ligar();
        System.out.println(rob2.toString());
        rob2.andar(5, 5);
        rob2.aspirar(50);
        System.out.println(rob2.toString());
        rob2.para();
        System.out.println(rob2.toString());
        rob2.desligar();
        System.out.println(rob2.toString());
    }
}
