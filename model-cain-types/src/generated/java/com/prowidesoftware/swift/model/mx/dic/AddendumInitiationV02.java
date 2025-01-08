
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
 * Provides supplemental data in addition to that which is required to complete an authorization initiation or financial initiation. 
 * 
 * The supplemental data is associated with an authorization or financial message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddendumInitiationV02", propOrder = {
    "hdr",
    "body",
    "sctyTrlr"
})
public class AddendumInitiationV02 {

    @XmlElement(name = "Hdr", required = true)
    protected Header66 hdr;
    @XmlElement(name = "Body")
    protected AddendumInitiation2 body;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType20 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header66 }
     *     
     */
    public Header66 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header66 }
     *     
     */
    public AddendumInitiationV02 setHdr(Header66 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link AddendumInitiation2 }
     *     
     */
    public AddendumInitiation2 getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddendumInitiation2 }
     *     
     */
    public AddendumInitiationV02 setBody(AddendumInitiation2 value) {
        this.body = value;
        return this;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType20 }
     *     
     */
    public ContentInformationType20 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType20 }
     *     
     */
    public AddendumInitiationV02 setSctyTrlr(ContentInformationType20 value) {
        this.sctyTrlr = value;
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
