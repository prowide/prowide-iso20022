
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Parameters to communicate with a host.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkParameters4", propOrder = {
    "ntwkTp",
    "adrVal"
})
public class NetworkParameters4 {

    @XmlElement(name = "NtwkTp", required = true)
    @XmlSchemaType(name = "string")
    protected NetworkType1Code ntwkTp;
    @XmlElement(name = "AdrVal", required = true)
    protected String adrVal;

    /**
     * Gets the value of the ntwkTp property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkType1Code }
     *     
     */
    public NetworkType1Code getNtwkTp() {
        return ntwkTp;
    }

    /**
     * Sets the value of the ntwkTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkType1Code }
     *     
     */
    public NetworkParameters4 setNtwkTp(NetworkType1Code value) {
        this.ntwkTp = value;
        return this;
    }

    /**
     * Gets the value of the adrVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrVal() {
        return adrVal;
    }

    /**
     * Sets the value of the adrVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public NetworkParameters4 setAdrVal(String value) {
        this.adrVal = value;
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
