
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
 * Contains the details of the destination. 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Destination3", propOrder = {
    "nmAndLctn",
    "adr"
})
public class Destination3 {

    @XmlElement(name = "NmAndLctn")
    protected String nmAndLctn;
    @XmlElement(name = "Adr")
    protected Address2 adr;

    /**
     * Gets the value of the nmAndLctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmAndLctn() {
        return nmAndLctn;
    }

    /**
     * Sets the value of the nmAndLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Destination3 setNmAndLctn(String value) {
        this.nmAndLctn = value;
        return this;
    }

    /**
     * Gets the value of the adr property.
     * 
     * @return
     *     possible object is
     *     {@link Address2 }
     *     
     */
    public Address2 getAdr() {
        return adr;
    }

    /**
     * Sets the value of the adr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address2 }
     *     
     */
    public Destination3 setAdr(Address2 value) {
        this.adr = value;
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
