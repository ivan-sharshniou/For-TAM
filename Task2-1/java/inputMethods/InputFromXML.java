package inputMethods;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InputFromXML {

    public static List<String> inputFromXml() {

        List<String> carinfo = new ArrayList<String>();
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(new File("src/main/resources/carparkinput.xml"));
            document.normalizeDocument();
            Element root = document.getDocumentElement();
            NodeList car = root.getElementsByTagName("car");

            for (int i=0; i<car.getLength(); i++) {
                Element rootitem = (Element) car.item(i);
                Element modelelem = (Element) rootitem.getElementsByTagName("model").item(0);
                Element fuelconsumptionelem = (Element) rootitem.getElementsByTagName("fuelconsumption").item(0);
                Element priceelem = (Element) rootitem.getElementsByTagName("price").item(0);
                String model = modelelem.getTextContent();
                String fuelconsumption = fuelconsumptionelem.getTextContent();
                String price = priceelem.getTextContent();
                carinfo.add(model+" "+fuelconsumption+" "+price);
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } return carinfo;
    }
}
