
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
 * Scope
 * An executing party, eg, a broker, sends the NonDisclosedBidResponse message to an instructing party, eg, an investment manager, to notify a bid based on the information provided in the NonDisclosedBidRequest message.
 * Usage
 * In the "Non disclosed" convention, the bidding process is done by exchanging the NonDisclosedBidRequest and the NonDisclosedBidResponse messages. The ListOrder message enumerates the financial instruments, the quantities and the direction for the trade. This message may contain pre-allocation information and is sent after the bidding process has been completed (by telephone or electronically).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonDisclosedBidResponse", propOrder = {
    "id",
    "bidDtls1",
    "tradgSsnDtls",
    "sttlmDtls"
})
public class NonDisclosedBidResponse {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification11 id;
    @XmlElement(name = "BidDtls1", required = true)
    protected Bid3 bidDtls1;
    @XmlElement(name = "TradgSsnDtls")
    protected TradingSession1 tradgSsnDtls;
    @XmlElement(name = "SttlmDtls")
    protected SecuritiesSettlement2 sttlmDtls;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification11 }
     *     
     */
    public DocumentIdentification11 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification11 }
     *     
     */
    public NonDisclosedBidResponse setId(DocumentIdentification11 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the bidDtls1 property.
     * 
     * @return
     *     possible object is
     *     {@link Bid3 }
     *     
     */
    public Bid3 getBidDtls1() {
        return bidDtls1;
    }

    /**
     * Sets the value of the bidDtls1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bid3 }
     *     
     */
    public NonDisclosedBidResponse setBidDtls1(Bid3 value) {
        this.bidDtls1 = value;
        return this;
    }

    /**
     * Gets the value of the tradgSsnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TradingSession1 }
     *     
     */
    public TradingSession1 getTradgSsnDtls() {
        return tradgSsnDtls;
    }

    /**
     * Sets the value of the tradgSsnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingSession1 }
     *     
     */
    public NonDisclosedBidResponse setTradgSsnDtls(TradingSession1 value) {
        this.tradgSsnDtls = value;
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
    public NonDisclosedBidResponse setSttlmDtls(SecuritiesSettlement2 value) {
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
