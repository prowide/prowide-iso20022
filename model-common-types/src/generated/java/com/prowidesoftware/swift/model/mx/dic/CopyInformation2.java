
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
 * Information provided when the message is a copy of a previous message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CopyInformation2", propOrder = {
    "cpyInd",
    "orgnlRcvr"
})
public class CopyInformation2 {

    @XmlElement(name = "CpyInd")
    protected boolean cpyInd;
    @XmlElement(name = "OrgnlRcvr")
    protected BICIdentification1 orgnlRcvr;

    /**
     * Gets the value of the cpyInd property.
     * 
     */
    public boolean isCpyInd() {
        return cpyInd;
    }

    /**
     * Sets the value of the cpyInd property.
     * 
     */
    public CopyInformation2 setCpyInd(boolean value) {
        this.cpyInd = value;
        return this;
    }

    /**
     * Gets the value of the orgnlRcvr property.
     * 
     * @return
     *     possible object is
     *     {@link BICIdentification1 }
     *     
     */
    public BICIdentification1 getOrgnlRcvr() {
        return orgnlRcvr;
    }

    /**
     * Sets the value of the orgnlRcvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BICIdentification1 }
     *     
     */
    public CopyInformation2 setOrgnlRcvr(BICIdentification1 value) {
        this.orgnlRcvr = value;
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
