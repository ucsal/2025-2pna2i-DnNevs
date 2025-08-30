package br.com.mariojp.solid.isp;

public class OfficeService {
    private final Scanner scanner;
    private final Printer printer;

    public OfficeService(Scanner scanner, Printer printer) {
        this.scanner = scanner;
        this.printer = printer;

    }

    public OfficeService(Scanner scanner) {
        this.scanner = scanner;
        this.printer = null;
    }

    public OfficeService(Printer printer) {
        this.scanner = null;
        this.printer = printer;
    }

    public void printReport(){
        String report = generateReport();
        printer.print(report);
    }

    public String scanDocument(){
        if(scanner == null){
            throw new UnsupportedOperationException("Não possui Scanner");
        }
        return scanner.scan();
    }

    public String generateReport(){
        return "Imprimindo relatório de dados";
    }
}
