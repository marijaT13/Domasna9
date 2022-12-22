package vezba2;
import java.util.ArrayList;
import java.util.List;

public class main {
	public static void main(String[] args) {
		List<vraboten> rabotnik=new ArrayList<vraboten>();
		rabotnik.add(new vraboten("Marija","Tashevska","28000"));
		rabotnik.add(new vraboten("Angela","Kjosevska","35000"));
		rabotnik.add(new vraboten("Maja","Tekovska","32000"));
		XML xml = new XML();
		xml.createXMLFile("xml2.xml", rabotnik);
	}
}
