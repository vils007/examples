package parserXML;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Администратор on 14.08.2017.
 */
public class ParserDom {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

        File xmlFile = new File("file1.xml");
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(xmlFile);
        document.getDocumentElement().normalize();

        System.out.println("Корневой элемент: " + document.getDocumentElement().getNodeName());

        // start Header
        NodeList nodeListHeader = document.getElementsByTagName(document.getDocumentElement().getChildNodes().item(1).getNodeName());
        System.out.println("--------------------");
        System.out.println(nodeListHeader.getLength());
        for(int tmp = 0; tmp < nodeListHeader.getLength(); tmp++){

            Node node = nodeListHeader.item(tmp);
            if(node.getNodeType() == Node.ELEMENT_NODE)
            {
                Element element = (Element)node;
                System.out.println(element.getTagName());
                System.out.println("message: " + element.getElementsByTagName("message").item(0).getChildNodes().item(0).getNodeValue());
                System.out.println("dateSent: " + element.getElementsByTagName("dateSent").item(0).getChildNodes().item(0).getNodeValue());
            }

        }
        // end Header


        // start Content
        NodeList content = document.getDocumentElement().getElementsByTagName("content");




        NodeList nodeListContent = document.getElementsByTagName(document.getDocumentElement().getChildNodes().item(2).getNodeName());
        NodeList listOfDocument = document.getDocumentElement().getElementsByTagName("Document");
        System.out.println(content.getLength());
        System.out.println(listOfDocument.getLength());

        for (int i = 0; i < listOfDocument.getLength() ; i++) {
            Node node = listOfDocument.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE){
                Element element = (Element)node;
               // element.getChildNodes().item(0).getAttributes();
                System.out.println(element.getTagName());
                System.out.println("DocId: " + element.getElementsByTagName("DocId").item(0).getChildNodes().item(0).getNodeValue());

            }

        }

        for(int tmp = 0; tmp < content.getLength(); tmp++){
            Node node = content.item(tmp);
            if(node.getNodeType() == Node.ELEMENT_NODE)
            {
                Element element = (Element)node;
                element.getChildNodes().item(0).getAttributes();
                System.out.println(element.getTagName());

                System.out.println("");
                Node node1 = (Node) document.getElementsByTagName("RqData").item(0);

                System.out.println("RqData = " + node1.getAttributes().getNamedItem("RqUID").getNodeValue());
                System.out.println("");
                System.out.println("EventName: " + element.getElementsByTagName("EventName").item(0).getChildNodes().item(0).getNodeValue());
                System.out.println("EventDateTime: " + element.getElementsByTagName("EventDateTime").item(0).getChildNodes().item(0).getNodeValue());
            }

        }

    }
}
