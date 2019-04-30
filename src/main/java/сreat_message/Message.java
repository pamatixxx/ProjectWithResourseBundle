package сreat_message;

import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class Message {

    private static final String MESSAGE = "GretingsBundle";

  public StringBuilder welcome(){
      StringBuilder message = new StringBuilder(ResourceBundle.getBundle(MESSAGE, Locale.getDefault()).getString(new TimeCalculation().getPartOfDay(new Date().getHours())));
      return message;
  }


}
