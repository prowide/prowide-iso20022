
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
 * Pre-agreed offering between clearing agents, or the channel through which the payment instruction is to be processed. This payment scheme can point to a specific rulebook governing the rules of clearing and settlement between two parties.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentSchemeChoice", propOrder = {
    "cd",
    "prtryInf"
})
public class PaymentSchemeChoice {

    @XmlElement(name = "Cd")
    @XmlSchemaType(name = "string")
    protected CashClearingSystem2Code cd;
    @XmlElement(name = "PrtryInf")
    protected String prtryInf;

    /**
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link CashClearingSystem2Code }
     *     
     */
    public CashClearingSystem2Code getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashClearingSystem2Code }
     *     
     */
    public PaymentSchemeChoice setCd(CashClearingSystem2Code value) {
        this.cd = value;
        return this;
    }

    /**
     * Gets the value of the prtryInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtryInf() {
        return prtryInf;
    }

    /**
     * Sets the value of the prtryInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentSchemeChoice setPrtryInf(String value) {
        this.prtryInf = value;
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
