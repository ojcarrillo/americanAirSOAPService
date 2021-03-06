package org.americanair.demo;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2018-05-15T12:08:05.479-05:00
 * Generated source version: 3.2.4
 *
 */
@WebServiceClient(name = "AmericanAirService",
                  wsdlLocation = "file:/D:/oxygen/eclipse-workspace/americanAirSOAPService/src/main/resources/wsdl/AmericanAirlines.wsdl",
                  targetNamespace = "http://www.americanair.org/demo/")
public class AmericanAirService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.americanair.org/demo/", "AmericanAirService");
    public final static QName AmericanAirServicesEndpoint = new QName("http://www.americanair.org/demo/", "AmericanAirServicesEndpoint");
    static {
        URL url = null;
        try {
            url = new URL("file:/D:/oxygen/eclipse-workspace/americanAirSOAPService/src/main/resources/wsdl/AmericanAirlines.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(AmericanAirService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/D:/oxygen/eclipse-workspace/americanAirSOAPService/src/main/resources/wsdl/AmericanAirlines.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public AmericanAirService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AmericanAirService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AmericanAirService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public AmericanAirService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public AmericanAirService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public AmericanAirService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns AmericanAirSystemServices
     */
    @WebEndpoint(name = "AmericanAirServicesEndpoint")
    public AmericanAirSystemServices getAmericanAirServicesEndpoint() {
        return super.getPort(AmericanAirServicesEndpoint, AmericanAirSystemServices.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AmericanAirSystemServices
     */
    @WebEndpoint(name = "AmericanAirServicesEndpoint")
    public AmericanAirSystemServices getAmericanAirServicesEndpoint(WebServiceFeature... features) {
        return super.getPort(AmericanAirServicesEndpoint, AmericanAirSystemServices.class, features);
    }

}
