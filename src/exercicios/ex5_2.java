package exercicios;

public class ex5_2 extends ex5 {

    ex5 ex5 = new ex5();

    public ex5_2() {
        super();
    }

    public void funcao(){
        ex5.setValor(4);
        int i = 0;
        while (ex5.getValor() <= 100) {
            System.out.println("Numero de: " + ex5.getValor() + " até " + " 100 ");
            ex5.setValor(ex5.getValor() + 1);
            i++;

            if (ex5.getValor() == 50) {
                System.out.println("Fim do programa, visto que ele está chegando aos: 50 ");
                break;
            } else if (getValor() < 50) {
                System.out.println("Seu programa não contém o numero 50, logo o programa continua!!");
            }
    }
    }
}