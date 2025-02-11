
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Set of information specific to the counterparty.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CounterpartyData89", propOrder = {
    "rptgCtrPty",
    "othrCtrPty",
    "nttyRspnsblForRpt",
    "othrPtyData"
})
public class CounterpartyData89 {

    @XmlElement(name = "RptgCtrPty", required = true)
    protected CounterpartyIdentification11 rptgCtrPty;
    @XmlElement(name = "OthrCtrPty", required = true)
    protected CounterpartyIdentification12 othrCtrPty;
    @XmlElement(name = "NttyRspnsblForRpt")
    protected OrganisationIdentification15Choice nttyRspnsblForRpt;
    @XmlElement(name = "OthrPtyData")
    protected TransactionCounterpartyData11 othrPtyData;

    /**
     * Gets the value of the rptgCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link CounterpartyIdentification11 }
     *     
     */
    public CounterpartyIdentification11 getRptgCtrPty() {
        return rptgCtrPty;
    }

    /**
     * Sets the value of the rptgCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CounterpartyIdentification11 }
     *     
     */
    public CounterpartyData89 setRptgCtrPty(CounterpartyIdentification11 value) {
        this.rptgCtrPty = value;
        return this;
    }

    /**
     * Gets the value of the othrCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link CounterpartyIdentification12 }
     *     
     */
    public CounterpartyIdentification12 getOthrCtrPty() {
        return othrCtrPty;
    }

    /**
     * Sets the value of the othrCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CounterpartyIdentification12 }
     *     
     */
    public CounterpartyData89 setOthrCtrPty(CounterpartyIdentification12 value) {
        this.othrCtrPty = value;
        return this;
    }

    /**
     * Gets the value of the nttyRspnsblForRpt property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public OrganisationIdentification15Choice getNttyRspnsblForRpt() {
        return nttyRspnsblForRpt;
    }

    /**
     * Sets the value of the nttyRspnsblForRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public CounterpartyData89 setNttyRspnsblForRpt(OrganisationIdentification15Choice value) {
        this.nttyRspnsblForRpt = value;
        return this;
    }

    /**
     * Gets the value of the othrPtyData property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionCounterpartyData11 }
     *     
     */
    public TransactionCounterpartyData11 getOthrPtyData() {
        return othrPtyData;
    }

    /**
     * Sets the value of the othrPtyData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionCounterpartyData11 }
     *     
     */
    public CounterpartyData89 setOthrPtyData(TransactionCounterpartyData11 value) {
        this.othrPtyData = value;
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

}
