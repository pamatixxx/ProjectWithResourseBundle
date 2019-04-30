import сreat_message.Message;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Logger;

public class Main {
    public static final Logger log = Logger.getLogger(String.valueOf(Main.class));


    public static void main(String[] args) throws Exception {

        System.out.println(new Message().welcome());

    }







}
