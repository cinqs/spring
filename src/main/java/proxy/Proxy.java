package proxy;

import java.util.Properties;

public class Proxy{
  public static void setProxy(){
    Properties props = System.getProperties();

    props.put("http.proxyHost", "proxy.priv.atos.fr");
    props.put("http.proxyPort", "3128");

    props.put("https.proxyHost", "proxy.priv.atos.fr");
    props.put("https.proxyPort", "3128");
  }
}
