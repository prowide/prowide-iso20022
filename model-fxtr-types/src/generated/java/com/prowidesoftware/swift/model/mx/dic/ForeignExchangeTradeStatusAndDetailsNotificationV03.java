
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

 * The ForeignExchangeTradeStatusAndDetails message is sent by a central system to the participant to provide notification of the status and details of a foreign exchange trade.

 * Usage

 * The notification is sent by a central settlement system to the two trading parties after it has received foreign exchange trade instructions from both.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForeignExchangeTradeStatusAndDetailsNotificationV03", propOrder = {
    "stsDtls",
    "tradInf",
    "tradgSdId",
    "ctrPtySdId",
    "tradAmts",
    "agrdRate",
    "tradgSdSttlmInstrs",
    "ctrPtySdSttlmInstrs",
    "gnlInf",
    "spltTradInf",
    "rgltryRptg",
    "splmtryData"
})
public class ForeignExchangeTradeStatusAndDetailsNotificationV03 {

    @XmlElement(name = "StsDtls", required = true)
    protected TradeData9 stsDtls;
    @XmlElement(name = "TradInf", required = true)
    protected TradeAgreement12 tradInf;
    @XmlElement(name = "TradgSdId", required = true)
    protected TradePartyIdentification6 tradgSdId;
    @XmlElement(name = "CtrPtySdId", required = true)
    protected TradePartyIdentification6 ctrPtySdId;
    @XmlElement(name = "TradAmts", required = true)
    protected AmountsAndValueDate1 tradAmts;
    @XmlElement(name = "AgrdRate", required = true)
    protected AgreedRate1 agrdRate;
    @XmlElement(name = "TradgSdSttlmInstrs")
    protected SettlementParties29 tradgSdSttlmInstrs;
    @XmlElement(name = "CtrPtySdSttlmInstrs")
    protected SettlementParties29 ctrPtySdSttlmInstrs;
    @XmlElement(name = "GnlInf")
    protected GeneralInformation4 gnlInf;
    @XmlElement(name = "SpltTradInf")
    protected List<SplitTradeDetails1> spltTradInf;
    @XmlElement(name = "RgltryRptg")
    protected RegulatoryReporting4 rgltryRptg;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the stsDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData9 }
     *     
     */
    public TradeData9 getStsDtls() {
        return stsDtls;
    }

    /**
     * Sets the value of the stsDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData9 }
     *     
     */
    public ForeignExchangeTradeStatusAndDetailsNotificationV03 setStsDtls(TradeData9 value) {
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
    public ForeignExchangeTradeStatusAndDetailsNotificationV03 setTradInf(TradeAgreement12 value) {
        this.tradInf = value;
        return this;
    }

    /**
     * Gets the value of the tradgSdId property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentification6 }
     *     
     */
    public TradePartyIdentification6 getTradgSdId() {
        return tradgSdId;
    }

    /**
     * Sets the value of the tradgSdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentification6 }
     *     
     */
    public ForeignExchangeTradeStatusAndDetailsNotificationV03 setTradgSdId(TradePartyIdentification6 value) {
        this.tradgSdId = value;
        return this;
    }

    /**
     * Gets the value of the ctrPtySdId property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentification6 }
     *     
     */
    public TradePartyIdentification6 getCtrPtySdId() {
        return ctrPtySdId;
    }

    /**
     * Sets the value of the ctrPtySdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentification6 }
     *     
     */
    public ForeignExchangeTradeStatusAndDetailsNotificationV03 setCtrPtySdId(TradePartyIdentification6 value) {
        this.ctrPtySdId = value;
        return this;
    }

    /**
     * Gets the value of the tradAmts property.
     * 
     * @return
     *     possible object is
     *     {@link AmountsAndValueDate1 }
     *     
     */
    public AmountsAndValueDate1 getTradAmts() {
        return tradAmts;
    }

    /**
     * Sets the value of the tradAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountsAndValueDate1 }
     *     
     */
    public ForeignExchangeTradeStatusAndDetailsNotificationV03 setTradAmts(AmountsAndValueDate1 value) {
        this.tradAmts = value;
        return this;
    }

    /**
     * Gets the value of the agrdRate property.
     * 
     * @return
     *     possible object is
     *     {@link AgreedRate1 }
     *     
     */
    public AgreedRate1 getAgrdRate() {
        return agrdRate;
    }

    /**
     * Sets the value of the agrdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreedRate1 }
     *     
     */
    public ForeignExchangeTradeStatusAndDetailsNotificationV03 setAgrdRate(AgreedRate1 value) {
        this.agrdRate = value;
        return this;
    }

    /**
     * Gets the value of the tradgSdSttlmInstrs property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties29 }
     *     
     */
    public SettlementParties29 getTradgSdSttlmInstrs() {
        return tradgSdSttlmInstrs;
    }

    /**
     * Sets the value of the tradgSdSttlmInstrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties29 }
     *     
     */
    public ForeignExchangeTradeStatusAndDetailsNotificationV03 setTradgSdSttlmInstrs(SettlementParties29 value) {
        this.tradgSdSttlmInstrs = value;
        return this;
    }

    /**
     * Gets the value of the ctrPtySdSttlmInstrs property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties29 }
     *     
     */
    public SettlementParties29 getCtrPtySdSttlmInstrs() {
        return ctrPtySdSttlmInstrs;
    }

    /**
     * Sets the value of the ctrPtySdSttlmInstrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties29 }
     *     
     */
    public ForeignExchangeTradeStatusAndDetailsNotificationV03 setCtrPtySdSttlmInstrs(SettlementParties29 value) {
        this.ctrPtySdSttlmInstrs = value;
        return this;
    }

    /**
     * Gets the value of the gnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralInformation4 }
     *     
     */
    public GeneralInformation4 getGnlInf() {
        return gnlInf;
    }

    /**
     * Sets the value of the gnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralInformation4 }
     *     
     */
    public ForeignExchangeTradeStatusAndDetailsNotificationV03 setGnlInf(GeneralInformation4 value) {
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
     * {@link SplitTradeDetails1 }
     * 
     * 
     */
    public List<SplitTradeDetails1> getSpltTradInf() {
        if (spltTradInf == null) {
            spltTradInf = new ArrayList<SplitTradeDetails1>();
        }
        return this.spltTradInf;
    }

    /**
     * Gets the value of the rgltryRptg property.
     * 
     * @return
     *     possible object is
     *     {@link RegulatoryReporting4 }
     *     
     */
    public RegulatoryReporting4 getRgltryRptg() {
        return rgltryRptg;
    }

    /**
     * Sets the value of the rgltryRptg property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulatoryReporting4 }
     *     
     */
    public ForeignExchangeTradeStatusAndDetailsNotificationV03 setRgltryRptg(RegulatoryReporting4 value) {
        this.rgltryRptg = value;
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
    public ForeignExchangeTradeStatusAndDetailsNotificationV03 addSpltTradInf(SplitTradeDetails1 spltTradInf) {
        getSpltTradInf().add(spltTradInf);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public ForeignExchangeTradeStatusAndDetailsNotificationV03 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
