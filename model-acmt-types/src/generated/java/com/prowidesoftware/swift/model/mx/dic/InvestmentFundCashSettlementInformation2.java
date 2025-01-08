
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
@XmlType(name = "InvestmentFundCashSettlementInformation2", propOrder = {
    "modScpIndctn",
    "sbcptPmtInstrm",
    "redPmtInstrm",
    "dvddPmtInstrm",
    "svgsPlanPmtInstrm"
})
public class InvestmentFundCashSettlementInformation2 {

    @XmlElement(name = "ModScpIndctn", required = true)
    @XmlSchemaType(name = "string")
    protected DataModification2Code modScpIndctn;
    @XmlElement(name = "SbcptPmtInstrm")
    protected PaymentInstrument7 sbcptPmtInstrm;
    @XmlElement(name = "RedPmtInstrm")
    protected PaymentInstrument6 redPmtInstrm;
    @XmlElement(name = "DvddPmtInstrm")
    protected PaymentInstrument6 dvddPmtInstrm;
    @XmlElement(name = "SvgsPlanPmtInstrm")
    protected PaymentInstrument7 svgsPlanPmtInstrm;

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
    public InvestmentFundCashSettlementInformation2 setModScpIndctn(DataModification2Code value) {
        this.modScpIndctn = value;
        return this;
    }

    /**
     * Gets the value of the sbcptPmtInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrument7 }
     *     
     */
    public PaymentInstrument7 getSbcptPmtInstrm() {
        return sbcptPmtInstrm;
    }

    /**
     * Sets the value of the sbcptPmtInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrument7 }
     *     
     */
    public InvestmentFundCashSettlementInformation2 setSbcptPmtInstrm(PaymentInstrument7 value) {
        this.sbcptPmtInstrm = value;
        return this;
    }

    /**
     * Gets the value of the redPmtInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrument6 }
     *     
     */
    public PaymentInstrument6 getRedPmtInstrm() {
        return redPmtInstrm;
    }

    /**
     * Sets the value of the redPmtInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrument6 }
     *     
     */
    public InvestmentFundCashSettlementInformation2 setRedPmtInstrm(PaymentInstrument6 value) {
        this.redPmtInstrm = value;
        return this;
    }

    /**
     * Gets the value of the dvddPmtInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrument6 }
     *     
     */
    public PaymentInstrument6 getDvddPmtInstrm() {
        return dvddPmtInstrm;
    }

    /**
     * Sets the value of the dvddPmtInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrument6 }
     *     
     */
    public InvestmentFundCashSettlementInformation2 setDvddPmtInstrm(PaymentInstrument6 value) {
        this.dvddPmtInstrm = value;
        return this;
    }

    /**
     * Gets the value of the svgsPlanPmtInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrument7 }
     *     
     */
    public PaymentInstrument7 getSvgsPlanPmtInstrm() {
        return svgsPlanPmtInstrm;
    }

    /**
     * Sets the value of the svgsPlanPmtInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrument7 }
     *     
     */
    public InvestmentFundCashSettlementInformation2 setSvgsPlanPmtInstrm(PaymentInstrument7 value) {
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
