
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
 * Subscription leg, or switch-in, of a switch order.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwitchSubscriptionLegOrder4", propOrder = {
    "legId",
    "invstmtAcctDtls",
    "finInstrmDtls",
    "finInstrmQty"
})
public class SwitchSubscriptionLegOrder4 {

    @XmlElement(name = "LegId")
    protected String legId;
    @XmlElement(name = "InvstmtAcctDtls")
    protected InvestmentAccount30 invstmtAcctDtls;
    @XmlElement(name = "FinInstrmDtls")
    protected FinancialInstrument18 finInstrmDtls;
    @XmlElement(name = "FinInstrmQty")
    protected FinancialInstrumentQuantity13Choice finInstrmQty;

    /**
     * Gets the value of the legId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegId() {
        return legId;
    }

    /**
     * Sets the value of the legId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwitchSubscriptionLegOrder4 setLegId(String value) {
        this.legId = value;
        return this;
    }

    /**
     * Gets the value of the invstmtAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount30 }
     *     
     */
    public InvestmentAccount30 getInvstmtAcctDtls() {
        return invstmtAcctDtls;
    }

    /**
     * Sets the value of the invstmtAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount30 }
     *     
     */
    public SwitchSubscriptionLegOrder4 setInvstmtAcctDtls(InvestmentAccount30 value) {
        this.invstmtAcctDtls = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument18 }
     *     
     */
    public FinancialInstrument18 getFinInstrmDtls() {
        return finInstrmDtls;
    }

    /**
     * Sets the value of the finInstrmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument18 }
     *     
     */
    public SwitchSubscriptionLegOrder4 setFinInstrmDtls(FinancialInstrument18 value) {
        this.finInstrmDtls = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity13Choice }
     *     
     */
    public FinancialInstrumentQuantity13Choice getFinInstrmQty() {
        return finInstrmQty;
    }

    /**
     * Sets the value of the finInstrmQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity13Choice }
     *     
     */
    public SwitchSubscriptionLegOrder4 setFinInstrmQty(FinancialInstrumentQuantity13Choice value) {
        this.finInstrmQty = value;
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
