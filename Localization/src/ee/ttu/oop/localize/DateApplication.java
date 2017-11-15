package ee.ttu.oop.localize;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class DateApplication {

    PrintWriter pw = new PrintWriter(System.out, true);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Locale ruLocale = new Locale("ru", "RU");
   // Locale enLocale = new Locale.US;
    //locale for Chinese
    Locale zhLocale = new Locale("cn","CN");
    //Locale for france
    Locale frLocale = new Locale("fr","FR");
    Locale currentLocale = Locale.US;
    ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", Locale.US);
    Date today = new Date();
    DateFormat df;
    SimpleDateFormat sdf;

    public static void main(String[] args) {
        DateApplication dateApp = new DateApplication();
        dateApp.run();
    }

    public void run() {
        String line = "";

        while (!(line.equals("q"))) {
            this.printMenu();
            try {
                line = this.br.readLine();
            } catch (Exception e) {
                e.printStackTrace();
            }

            switch (line) {
                case "1": setEnglish(); break;
                case "2": setFrench(); break;
                case "3": setChinese(); break;
                case "4": setRussian(); break;
            }
        }
    }

    public void printMenu() {
        pw.println("=== Date App ===");
        // Default date format
        df= DateFormat.getDateInstance(DateFormat.DEFAULT,currentLocale);
        pw.println(messages.getString("date1")+" "+df.format(today));
        // Long date format
        df=DateFormat.getDateInstance(DateFormat.LONG,currentLocale);
        pw.println(messages.getString("date2")+" "+ df.format(today));
        // Short date format
        df=DateFormat.getDateInstance(DateFormat.SHORT,currentLocale);
        pw.println(messages.getString("date3")+" "+ df.format(today));
        
        // Full Date format
        df=DateFormat.getDateInstance(DateFormat.FULL,currentLocale);
        pw.println(messages.getString("date4")+" "+ df.format(today));
        // Full time format
        df=DateFormat.getDateInstance(DateFormat.FULL,currentLocale);
        pw.println(messages.getString("date5")+" "+ df.format(today));
        // Day of the week
        df=new SimpleDateFormat("EEEE",currentLocale);
        pw.println(messages.getString("date6")+" "+df.format(today));
        
        // Custom date
        
        pw.println("\n--- Choose Language Option ---");
        pw.println("1. " + messages.getString("menu1"));
        pw.println("2. " + messages.getString("menu2"));
        pw.println("3. " + messages.getString("menu3"));
        pw.println("4. " + messages.getString("menu4"));
        pw.println("q. " + messages.getString("menuq"));
        System.out.print(messages.getString("menucommand") + " ");
    }

    public void setEnglish() {
        // Set currentLocale
    	currentLocale=currentLocale;
        // Set messages
    	messages = ResourceBundle.getBundle("MessagesBundle",currentLocale);
    }

    public void setFrench() {
        // Set currentLocale
    	currentLocale=frLocale;
        // Set messages
    	messages=ResourceBundle.getBundle("MessagesBundle",frLocale);
    }

    public void setChinese() {
        // Set currentLocale
    	currentLocale=zhLocale;
        // Set messages
    	messages=ResourceBundle.getBundle("MessagesBundle",zhLocale);
    }

    public void setRussian() {
        // Set currentLocale
    	currentLocale=ruLocale;
        // Set messages
    	messages=ResourceBundle.getBundle("MessagesBundle",ruLocale);
    }
}