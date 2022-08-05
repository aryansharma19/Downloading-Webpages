import java.io.*;
import java.util.List;

public class IOUtil {

    public static void read(List<String> data,String fileName){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName),"UTF-8"));
            String line;

            while((line = br.readLine()) != null){
                data.add(line);
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String read(InputStream in){
        StringBuilder data = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(in,"UTF-8"));
            String line;

            while((line = br.readLine()) != null){
                data.append(line).append("\n");
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data.toString();
    }

    public static void write(long id,String webpage){
        try {
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(id+".html"),"UTF-8"));
            writer.write(webpage);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
