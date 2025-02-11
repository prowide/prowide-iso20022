
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
@XmlType(name = "Undertaking9", propOrder = {
    "id",
    "issr",
    "applcntRefNb"
})
public class Undertaking9 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Issr", required = true)
    protected PartyIdentification43 issr;
    @XmlElement(name = "ApplcntRefNb")
    protected String applcntRefNb;

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
    public Undertaking9 setId(String value) {
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
    public Undertaking9 setIssr(PartyIdentification43 value) {
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
    public Undertaking9 setApplcntRefNb(String value) {
        this.applcntRefNb = value;
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
