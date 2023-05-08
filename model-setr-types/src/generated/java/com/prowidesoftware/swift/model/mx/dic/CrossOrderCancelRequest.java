
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
 * An executing party, eg, a broker, sends the CrossOrderCancelRequest message to a point of execution such as an exchange to request the cancellation of the previously sent CrossOrder. The CrossOrderCancelRequest message is used to fully cancel the remaining open quantity of a cross order.
 * Usage
 * This message must contain the reference of the message to be cancelled and it may also contain all the details of the message to be cancelled.
 * This cancellation message is a request to cancel. There is no automatic acceptance of the cancellation instruction. The rejection or acceptance of a cancellation message instruction is made using an OrderStatus message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrossOrderCancelRequest", propOrder = {
    "id",
    "refs",
    "ordrDtls",
    "ordrQtyDtls",
    "finInstrmDtls",
    "finInstrmAttrbts",
    "undrlygFinInstrm",
    "undrlygFinInstrmAttrbts",
    "legGrpDtls",
    "tradgPties",
    "cshPties",
    "othrBizPties",
    "rcvgSttlmPties",
    "dlvrgSttlmPties"
})
public class CrossOrderCancelRequest {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification11 id;
    @XmlElement(name = "Refs", required = true)
    protected Reference13 refs;
    @XmlElement(name = "OrdrDtls", required = true)
    protected CrossOrder2 ordrDtls;
    @XmlElement(name = "OrdrQtyDtls")
    protected OrderQuantity3 ordrQtyDtls;
    @XmlElement(name = "FinInstrmDtls")
    protected SecurityIdentification7 finInstrmDtls;
    @XmlElement(name = "FinInstrmAttrbts")
    protected FinancialInstrumentAttributes1 finInstrmAttrbts;
    @XmlElement(name = "UndrlygFinInstrm", required = true)
    protected SecurityIdentification7 undrlygFinInstrm;
    @XmlElement(name = "UndrlygFinInstrmAttrbts")
    protected List<FinancialInstrumentAttributes1> undrlygFinInstrmAttrbts;
    @XmlElement(name = "LegGrpDtls")
    protected List<InstrumentLeg2> legGrpDtls;
    @XmlElement(name = "TradgPties")
    protected List<Intermediary14> tradgPties;
    @XmlElement(name = "CshPties", required = true)
    protected CashParties1 cshPties;
    @XmlElement(name = "OthrBizPties", required = true)
    protected OtherParties1 othrBizPties;
    @XmlElement(name = "RcvgSttlmPties", required = true)
    protected SettlementParties3 rcvgSttlmPties;
    @XmlElement(name = "DlvrgSttlmPties")
    protected SettlementParties3 dlvrgSttlmPties;

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
    public CrossOrderCancelRequest setId(DocumentIdentification11 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the refs property.
     * 
     * @return
     *     possible object is
     *     {@link Reference13 }
     *     
     */
    public Reference13 getRefs() {
        return refs;
    }

    /**
     * Sets the value of the refs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference13 }
     *     
     */
    public CrossOrderCancelRequest setRefs(Reference13 value) {
        this.refs = value;
        return this;
    }

    /**
     * Gets the value of the ordrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CrossOrder2 }
     *     
     */
    public CrossOrder2 getOrdrDtls() {
        return ordrDtls;
    }

    /**
     * Sets the value of the ordrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossOrder2 }
     *     
     */
    public CrossOrderCancelRequest setOrdrDtls(CrossOrder2 value) {
        this.ordrDtls = value;
        return this;
    }

    /**
     * Gets the value of the ordrQtyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link OrderQuantity3 }
     *     
     */
    public OrderQuantity3 getOrdrQtyDtls() {
        return ordrQtyDtls;
    }

    /**
     * Sets the value of the ordrQtyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderQuantity3 }
     *     
     */
    public CrossOrderCancelRequest setOrdrQtyDtls(OrderQuantity3 value) {
        this.ordrQtyDtls = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification7 }
     *     
     */
    public SecurityIdentification7 getFinInstrmDtls() {
        return finInstrmDtls;
    }

    /**
     * Sets the value of the finInstrmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification7 }
     *     
     */
    public CrossOrderCancelRequest setFinInstrmDtls(SecurityIdentification7 value) {
        this.finInstrmDtls = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributes1 }
     *     
     */
    public FinancialInstrumentAttributes1 getFinInstrmAttrbts() {
        return finInstrmAttrbts;
    }

    /**
     * Sets the value of the finInstrmAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributes1 }
     *     
     */
    public CrossOrderCancelRequest setFinInstrmAttrbts(FinancialInstrumentAttributes1 value) {
        this.finInstrmAttrbts = value;
        return this;
    }

    /**
     * Gets the value of the undrlygFinInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification7 }
     *     
     */
    public SecurityIdentification7 getUndrlygFinInstrm() {
        return undrlygFinInstrm;
    }

    /**
     * Sets the value of the undrlygFinInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification7 }
     *     
     */
    public CrossOrderCancelRequest setUndrlygFinInstrm(SecurityIdentification7 value) {
        this.undrlygFinInstrm = value;
        return this;
    }

    /**
     * Gets the value of the undrlygFinInstrmAttrbts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the undrlygFinInstrmAttrbts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndrlygFinInstrmAttrbts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialInstrumentAttributes1 }
     * 
     * 
     * @return
     *     The value of the undrlygFinInstrmAttrbts property.
     */
    public List<FinancialInstrumentAttributes1> getUndrlygFinInstrmAttrbts() {
        if (undrlygFinInstrmAttrbts == null) {
            undrlygFinInstrmAttrbts = new ArrayList<>();
        }
        return this.undrlygFinInstrmAttrbts;
    }

    /**
     * Gets the value of the legGrpDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the legGrpDtls property.
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
     * @return
     *     The value of the legGrpDtls property.
     */
    public List<InstrumentLeg2> getLegGrpDtls() {
        if (legGrpDtls == null) {
            legGrpDtls = new ArrayList<>();
        }
        return this.legGrpDtls;
    }

    /**
     * Gets the value of the tradgPties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tradgPties property.
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
     * @return
     *     The value of the tradgPties property.
     */
    public List<Intermediary14> getTradgPties() {
        if (tradgPties == null) {
            tradgPties = new ArrayList<>();
        }
        return this.tradgPties;
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
    public CrossOrderCancelRequest setCshPties(CashParties1 value) {
        this.cshPties = value;
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
    public CrossOrderCancelRequest setOthrBizPties(OtherParties1 value) {
        this.othrBizPties = value;
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
    public CrossOrderCancelRequest setRcvgSttlmPties(SettlementParties3 value) {
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
    public CrossOrderCancelRequest setDlvrgSttlmPties(SettlementParties3 value) {
        this.dlvrgSttlmPties = value;
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
     * Adds a new item to the undrlygFinInstrmAttrbts list.
     * @see #getUndrlygFinInstrmAttrbts()
     * 
     */
    public CrossOrderCancelRequest addUndrlygFinInstrmAttrbts(FinancialInstrumentAttributes1 undrlygFinInstrmAttrbts) {
        getUndrlygFinInstrmAttrbts().add(undrlygFinInstrmAttrbts);
        return this;
    }

    /**
     * Adds a new item to the legGrpDtls list.
     * @see #getLegGrpDtls()
     * 
     */
    public CrossOrderCancelRequest addLegGrpDtls(InstrumentLeg2 legGrpDtls) {
        getLegGrpDtls().add(legGrpDtls);
        return this;
    }

    /**
     * Adds a new item to the tradgPties list.
     * @see #getTradgPties()
     * 
     */
    public CrossOrderCancelRequest addTradgPties(Intermediary14 tradgPties) {
        getTradgPties().add(tradgPties);
        return this;
    }

}
