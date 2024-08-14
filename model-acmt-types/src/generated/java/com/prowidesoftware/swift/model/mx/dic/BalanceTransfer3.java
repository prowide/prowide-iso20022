
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
 * Information that enables any payments made in connection with the fulfilment of an account switch to be reconciled by the relevant account servicer with the associated request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceTransfer3", propOrder = {
    "balTrfRef",
    "balTrfMtd",
    "balTrfFndgLmt"
})
public class BalanceTransfer3 {

    @XmlElement(name = "BalTrfRef")
    protected BalanceTransferReference1 balTrfRef;
    @XmlElement(name = "BalTrfMtd")
    protected SettlementMethod3Choice balTrfMtd;
    @XmlElement(name = "BalTrfFndgLmt")
    protected BalanceTransferFundingLimit1 balTrfFndgLmt;

    /**
     * Gets the value of the balTrfRef property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceTransferReference1 }
     *     
     */
    public BalanceTransferReference1 getBalTrfRef() {
        return balTrfRef;
    }

    /**
     * Sets the value of the balTrfRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceTransferReference1 }
     *     
     */
    public BalanceTransfer3 setBalTrfRef(BalanceTransferReference1 value) {
        this.balTrfRef = value;
        return this;
    }

    /**
     * Gets the value of the balTrfMtd property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementMethod3Choice }
     *     
     */
    public SettlementMethod3Choice getBalTrfMtd() {
        return balTrfMtd;
    }

    /**
     * Sets the value of the balTrfMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementMethod3Choice }
     *     
     */
    public BalanceTransfer3 setBalTrfMtd(SettlementMethod3Choice value) {
        this.balTrfMtd = value;
        return this;
    }

    /**
     * Gets the value of the balTrfFndgLmt property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceTransferFundingLimit1 }
     *     
     */
    public BalanceTransferFundingLimit1 getBalTrfFndgLmt() {
        return balTrfFndgLmt;
    }

    /**
     * Sets the value of the balTrfFndgLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceTransferFundingLimit1 }
     *     
     */
    public BalanceTransfer3 setBalTrfFndgLmt(BalanceTransferFundingLimit1 value) {
        this.balTrfFndgLmt = value;
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
