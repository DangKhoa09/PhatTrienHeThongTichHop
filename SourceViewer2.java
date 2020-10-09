package IPAddress;
import java.net.*;
import java.io.*;
public class SourceViewer2 {
 public static void main (String[] args) {

 try {
 //Open the URLConnection for reading
 URL u = new URL("https://sites.google.com/site/khoatrantm");
 URLConnection uc = u.openConnection( );
 InputStream raw = uc.getInputStream( );
 InputStream buffer = new BufferedInputStream(raw);
 // chain the InputStream to a Reader
 Reader r = new InputStreamReader(buffer);
 int c;
 while ((c = r.read( )) != -1) {
 System.out.print((char) c);
 }
 }
 catch (MalformedURLException ex) {
 System.err.println("https://sites.google.com/site/khoatrantm" + " is not a parseable URL");
 }
 catch (IOException ex) {
 System.err.println(ex);
 }
 
 }
}
