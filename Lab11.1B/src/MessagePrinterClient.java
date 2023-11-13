public class MessagePrinterClient {

    public static void main(String[] args) {
        MessagePrinter printer1 = new MessagePrinter("Roses are red", "red", 25, 3000);
        MessagePrinter printer2 = new MessagePrinter("Violets are blue", "blue", 1375);


        printer1.run();
        printer2.run();

        // Get the roseColor from printer1 and printer2
        String roseColor1 = printer1.getRoseColor();
        String roseColor2 = printer2.getRoseColor();

        System.out.println("Rose color from printer1: " + roseColor1);
        System.out.println("Rose color from printer2: " + roseColor2);
    }
}
