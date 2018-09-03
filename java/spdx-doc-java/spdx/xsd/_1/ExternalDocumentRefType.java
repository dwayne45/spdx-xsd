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
 * A data type for ExternalDocumentRef type
 * 
 * <p>Java class for ExternalDocumentRefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalDocumentRefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{spdx:xsd::1.0}Checksum"/>
 *         &lt;element ref="{spdx:xsd::1.0}ExternalDocumentID"/>
 *         &lt;element ref="{spdx:xsd::1.0}SpdxDocument"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalDocumentRefType", propOrder = {
    "checksum",
    "externalDocumentID",
    "spdxDocument"
})
public class ExternalDocumentRefType {

    @XmlElement(name = "Checksum", required = true, nillable = true)
    protected ChecksumType checksum;
    @XmlElement(name = "ExternalDocumentID", required = true, nillable = true)
    protected ExternalDocumentIDType externalDocumentID;
    @XmlElement(name = "SpdxDocument", required = true, nillable = true)
    protected SpdxDocumentType spdxDocument;

    /**
     * Gets the value of the checksum property.
     * 
     * @return
     *     possible object is
     *     {@link ChecksumType }
     *     
     */
    public ChecksumType getChecksum() {
        return checksum;
    }

    /**
     * Sets the value of the checksum property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChecksumType }
     *     
     */
    public void setChecksum(ChecksumType value) {
        this.checksum = value;
    }

    /**
     * Gets the value of the externalDocumentID property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalDocumentIDType }
     *     
     */
    public ExternalDocumentIDType getExternalDocumentID() {
        return externalDocumentID;
    }

    /**
     * Sets the value of the externalDocumentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalDocumentIDType }
     *     
     */
    public void setExternalDocumentID(ExternalDocumentIDType value) {
        this.externalDocumentID = value;
    }

    /**
     * Gets the value of the spdxDocument property.
     * 
     * @return
     *     possible object is
     *     {@link SpdxDocumentType }
     *     
     */
    public SpdxDocumentType getSpdxDocument() {
        return spdxDocument;
    }

    /**
     * Sets the value of the spdxDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpdxDocumentType }
     *     
     */
    public void setSpdxDocument(SpdxDocumentType value) {
        this.spdxDocument = value;
    }

}
