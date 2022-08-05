import java.io.IOException;
import java.net.*;

public class Download {

    public static String download(String sourceUrl){
        System.out.println("Downloading : "+ sourceUrl);
        try {
            URL url = new URI(sourceUrl).toURL();
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            int response = con.getResponseCode();
            if(response>= 200 && response<300){
                return IOUtil.read(con.getInputStream());
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
           e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
