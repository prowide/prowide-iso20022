
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
 * Execution of the redemption part, in a switch between investment funds or investment fund classes.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwitchExecutionRedemptionLeg4", propOrder = {
    "legExctnId",
    "legId",
    "invstmtAcctDtls",
    "finInstrmDtls",
    "finInstrmQty"
})
public class SwitchExecutionRedemptionLeg4 {

    @XmlElement(name = "LegExctnId")
    protected String legExctnId;
    @XmlElement(name = "LegId")
    protected String legId;
    @XmlElement(name = "InvstmtAcctDtls")
    protected InvestmentAccount30 invstmtAcctDtls;
    @XmlElement(name = "FinInstrmDtls")
    protected FinancialInstrument18 finInstrmDtls;
    @XmlElement(name = "FinInstrmQty")
    protected FinancialInstrumentQuantity3 finInstrmQty;

    /**
     * Gets the value of the legExctnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegExctnId() {
        return legExctnId;
    }

    /**
     * Sets the value of the legExctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwitchExecutionRedemptionLeg4 setLegExctnId(String value) {
        this.legExctnId = value;
        return this;
    }

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
    public SwitchExecutionRedemptionLeg4 setLegId(String value) {
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
    public SwitchExecutionRedemptionLeg4 setInvstmtAcctDtls(InvestmentAccount30 value) {
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
    public SwitchExecutionRedemptionLeg4 setFinInstrmDtls(FinancialInstrument18 value) {
        this.finInstrmDtls = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity3 }
     *     
     */
    public FinancialInstrumentQuantity3 getFinInstrmQty() {
        return finInstrmQty;
    }

    /**
     * Sets the value of the finInstrmQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity3 }
     *     
     */
    public SwitchExecutionRedemptionLeg4 setFinInstrmQty(FinancialInstrumentQuantity3 value) {
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
