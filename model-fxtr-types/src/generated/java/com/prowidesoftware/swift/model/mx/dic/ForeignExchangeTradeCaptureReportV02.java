
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "ForeignExchangeTradeCaptureReportV02", propOrder = {
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
public class ForeignExchangeTradeCaptureReportV02 {

    @XmlElement(name = "Hdr", required = true)
    protected Header23 hdr;
    @XmlElement(name = "RptId")
    protected MessageIdentification1 rptId;
    @XmlElement(name = "TradgSdId")
    protected TradePartyIdentification9 tradgSdId;
    @XmlElement(name = "CtrPtySdId")
    protected TradePartyIdentification9 ctrPtySdId;
    @XmlElement(name = "TradDtl")
    protected Trade7 tradDtl;
    @XmlElement(name = "Ref")
    protected AdditionalReferences2 ref;
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
    public ForeignExchangeTradeCaptureReportV02 setHdr(Header23 value) {
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
    public ForeignExchangeTradeCaptureReportV02 setRptId(MessageIdentification1 value) {
        this.rptId = value;
        return this;
    }

    /**
     * Gets the value of the tradgSdId property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentification9 }
     *     
     */
    public TradePartyIdentification9 getTradgSdId() {
        return tradgSdId;
    }

    /**
     * Sets the value of the tradgSdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentification9 }
     *     
     */
    public ForeignExchangeTradeCaptureReportV02 setTradgSdId(TradePartyIdentification9 value) {
        this.tradgSdId = value;
        return this;
    }

    /**
     * Gets the value of the ctrPtySdId property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentification9 }
     *     
     */
    public TradePartyIdentification9 getCtrPtySdId() {
        return ctrPtySdId;
    }

    /**
     * Sets the value of the ctrPtySdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentification9 }
     *     
     */
    public ForeignExchangeTradeCaptureReportV02 setCtrPtySdId(TradePartyIdentification9 value) {
        this.ctrPtySdId = value;
        return this;
    }

    /**
     * Gets the value of the tradDtl property.
     * 
     * @return
     *     possible object is
     *     {@link Trade7 }
     *     
     */
    public Trade7 getTradDtl() {
        return tradDtl;
    }

    /**
     * Sets the value of the tradDtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trade7 }
     *     
     */
    public ForeignExchangeTradeCaptureReportV02 setTradDtl(Trade7 value) {
        this.tradDtl = value;
        return this;
    }

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReferences2 }
     *     
     */
    public AdditionalReferences2 getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReferences2 }
     *     
     */
    public ForeignExchangeTradeCaptureReportV02 setRef(AdditionalReferences2 value) {
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
    public ForeignExchangeTradeCaptureReportV02 setReqRspndr(boolean value) {
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
    public ForeignExchangeTradeCaptureReportV02 setReqRjctd(Boolean value) {
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
    public ForeignExchangeTradeCaptureReportV02 setQryRjctRsn(String value) {
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
    public ForeignExchangeTradeCaptureReportV02 setTtlNbTrds(BigDecimal value) {
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
    public ForeignExchangeTradeCaptureReportV02 setLastRptReqd(Boolean value) {
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
    public ForeignExchangeTradeCaptureReportV02 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
