/**
 *
 * @author westo
 */
package HTTPURLConnection;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class HTTPURLConnection {

    public static void main(String[] args) {
        try {
            // the URL to the web sight where I work as an intern
            URL url = new URL("https://www.iccu.com");
            //open connection method used to communicate with web page
            HttpURLConnection iccu = (HttpURLConnection) url.openConnection();
            /* This will pull up the first 20 header fields.  If there are
             no more fields, then it will show "null = null"
            */
            for (int i = 1; i <= 20; i++) {System.out.println(iccu.getHeaderFieldKey(i) + " = " + iccu.getHeaderField(i));
            }
            // Using a multi catch phrase exception and closing the connection.
            iccu.disconnect();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
