package br.com.mariojp.solid.isp;

public interface MultiFunctionDevice implements Printer, Scanner {

    @Override
    public void print(String content){
        System.out.println("Imprimindo: " + content);
    }

    @Override
    public String scan(){

        return "Escaneado";
    }

}
