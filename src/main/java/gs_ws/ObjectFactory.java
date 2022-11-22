//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.11.21 a las 09:35:05 PM COT 
//


package gs_ws;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.song_soap.gs_ws package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.song_soap.gs_ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddSongRequest }
     * 
     */
    public AddSongRequest createAddSongRequest() {
        return new AddSongRequest();
    }

    /**
     * Create an instance of {@link Song }
     * 
     */
    public Song createSong() {
        return new Song();
    }

    /**
     * Create an instance of {@link AddSongResponse }
     * 
     */
    public AddSongResponse createAddSongResponse() {
        return new AddSongResponse();
    }

    /**
     * Create an instance of {@link ServiceStatus }
     * 
     */
    public ServiceStatus createServiceStatus() {
        return new ServiceStatus();
    }

    /**
     * Create an instance of {@link GetSongByIdRequest }
     * 
     */
    public GetSongByIdRequest createGetSongByIdRequest() {
        return new GetSongByIdRequest();
    }

    /**
     * Create an instance of {@link GetSongByIdResponse }
     * 
     */
    public GetSongByIdResponse createGetSongByIdResponse() {
        return new GetSongByIdResponse();
    }

    /**
     * Create an instance of {@link GetSongByNameRequest }
     * 
     */
    public GetSongByNameRequest createGetSongByNameRequest() {
        return new GetSongByNameRequest();
    }

    /**
     * Create an instance of {@link GetSongByNameResponse }
     * 
     */
    public GetSongByNameResponse createGetSongByNameResponse() {
        return new GetSongByNameResponse();
    }

    /**
     * Create an instance of {@link GetAllSongsRequest }
     * 
     */
    public GetAllSongsRequest createGetAllSongsRequest() {
        return new GetAllSongsRequest();
    }

    /**
     * Create an instance of {@link GetAllSongsResponse }
     * 
     */
    public GetAllSongsResponse createGetAllSongsResponse() {
        return new GetAllSongsResponse();
    }

    /**
     * Create an instance of {@link UpdateSongRequest }
     * 
     */
    public UpdateSongRequest createUpdateSongRequest() {
        return new UpdateSongRequest();
    }

    /**
     * Create an instance of {@link UpdateSongResponse }
     * 
     */
    public UpdateSongResponse createUpdateSongResponse() {
        return new UpdateSongResponse();
    }

    /**
     * Create an instance of {@link DeleteSongRequest }
     * 
     */
    public DeleteSongRequest createDeleteSongRequest() {
        return new DeleteSongRequest();
    }

    /**
     * Create an instance of {@link DeleteSongResponse }
     * 
     */
    public DeleteSongResponse createDeleteSongResponse() {
        return new DeleteSongResponse();
    }

}
