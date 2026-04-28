
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
 * An instructing party, eg, an investment manager, sends the OrderMassCancelRequest message to an executing party, eg, a broker, to request the cancellation of all the remaining quantity of a group of orders matching the criteria specified within the request. The OrderMassCancelRequest message can only be used to reduce the full quantity.
 * Usage
 * The OrderMassCancelRequest message is a request to cancel. There is no automatic acceptance of the cancellation instruction. The rejection or acceptance of a cancellation message instruction is made using an OrderStatus message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderMassCancelRequest", propOrder = {
    "cclAllOrdrs",
    "ordrIds",
    "id",
    "cclForTradgSsn",
    "cclForInstrm",
    "cclForUndrlygInstrm",
    "cclForSctyTp",
    "cclForPdct",
    "cclForPty",
    "cclForCshPties",
    "cclForOthrBizPties",
    "cclForRcvgPties",
    "cclForDlvrgPties"
})
public class OrderMassCancelRequest {

    @XmlElement(name = "CclAllOrdrs")
    protected OrderIdentification3 cclAllOrdrs;
    @XmlElement(name = "OrdrIds")
    protected List<OrderIdentification3> ordrIds;
    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification11 id;
    @XmlElement(name = "CclForTradgSsn")
    protected TradingSession1 cclForTradgSsn;
    @XmlElement(name = "CclForInstrm")
    protected SecurityIdentification7 cclForInstrm;
    @XmlElement(name = "CclForUndrlygInstrm")
    protected List<SecurityIdentification7> cclForUndrlygInstrm;
    @XmlElement(name = "CclForSctyTp")
    protected FinancialInstrumentClassification1 cclForSctyTp;
    @XmlElement(name = "CclForPdct")
    protected FinancialInstrumentProductType1Choice cclForPdct;
    @XmlElement(name = "CclForPty")
    protected Intermediary14 cclForPty;
    @XmlElement(name = "CclForCshPties")
    protected CashParties1 cclForCshPties;
    @XmlElement(name = "CclForOthrBizPties")
    protected OtherParties1 cclForOthrBizPties;
    @XmlElement(name = "CclForRcvgPties")
    protected SettlementParties3 cclForRcvgPties;
    @XmlElement(name = "CclForDlvrgPties", required = true)
    protected SettlementParties3 cclForDlvrgPties;

    /**
     * Gets the value of the cclAllOrdrs property.
     * 
     * @return
     *     possible object is
     *     {@link OrderIdentification3 }
     *     
     */
    public OrderIdentification3 getCclAllOrdrs() {
        return cclAllOrdrs;
    }

    /**
     * Sets the value of the cclAllOrdrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderIdentification3 }
     *     
     */
    public OrderMassCancelRequest setCclAllOrdrs(OrderIdentification3 value) {
        this.cclAllOrdrs = value;
        return this;
    }

