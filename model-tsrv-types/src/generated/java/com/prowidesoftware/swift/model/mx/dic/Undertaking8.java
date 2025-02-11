
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
 * Information about an undertaking.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Undertaking8", propOrder = {
    "id",
    "issr",
    "applcntRefNb",
    "bnfcryRefNb"
})
public class Undertaking8 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Issr", required = true)
    protected PartyIdentification43 issr;
    @XmlElement(name = "ApplcntRefNb")
    protected String applcntRefNb;
    @XmlElement(name = "BnfcryRefNb")
    protected String bnfcryRefNb;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Undertaking8 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *     
     */
    public PartyIdentification43 getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *     
     */
    public Undertaking8 setIssr(PartyIdentification43 value) {
        this.issr = value;
        return this;
    }

    /**
     * Gets the value of the applcntRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplcntRefNb() {
        return applcntRefNb;
    }

    /**
     * Sets the value of the applcntRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Undertaking8 setApplcntRefNb(String value) {
        this.applcntRefNb = value;
        return this;
    }

    /**
     * Gets the value of the bnfcryRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBnfcryRefNb() {
        return bnfcryRefNb;
    }

    /**
     * Sets the value of the bnfcryRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Undertaking8 setBnfcryRefNb(String value) {
        this.bnfcryRefNb = value;
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
