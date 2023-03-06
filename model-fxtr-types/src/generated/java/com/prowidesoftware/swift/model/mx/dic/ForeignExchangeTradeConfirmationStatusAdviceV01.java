
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
 * The ForeignExchageTradeConfirmationStatusAdvice message is sent from a Central matching utility (CMU) to a market participant to advise the matching status of the trade. 
 * 
 * Usage
 * The confirmation status advice is sent by the CMU to the market participants after they received the confirmation request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForeignExchangeTradeConfirmationStatusAdviceV01", propOrder = {
    "hdr",
    "advcId",
    "tradgSdId",
    "ctrPtySdId",
    "tradDtl",
    "confInf",
    "ref",
    "splmtryData"
})
public class ForeignExchangeTradeConfirmationStatusAdviceV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header23 hdr;
    @XmlElement(name = "AdvcId")
    protected MessageIdentification1 advcId;
    @XmlElement(name = "TradgSdId", required = true)
    protected TradePartyIdentification7 tradgSdId;
    @XmlElement(name = "CtrPtySdId", required = true)
    protected TradePartyIdentification7 ctrPtySdId;
    @XmlElement(name = "TradDtl", required = true)
    protected Trade2 tradDtl;
    @XmlElement(name = "ConfInf", required = true)
    protected Confirmation1 confInf;
    @XmlElement(name = "Ref")
    protected AdditionalReferences ref;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header23 }
     *     
     */
    public Header23 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header23 }
     *     
     */
    public ForeignExchangeTradeConfirmationStatusAdviceV01 setHdr(Header23 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the advcId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getAdvcId() {
        return advcId;
    }

    /**
     * Sets the value of the advcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public ForeignExchangeTradeConfirmationStatusAdviceV01 setAdvcId(MessageIdentification1 value) {
        this.advcId = value;
        return this;
    }

    /**
     * Gets the value of the tradgSdId property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentification7 }
     *     
     */
    public TradePartyIdentification7 getTradgSdId() {
        return tradgSdId;
    }

    /**
     * Sets the value of the tradgSdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentification7 }
     *     
     */
    public ForeignExchangeTradeConfirmationStatusAdviceV01 setTradgSdId(TradePartyIdentification7 value) {
        this.tradgSdId = value;
        return this;
    }

    /**
     * Gets the value of the ctrPtySdId property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentification7 }
     *     
     */
    public TradePartyIdentification7 getCtrPtySdId() {
        return ctrPtySdId;
    }

    /**
     * Sets the value of the ctrPtySdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentification7 }
     *     
     */
    public ForeignExchangeTradeConfirmationStatusAdviceV01 setCtrPtySdId(TradePartyIdentification7 value) {
        this.ctrPtySdId = value;
        return this;
    }

    /**
     * Gets the value of the tradDtl property.
     * 
     * @return
     *     possible object is
     *     {@link Trade2 }
     *     
     */
    public Trade2 getTradDtl() {
        return tradDtl;
    }

    /**
     * Sets the value of the tradDtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trade2 }
     *     
     */
    public ForeignExchangeTradeConfirmationStatusAdviceV01 setTradDtl(Trade2 value) {
        this.tradDtl = value;
        return this;
    }

    /**
     * Gets the value of the confInf property.
     * 
     * @return
     *     possible object is
     *     {@link Confirmation1 }
     *     
     */
    public Confirmation1 getConfInf() {
        return confInf;
    }

    /**
     * Sets the value of the confInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Confirmation1 }
     *     
     */
    public ForeignExchangeTradeConfirmationStatusAdviceV01 setConfInf(Confirmation1 value) {
        this.confInf = value;
        return this;
    }

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReferences }
     *     
     */
    public AdditionalReferences getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReferences }
     *     
     */
    public ForeignExchangeTradeConfirmationStatusAdviceV01 setRef(AdditionalReferences value) {
        this.ref = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
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

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public ForeignExchangeTradeConfirmationStatusAdviceV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
