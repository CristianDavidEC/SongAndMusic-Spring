//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.11.24 a las 12:31:36 AM COT 
//


package gs_ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para songInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="songInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="lyrics" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="originalTone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="femaleTone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="maleTone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="artist" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="genre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "songInfo", propOrder = {
    "id",
    "name",
    "lyrics",
    "originalTone",
    "femaleTone",
    "maleTone",
    "artist",
    "time",
    "genre"
})
public class SongInfo {

    protected long id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String lyrics;
    @XmlElement(required = true)
    protected String originalTone;
    @XmlElement(required = true)
    protected String femaleTone;
    @XmlElement(required = true)
    protected String maleTone;
    @XmlElement(required = true)
    protected String artist;
    protected int time;
    @XmlElement(required = true)
    protected String genre;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad lyrics.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLyrics() {
        return lyrics;
    }

    /**
     * Define el valor de la propiedad lyrics.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLyrics(String value) {
        this.lyrics = value;
    }

    /**
     * Obtiene el valor de la propiedad originalTone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalTone() {
        return originalTone;
    }

    /**
     * Define el valor de la propiedad originalTone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalTone(String value) {
        this.originalTone = value;
    }

    /**
     * Obtiene el valor de la propiedad femaleTone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFemaleTone() {
        return femaleTone;
    }

    /**
     * Define el valor de la propiedad femaleTone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFemaleTone(String value) {
        this.femaleTone = value;
    }

    /**
     * Obtiene el valor de la propiedad maleTone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaleTone() {
        return maleTone;
    }

    /**
     * Define el valor de la propiedad maleTone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaleTone(String value) {
        this.maleTone = value;
    }

    /**
     * Obtiene el valor de la propiedad artist.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArtist() {
        return artist;
    }

    /**
     * Define el valor de la propiedad artist.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArtist(String value) {
        this.artist = value;
    }

    /**
     * Obtiene el valor de la propiedad time.
     * 
     */
    public int getTime() {
        return time;
    }

    /**
     * Define el valor de la propiedad time.
     * 
     */
    public void setTime(int value) {
        this.time = value;
    }

    /**
     * Obtiene el valor de la propiedad genre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Define el valor de la propiedad genre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenre(String value) {
        this.genre = value;
    }

}
