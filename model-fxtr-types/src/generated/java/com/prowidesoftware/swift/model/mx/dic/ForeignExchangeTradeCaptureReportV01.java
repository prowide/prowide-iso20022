
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * The ForeignExchangeTradeCaptureReport message is sent by a trading system to a participant for notification and providing details of a treasury trade.
 * Usage
 * The report is sent by the trading system to the two trading parties after their trade has been executed. 
 * The report can also be sent by the trading system to a trading parties to respond their inquiry (TradeCaptureRequest). 
 * Note that multiple reports can be sent to respond one inquiry message.
 * The message may contains trade details and trading parties' information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForeignExchangeTradeCaptureReportV01", propOrder = {
    "hdr",
    "rptId",
    "tradgSdId",
    "ctrPtySdId",
    "tradDtl",
    "ref",
    "reqRspndr",
    "reqRjctd",
    "qryRjctRsn",
    "ttlNbTrds",
    "lastRptReqd",
    "splmtryData"
})
public class ForeignExchangeTradeCaptureReportV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header23 hdr;
    @XmlElement(name = "RptId")
    protected MessageIdentification1 rptId;
    @XmlElement(name = "TradgSdId")
    protected TradePartyIdentification7 tradgSdId;
    @XmlElement(name = "CtrPtySdId")
    protected TradePartyIdentification7 ctrPtySdId;
    @XmlElement(name = "TradDtl")
    protected Trade1 tradDtl;
    @XmlElement(name = "Ref")
    protected AdditionalReferences ref;
    @XmlElement(name = "ReqRspndr")
    protected boolean reqRspndr;
    @XmlElement(name = "ReqRjctd")
    protected Boolean reqRjctd;
    @XmlElement(name = "QryRjctRsn")
    protected String qryRjctRsn;
    @XmlElement(name = "TtlNbTrds")
    protected BigDecimal ttlNbTrds;
    @XmlElement(name = "LastRptReqd")
    protected Boolean lastRptReqd;
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
    public ForeignExchangeTradeCaptureReportV01 setHdr(Header23 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the rptId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getRptId() {
        return rptId;
    }

    /**
     * Sets the value of the rptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public ForeignExchangeTradeCaptureReportV01 setRptId(MessageIdentification1 value) {
        this.rptId = value;
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
    public ForeignExchangeTradeCaptureReportV01 setTradgSdId(TradePartyIdentification7 value) {
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
    public ForeignExchangeTradeCaptureReportV01 setCtrPtySdId(TradePartyIdentification7 value) {
        this.ctrPtySdId = value;
        return this;
    }

    /**
     * Gets the value of the tradDtl property.
     * 
     * @return
     *     possible object is
     *     {@link Trade1 }
     *     
     */
    public Trade1 getTradDtl() {
        return tradDtl;
    }

    /**
     * Sets the value of the tradDtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trade1 }
     *     
     */
    public ForeignExchangeTradeCaptureReportV01 setTradDtl(Trade1 value) {
        this.tradDtl = value;
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
    public ForeignExchangeTradeCaptureReportV01 setRef(AdditionalReferences value) {
        this.ref = value;
        return this;
    }

    /**
     * Gets the value of the reqRspndr property.
     * 
     */
    public boolean isReqRspndr() {
        return reqRspndr;
    }

    /**
     * Sets the value of the reqRspndr property.
     * 
     */
    public ForeignExchangeTradeCaptureReportV01 setReqRspndr(boolean value) {
        this.reqRspndr = value;
        return this;
    }

    /**
     * Gets the value of the reqRjctd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReqRjctd() {
        return reqRjctd;
    }

    /**
     * Sets the value of the reqRjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ForeignExchangeTradeCaptureReportV01 setReqRjctd(Boolean value) {
        this.reqRjctd = value;
        return this;
    }

    /**
     * Gets the value of the qryRjctRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryRjctRsn() {
        return qryRjctRsn;
    }

    /**
     * Sets the value of the qryRjctRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ForeignExchangeTradeCaptureReportV01 setQryRjctRsn(String value) {
        this.qryRjctRsn = value;
        return this;
    }

    /**
     * Gets the value of the ttlNbTrds property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlNbTrds() {
        return ttlNbTrds;
    }

    /**
     * Sets the value of the ttlNbTrds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ForeignExchangeTradeCaptureReportV01 setTtlNbTrds(BigDecimal value) {
        this.ttlNbTrds = value;
        return this;
    }

    /**
     * Gets the value of the lastRptReqd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLastRptReqd() {
        return lastRptReqd;
    }

    /**
     * Sets the value of the lastRptReqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ForeignExchangeTradeCaptureReportV01 setLastRptReqd(Boolean value) {
        this.lastRptReqd = value;
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
    public ForeignExchangeTradeCaptureReportV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
