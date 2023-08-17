import java.net.MalformedURLException;
import java.net.URL;

public class URLReader {

    public static void main(String[] args) {
        try {
            URL myurl =  new URL("https://campusvirtual.escuelaing.edu.co/moodle/course/view.php?id=892");
            System.out.println("protocol:" + myurl.getProtocol());
            System.out.println("host:" + myurl.getHost());
            System.out.println("authority:" + myurl.getAuthority());
            System.out.println("port:" + myurl.getPort());
            System.out.println("path:" + myurl.getPath());
            System.out.println("file:" + myurl.getFile());
            System.out.println("query:" + myurl.getQuery());
            System.out.println("ref:" + myurl.getRef());
        }catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

    }
}
