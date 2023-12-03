import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        try {
            URI uri = new URI("http://username:password@myserver.com:5000/catalogue/phones?os=android#samsung");

            URL url = uri.toURL();
            System.out.println(url);
/*
            System.out.println("scheme: " + uri.getScheme());
            System.out.println("scheme-specific-part: " + uri.getSchemeSpecificPart());
            System.out.println("authority: " + uri.getAuthority());
            System.out.println("user-info: " + uri.getUserInfo());
            System.out.println("host: " + uri.getHost());
            System.out.println("port: " + uri.getPort());
            System.out.println("path: " + uri.getPath());
            System.out.println("query: " + uri.getQuery());
            System.out.println("fragment: " + uri.getFragment());


 */
        }catch (URISyntaxException e)  {
            System.out.println("Bad URI : " + e.getMessage());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

    }
}


/*
Scheme	String
scheme-specific-part    	String
authority	String
user-info	String
host	String
port	int
path	String
query	String
fragment	String

 */
