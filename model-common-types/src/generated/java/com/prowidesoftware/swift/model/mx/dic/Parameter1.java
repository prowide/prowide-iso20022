
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
 * Parameters associated to a cryptographic algorithm.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Parameter1", propOrder = {
    "initlstnVctr"
})
public class Parameter1 {

    @XmlElement(name = "InitlstnVctr")
    protected byte[] initlstnVctr;

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
    public Parameter1 setInitlstnVctr(byte[] value) {
        this.initlstnVctr = value;
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
