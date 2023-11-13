
public class MessagePrinter implements Runnable {
    private String message = "Random printer color";
    private int count = 20;  // default value
    private int interval = 1000;  // default value
    private String roseColor = "red";  // default value
    private String violetColor = "blue";  // default value

    public void setRoseColor(String roseColor) {
        if (count >= 15) {
            String upperCaseRoseColor = roseColor.toUpperCase();
            switch (upperCaseRoseColor) {
                case "RED":
                    if (count >= 15 && count <= 20) {
                        this.roseColor = "red";
                    }
                    break;
                case "PINK":
                    if (count >= 10 && count <= 14) {
                        this.roseColor = "pink";
                    }
                    break;
                case "BLOOD RED":
                    if (count >= 5 && count <= 9) {
                        this.roseColor = "blood red";
                    }
                    break;
                case "RAINBOW":
                    if (count < 5) {
                        this.roseColor = "rainbow";
                    }
                    break;
                default:
                    // Handle any other cases or invalid inputs here
                    break;
            }
        }
    }



    public MessagePrinter(String message) {
        this.message = message;
    }

    public MessagePrinter(String message, String violetColor, int count){
        this.message = message;
        this.violetColor = violetColor;
        this.count = count;
    }

    public MessagePrinter(String message, int interval, int count) {
        this(message);
        this.interval = interval;
    }

    public MessagePrinter(String message, String roseColor, int interval, int count){
        this(message, interval, count);
        this.roseColor = roseColor;
    }

    public String getRoseColor() {
        return roseColor;
    }

    /**
     * We now implement the Runnable interface and provide a run() method.
     * It should loop 10 times, printing the 'message' field to stdout, then
     * pausing for 'interval' millis.
     *
     * Use a try/catch to call Thread.sleep(interval) for the pause.
     * The sleep() method throws InterruptedException, which you need to catch.
     * You can either leave the catch block empty, or print the exception to stdout.
     */
    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + message);
            try {
                Thread.sleep(interval);
            }
            catch (InterruptedException ignored) {
            }
        }
    }
}
