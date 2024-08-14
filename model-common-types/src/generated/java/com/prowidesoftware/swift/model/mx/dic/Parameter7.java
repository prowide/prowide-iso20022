
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
 * Parameters associated to the MAC algorithm.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Parameter7", propOrder = {
    "initlstnVctr",
    "bPddg"
})
public class Parameter7 {

    @XmlElement(name = "InitlstnVctr")
    protected byte[] initlstnVctr;
    @XmlElement(name = "BPddg")
    @XmlSchemaType(name = "string")
    protected BytePadding1Code bPddg;

    /**
     * Gets the value of the initlstnVctr property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getInitlstnVctr() {
        return initlstnVctr;
    }

    /**
     * Sets the value of the initlstnVctr property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public Parameter7 setInitlstnVctr(byte[] value) {
        this.initlstnVctr = value;
        return this;
    }

    /**
     * Gets the value of the bPddg property.
     * 
     * @return
     *     possible object is
     *     {@link BytePadding1Code }
     *     
     */
    public BytePadding1Code getBPddg() {
        return bPddg;
    }

    /**
     * Sets the value of the bPddg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BytePadding1Code }
     *     
     */
    public Parameter7 setBPddg(BytePadding1Code value) {
        this.bPddg = value;
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
