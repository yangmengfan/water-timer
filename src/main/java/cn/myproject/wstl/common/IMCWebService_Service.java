package cn.myproject.wstl.common;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * <p>
 * An example of how this class may be used:
 * 
 * <pre>
 * IMCWebService service = new IMCWebService();
 * IMCWebService portType = service.getIMCWebServicePort();
 * portType.getNCRealData(...);
 * </pre>
 * 
 * </p>
 * 
 */
@WebServiceClient(name = "IMCWebService", targetNamespace = "http://common.hd.slsd.nari.com/", wsdlLocation = "http://192.168.2.12:8088/IMCWebService?wsdl")
public class IMCWebService_Service extends Service {

	private final static URL IMCWEBSERVICE_WSDL_LOCATION;
	private final static Logger logger = Logger
			.getLogger(IMCWebService_Service.class
					.getName());

	static {
		URL url = null;
		try {
			URL baseUrl;
			baseUrl = IMCWebService_Service.class
					.getResource(".");
			url = new URL(baseUrl,
					"http://192.168.2.12:8088/IMCWebService?wsdl");
		} catch (MalformedURLException e) {
			logger.warning("Failed to create URL for the wsdl Location: 'http://192.168.2.12:8088/IMCWebService?wsdl', retrying as a local file");
			logger.warning(e.getMessage());
		}
		IMCWEBSERVICE_WSDL_LOCATION = url;
	}

	public IMCWebService_Service(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public IMCWebService_Service() {
		super(IMCWEBSERVICE_WSDL_LOCATION, new QName(
				"http://common.hd.slsd.nari.com/", "IMCWebService"));
	}

	/**
	 * 
	 * @return returns IMCWebService
	 */
	@WebEndpoint(name = "IMCWebServicePort")
	public IMCWebService getIMCWebServicePort() {
		return super.getPort(new QName("http://common.hd.slsd.nari.com/",
				"IMCWebServicePort"), IMCWebService.class);
	}

}