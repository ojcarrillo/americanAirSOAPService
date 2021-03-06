
package org.americanair.demo;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.americanair.demo package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.americanair.demo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CancelarReserva }
     * 
     */
    public CancelarReserva createCancelarReserva() {
        return new CancelarReserva();
    }

    /**
     * Create an instance of {@link CancelarReservaResponse }
     * 
     */
    public CancelarReservaResponse createCancelarReservaResponse() {
        return new CancelarReservaResponse();
    }

    /**
     * Create an instance of {@link ObtenerReserva }
     * 
     */
    public ObtenerReserva createObtenerReserva() {
        return new ObtenerReserva();
    }

    /**
     * Create an instance of {@link ObtenerReservaResponse }
     * 
     */
    public ObtenerReservaResponse createObtenerReservaResponse() {
        return new ObtenerReservaResponse();
    }

    /**
     * Create an instance of {@link Persona }
     * 
     */
    public Persona createPersona() {
        return new Persona();
    }

    /**
     * Create an instance of {@link Vuelo }
     * 
     */
    public Vuelo createVuelo() {
        return new Vuelo();
    }

    /**
     * Create an instance of {@link RealizarReserva }
     * 
     */
    public RealizarReserva createRealizarReserva() {
        return new RealizarReserva();
    }

    /**
     * Create an instance of {@link RealizarReservaResponse }
     * 
     */
    public RealizarReservaResponse createRealizarReservaResponse() {
        return new RealizarReservaResponse();
    }

}
