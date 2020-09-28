
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
@XmlType(name = "TransactionTotals2", propOrder = {
    "poiGrpId",
    "cardPdctPrfl",
    "ccy",
    "tp",
    "ttlNb",
    "cmltvAmt"
})
public class TransactionTotals2 {

    @XmlElement(name = "POIGrpId")
    protected String poiGrpId;
    @XmlElement(name = "CardPdctPrfl")
    protected String cardPdctPrfl;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected TypeTransactionTotals2Code tp;
    @XmlElement(name = "TtlNb", required = true)
    protected String ttlNb;
    @XmlElement(name = "CmltvAmt", required = true)
    protected BigDecimal cmltvAmt;

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
    public TransactionTotals2 setPOIGrpId(String value) {
        this.poiGrpId = value;
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
    public TransactionTotals2 setCardPdctPrfl(String value) {
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
    public TransactionTotals2 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTransactionTotals2Code }
     *     
     */
    public TypeTransactionTotals2Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTransactionTotals2Code }
     *     
     */
    public TransactionTotals2 setTp(TypeTransactionTotals2Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the ttlNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtlNb() {
        return ttlNb;
    }

    /**
     * Sets the value of the ttlNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionTotals2 setTtlNb(String value) {
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
    public TransactionTotals2 setCmltvAmt(BigDecimal value) {
        this.cmltvAmt = value;
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
