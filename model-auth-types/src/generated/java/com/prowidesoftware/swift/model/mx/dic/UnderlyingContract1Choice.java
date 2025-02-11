
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
 * Choice of the type of underlying contract.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnderlyingContract1Choice", propOrder = {
    "ln",
    "trad"
})
public class UnderlyingContract1Choice {

    @XmlElement(name = "Ln")
    protected LoanContract1 ln;
    @XmlElement(name = "Trad")
    protected TradeContract1 trad;

    /**
     * Gets the value of the ln property.
     * 
     * @return
     *     possible object is
     *     {@link LoanContract1 }
     *     
     */
    public LoanContract1 getLn() {
        return ln;
    }

    /**
     * Sets the value of the ln property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanContract1 }
     *     
     */
    public UnderlyingContract1Choice setLn(LoanContract1 value) {
        this.ln = value;
        return this;
    }

    /**
     * Gets the value of the trad property.
     * 
     * @return
     *     possible object is
     *     {@link TradeContract1 }
     *     
     */
    public TradeContract1 getTrad() {
        return trad;
    }

    /**
     * Sets the value of the trad property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeContract1 }
     *     
     */
    public UnderlyingContract1Choice setTrad(TradeContract1 value) {
        this.trad = value;
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
