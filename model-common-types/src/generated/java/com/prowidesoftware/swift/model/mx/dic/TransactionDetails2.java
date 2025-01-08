
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
 * Reference of the trade transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionDetails2", propOrder = {
    "tradRef"
})
public class TransactionDetails2 {

    @XmlElement(name = "TradRef", required = true)
    protected String tradRef;

    /**
     * Gets the value of the tradRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradRef() {
        return tradRef;
    }

    /**
     * Sets the value of the tradRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionDetails2 setTradRef(String value) {
        this.tradRef = value;
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
