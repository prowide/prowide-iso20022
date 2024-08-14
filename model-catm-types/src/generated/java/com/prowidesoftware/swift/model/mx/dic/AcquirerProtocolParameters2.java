
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
 * Acceptor parameters dedicated to the acquirer protocol.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcquirerProtocolParameters2", propOrder = {
    "finCaptr",
    "btchTrf",
    "cmpltnXchg"
})
public class AcquirerProtocolParameters2 {

    @XmlElement(name = "FinCaptr", required = true)
    @XmlSchemaType(name = "string")
    protected FinancialCapture1Code finCaptr;
    @XmlElement(name = "BtchTrf")
    protected ExchangeConfiguration1 btchTrf;
    @XmlElement(name = "CmpltnXchg")
    protected ExchangeConfiguration1 cmpltnXchg;

    /**
     * Gets the value of the finCaptr property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialCapture1Code }
     *     
     */
    public FinancialCapture1Code getFinCaptr() {
        return finCaptr;
    }

    /**
     * Sets the value of the finCaptr property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialCapture1Code }
     *     
     */
    public AcquirerProtocolParameters2 setFinCaptr(FinancialCapture1Code value) {
        this.finCaptr = value;
        return this;
    }

    /**
     * Gets the value of the btchTrf property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeConfiguration1 }
     *     
     */
    public ExchangeConfiguration1 getBtchTrf() {
        return btchTrf;
    }

    /**
     * Sets the value of the btchTrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeConfiguration1 }
     *     
     */
    public AcquirerProtocolParameters2 setBtchTrf(ExchangeConfiguration1 value) {
        this.btchTrf = value;
        return this;
    }

    /**
     * Gets the value of the cmpltnXchg property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeConfiguration1 }
     *     
     */
    public ExchangeConfiguration1 getCmpltnXchg() {
        return cmpltnXchg;
    }

    /**
     * Sets the value of the cmpltnXchg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeConfiguration1 }
     *     
     */
    public AcquirerProtocolParameters2 setCmpltnXchg(ExchangeConfiguration1 value) {
        this.cmpltnXchg = value;
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
