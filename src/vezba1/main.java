package vezba1;

public class main {
public static void main(String[] args) {
	vraboten rabotnik=new vraboten();
	rabotnik.setIme("Mihajlo");
	rabotnik.setPrezime("Hristovski");
	rabotnik.setPlata("30000");
	
	XML xml=new XML();
	xml.createXMLFile("xml.xml", rabotnik);
}
}
