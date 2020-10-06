package IPAddress;
import java.io.*;
import java.net.*;
class viewSource {
	public static void main(String[] args)
	{
	URL u;
	String thisLine;
	if(args.length>0){
	try{
	u = new URL("https://sites.google.com/site/khoatrantm");
	try{
	BufferedReader br = new BufferedReader(new
	InputStreamReader(u.openStream())); //thay the cho DataInputStream
	while((thisLine = br.readLine())!= null)
		System.out.println(thisLine);
		}
		catch(IOException e)
		{
		System.err.println(e);
		}
		}
		catch(MalformedURLException e){
		System.err.println(e);
		}
		}
		}

}
