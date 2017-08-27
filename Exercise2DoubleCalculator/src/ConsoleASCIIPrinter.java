import java.util.HashMap;
import java.util.Map;

/**
 * Created by ilya on 26.08.17.
 */
public class ConsoleASCIIPrinter implements Printer {
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
        LETTERS.put("a",
                " 0 "+
                        "0 0"+
                        "000"+
                        "0 0"+
                        "0 0");

        LETTERS.put("n",
                "0   0"+
                        "00  0"+
                        "0 0 0"+
                        "0  00"+
                        "0   0");
        LETTERS.put("N",
             "0   0"+
                "00  0"+
                "0 0 0"+
                "0  00"+
                "0   0");
        LETTERS.put("i",
                "000"+
                        " 0 "+
                        " 0 "+
                        " 0 "+
                        "000");
        LETTERS.put("I",
             "000"+
                " 0 "+
                " 0 "+
                " 0 "+
                "000");
        LETTERS.put("f",
             "000"+
                "0  "+
                "00 "+
                "0  "+
                "0  ");

        LETTERS.put("t",
            "000"+
               " 0 "+
               " 0 "+
               " 0 "+
               " 0 ");

        LETTERS.put("y",
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


        for (int lineCounter = 0; lineCounter < 5; lineCounter++) {

            for (int i = 0; i < string.length(); i++) {
                int symbolLength = LETTERS
                        .get(string.substring(i,i+1)).length()/5;
                printableString .append(LETTERS
                                           .get(string.substring(i,i+1))
                                           .substring(lineCounter*symbolLength,lineCounter*symbolLength+symbolLength))
                                .append(" ");
            }
            printableString.append("\n");

        }

        return printableString.toString();
    }


}
