package com.benjiman.capstone;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.List;

import static com.benjiman.capstone.CapstoneApplication.troops;

public class XMLData {

    // This method will get the XML Data from the named location, uses the document builder
    public static List<Person> GrabXML() {
        // NodeList initialise
        NodeList nList;

        // Try block to check the file exists and throw exception if it doesn't
        try {
            // XML File path
            File file = new File("src/main/resources/dataset.xml");
            DocumentBuilderFactory fac = DocumentBuilderFactory.newInstance();
            DocumentBuilder build = fac.newDocumentBuilder();
            Document doc = build.parse(file);
            doc.getDocumentElement().normalize();

            // Link nlist to record tag in the XML
            nList = doc.getElementsByTagName("record");
            System.out.println("test 1, print from the try block");

            // For loop for the nodeList and to iterate through the nodes
            for(int check = 0; check < nList.getLength(); check++) {
                Node node = nList.item(check);

                if(node.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) node;

                    // Adds to the file
                    troops.add(new Person(eElement.getElementsByTagName("name").item(0).getTextContent(),
                            eElement.getElementsByTagName("number").item(0).getTextContent(),eElement.getElementsByTagName("percentage").item(0).getTextContent()));

                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

        return troops;
    }
}
