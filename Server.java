import com.sun.net.httpserver.*;
import java.net.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;
public class Server
{
	public static void main(String[] args) throws IOException
	{
		int port = 9000;
HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);
System.out.println("server started at " + port);
server.createContext("/", new Root());
server.setExecutor(null);
server.start();
	}	
}
class Root implements HttpHandler {
Swinger swin = new Swinger();
String[] args = {};

         @Override

         public void handle(HttpExchange he) throws IOException {
				File file = new File(swin.pathify(swin.path));
				//File file = new File("apple.png"); 
				he.getResponseHeaders().set("Content-Type", "image/png");
				FileInputStream fis = new FileInputStream(file);
				 he.sendResponseHeaders(200, 0);
				 //he.sendResponseHeaders(200, file.length());
				
                 OutputStream os = he.getResponseBody();
				 byte[] buffer = new byte[(int)file.length()]; // Adjust if you want
				 int bytesRead;
				
				while ((bytesRead = fis.read(buffer)) != -1)
			{	
				os.write(buffer, 0, bytesRead);
				//os.write(buffer, 0, buffer.length);
				}
				//os.flush();

                 
                 //os.write(response.getByteArray());
                 os.close();
				 he.close();
         }
}
class MyHandler implements HttpHandler {
	Swinger swin = new Swinger();
       @Override public void handle(HttpExchange t) throws IOException {
           String response = swin.pathify(swin.path);
           t.sendResponseHeaders(200, 0);
           OutputStream os = t.getResponseBody();
           os.write(response.getBytes());
           os.close();
       }
   }