//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.11.21 a las 09:35:05 PM COT 
//


package gs_ws;

import javax.xml.bind.annotation.*;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="song" type="{http://spring.io/guides/gs-producing-web-service}song"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "song"
})
@XmlRootElement(name = "addSongRequest")
public class AddSongRequest {

    @XmlElement(required = true)
    protected Song song;

    /**
     * Obtiene el valor de la propiedad song.
     * 
     * @return
     *     possible object is
     *     {@link Song }
     *     
     */
    public Song getSong() {
        return song;
    }

    /**
     * Define el valor de la propiedad song.
     * 
     * @param value
     *     allowed object is
     *     {@link Song }
     *     
     */
    public void setSong(Song value) {
        this.song = value;
    }

}
