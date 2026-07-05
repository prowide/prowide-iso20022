
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Data related specifically to counterparty.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CounterpartyData77", propOrder = {
    "rptgCtrPty",
    "othrCtrPty",
    "nttyRspnsblForRpt",
    "othrPtyData"
})
public class CounterpartyData77 {

    @XmlElement(name = "RptgCtrPty", required = true)
    protected CounterpartyIdentification4 rptgCtrPty;
    @XmlElement(name = "OthrCtrPty", required = true)
    protected CounterpartyIdentification2 othrCtrPty;
    @XmlElement(name = "NttyRspnsblForRpt")
    protected OrganisationIdentification9Choice nttyRspnsblForRpt;
    @XmlElement(name = "OthrPtyData")
    protected TransactionCounterpartyData8 othrPtyData;

    /**
     * Gets the value of the rptgCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link CounterpartyIdentification4 }
     *     
     */
    public CounterpartyIdentification4 getRptgCtrPty() {
        return rptgCtrPty;
    }

    /**
     * Sets the value of the rptgCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CounterpartyIdentification4 }
     *     
     */
    public CounterpartyData77 setRptgCtrPty(CounterpartyIdentification4 value) {
        this.rptgCtrPty = value;
        return this;
    }

    /**
     * Gets the value of the othrCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link CounterpartyIdentification2 }
     *     
     */
    public CounterpartyIdentification2 getOthrCtrPty() {
        return othrCtrPty;
    }

    /**
     * Sets the value of the othrCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CounterpartyIdentification2 }
     *     
     */
    public CounterpartyData77 setOthrCtrPty(CounterpartyIdentification2 value) {
        this.othrCtrPty = value;
        return this;
    }

    /**
     * Gets the value of the nttyRspnsblForRpt property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification9Choice }
     *     
     */
    public OrganisationIdentification9Choice getNttyRspnsblForRpt() {
        return nttyRspnsblForRpt;
    }

    /**
     * Sets the value of the nttyRspnsblForRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification9Choice }
     *     
     */
    public CounterpartyData77 setNttyRspnsblForRpt(OrganisationIdentification9Choice value) {
        this.nttyRspnsblForRpt = value;
        return this;
    }

    /**
     * Gets the value of the othrPtyData property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionCounterpartyData8 }
     *     
     */
    public TransactionCounterpartyData8 getOthrPtyData() {
        return othrPtyData;
    }

    /**
     * Sets the value of the othrPtyData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionCounterpartyData8 }
     *     
     */
    public CounterpartyData77 setOthrPtyData(TransactionCounterpartyData8 value) {
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
