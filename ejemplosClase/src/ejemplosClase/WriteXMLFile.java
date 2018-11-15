package ejemplosClase;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class WriteXMLFile {

	public static void main(String argv[]) {

	  try {

		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

		// root element
		Document doc = docBuilder.newDocument();
		Element rootElement = doc.createElement("bookstore");
		doc.appendChild(rootElement);

		// Book 1
			Element book1 = doc.createElement("book"); // create the node(=element)
			rootElement.appendChild(book1); // add the node to the root element
	
			// set attribute to staff element
			book1.setAttribute("id", "1"); // Set an attribute (here an ID)
			
			// add the title
			Element title1 = doc.createElement("title");  // Create a new element in the node book
			title1.appendChild(doc.createTextNode("The Philosopher's Stone")); // assign the data to this new element
			book1.appendChild(title1); // add this new element to the parent element
	
			// add the authors
			Element author1 = doc.createElement("author");
			author1.appendChild(doc.createTextNode("J.K. Rowling"));
			book1.appendChild(author1);
	
			// add the year
			Element year1 = doc.createElement("year");
			year1.appendChild(doc.createTextNode("1997"));
			book1.appendChild(year1);
			
			
		// Book 2
			Element book2 = doc.createElement("book");
			rootElement.appendChild(book2);
	
			// set attribute to staff element
			book2.setAttribute("id", "2");
			
			// add the title
			Element title2 = doc.createElement("title");
			title2.appendChild(doc.createTextNode("The Chamber of Secrets"));
			book2.appendChild(title2);
	
			// add the authors
			Element author2= doc.createElement("author");
			author2.appendChild(doc.createTextNode("J.K. Rowling"));
			book2.appendChild(author2);
	
			// add the year
			Element year2 = doc.createElement("year");
			year2.appendChild(doc.createTextNode("1998"));
			book2.appendChild(year2);
			
			
			
		// write the content into xml file
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
			transformer.setOutputProperty(OutputKeys.INDENT, "yes"); // helps to get a nice formatting
			transformer.setOutputProperty(OutputKeys.METHOD, "xml"); // helps to get a nice formatting
			transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4"); // helps to get a nice formatting
		DOMSource source = new DOMSource(doc);
		StreamResult result = new StreamResult(new File("books.xml"));

		// Output to console for testing
		// StreamResult result = new StreamResult(System.out);

		// Actually transform the java objects to the xml-file
		transformer.transform(source, result);

		System.out.println("File saved!"); // Simply display in the console, that the file has been created

	  } catch (ParserConfigurationException pce) {
		pce.printStackTrace();
	  } catch (TransformerException tfe) {
		tfe.printStackTrace();
	  }
	}
}