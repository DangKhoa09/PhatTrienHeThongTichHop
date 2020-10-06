package IPAddress;
import java.net.MalformedURLException;
import java.net.URL;
public class GetURLParts {

	public static void main(String[] args) {
		try
		{
		URL u = new URL("https://en.wikipedia.org/wiki/Main_Page");
		System.out.println("URL is : "+u);
		System.out.println("The protocol part is : "+u.getProtocol());
		System.out.println("The host part is : "+u.getHost());
		System.out.println("The file part is : "+u.getFile());
		System.out.println("The reference part is : "+u.getRef());
		}
		catch(MalformedURLException e)
		{
		System.err.println(e);
		}


	}

}