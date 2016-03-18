package tutorial;

import java.util.Date;
import java.text.SimpleDateFormat;

public class ShowDate{

  private Date date = new Date();

  @Override
  public String toString(){
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    String dateString = sdf.format(date);
    return dateString;
  }

}
