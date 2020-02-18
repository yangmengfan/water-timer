package cn.myproject.wstl.common;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.nari.slsd.hd.common package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _CharDataWS_QNAME = new QName(
			"http://common.hd.slsd.nari.com/", "charDataWS");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: com.nari.slsd.hd.common
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link WebFetchParam }
	 * 
	 */
	public WebFetchParam createWebFetchParam() {
		return new WebFetchParam();
	}

	/**
	 * Create an instance of {@link WdsHydroCurvedArray }
	 * 
	 */
	public WdsHydroCurvedArray createWdsHydroCurvedArray() {
		return new WdsHydroCurvedArray();
	}

	/**
	 * Create an instance of {@link WdsHydroCurved }
	 * 
	 */
	public WdsHydroCurved createWdsHydroCurved() {
		return new WdsHydroCurved();
	}

	/**
	 * Create an instance of {@link CharDataWSArray }
	 * 
	 */
	public CharDataWSArray createCharDataWSArray() {
		return new CharDataWSArray();
	}

	/**
	 * Create an instance of {@link WdsHydroCurvedId }
	 * 
	 */
	public WdsHydroCurvedId createWdsHydroCurvedId() {
		return new WdsHydroCurvedId();
	}

	/**
	 * Create an instance of {@link CharDataWS }
	 * 
	 */
	public CharDataWS createCharDataWS() {
		return new CharDataWS();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link CharDataWS }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://common.hd.slsd.nari.com/", name = "charDataWS")
	public JAXBElement<CharDataWS> createCharDataWS(CharDataWS value) {
		return new JAXBElement<CharDataWS>(_CharDataWS_QNAME, CharDataWS.class,
				null, value);
	}

}
