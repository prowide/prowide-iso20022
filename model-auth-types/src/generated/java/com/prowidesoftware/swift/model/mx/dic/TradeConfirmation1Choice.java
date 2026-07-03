
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
 * Information regarding the confirmation of the contract.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeConfirmation1Choice", propOrder = {
    "confd",
    "nonConfd"
})
public class TradeConfirmation1Choice {

    @XmlElement(name = "Confd")
    protected TradeConfirmation2 confd;
    @XmlElement(name = "NonConfd")
    protected TradeNonConfirmation1 nonConfd;

    /**
     * Gets the value of the confd property.
     * 
     * @return
     *     possible object is
     *     {@link TradeConfirmation2 }
     *     
     */
    public TradeConfirmation2 getConfd() {
        return confd;
    }

    /**
     * Sets the value of the confd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeConfirmation2 }
     *     
     */
    public TradeConfirmation1Choice setConfd(TradeConfirmation2 value) {
        this.confd = value;
        return this;
    }

    /**
     * Gets the value of the nonConfd property.
     * 
     * @return
     *     possible object is
     *     {@link TradeNonConfirmation1 }
     *     
     */
    public TradeNonConfirmation1 getNonConfd() {
        return nonConfd;
    }

    /**
     * Sets the value of the nonConfd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeNonConfirmation1 }
     *     
     */
    public TradeConfirmation1Choice setNonConfd(TradeNonConfirmation1 value) {
        this.nonConfd = value;
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
