import br.com.mariojp.solid.isp.*;

public class Main {
    public static void main(String[] args) {


        //Só imprime
        Printer printer = new SimplePrinter();
        printer.print("Imprimindo Relatórios");

        //Imprime e Escaneia
        MultiFunctionDevice multiFuncional = new MultiFunctionDevice();
        multiFuncional.print("Imprimindo em uma multifuncional");
        System.out.println(multiFuncional.scan());



    }

}
