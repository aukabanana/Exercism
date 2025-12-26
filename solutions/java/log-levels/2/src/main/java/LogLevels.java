public class LogLevels {
    
    public static String message(String logLine) {
        int index = logLine.indexOf(":");
        String text = logLine.substring(index+2);
        String txtTrim = text.trim();
        return txtTrim;
    }

    public static String logLevel(String logLine) {
        int startIndex = logLine.indexOf("[");
        int endIndex = logLine.indexOf("]");
        return logLine.substring(startIndex+1,endIndex).toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
