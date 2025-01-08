
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
 * Environment of the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardTransactionEnvironment6", propOrder = {
    "sndgInstn",
    "rcvgInstn"
})
public class CardTransactionEnvironment6 {

    @XmlElement(name = "SndgInstn", required = true)
    protected GenericIdentification73 sndgInstn;
    @XmlElement(name = "RcvgInstn", required = true)
    protected GenericIdentification73 rcvgInstn;

    /**
     * Gets the value of the sndgInstn property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification73 }
     *     
     */
    public GenericIdentification73 getSndgInstn() {
        return sndgInstn;
    }

    /**
     * Sets the value of the sndgInstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification73 }
     *     
     */
    public CardTransactionEnvironment6 setSndgInstn(GenericIdentification73 value) {
        this.sndgInstn = value;
        return this;
    }

    /**
     * Gets the value of the rcvgInstn property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification73 }
     *     
     */
    public GenericIdentification73 getRcvgInstn() {
        return rcvgInstn;
    }

    /**
     * Sets the value of the rcvgInstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification73 }
     *     
     */
    public CardTransactionEnvironment6 setRcvgInstn(GenericIdentification73 value) {
        this.rcvgInstn = value;
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
