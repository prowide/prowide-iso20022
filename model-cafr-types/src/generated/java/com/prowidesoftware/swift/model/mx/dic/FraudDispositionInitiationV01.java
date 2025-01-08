
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
 * A FraudDispositionInitiation message is usually sent by an agent to a financial institution acting as an acquirer or as an issuer   to report about the disposition of a confirmed fraudulent transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FraudDispositionInitiationV01", propOrder = {
    "hdr",
    "body",
    "sctyTrlr"
})
public class FraudDispositionInitiationV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header48 hdr;
    @XmlElement(name = "Body", required = true)
    protected FraudDispositionInitiation1 body;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType20 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header48 }
     *     
     */
    public Header48 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header48 }
     *     
     */
    public FraudDispositionInitiationV01 setHdr(Header48 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link FraudDispositionInitiation1 }
     *     
     */
    public FraudDispositionInitiation1 getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudDispositionInitiation1 }
     *     
     */
    public FraudDispositionInitiationV01 setBody(FraudDispositionInitiation1 value) {
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
    public FraudDispositionInitiationV01 setSctyTrlr(ContentInformationType20 value) {
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
