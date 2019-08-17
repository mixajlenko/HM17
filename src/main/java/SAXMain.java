
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class SAXMain {

    private static List<Worker> worker = new LinkedList<>();

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parse = factory.newSAXParser();

        XMLHandler handler = new XMLHandler();
        parse.parse(new File("C:\\Java01\\home_work17.1\\src\\main\\resources\\prop.xml"), handler);


        for (Worker w : worker) {
            System.out.println(String.format("Login: %s\nPosition: %s\nCompany: %s\nSince Year %s\n",
                    w.getLogin(),
                    w.getPosition(),
                    w.getCompany(),
                    w.getSinceYear()));
        }
    }

    private static class XMLHandler extends DefaultHandler {

        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {

        }

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

            if (qName.equals("worker")) {
                if(localName.equals("login")){
                    String login = attributes.getValue("login");
                }

                String position = attributes.getValue("position");
                String company = attributes.getValue("company");
                String sinceYear = attributes.getValue("sinceYear");
                //worker.add(new Worker(login, position, company, sinceYear));

            }


        }
    }
}
