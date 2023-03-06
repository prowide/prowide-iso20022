
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
 * Scope
 * The ForeignExchangeTradeConfirmationRequestAmendmentRequest message is sent from a market participant to a Central matching utility (CMU) to amend the ForeignExchangeTradeConfirmationRequest previously sent.
 * 
 * Usage
 * The request is sent by the market participants to the CMU after the confirmation is requested.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForeignExchangeTradeConfirmationRequestAmendmentRequestV01", propOrder = {
    "hdr",
    "amdmntReqId",
    "tradgSdId",
    "ctrPtySdId",
    "tradDtl",
    "qryPrd",
    "qryStartNb",
    "qryTradSts",
    "splmtryData"
})
public class ForeignExchangeTradeConfirmationRequestAmendmentRequestV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header23 hdr;
    @XmlElement(name = "AmdmntReqId", required = true)
    protected MessageIdentification1 amdmntReqId;
    @XmlElement(name = "TradgSdId")
    protected TradePartyIdentification7 tradgSdId;
    @XmlElement(name = "CtrPtySdId")
    protected TradePartyIdentification7 ctrPtySdId;
    @XmlElement(name = "TradDtl", required = true)
    protected Trade2 tradDtl;
    @XmlElement(name = "QryPrd", required = true)
    protected Period4 qryPrd;
    @XmlElement(name = "QryStartNb", required = true)
    protected String qryStartNb;
    @XmlElement(name = "QryTradSts", required = true)
    @XmlSchemaType(name = "string")
    protected QueryTradeStatus1Code qryTradSts;
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
    public ForeignExchangeTradeConfirmationRequestAmendmentRequestV01 setHdr(Header23 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the amdmntReqId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getAmdmntReqId() {
        return amdmntReqId;
    }

    /**
     * Sets the value of the amdmntReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public ForeignExchangeTradeConfirmationRequestAmendmentRequestV01 setAmdmntReqId(MessageIdentification1 value) {
        this.amdmntReqId = value;
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
    public ForeignExchangeTradeConfirmationRequestAmendmentRequestV01 setTradgSdId(TradePartyIdentification7 value) {
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
    public ForeignExchangeTradeConfirmationRequestAmendmentRequestV01 setCtrPtySdId(TradePartyIdentification7 value) {
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
    public ForeignExchangeTradeConfirmationRequestAmendmentRequestV01 setTradDtl(Trade2 value) {
        this.tradDtl = value;
        return this;
    }

    /**
     * Gets the value of the qryPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period4 }
     *     
     */
    public Period4 getQryPrd() {
        return qryPrd;
    }

    /**
     * Sets the value of the qryPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period4 }
     *     
     */
    public ForeignExchangeTradeConfirmationRequestAmendmentRequestV01 setQryPrd(Period4 value) {
        this.qryPrd = value;
        return this;
    }

    /**
     * Gets the value of the qryStartNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryStartNb() {
        return qryStartNb;
    }

    /**
     * Sets the value of the qryStartNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ForeignExchangeTradeConfirmationRequestAmendmentRequestV01 setQryStartNb(String value) {
        this.qryStartNb = value;
        return this;
    }

    /**
     * Gets the value of the qryTradSts property.
     * 
     * @return
     *     possible object is
     *     {@link QueryTradeStatus1Code }
     *     
     */
    public QueryTradeStatus1Code getQryTradSts() {
        return qryTradSts;
    }

    /**
     * Sets the value of the qryTradSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryTradeStatus1Code }
     *     
     */
    public ForeignExchangeTradeConfirmationRequestAmendmentRequestV01 setQryTradSts(QueryTradeStatus1Code value) {
        this.qryTradSts = value;
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
    public ForeignExchangeTradeConfirmationRequestAmendmentRequestV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
