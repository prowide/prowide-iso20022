
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
 * This is regulatory transaction reporting information from the counterparty side party.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CounterpartySideTransactionReporting1", propOrder = {
    "rptgJursdctn",
    "rptgPty",
    "ctrPtySdUnqTxIdr"
})
public class CounterpartySideTransactionReporting1 {

    @XmlElement(name = "RptgJursdctn")
    protected String rptgJursdctn;
    @XmlElement(name = "RptgPty")
    protected PartyIdentification73Choice rptgPty;
    @XmlElement(name = "CtrPtySdUnqTxIdr")
    protected List<UniqueTransactionIdentifier2> ctrPtySdUnqTxIdr;

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
    public CounterpartySideTransactionReporting1 setRptgJursdctn(String value) {
        this.rptgJursdctn = value;
        return this;
    }

    /**
     * Gets the value of the rptgPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification73Choice }
     *     
     */
    public PartyIdentification73Choice getRptgPty() {
        return rptgPty;
    }

    /**
     * Sets the value of the rptgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification73Choice }
     *     
     */
    public CounterpartySideTransactionReporting1 setRptgPty(PartyIdentification73Choice value) {
        this.rptgPty = value;
        return this;
    }

    /**
     * Gets the value of the ctrPtySdUnqTxIdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ctrPtySdUnqTxIdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtrPtySdUnqTxIdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UniqueTransactionIdentifier2 }
     * 
     * 
     * @return
     *     The value of the ctrPtySdUnqTxIdr property.
     */
    public List<UniqueTransactionIdentifier2> getCtrPtySdUnqTxIdr() {
        if (ctrPtySdUnqTxIdr == null) {
            ctrPtySdUnqTxIdr = new ArrayList<>();
        }
        return this.ctrPtySdUnqTxIdr;
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
     * Adds a new item to the ctrPtySdUnqTxIdr list.
     * @see #getCtrPtySdUnqTxIdr()
     * 
     */
    public CounterpartySideTransactionReporting1 addCtrPtySdUnqTxIdr(UniqueTransactionIdentifier2 ctrPtySdUnqTxIdr) {
        getCtrPtySdUnqTxIdr().add(ctrPtySdUnqTxIdr);
        return this;
    }

}
