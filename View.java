import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import java.lang.*;
import javafx.scene.image.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import java.lang.reflect.*;
import java.io.File;
import java.net.URL;
import java.nio.file.*;
import java.net.MalformedURLException;
import java.io.*;
import java.net.*;
import java.io.IOException.*;
import java.util.*;

public class View extends Application{
	
public static void main(String[] args) 
	{
launch(args);
}
@Override public void start(Stage primaryStage) throws IOException, InterruptedException, MalformedURLException
{
	
//Swinger swing = new Swinger(); 
//Conn conn = new Conn();
String[] args = {};
//String path;// = imago.start().getAbsolutePath();
//path = imago.start().toURI().toString();
//ServeIt ss = new ServeIt();
//System.out.println("Temp file : " + path);
//swing.main();
//String patho = "file:///" + swing.pathify(swing.path);
//Image img = new Image("http://localhost:9000");

//ImageView iview1 = new ImageView(img);
WebView browser = new WebView();
WebEngine webEngine = browser.getEngine();

webEngine.load("http://localhost:9000");

//String mockImg = "";
//Label lblName = new Label(mockImg);
Label lblName2 = new Label();
TextField text1 = new TextField();
text1.setPromptText("Enter your guess");
//Button btn0 = new Button("IMG");
Button btn1 = new Button("Submit");
//setOnAction(e -> buttonClick());
Button btn2 = new Button("Reload");
btn2.setOnAction(e -> webEngine.reload());	

HBox pane2 = new HBox(btn1, btn2);
//StackPane pane = new StackPane(browser, text1, lblName2, pane2);
VBox pane = new VBox(browser, text1, lblName2, pane2);
Scene scene = new Scene(pane);
primaryStage.setScene(scene);
//primaryStage.setTitle("Captcha service");
primaryStage.show();
}
	

}