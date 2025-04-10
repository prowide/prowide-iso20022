
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
 * Set of elements used to define the balance details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashBalance8", propOrder = {
    "tp",
    "cdtLine",
    "amt",
    "cdtDbtInd",
    "dt",
    "avlbty"
})
public class CashBalance8 {

    @XmlElement(name = "Tp", required = true)
    protected BalanceType13 tp;
    @XmlElement(name = "CdtLine")
    protected List<CreditLine3> cdtLine;
    @XmlElement(name = "Amt", required = true)
    protected ActiveOrHistoricCurrencyAndAmount amt;
    @XmlElement(name = "CdtDbtInd", required = true)
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "Dt", required = true)
    protected DateAndDateTime2Choice dt;
    @XmlElement(name = "Avlbty")
    protected List<CashAvailability1> avlbty;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceType13 }
     *     
     */
    public BalanceType13 getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceType13 }
     *     
     */
    public CashBalance8 setTp(BalanceType13 value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the cdtLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cdtLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCdtLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditLine3 }
     * 
     * 
     * @return
     *     The value of the cdtLine property.
     */
    public List<CreditLine3> getCdtLine() {
        if (cdtLine == null) {
            cdtLine = new ArrayList<>();
        }
        return this.cdtLine;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public CashBalance8 setAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the cdtDbtInd property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebitCode }
     *     
     */
    public CreditDebitCode getCdtDbtInd() {
        return cdtDbtInd;
    }

    /**
     * Sets the value of the cdtDbtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebitCode }
     *     
     */
    public CashBalance8 setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
        return this;
    }

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public CashBalance8 setDt(DateAndDateTime2Choice value) {
        this.dt = value;
        return this;
    }

    /**
     * Gets the value of the avlbty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the avlbty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvlbty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashAvailability1 }
     * 
     * 
     * @return
     *     The value of the avlbty property.
     */
    public List<CashAvailability1> getAvlbty() {
        if (avlbty == null) {
            avlbty = new ArrayList<>();
        }
        return this.avlbty;
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
     * Adds a new item to the cdtLine list.
     * @see #getCdtLine()
     * 
     */
    public CashBalance8 addCdtLine(CreditLine3 cdtLine) {
        getCdtLine().add(cdtLine);
        return this;
    }

    /**
     * Adds a new item to the avlbty list.
     * @see #getAvlbty()
     * 
     */
    public CashBalance8 addAvlbty(CashAvailability1 avlbty) {
        getAvlbty().add(avlbty);
        return this;
    }

}
