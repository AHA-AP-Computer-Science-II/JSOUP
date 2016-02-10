package jsoupTest;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class jsoupTest {

	public static void main(String[] args) {
		
//		Document doc = new Document("http://www.google.com");
		
		Document doc;
		
		try {
			doc = Jsoup.connect("http://www.google.com").get();
			Element body = doc.body();
			System.out.println(body);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
}
