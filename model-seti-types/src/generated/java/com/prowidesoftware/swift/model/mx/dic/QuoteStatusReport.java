
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
 * A trading party, eg, an investment manager, sends the QuoteStatusReport message to another trading party, eg, a broker, to advise the status of a quote or a quote cancellation.
 * Usage
 * The QuoteStatusReport may also be used in a tradeable and restricted tradeable quoting market.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuoteStatusReport", propOrder = {
    "id",
    "refs",
    "qtStsDtls",
    "legGrpDtls",
    "ordrDtls",
    "tradgSsnDtls",
    "twoLegTxDtls",
    "tradgPties",
    "sttlmDtls",
    "cshPties",
    "rcvgSttlmPties",
    "dlvrgSttlmPties",
    "othrBizPties",
    "qtDtls"
})
public class QuoteStatusReport {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification11 id;
    @XmlElement(name = "Refs", required = true)
    protected Reference7 refs;
    @XmlElement(name = "QtStsDtls", required = true)
    protected QuoteStatus1 qtStsDtls;
    @XmlElement(name = "LegGrpDtls")
    protected List<InstrumentLeg2> legGrpDtls;
    @XmlElement(name = "OrdrDtls")
    protected Order1 ordrDtls;
    @XmlElement(name = "TradgSsnDtls")
    protected TradingSession1 tradgSsnDtls;
    @XmlElement(name = "TwoLegTxDtls")
    protected SecuritiesFinancing1 twoLegTxDtls;
    @XmlElement(name = "TradgPties")
    protected List<Intermediary14> tradgPties;
    @XmlElement(name = "SttlmDtls")
    protected SecuritiesSettlement1 sttlmDtls;
    @XmlElement(name = "CshPties")
    protected CashParties1 cshPties;
    @XmlElement(name = "RcvgSttlmPties")
    protected SettlementParties3 rcvgSttlmPties;
    @XmlElement(name = "DlvrgSttlmPties")
    protected SettlementParties3 dlvrgSttlmPties;
    @XmlElement(name = "OthrBizPties")
    protected OtherParties1 othrBizPties;
    @XmlElement(name = "QtDtls", required = true)
    protected Quote1 qtDtls;

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
    public QuoteStatusReport setId(DocumentIdentification11 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the refs property.
     * 
     * @return
     *     possible object is
     *     {@link Reference7 }
     *     
     */
    public Reference7 getRefs() {
        return refs;
    }

    /**
     * Sets the value of the refs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference7 }
     *     
     */
    public QuoteStatusReport setRefs(Reference7 value) {
        this.refs = value;
        return this;
    }

    /**
     * Gets the value of the qtStsDtls property.
     * 
     * @return
     *     possible object is
     *     {@link QuoteStatus1 }
     *     
     */
    public QuoteStatus1 getQtStsDtls() {
        return qtStsDtls;
    }

    /**
     * Sets the value of the qtStsDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuoteStatus1 }
     *     
     */
    public QuoteStatusReport setQtStsDtls(QuoteStatus1 value) {
        this.qtStsDtls = value;
        return this;
    }

    /**
     * Gets the value of the legGrpDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legGrpDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegGrpDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstrumentLeg2 }
     * 
     * 
     */
    public List<InstrumentLeg2> getLegGrpDtls() {
        if (legGrpDtls == null) {
            legGrpDtls = new ArrayList<InstrumentLeg2>();
        }
        return this.legGrpDtls;
    }

    /**
     * Gets the value of the ordrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Order1 }
     *     
     */
    public Order1 getOrdrDtls() {
        return ordrDtls;
    }

    /**
     * Sets the value of the ordrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Order1 }
     *     
     */
    public QuoteStatusReport setOrdrDtls(Order1 value) {
        this.ordrDtls = value;
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
    public QuoteStatusReport setTradgSsnDtls(TradingSession1 value) {
        this.tradgSsnDtls = value;
        return this;
    }

    /**
     * Gets the value of the twoLegTxDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancing1 }
     *     
     */
    public SecuritiesFinancing1 getTwoLegTxDtls() {
        return twoLegTxDtls;
    }

    /**
     * Sets the value of the twoLegTxDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancing1 }
     *     
     */
    public QuoteStatusReport setTwoLegTxDtls(SecuritiesFinancing1 value) {
        this.twoLegTxDtls = value;
        return this;
    }

    /**
     * Gets the value of the tradgPties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradgPties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradgPties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Intermediary14 }
     * 
     * 
     */
    public List<Intermediary14> getTradgPties() {
        if (tradgPties == null) {
            tradgPties = new ArrayList<Intermediary14>();
        }
        return this.tradgPties;
    }

    /**
     * Gets the value of the sttlmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlement1 }
     *     
     */
    public SecuritiesSettlement1 getSttlmDtls() {
        return sttlmDtls;
    }

    /**
     * Sets the value of the sttlmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlement1 }
     *     
     */
    public QuoteStatusReport setSttlmDtls(SecuritiesSettlement1 value) {
        this.sttlmDtls = value;
        return this;
    }

    /**
     * Gets the value of the cshPties property.
     * 
     * @return
     *     possible object is
     *     {@link CashParties1 }
     *     
     */
    public CashParties1 getCshPties() {
        return cshPties;
    }

    /**
     * Sets the value of the cshPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashParties1 }
     *     
     */
    public QuoteStatusReport setCshPties(CashParties1 value) {
        this.cshPties = value;
        return this;
    }

    /**
     * Gets the value of the rcvgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties3 }
     *     
     */
    public SettlementParties3 getRcvgSttlmPties() {
        return rcvgSttlmPties;
    }

    /**
     * Sets the value of the rcvgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties3 }
     *     
     */
    public QuoteStatusReport setRcvgSttlmPties(SettlementParties3 value) {
        this.rcvgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the dlvrgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties3 }
     *     
     */
    public SettlementParties3 getDlvrgSttlmPties() {
        return dlvrgSttlmPties;
    }

    /**
     * Sets the value of the dlvrgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties3 }
     *     
     */
    public QuoteStatusReport setDlvrgSttlmPties(SettlementParties3 value) {
        this.dlvrgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the othrBizPties property.
     * 
     * @return
     *     possible object is
     *     {@link OtherParties1 }
     *     
     */
    public OtherParties1 getOthrBizPties() {
        return othrBizPties;
    }

    /**
     * Sets the value of the othrBizPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherParties1 }
     *     
     */
    public QuoteStatusReport setOthrBizPties(OtherParties1 value) {
        this.othrBizPties = value;
        return this;
    }

    /**
     * Gets the value of the qtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Quote1 }
     *     
     */
    public Quote1 getQtDtls() {
        return qtDtls;
    }

    /**
     * Sets the value of the qtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quote1 }
     *     
     */
    public QuoteStatusReport setQtDtls(Quote1 value) {
        this.qtDtls = value;
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

    /**
     * Adds a new item to the legGrpDtls list.
     * @see #getLegGrpDtls()
     * 
     */
    public QuoteStatusReport addLegGrpDtls(InstrumentLeg2 legGrpDtls) {
        getLegGrpDtls().add(legGrpDtls);
        return this;
    }

    /**
     * Adds a new item to the tradgPties list.
     * @see #getTradgPties()
     * 
     */
    public QuoteStatusReport addTradgPties(Intermediary14 tradgPties) {
        getTradgPties().add(tradgPties);
        return this;
    }

}
