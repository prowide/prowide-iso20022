
package com.prowidesoftware.swift.model.mx.dic;

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
 * The ForeignExchangeTradeStatusAndDetails message is sent by a central system to the participant to provide notification of the status and details of a foreign exchange trade.
 * Usage
 * The notification is sent by a central settlement system to the two trading parties after it has received foreign exchange trade instructions from both.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForeignExchangeTradeStatusAndDetailsNotificationV06", propOrder = {
    "stsDtls",
    "tradInf",
    "tradgSdId",
    "ctrPtySdId",
    "tradAmts",
    "agrdRate",
    "ndfConds",
    "tradgSdSttlmInstrs",
    "ctrPtySdSttlmInstrs",
    "gnlInf",
    "spltTradInf",
    "rgltryRptg",
    "pstTradEvt",
    "splmtryData"
})
public class ForeignExchangeTradeStatusAndDetailsNotificationV06 {

    @XmlElement(name = "StsDtls", required = true)
    protected TradeData14 stsDtls;
    @XmlElement(name = "TradInf", required = true)
    protected TradeAgreement12 tradInf;
    @XmlElement(name = "TradgSdId", required = true)
    protected TradePartyIdentification8 tradgSdId;
    @XmlElement(name = "CtrPtySdId", required = true)
    protected TradePartyIdentification8 ctrPtySdId;
    @XmlElement(name = "TradAmts", required = true)
    protected AmountsAndValueDate8 tradAmts;
    @XmlElement(name = "AgrdRate", required = true)
    protected AgreedRate3 agrdRate;
    @XmlElement(name = "NDFConds")
    protected NonDeliverableForwardConditions2 ndfConds;
    @XmlElement(name = "TradgSdSttlmInstrs")
    protected SettlementParties120 tradgSdSttlmInstrs;
    @XmlElement(name = "CtrPtySdSttlmInstrs")
    protected SettlementParties120 ctrPtySdSttlmInstrs;
    @XmlElement(name = "GnlInf")
    protected GeneralInformation9 gnlInf;
    @XmlElement(name = "SpltTradInf")
    protected List<SplitTradeDetails5> spltTradInf;
    @XmlElement(name = "RgltryRptg")
    protected RegulatoryReporting8 rgltryRptg;
    @XmlElement(name = "PstTradEvt")
    protected PostTradeEvent1 pstTradEvt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the stsDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData14 }
     *     
     */
    public TradeData14 getStsDtls() {
        return stsDtls;
    }

    /**
     * Sets the value of the stsDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData14 }
     *     
     */
    public ForeignExchangeTradeStatusAndDetailsNotificationV06 setStsDtls(TradeData14 value) {
        this.stsDtls = value;
        return this;
    }

    /**
     * Gets the value of the tradInf property.
     * 
     * @return
     *     possible object is
     *     {@link TradeAgreement12 }
     *     
     */
    public TradeAgreement12 getTradInf() {
        return tradInf;
    }

    /**
     * Sets the value of the tradInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeAgreement12 }
     *     
     */
    public ForeignExchangeTradeStatusAndDetailsNotificationV06 setTradInf(TradeAgreement12 value) {
        this.tradInf = value;
        return this;
    }

    /**
     * Gets the value of the tradgSdId property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentification8 }
     *     
     */
    public TradePartyIdentification8 getTradgSdId() {
        return tradgSdId;
    }

    /**
     * Sets the value of the tradgSdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentification8 }
     *     
     */
    public ForeignExchangeTradeStatusAndDetailsNotificationV06 setTradgSdId(TradePartyIdentification8 value) {
        this.tradgSdId = value;
        return this;
    }

    /**
     * Gets the value of the ctrPtySdId property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentification8 }
     *     
     */
    public TradePartyIdentification8 getCtrPtySdId() {
        return ctrPtySdId;
    }

    /**
     * Sets the value of the ctrPtySdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentification8 }
     *     
     */
    public ForeignExchangeTradeStatusAndDetailsNotificationV06 setCtrPtySdId(TradePartyIdentification8 value) {
        this.ctrPtySdId = value;
        return this;
    }

    /**
     * Gets the value of the tradAmts property.
     * 
     * @return
     *     possible object is
     *     {@link AmountsAndValueDate8 }
     *     
     */
    public AmountsAndValueDate8 getTradAmts() {
        return tradAmts;
    }

    /**
     * Sets the value of the tradAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountsAndValueDate8 }
     *     
     */
    public ForeignExchangeTradeStatusAndDetailsNotificationV06 setTradAmts(AmountsAndValueDate8 value) {
        this.tradAmts = value;
        return this;
    }

    /**
     * Gets the value of the agrdRate property.
     * 
     * @return
     *     possible object is
     *     {@link AgreedRate3 }
     *     
     */
    public AgreedRate3 getAgrdRate() {
        return agrdRate;
    }

    /**
     * Sets the value of the agrdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreedRate3 }
     *     
     */
    public ForeignExchangeTradeStatusAndDetailsNotificationV06 setAgrdRate(AgreedRate3 value) {
        this.agrdRate = value;
        return this;
    }

    /**
     * Gets the value of the ndfConds property.
     * 
     * @return
     *     possible object is
     *     {@link NonDeliverableForwardConditions2 }
     *     
     */
    public NonDeliverableForwardConditions2 getNDFConds() {
        return ndfConds;
    }

    /**
     * Sets the value of the ndfConds property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonDeliverableForwardConditions2 }
     *     
     */
    public ForeignExchangeTradeStatusAndDetailsNotificationV06 setNDFConds(NonDeliverableForwardConditions2 value) {
        this.ndfConds = value;
        return this;
    }

    /**
     * Gets the value of the tradgSdSttlmInstrs property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties120 }
     *     
     */
    public SettlementParties120 getTradgSdSttlmInstrs() {
        return tradgSdSttlmInstrs;
    }

    /**
     * Sets the value of the tradgSdSttlmInstrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties120 }
     *     
     */
    public ForeignExchangeTradeStatusAndDetailsNotificationV06 setTradgSdSttlmInstrs(SettlementParties120 value) {
        this.tradgSdSttlmInstrs = value;
        return this;
    }

    /**
     * Gets the value of the ctrPtySdSttlmInstrs property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties120 }
     *     
     */
    public SettlementParties120 getCtrPtySdSttlmInstrs() {
        return ctrPtySdSttlmInstrs;
    }

    /**
     * Sets the value of the ctrPtySdSttlmInstrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties120 }
     *     
     */
    public ForeignExchangeTradeStatusAndDetailsNotificationV06 setCtrPtySdSttlmInstrs(SettlementParties120 value) {
        this.ctrPtySdSttlmInstrs = value;
        return this;
    }

    /**
     * Gets the value of the gnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralInformation9 }
     *     
     */
    public GeneralInformation9 getGnlInf() {
        return gnlInf;
    }

    /**
     * Sets the value of the gnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralInformation9 }
     *     
     */
    public ForeignExchangeTradeStatusAndDetailsNotificationV06 setGnlInf(GeneralInformation9 value) {
        this.gnlInf = value;
        return this;
    }

    /**
     * Gets the value of the spltTradInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spltTradInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpltTradInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SplitTradeDetails5 }
     * 
     * 
     */
    public List<SplitTradeDetails5> getSpltTradInf() {
        if (spltTradInf == null) {
            spltTradInf = new ArrayList<SplitTradeDetails5>();
        }
        return this.spltTradInf;
    }

    /**
     * Gets the value of the rgltryRptg property.
     * 
     * @return
     *     possible object is
     *     {@link RegulatoryReporting8 }
     *     
     */
    public RegulatoryReporting8 getRgltryRptg() {
        return rgltryRptg;
    }

    /**
     * Sets the value of the rgltryRptg property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulatoryReporting8 }
     *     
     */
    public ForeignExchangeTradeStatusAndDetailsNotificationV06 setRgltryRptg(RegulatoryReporting8 value) {
        this.rgltryRptg = value;
        return this;
    }

    /**
     * Gets the value of the pstTradEvt property.
     * 
     * @return
     *     possible object is
     *     {@link PostTradeEvent1 }
     *     
     */
    public PostTradeEvent1 getPstTradEvt() {
        return pstTradEvt;
    }

    /**
     * Sets the value of the pstTradEvt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostTradeEvent1 }
     *     
     */
    public ForeignExchangeTradeStatusAndDetailsNotificationV06 setPstTradEvt(PostTradeEvent1 value) {
        this.pstTradEvt = value;
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
     * Adds a new item to the spltTradInf list.
     * @see #getSpltTradInf()
     * 
     */
    public ForeignExchangeTradeStatusAndDetailsNotificationV06 addSpltTradInf(SplitTradeDetails5 spltTradInf) {
        getSpltTradInf().add(spltTradInf);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public ForeignExchangeTradeStatusAndDetailsNotificationV06 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
