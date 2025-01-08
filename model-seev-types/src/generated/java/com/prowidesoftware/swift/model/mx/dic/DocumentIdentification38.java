
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Identification of a document as well as the document number and type of link.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentIdentification38", propOrder = {
    "id",
    "docNb",
    "lkgTp"
})
public class DocumentIdentification38 {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification4Choice id;
    @XmlElement(name = "DocNb")
    protected DocumentNumber6Choice docNb;
    @XmlElement(name = "LkgTp")
    protected ProcessingPosition10Choice lkgTp;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification4Choice }
     *     
     */
    public DocumentIdentification4Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification4Choice }
     *     
     */
    public DocumentIdentification38 setId(DocumentIdentification4Choice value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the docNb property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentNumber6Choice }
     *     
     */
    public DocumentNumber6Choice getDocNb() {
        return docNb;
    }

    /**
     * Sets the value of the docNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentNumber6Choice }
     *     
     */
    public DocumentIdentification38 setDocNb(DocumentNumber6Choice value) {
        this.docNb = value;
        return this;
    }

    /**
     * Gets the value of the lkgTp property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingPosition10Choice }
     *     
     */
    public ProcessingPosition10Choice getLkgTp() {
        return lkgTp;
    }

    /**
     * Sets the value of the lkgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingPosition10Choice }
     *     
     */
    public DocumentIdentification38 setLkgTp(ProcessingPosition10Choice value) {
        this.lkgTp = value;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

}
