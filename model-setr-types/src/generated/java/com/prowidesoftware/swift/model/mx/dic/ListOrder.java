
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
 * An instructing party, eg, an investment manager, sends the ListOrder message to an executing party, eg, a broker. The ListOrder message enumerates the financial instruments, the quantities, the direction for the trade and may contain pre-allocation information.
 * Usage
 * The ListOrder message is used in one of two ways depending on which market conventions are being followed, ie, non disclosed list trading scenario versus disclosed list trading scenario.
 * In the non disclosed list trading scenario, eg, European and US model, the ListOrder message is sent after the bidding process has been completed.
 * In the disclosed list trading scenario, eg, Japanese model, the ListOrder message is sent before the bidding process is started. However, the direction of the trade is disclosed after the bidding process is completed.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOrder", propOrder = {
    "id",
    "refs",
    "listDtls",
    "tradgPties",
    "cshPties",
    "rcvgSttlmPties",
    "dlvrgSttlmPties",
    "othrBizPties",
    "amtsDtls"
})
public class ListOrder {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification11 id;
    @XmlElement(name = "Refs", required = true)
    protected Reference12 refs;
    @XmlElement(name = "ListDtls", required = true)
    protected List1 listDtls;
    @XmlElement(name = "TradgPties")
    protected List<Intermediary14> tradgPties;
    @XmlElement(name = "CshPties")
    protected CashParties1 cshPties;
    @XmlElement(name = "RcvgSttlmPties")
    protected SettlementParties3 rcvgSttlmPties;
    @XmlElement(name = "DlvrgSttlmPties")
    protected SettlementParties3 dlvrgSttlmPties;
    @XmlElement(name = "OthrBizPties")
    protected OtherParties1 othrBizPties;
    @XmlElement(name = "AmtsDtls")
    protected List<OtherAmounts1> amtsDtls;

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
    public ListOrder setId(DocumentIdentification11 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the refs property.
     * 
     * @return
     *     possible object is
     *     {@link Reference12 }
     *     
     */
    public Reference12 getRefs() {
        return refs;
    }

    /**
     * Sets the value of the refs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference12 }
     *     
     */
    public ListOrder setRefs(Reference12 value) {
        this.refs = value;
        return this;
    }

    /**
     * Gets the value of the listDtls property.
     * 
     * @return
     *     possible object is
     *     {@link List1 }
     *     
     */
    public List1 getListDtls() {
        return listDtls;
    }

    /**
     * Sets the value of the listDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link List1 }
     *     
     */
    public ListOrder setListDtls(List1 value) {
        this.listDtls = value;
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
    public ListOrder setCshPties(CashParties1 value) {
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
    public ListOrder setRcvgSttlmPties(SettlementParties3 value) {
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
    public ListOrder setDlvrgSttlmPties(SettlementParties3 value) {
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
    public ListOrder setOthrBizPties(OtherParties1 value) {
        this.othrBizPties = value;
        return this;
    }

    /**
     * Gets the value of the amtsDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amtsDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmtsDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherAmounts1 }
     * 
     * 
     */
    public List<OtherAmounts1> getAmtsDtls() {
        if (amtsDtls == null) {
            amtsDtls = new ArrayList<OtherAmounts1>();
        }
        return this.amtsDtls;
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
     * Adds a new item to the tradgPties list.
     * @see #getTradgPties()
     * 
     */
    public ListOrder addTradgPties(Intermediary14 tradgPties) {
        getTradgPties().add(tradgPties);
        return this;
    }

    /**
     * Adds a new item to the amtsDtls list.
     * @see #getAmtsDtls()
     * 
     */
    public ListOrder addAmtsDtls(OtherAmounts1 amtsDtls) {
        getAmtsDtls().add(amtsDtls);
        return this;
    }

}
