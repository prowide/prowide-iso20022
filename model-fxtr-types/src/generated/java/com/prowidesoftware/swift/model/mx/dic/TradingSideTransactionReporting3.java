
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
 * Regulatory transaction reporting information from the Trading Side party.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradingSideTransactionReporting3", propOrder = {
    "rptgJursdctn",
    "rptgPty",
    "tradgSdUnqTxIdr"
})
public class TradingSideTransactionReporting3 {

    @XmlElement(name = "RptgJursdctn")
    protected String rptgJursdctn;
    @XmlElement(name = "RptgPty")
    protected PartyIdentification242Choice rptgPty;
    @XmlElement(name = "TradgSdUnqTxIdr")
    protected List<UniqueTransactionIdentifier3> tradgSdUnqTxIdr;

    /**
     * Gets the value of the rptgJursdctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptgJursdctn() {
        return rptgJursdctn;
    }

    /**
     * Sets the value of the rptgJursdctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradingSideTransactionReporting3 setRptgJursdctn(String value) {
        this.rptgJursdctn = value;
        return this;
    }

    /**
     * Gets the value of the rptgPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public PartyIdentification242Choice getRptgPty() {
        return rptgPty;
    }

    /**
     * Sets the value of the rptgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public TradingSideTransactionReporting3 setRptgPty(PartyIdentification242Choice value) {
        this.rptgPty = value;
        return this;
    }

    /**
     * Gets the value of the tradgSdUnqTxIdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradgSdUnqTxIdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradgSdUnqTxIdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UniqueTransactionIdentifier3 }
     * 
     * 
     */
    public List<UniqueTransactionIdentifier3> getTradgSdUnqTxIdr() {
        if (tradgSdUnqTxIdr == null) {
            tradgSdUnqTxIdr = new ArrayList<UniqueTransactionIdentifier3>();
        }
        return this.tradgSdUnqTxIdr;
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
     * Adds a new item to the tradgSdUnqTxIdr list.
     * @see #getTradgSdUnqTxIdr()
     * 
     */
    public TradingSideTransactionReporting3 addTradgSdUnqTxIdr(UniqueTransactionIdentifier3 tradgSdUnqTxIdr) {
        getTradgSdUnqTxIdr().add(tradgSdUnqTxIdr);
        return this;
    }

}
