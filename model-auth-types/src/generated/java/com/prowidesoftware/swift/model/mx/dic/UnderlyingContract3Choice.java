
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
 * Choice of the type of underlying contract.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnderlyingContract3Choice", propOrder = {
    "ln",
    "trad"
})
public class UnderlyingContract3Choice {

    @XmlElement(name = "Ln")
    protected LoanContract3 ln;
    @XmlElement(name = "Trad")
    protected TradeContract3 trad;

    /**
     * Gets the value of the ln property.
     * 
     * @return
     *     possible object is
     *     {@link LoanContract3 }
     *     
     */
    public LoanContract3 getLn() {
        return ln;
    }

    /**
     * Sets the value of the ln property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanContract3 }
     *     
     */
    public UnderlyingContract3Choice setLn(LoanContract3 value) {
        this.ln = value;
        return this;
    }

    /**
     * Gets the value of the trad property.
     * 
     * @return
     *     possible object is
     *     {@link TradeContract3 }
     *     
     */
    public TradeContract3 getTrad() {
        return trad;
    }

    /**
     * Sets the value of the trad property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeContract3 }
     *     
     */
    public UnderlyingContract3Choice setTrad(TradeContract3 value) {
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
