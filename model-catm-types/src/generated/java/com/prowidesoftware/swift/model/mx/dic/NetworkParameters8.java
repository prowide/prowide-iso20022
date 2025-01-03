
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
@XmlType(name = "NetworkParameters8", propOrder = {
    "tp",
    "accs"
})
public class NetworkParameters8 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected NetworkType2Code tp;
    @XmlElement(name = "Accs", required = true)
    protected NetworkParameters7 accs;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkType2Code }
     *     
     */
    public NetworkType2Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkType2Code }
     *     
     */
    public NetworkParameters8 setTp(NetworkType2Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the accs property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkParameters7 }
     *     
     */
    public NetworkParameters7 getAccs() {
        return accs;
    }

    /**
     * Sets the value of the accs property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkParameters7 }
     *     
     */
    public NetworkParameters8 setAccs(NetworkParameters7 value) {
        this.accs = value;
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
