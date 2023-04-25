
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
 * Status and reason of an instructed order.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderStatusAndReason5", propOrder = {
    "sts",
    "rjctnRsn",
    "ordrStsDtls",
    "finInstrm",
    "undrlygFinInstrm",
    "tradgPties",
    "cshPties",
    "rcvgSttlmPties",
    "dlvrgSttlmPties",
    "othrBizPties"
})
public class OrderStatusAndReason5 {

    @XmlElement(name = "Sts", required = true)
    @XmlSchemaType(name = "string")
    protected OrderStatus1Code sts;
    @XmlElement(name = "RjctnRsn")
    protected RejectionReason3Choice rjctnRsn;
    @XmlElement(name = "OrdrStsDtls")
    protected OrderStatus1 ordrStsDtls;
    @XmlElement(name = "FinInstrm", required = true)
    protected SecurityIdentification7 finInstrm;
    @XmlElement(name = "UndrlygFinInstrm")
    protected List<SecurityIdentification7> undrlygFinInstrm;
    @XmlElement(name = "TradgPties")
    protected Intermediary14 tradgPties;
    @XmlElement(name = "CshPties")
    protected CashParties1 cshPties;
    @XmlElement(name = "RcvgSttlmPties")
    protected SettlementParties3 rcvgSttlmPties;
    @XmlElement(name = "DlvrgSttlmPties")
    protected SettlementParties3 dlvrgSttlmPties;
    @XmlElement(name = "OthrBizPties")
    protected OtherParties1 othrBizPties;

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatus1Code }
     *     
     */
    public OrderStatus1Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatus1Code }
     *     
     */
    public OrderStatusAndReason5 setSts(OrderStatus1Code value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the rjctnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionReason3Choice }
     *     
     */
    public RejectionReason3Choice getRjctnRsn() {
        return rjctnRsn;
    }

    /**
     * Sets the value of the rjctnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionReason3Choice }
     *     
     */
    public OrderStatusAndReason5 setRjctnRsn(RejectionReason3Choice value) {
        this.rjctnRsn = value;
        return this;
    }

    /**
     * Gets the value of the ordrStsDtls property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatus1 }
     *     
     */
    public OrderStatus1 getOrdrStsDtls() {
        return ordrStsDtls;
    }

    /**
     * Sets the value of the ordrStsDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatus1 }
     *     
     */
    public OrderStatusAndReason5 setOrdrStsDtls(OrderStatus1 value) {
        this.ordrStsDtls = value;
        return this;
    }

    /**
     * Gets the value of the finInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification7 }
     *     
     */
    public SecurityIdentification7 getFinInstrm() {
        return finInstrm;
    }

    /**
     * Sets the value of the finInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification7 }
     *     
     */
    public OrderStatusAndReason5 setFinInstrm(SecurityIdentification7 value) {
        this.finInstrm = value;
        return this;
    }

    /**
     * Gets the value of the undrlygFinInstrm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the undrlygFinInstrm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndrlygFinInstrm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityIdentification7 }
     * 
     * 
     * @return
     *     The value of the undrlygFinInstrm property.
     */
    public List<SecurityIdentification7> getUndrlygFinInstrm() {
        if (undrlygFinInstrm == null) {
            undrlygFinInstrm = new ArrayList<>();
        }
        return this.undrlygFinInstrm;
    }

    /**
     * Gets the value of the tradgPties property.
     * 
     * @return
     *     possible object is
     *     {@link Intermediary14 }
     *     
     */
    public Intermediary14 getTradgPties() {
        return tradgPties;
    }

    /**
     * Sets the value of the tradgPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Intermediary14 }
     *     
     */
    public OrderStatusAndReason5 setTradgPties(Intermediary14 value) {
        this.tradgPties = value;
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
    public OrderStatusAndReason5 setCshPties(CashParties1 value) {
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
    public OrderStatusAndReason5 setRcvgSttlmPties(SettlementParties3 value) {
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
    public OrderStatusAndReason5 setDlvrgSttlmPties(SettlementParties3 value) {
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
    public OrderStatusAndReason5 setOthrBizPties(OtherParties1 value) {
        this.othrBizPties = value;
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
     * Adds a new item to the undrlygFinInstrm list.
     * @see #getUndrlygFinInstrm()
     * 
     */
    public OrderStatusAndReason5 addUndrlygFinInstrm(SecurityIdentification7 undrlygFinInstrm) {
        getUndrlygFinInstrm().add(undrlygFinInstrm);
        return this;
    }

}
