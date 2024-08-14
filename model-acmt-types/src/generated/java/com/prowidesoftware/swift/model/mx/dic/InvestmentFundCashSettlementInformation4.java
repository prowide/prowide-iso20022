
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
 * Settlement instructions to be used to transfer cash from the Debtor to the Creditor.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentFundCashSettlementInformation4", propOrder = {
    "modScpIndctn",
    "sbcptPmtInstrm",
    "redPmtInstrm",
    "dvddPmtInstrm",
    "svgsPlanPmtInstrm"
})
public class InvestmentFundCashSettlementInformation4 {

    @XmlElement(name = "ModScpIndctn", required = true)
    @XmlSchemaType(name = "string")
    protected DataModification2Code modScpIndctn;
    @XmlElement(name = "SbcptPmtInstrm")
    protected PaymentInstrument8 sbcptPmtInstrm;
    @XmlElement(name = "RedPmtInstrm")
    protected PaymentInstrument9 redPmtInstrm;
    @XmlElement(name = "DvddPmtInstrm")
    protected PaymentInstrument9 dvddPmtInstrm;
    @XmlElement(name = "SvgsPlanPmtInstrm")
    protected PaymentInstrument8 svgsPlanPmtInstrm;

    /**
     * Gets the value of the modScpIndctn property.
     * 
     * @return
     *     possible object is
     *     {@link DataModification2Code }
     *     
     */
    public DataModification2Code getModScpIndctn() {
        return modScpIndctn;
    }

    /**
     * Sets the value of the modScpIndctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataModification2Code }
     *     
     */
    public InvestmentFundCashSettlementInformation4 setModScpIndctn(DataModification2Code value) {
        this.modScpIndctn = value;
        return this;
    }

    /**
     * Gets the value of the sbcptPmtInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrument8 }
     *     
     */
    public PaymentInstrument8 getSbcptPmtInstrm() {
        return sbcptPmtInstrm;
    }

    /**
     * Sets the value of the sbcptPmtInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrument8 }
     *     
     */
    public InvestmentFundCashSettlementInformation4 setSbcptPmtInstrm(PaymentInstrument8 value) {
        this.sbcptPmtInstrm = value;
        return this;
    }

    /**
     * Gets the value of the redPmtInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrument9 }
     *     
     */
    public PaymentInstrument9 getRedPmtInstrm() {
        return redPmtInstrm;
    }

    /**
     * Sets the value of the redPmtInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrument9 }
     *     
     */
    public InvestmentFundCashSettlementInformation4 setRedPmtInstrm(PaymentInstrument9 value) {
        this.redPmtInstrm = value;
        return this;
    }

    /**
     * Gets the value of the dvddPmtInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrument9 }
     *     
     */
    public PaymentInstrument9 getDvddPmtInstrm() {
        return dvddPmtInstrm;
    }

    /**
     * Sets the value of the dvddPmtInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrument9 }
     *     
     */
    public InvestmentFundCashSettlementInformation4 setDvddPmtInstrm(PaymentInstrument9 value) {
        this.dvddPmtInstrm = value;
        return this;
    }

    /**
     * Gets the value of the svgsPlanPmtInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrument8 }
     *     
     */
    public PaymentInstrument8 getSvgsPlanPmtInstrm() {
        return svgsPlanPmtInstrm;
    }

    /**
     * Sets the value of the svgsPlanPmtInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrument8 }
     *     
     */
    public InvestmentFundCashSettlementInformation4 setSvgsPlanPmtInstrm(PaymentInstrument8 value) {
        this.svgsPlanPmtInstrm = value;
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
