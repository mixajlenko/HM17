package SAX;

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

        AdvancedXMLHandler handler = new AdvancedXMLHandler();
        parse.parse(new File("C:\\Java01\\home_work17.1\\src\\main\\resources\\prop.xml"), handler);


        for (Worker w : worker) {
            System.out.println(String.format("Login: %s\nPosition: %s\nCompany: %s\nSince Year %s\n",
                    w.getLogin(),
                    w.getPosition(),
                    w.getCompany(),
                    w.getSinceYear()));
        }
    }

    private static class AdvancedXMLHandler extends DefaultHandler {

        private String login;

        private String position;

        private String company;

        private String sinceYear;

        private String lastElementName;

        @Override
        public void characters(char[] ch, int start, int length) {
            String info = new String(ch, start, length);

            info = info.replace("\n", "").trim();

            if (!info.isEmpty()) {
                if (lastElementName.equals("login"))
                    login = info;
                if (lastElementName.equals("position"))
                    position = info;
            }
        }

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) {
            lastElementName = qName;
            if (qName.equals("additionalInfo")) {
                String company = attributes.getValue("company");
                String sinceYear = attributes.getValue("sinceYear");
                worker.add(new Worker(login, position, company, sinceYear));
            }
        }

        @Override
        public void endElement(String uri, String localName, String qName) {
            if ((login != null && !login.isEmpty()) && (position != null && !position.isEmpty())) {
                worker.add(new Worker(login, position, company, sinceYear));
                login = null;
                position = null;
                company = null;
                sinceYear = null;
            } else {
                System.out.println("Ты дурачок");
            }
        }
    }
}
