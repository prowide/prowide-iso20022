
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Transaction totals during the reconciliation period, for a certain type of transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyTransactionTotals1", propOrder = {
    "poiGrpId",
    "lltyUnit",
    "cardPdctPrfl",
    "ccy",
    "txTp",
    "ttlNb",
    "cmltvAmt",
    "dtldAmt"
})
public class LoyaltyTransactionTotals1 {

    @XmlElement(name = "POIGrpId")
    protected String poiGrpId;
    @XmlElement(name = "LltyUnit")
    @XmlSchemaType(name = "string")
    protected AmountUnit1Code lltyUnit;
    @XmlElement(name = "CardPdctPrfl")
    protected String cardPdctPrfl;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "TxTp", required = true)
    @XmlSchemaType(name = "string")
    protected LoyaltyTypeTransactionTotals1Code txTp;
    @XmlElement(name = "TtlNb", required = true)
    protected BigDecimal ttlNb;
    @XmlElement(name = "CmltvAmt", required = true)
    protected BigDecimal cmltvAmt;
    @XmlElement(name = "DtldAmt")
    protected DetailedAmount15 dtldAmt;

    /**
     * Gets the value of the poiGrpId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOIGrpId() {
        return poiGrpId;
    }

    /**
     * Sets the value of the poiGrpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoyaltyTransactionTotals1 setPOIGrpId(String value) {
        this.poiGrpId = value;
        return this;
    }

    /**
     * Gets the value of the lltyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link AmountUnit1Code }
     *     
     */
    public AmountUnit1Code getLltyUnit() {
        return lltyUnit;
    }

    /**
     * Sets the value of the lltyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountUnit1Code }
     *     
     */
    public LoyaltyTransactionTotals1 setLltyUnit(AmountUnit1Code value) {
        this.lltyUnit = value;
        return this;
    }

    /**
     * Gets the value of the cardPdctPrfl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardPdctPrfl() {
        return cardPdctPrfl;
    }

    /**
     * Sets the value of the cardPdctPrfl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoyaltyTransactionTotals1 setCardPdctPrfl(String value) {
        this.cardPdctPrfl = value;
        return this;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoyaltyTransactionTotals1 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the txTp property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyTypeTransactionTotals1Code }
     *     
     */
    public LoyaltyTypeTransactionTotals1Code getTxTp() {
        return txTp;
    }

    /**
     * Sets the value of the txTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyTypeTransactionTotals1Code }
     *     
     */
    public LoyaltyTransactionTotals1 setTxTp(LoyaltyTypeTransactionTotals1Code value) {
        this.txTp = value;
        return this;
    }

    /**
     * Gets the value of the ttlNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlNb() {
        return ttlNb;
    }

    /**
     * Sets the value of the ttlNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public LoyaltyTransactionTotals1 setTtlNb(BigDecimal value) {
        this.ttlNb = value;
        return this;
    }

    /**
     * Gets the value of the cmltvAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCmltvAmt() {
        return cmltvAmt;
    }

    /**
     * Sets the value of the cmltvAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public LoyaltyTransactionTotals1 setCmltvAmt(BigDecimal value) {
        this.cmltvAmt = value;
        return this;
    }

    /**
     * Gets the value of the dtldAmt property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedAmount15 }
     *     
     */
    public DetailedAmount15 getDtldAmt() {
        return dtldAmt;
    }

    /**
     * Sets the value of the dtldAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedAmount15 }
     *     
     */
    public LoyaltyTransactionTotals1 setDtldAmt(DetailedAmount15 value) {
        this.dtldAmt = value;
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
