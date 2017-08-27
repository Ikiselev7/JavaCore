import java.util.HashMap;
import java.util.Map;

/**
 * Created by ilya on 26.08.17.
 */
public class ConsoleASCIIStringPrinter implements StringPrinter {
    private static final int LETTER_HEIGHT = 5;

    private static final Map<String, String> LETTERS = new HashMap<>();
    static {
        LETTERS.put("0",
              "000"+
                 "0 0"+
                 "0 0"+
                 "0 0"+
                 "000");
        LETTERS.put("1",
              "  0"+
                 "  0"+
                 "  0"+
                 "  0"+
                 "  0");
        LETTERS.put("2",
             "000"+
                "  0"+
                "000"+
                "0  "+
                "000");
        LETTERS.put("3",
             "000"+
                "  0"+
                "000"+
                "  0"+
                "000");
        LETTERS.put("4",
             "0 0"+
                "0 0"+
                "000"+
                "  0"+
                "  0");
        LETTERS.put("5",
             "000"+
                "0  "+
                "000"+
                "  0"+
                "000");
        LETTERS.put("6",
             "000"+
                "0  "+
                "000"+
                "0 0"+
                "000");
        LETTERS.put("7",
             "000"+
                "  0"+
                "  0"+
                "  0"+
                "  0");
        LETTERS.put("8",
             "000"+
                "0 0"+
                "000"+
                "0 0"+
                "000");
        LETTERS.put("9",
             "000"+
                "0 0"+
                "000"+
                "  0"+
                "000");
        LETTERS.put(".",
             "   "+
                "   "+
                "   "+
                "   "+
                " 0 ");
        LETTERS.put("A",
             " 0 "+
                "0 0"+
                "000"+
                "0 0"+
                "0 0");
        LETTERS.put("N",
             "0   0"+
                "00  0"+
                "0 0 0"+
                "0  00"+
                "0   0");
        LETTERS.put("I",
             "000"+
                " 0 "+
                " 0 "+
                " 0 "+
                "000");
        LETTERS.put("F",
             "000"+
                "0  "+
                "00 "+
                "0  "+
                "0  ");

        LETTERS.put("T",
            "000"+
               " 0 "+
               " 0 "+
               " 0 "+
               " 0 ");

        LETTERS.put("Y",
             "0 0"+
                "0 0"+
                " 0 "+
                " 0 "+
                " 0 ");
        LETTERS.put("-",
             "   "+
                "   "+
                "000"+
                "   "+
                "   ");


    }






    @Override
    public void print(String string) {
        System.out.println(getStringValue(string));
    }

    private String getStringValue(String string){
        StringBuilder printableString = new StringBuilder();


        for (int lineCounter = 0; lineCounter < LETTER_HEIGHT; lineCounter++) {

            for (int symbolCounter = 0; symbolCounter < string.length(); symbolCounter++) {
                String symbol = string.substring(symbolCounter,symbolCounter+1).toUpperCase();
                String letter = LETTERS.get(symbol);
                int symbolLength = letter.length()/LETTER_HEIGHT;
                printableString .append(letter.substring(lineCounter*symbolLength,lineCounter*symbolLength+symbolLength))
                                .append("  ");
            }
            printableString.append("\n");

        }

        return printableString.toString();
    }


}
