
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Scope
 * A trading party, eg, an investment manager sends the QuoteResponse message to another trading party, eg, a broker to respond to an IndicationOfInterest or to a Quote message. The QuoteResponse message is also used to hit or lift a IndicationOfInterest or Quote message, to "counter" a Quote message or to end a negotiation dialog.
 * Usage
 * The QuoteResponse message may also be sent in a tradeable and restricted tradeable quoting market.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuoteResponse", propOrder = {
    "id",
    "refs",
    "qtDtls"
})
public class QuoteResponse {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification11 id;
    @XmlElement(name = "Refs", required = true)
    protected Reference5 refs;
    @XmlElement(name = "QtDtls", required = true)
    protected Quote4 qtDtls;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification11 }
     *     
     */
    public DocumentIdentification11 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification11 }
     *     
     */
    public QuoteResponse setId(DocumentIdentification11 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the refs property.
     * 
     * @return
     *     possible object is
     *     {@link Reference5 }
     *     
     */
    public Reference5 getRefs() {
        return refs;
    }

    /**
     * Sets the value of the refs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference5 }
     *     
     */
    public QuoteResponse setRefs(Reference5 value) {
        this.refs = value;
        return this;
    }

    /**
     * Gets the value of the qtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Quote4 }
     *     
     */
    public Quote4 getQtDtls() {
        return qtDtls;
    }

    /**
     * Sets the value of the qtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quote4 }
     *     
     */
    public QuoteResponse setQtDtls(Quote4 value) {
        this.qtDtls = value;
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