    /**
     * Gets the value of the ordrIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ordrIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrdrIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderIdentification3 }
     * 
     * 
     */
    public List<OrderIdentification3> getOrdrIds() {
        if (ordrIds == null) {
            ordrIds = new ArrayList<OrderIdentification3>();
        }
        return this.ordrIds;
    }

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
    public OrderMassCancelRequest setId(DocumentIdentification11 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the cclForTradgSsn property.
     * 
     * @return
     *     possible object is
     *     {@link TradingSession1 }
     *     
     */
    public TradingSession1 getCclForTradgSsn() {
        return cclForTradgSsn;
    }

    /**
     * Sets the value of the cclForTradgSsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingSession1 }
     *     
     */
    public OrderMassCancelRequest setCclForTradgSsn(TradingSession1 value) {
        this.cclForTradgSsn = value;
        return this;
    }

    /**
     * Gets the value of the cclForInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification7 }
     *     
     */
    public SecurityIdentification7 getCclForInstrm() {
        return cclForInstrm;
    }

    /**
     * Sets the value of the cclForInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification7 }
     *     
     */
    public OrderMassCancelRequest setCclForInstrm(SecurityIdentification7 value) {
        this.cclForInstrm = value;
        return this;
    }

    /**
     * Gets the value of the cclForUndrlygInstrm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cclForUndrlygInstrm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCclForUndrlygInstrm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityIdentification7 }
     * 
     * 
     */
    public List<SecurityIdentification7> getCclForUndrlygInstrm() {
        if (cclForUndrlygInstrm == null) {
            cclForUndrlygInstrm = new ArrayList<SecurityIdentification7>();
        }
        return this.cclForUndrlygInstrm;
    }

    /**
     * Gets the value of the cclForSctyTp property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentClassification1 }
     *     
     */
    public FinancialInstrumentClassification1 getCclForSctyTp() {
        return cclForSctyTp;
    }

    /**
     * Sets the value of the cclForSctyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentClassification1 }
     *     
     */
    public OrderMassCancelRequest setCclForSctyTp(FinancialInstrumentClassification1 value) {
        this.cclForSctyTp = value;
        return this;
    }

    /**
     * Gets the value of the cclForPdct property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentProductType1Choice }
     *     
     */
    public FinancialInstrumentProductType1Choice getCclForPdct() {
        return cclForPdct;
    }

    /**
     * Sets the value of the cclForPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentProductType1Choice }
     *     
     */
    public OrderMassCancelRequest setCclForPdct(FinancialInstrumentProductType1Choice value) {
        this.cclForPdct = value;
        return this;
    }

    /**
     * Gets the value of the cclForPty property.
     * 
     * @return
     *     possible object is
     *     {@link Intermediary14 }
     *     
     */
    public Intermediary14 getCclForPty() {
        return cclForPty;
    }

    /**
     * Sets the value of the cclForPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Intermediary14 }
     *     
     */
    public OrderMassCancelRequest setCclForPty(Intermediary14 value) {
        this.cclForPty = value;
        return this;
    }

    /**
     * Gets the value of the cclForCshPties property.
     * 
     * @return
     *     possible object is
     *     {@link CashParties1 }
     *     
     */
    public CashParties1 getCclForCshPties() {
        return cclForCshPties;
    }

    /**
     * Sets the value of the cclForCshPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashParties1 }
     *     
     */
    public OrderMassCancelRequest setCclForCshPties(CashParties1 value) {
        this.cclForCshPties = value;
        return this;
    }

    /**
     * Gets the value of the cclForOthrBizPties property.
     * 
     * @return
     *     possible object is
     *     {@link OtherParties1 }
     *     
     */
    public OtherParties1 getCclForOthrBizPties() {
        return cclForOthrBizPties;
    }

    /**
     * Sets the value of the cclForOthrBizPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherParties1 }
     *     
     */
    public OrderMassCancelRequest setCclForOthrBizPties(OtherParties1 value) {
        this.cclForOthrBizPties = value;
        return this;
    }

    /**
     * Gets the value of the cclForRcvgPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties3 }
     *     
     */
    public SettlementParties3 getCclForRcvgPties() {
        return cclForRcvgPties;
    }

    /**
     * Sets the value of the cclForRcvgPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties3 }
     *     
     */
    public OrderMassCancelRequest setCclForRcvgPties(SettlementParties3 value) {
        this.cclForRcvgPties = value;
        return this;
    }

    /**
     * Gets the value of the cclForDlvrgPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties3 }
     *     
     */
    public SettlementParties3 getCclForDlvrgPties() {
        return cclForDlvrgPties;
    }

    /**
     * Sets the value of the cclForDlvrgPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties3 }
     *     
     */
    public OrderMassCancelRequest setCclForDlvrgPties(SettlementParties3 value) {
        this.cclForDlvrgPties = value;
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
     * Adds a new item to the ordrIds list.
     * @see #getOrdrIds()
     * 
     */
    public OrderMassCancelRequest addOrdrIds(OrderIdentification3 ordrIds) {
        getOrdrIds().add(ordrIds);
        return this;
    }

    /**
     * Adds a new item to the cclForUndrlygInstrm list.
     * @see #getCclForUndrlygInstrm()
     * 
     */
    public OrderMassCancelRequest addCclForUndrlygInstrm(SecurityIdentification7 cclForUndrlygInstrm) {
        getCclForUndrlygInstrm().add(cclForUndrlygInstrm);
        return this;
    }

}
