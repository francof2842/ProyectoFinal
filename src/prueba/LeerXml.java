package prueba;


import java.io.File;
import java.io.IOException;
import org.jdom2.Document;         // |
import org.jdom2.Element;          // |\ Librerías
import org.jdom2.JDOMException;    // |/ JDOM
import org.jdom2.filter.ElementFilter;
import org.jdom2.input.SAXBuilder; // |

public class LeerXml {

	
	public static void cargarXml() throws JDOMException, IOException
	{
		SAXBuilder builder = new SAXBuilder();
		File xmlProductFile = new File("prueba.xml");
		Document document = builder.build(xmlProductFile);  

		
		
		
		Element root = document.getRootElement();
		ElementFilter filter = new org.jdom2.filter.ElementFilter("node_id");
		for(Element c : root.getDescendants(filter)) {
		    System.out.println(c.getTextNormalize());
		}
	}
	
	

	
	public static void main(String[] args) throws java.lang.Exception {
		cargarXml();
	}
		
	
}
