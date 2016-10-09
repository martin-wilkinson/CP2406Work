package au.com.wilkinson.martin;

/**
 * Created by jimji on 3/10/2016.
 */

        import java.io.File;
        import javax.xml.parsers.DocumentBuilderFactory;
        import javax.xml.parsers.DocumentBuilder;
        import org.w3c.dom.Document;
        import org.w3c.dom.NodeList;
        import org.w3c.dom.Node;
        import org.w3c.dom.Element;

public class DeckBuilder {

    public static void main(String[] args) {
        GameCard[] test = buildDeck();
        System.out.println(test);
    }
    public static GameCard[] buildDeck() {
        GameCard[] deck = new GameCard[60];
        try {
            File inputFile = new File("D:\\Assignment 1\\src\\au\\com\\wilkinson\\martin\\MstCards_151021.plist");
            DocumentBuilderFactory dbFactory
                    = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("dict");
            int deckPos = 0;
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node currentNode = nList.item(temp);
                if (currentNode.getNodeType() == currentNode.ELEMENT_NODE) {
                    Element currentElement = (Element) currentNode;
                    NodeList nlist1 = currentElement.getElementsByTagName("key");
                    NodeList nlist2 = currentElement.getElementsByTagName("string");
                    NodeList nlist3 = currentElement.getElementsByTagName("array");


                    if (nlist1.item(3).getTextContent().equals("trump")) {
                        deck[deckPos] = new TrumpCard(nlist2.item(2).getTextContent(), nlist2.item(3).getTextContent());
                        deckPos++;
                    }
                    else if (nlist1.item(3).getTextContent().equals("play")){
                        String[] occrnceArray = new String[nlist2.getLength() - 11];
                        for (int j = 0; j < nlist2.getLength() - 11; j++) {
                            occrnceArray[j] = nlist2.item(6 + j).getTextContent();
                        }

                        deck[deckPos] = new PlayCard(nlist2.item(2).getTextContent(), nlist2.item(3).getTextContent(), nlist2.item(4).getTextContent(), nlist2.item(5).getTextContent(),
                                occrnceArray, nlist2.item(6 + occrnceArray.length).getTextContent(), nlist2.item(7 + occrnceArray.length).getTextContent(),
                                nlist2.item(8 + occrnceArray.length).getTextContent(), nlist2.item(9 + occrnceArray.length).getTextContent(), nlist2.item(10 + occrnceArray.length).getTextContent());
                        deckPos++;
                    }
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return deck;
    }
}
