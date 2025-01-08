
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
 * List trading by which the buy-side details the exact stocks and sizes to be traded and the sell-side offers the buy-side a two-way price, to buy or to sell the indicated stocks. All sell-side firms see all of the stocks and quantities in the portfolio during the bidding phase regardless of whether or not they win the business.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisclosedBid1", propOrder = {
    "sd",
    "grssInd",
    "listId",
    "tradgSsn",
    "biddgAcct",
    "sttlmDtls"
})
public class DisclosedBid1 {

    @XmlElement(name = "Sd")
    @XmlSchemaType(name = "string")
    protected Side1Code sd;
    @XmlElement(name = "GrssInd")
    protected boolean grssInd;
    @XmlElement(name = "ListId")
    protected String listId;
    @XmlElement(name = "TradgSsn")
    protected TradingSession1 tradgSsn;
    @XmlElement(name = "BiddgAcct")
    protected SecuritiesAccount2 biddgAcct;
    @XmlElement(name = "SttlmDtls")
    protected SecuritiesSettlement2 sttlmDtls;

    /**
     * Gets the value of the sd property.
     * 
     * @return
     *     possible object is
     *     {@link Side1Code }
     *     
     */
    public Side1Code getSd() {
        return sd;
    }

    /**
     * Sets the value of the sd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Side1Code }
     *     
     */
    public DisclosedBid1 setSd(Side1Code value) {
        this.sd = value;
        return this;
    }

    /**
     * Gets the value of the grssInd property.
     * 
     */
    public boolean isGrssInd() {
        return grssInd;
    }

    /**
     * Sets the value of the grssInd property.
     * 
     */
    public DisclosedBid1 setGrssInd(boolean value) {
        this.grssInd = value;
        return this;
    }

    /**
     * Gets the value of the listId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListId() {
        return listId;
    }

    /**
     * Sets the value of the listId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DisclosedBid1 setListId(String value) {
        this.listId = value;
        return this;
    }

    /**
     * Gets the value of the tradgSsn property.
     * 
     * @return
     *     possible object is
     *     {@link TradingSession1 }
     *     
     */
    public TradingSession1 getTradgSsn() {
        return tradgSsn;
    }

    /**
     * Sets the value of the tradgSsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingSession1 }
     *     
     */
    public DisclosedBid1 setTradgSsn(TradingSession1 value) {
        this.tradgSsn = value;
        return this;
    }

    /**
     * Gets the value of the biddgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount2 }
     *     
     */
    public SecuritiesAccount2 getBiddgAcct() {
        return biddgAcct;
    }

    /**
     * Sets the value of the biddgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount2 }
     *     
     */
    public DisclosedBid1 setBiddgAcct(SecuritiesAccount2 value) {
        this.biddgAcct = value;
        return this;
    }

    /**
     * Gets the value of the sttlmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlement2 }
     *     
     */
    public SecuritiesSettlement2 getSttlmDtls() {
        return sttlmDtls;
    }

    /**
     * Sets the value of the sttlmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlement2 }
     *     
     */
    public DisclosedBid1 setSttlmDtls(SecuritiesSettlement2 value) {
        this.sttlmDtls = value;
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
