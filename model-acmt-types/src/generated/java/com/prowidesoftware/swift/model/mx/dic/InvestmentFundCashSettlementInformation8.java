
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Settlement instructions to be used to transfer cash from the debtor to the creditor.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentFundCashSettlementInformation8", propOrder = {
    "modScpIndctn",
    "sbcptPmtInstrm",
    "redPmtInstrm",
    "dvddPmtInstrm",
    "svgsPlanPmtInstrm",
    "intrstPmtInstrm"
})
public class InvestmentFundCashSettlementInformation8 {

    @XmlElement(name = "ModScpIndctn", required = true)
    @XmlSchemaType(name = "string")
    protected DataModification2Code modScpIndctn;
    @XmlElement(name = "SbcptPmtInstrm")
    protected PaymentInstrument11 sbcptPmtInstrm;
    @XmlElement(name = "RedPmtInstrm")
    protected PaymentInstrument12 redPmtInstrm;
    @XmlElement(name = "DvddPmtInstrm")
    protected PaymentInstrument12 dvddPmtInstrm;
    @XmlElement(name = "SvgsPlanPmtInstrm")
    protected PaymentInstrument11 svgsPlanPmtInstrm;
    @XmlElement(name = "IntrstPmtInstrm")
    protected PaymentInstrument12 intrstPmtInstrm;

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
    public InvestmentFundCashSettlementInformation8 setModScpIndctn(DataModification2Code value) {
        this.modScpIndctn = value;
        return this;
    }

    /**
     * Gets the value of the sbcptPmtInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrument11 }
     *     
     */
    public PaymentInstrument11 getSbcptPmtInstrm() {
        return sbcptPmtInstrm;
    }

    /**
     * Sets the value of the sbcptPmtInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrument11 }
     *     
     */
    public InvestmentFundCashSettlementInformation8 setSbcptPmtInstrm(PaymentInstrument11 value) {
        this.sbcptPmtInstrm = value;
        return this;
    }

    /**
     * Gets the value of the redPmtInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrument12 }
     *     
     */
    public PaymentInstrument12 getRedPmtInstrm() {
        return redPmtInstrm;
    }

    /**
     * Sets the value of the redPmtInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrument12 }
     *     
     */
    public InvestmentFundCashSettlementInformation8 setRedPmtInstrm(PaymentInstrument12 value) {
        this.redPmtInstrm = value;
        return this;
    }

    /**
     * Gets the value of the dvddPmtInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrument12 }
     *     
     */
    public PaymentInstrument12 getDvddPmtInstrm() {
        return dvddPmtInstrm;
    }

    /**
     * Sets the value of the dvddPmtInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrument12 }
     *     
     */
    public InvestmentFundCashSettlementInformation8 setDvddPmtInstrm(PaymentInstrument12 value) {
        this.dvddPmtInstrm = value;
        return this;
    }

    /**
     * Gets the value of the svgsPlanPmtInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrument11 }
     *     
     */
    public PaymentInstrument11 getSvgsPlanPmtInstrm() {
        return svgsPlanPmtInstrm;
    }

    /**
     * Sets the value of the svgsPlanPmtInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrument11 }
     *     
     */
    public InvestmentFundCashSettlementInformation8 setSvgsPlanPmtInstrm(PaymentInstrument11 value) {
        this.svgsPlanPmtInstrm = value;
        return this;
    }

    /**
     * Gets the value of the intrstPmtInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrument12 }
     *     
     */
    public PaymentInstrument12 getIntrstPmtInstrm() {
        return intrstPmtInstrm;
    }

    /**
     * Sets the value of the intrstPmtInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrument12 }
     *     
     */
    public InvestmentFundCashSettlementInformation8 setIntrstPmtInstrm(PaymentInstrument12 value) {
        this.intrstPmtInstrm = value;
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
