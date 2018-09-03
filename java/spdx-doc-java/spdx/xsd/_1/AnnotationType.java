//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.31 at 09:32:17 AM PDT 
//


package spdx.xsd._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for Annotation type
 * 
 * <p>Java class for AnnotationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnnotationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{spdx:xsd::1.0}Date"/>
 *         &lt;element ref="{spdx:xsd::1.0}AnnotationTypeCode"/>
 *         &lt;element ref="{spdx:xsd::1.0}Comment"/>
 *         &lt;element ref="{spdx:xsd::1.0}Annotator"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnnotationType", propOrder = {
    "date",
    "annotationTypeCode",
    "comment",
    "annotator"
})
public class AnnotationType {

    @XmlElement(name = "Date", required = true, nillable = true)
    protected DateType date;
    @XmlElement(name = "AnnotationTypeCode", required = true, nillable = true)
    protected AnnotationTypeCodeType annotationTypeCode;
    @XmlElement(name = "Comment", required = true, nillable = true)
    protected CommentType comment;
    @XmlElement(name = "Annotator", required = true, nillable = true)
    protected AnnotatorType annotator;

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setDate(DateType value) {
        this.date = value;
    }

    /**
     * Gets the value of the annotationTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link AnnotationTypeCodeType }
     *     
     */
    public AnnotationTypeCodeType getAnnotationTypeCode() {
        return annotationTypeCode;
    }

    /**
     * Sets the value of the annotationTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnotationTypeCodeType }
     *     
     */
    public void setAnnotationTypeCode(AnnotationTypeCodeType value) {
        this.annotationTypeCode = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link CommentType }
     *     
     */
    public CommentType getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommentType }
     *     
     */
    public void setComment(CommentType value) {
        this.comment = value;
    }

    /**
     * Gets the value of the annotator property.
     * 
     * @return
     *     possible object is
     *     {@link AnnotatorType }
     *     
     */
    public AnnotatorType getAnnotator() {
        return annotator;
    }

    /**
     * Sets the value of the annotator property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnotatorType }
     *     
     */
    public void setAnnotator(AnnotatorType value) {
        this.annotator = value;
    }

}
