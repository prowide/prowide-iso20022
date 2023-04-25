
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
 * The ForeignExchangeTradeInstructionCancellation message is sent by a participant to a central settlement system to notify the cancellation of the foreign exchange trade previously confirmed by the sender.
 * Usage
 * The ForeignExchangeTradeInstructionCancellation message is sent from a participant to a central settlement system to advise of the cancellation of a previously sent notification. The "Related Reference" must be used to link it to the previous notification.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForeignExchangeTradeInstructionCancellationV03", propOrder = {
    "tradInf",
    "tradgSdId",
    "ctrPtySdId",
    "agrdRate",
    "tradgSdSttlmInstrs",
    "ctrPtySdSttlmInstrs",
    "optnlGnlInf",
    "tradAmts",
    "rgltryRptg",
    "splmtryData"
})
public class ForeignExchangeTradeInstructionCancellationV03 {

    @XmlElement(name = "TradInf", required = true)
    protected TradeAgreement11 tradInf;
    @XmlElement(name = "TradgSdId", required = true)
    protected TradePartyIdentification6 tradgSdId;
    @XmlElement(name = "CtrPtySdId", required = true)
    protected TradePartyIdentification6 ctrPtySdId;
    @XmlElement(name = "AgrdRate")
    protected AgreedRate1 agrdRate;
    @XmlElement(name = "TradgSdSttlmInstrs")
    protected SettlementParties29 tradgSdSttlmInstrs;
    @XmlElement(name = "CtrPtySdSttlmInstrs")
    protected SettlementParties29 ctrPtySdSttlmInstrs;
    @XmlElement(name = "OptnlGnlInf")
    protected GeneralInformation4 optnlGnlInf;
    @XmlElement(name = "TradAmts", required = true)
    protected AmountsAndValueDate1 tradAmts;
    @XmlElement(name = "RgltryRptg")
    protected RegulatoryReporting4 rgltryRptg;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the tradInf property.
     * 
     * @return
     *     possible object is
     *     {@link TradeAgreement11 }
     *     
     */
    public TradeAgreement11 getTradInf() {
        return tradInf;
    }

    /**
     * Sets the value of the tradInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeAgreement11 }
     *     
     */
    public ForeignExchangeTradeInstructionCancellationV03 setTradInf(TradeAgreement11 value) {
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
    public ForeignExchangeTradeInstructionCancellationV03 setTradgSdId(TradePartyIdentification6 value) {
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
    public ForeignExchangeTradeInstructionCancellationV03 setCtrPtySdId(TradePartyIdentification6 value) {
        this.ctrPtySdId = value;
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
    public ForeignExchangeTradeInstructionCancellationV03 setAgrdRate(AgreedRate1 value) {
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
    public ForeignExchangeTradeInstructionCancellationV03 setTradgSdSttlmInstrs(SettlementParties29 value) {
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
    public ForeignExchangeTradeInstructionCancellationV03 setCtrPtySdSttlmInstrs(SettlementParties29 value) {
        this.ctrPtySdSttlmInstrs = value;
        return this;
    }

    /**
     * Gets the value of the optnlGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralInformation4 }
     *     
     */
    public GeneralInformation4 getOptnlGnlInf() {
        return optnlGnlInf;
    }

    /**
     * Sets the value of the optnlGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralInformation4 }
     *     
     */
    public ForeignExchangeTradeInstructionCancellationV03 setOptnlGnlInf(GeneralInformation4 value) {
        this.optnlGnlInf = value;
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
    public ForeignExchangeTradeInstructionCancellationV03 setTradAmts(AmountsAndValueDate1 value) {
        this.tradAmts = value;
        return this;
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
    public ForeignExchangeTradeInstructionCancellationV03 setRgltryRptg(RegulatoryReporting4 value) {
        this.rgltryRptg = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
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
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
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
    public ForeignExchangeTradeInstructionCancellationV03 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
