package ejemplosClase;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class ReadXML {

	public static void main(String[] args) {
		try {

            DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
            Document doc = docBuilder.parse (new File("workers.xml"));

            // normalize text representation
            doc.getDocumentElement ().normalize ();
            System.out.println ("Root element of the doc is " + 
                 doc.getDocumentElement().getNodeName());


            
            NodeList listOfPersons = doc.getElementsByTagName("Employee");
           
            int totalPersons = listOfPersons.getLength();
            System.out.println("Total no of people : " + totalPersons);

            for(int s=0; s<listOfPersons.getLength() ; s++){

            	// Define the current node (using the runner)
                Node thisNode = listOfPersons.item(s);
                
                String name = getValue(thisNode, "Name"); // Method getValue defined below
                String familyName = getValue(thisNode,"FamilyName");
                int age 			= Integer.parseInt(getValue(thisNode,"Age"));	 // load the age to a integer
    			boolean female 		= Boolean.parseBoolean(getValue(thisNode,"Female"));	// load the female variable to a boolean
    			double grossIncome  = Double.parseDouble(getValue(thisNode,"GrossSalary")); // convert the string to a double
                
                
    			// Simply print to the console what we have read
    			if(female){
    				System.out.printf("Mrs %s %s is %s years old and earns %9.2f dolars (gross)\n",name,familyName,age,grossIncome);
    			}
    			else{
    				System.out.printf("Mr %s %s is %s years old and earns %9.2f dolars (gross)\n",name,familyName,age,grossIncome);
    			}

            }//end of for loop with s var


        }catch (SAXParseException err) { // Catch all the possible exceptions
        System.out.println ("** Parsing error" + ", line " 
             + err.getLineNumber () + ", uri " + err.getSystemId ());
        System.out.println(" " + err.getMessage ());

        }catch (SAXException e) {
        Exception x = e.getException ();
        ((x == null) ? e : x).printStackTrace ();

        }catch (Throwable t) {
        t.printStackTrace ();
        }
        //System.exit (0);

    }//end of main

	
	private static String getValue(Node node, String label){
		String result="";
		 if(node.getNodeType() == Node.ELEMENT_NODE){


             Element thisElement = (Element)node;

             
             NodeList myNodeList =  thisElement.getElementsByTagName(label);
                          
             Element myElement = (Element)myNodeList.item(0);

             NodeList childNodes = myElement.getChildNodes();
           result = ((Node)childNodes.item(0)).getNodeValue().trim();

             
          

         }//end of if clause
		return result;
	
	}
	

}
