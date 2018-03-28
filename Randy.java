import java.util.Random;
class Randy
{
String randevu()
{
Random r = new Random();
String code = "";
    String alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    for (int i = 0; i < 8; i++) {
        code += alphabet.charAt(r.nextInt(alphabet.length()));
    } 
	return code;
}
} 