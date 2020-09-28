
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
@XmlType(name = "CounterpartyData51", propOrder = {
    "rptgCtrPty",
    "othrCtrPty",
    "nttyRspnsblForRpt",
    "txSpcfcData"
})
public class CounterpartyData51 {

    @XmlElement(name = "RptgCtrPty", required = true)
    protected CounterpartyIdentification1 rptgCtrPty;
    @XmlElement(name = "OthrCtrPty", required = true)
    protected CounterpartyIdentification2 othrCtrPty;
    @XmlElement(name = "NttyRspnsblForRpt")
    protected OrganisationIdentification9Choice nttyRspnsblForRpt;
    @XmlElement(name = "TxSpcfcData")
    protected TransactionCounterpartyData3Choice txSpcfcData;

    /**
     * Gets the value of the rptgCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link CounterpartyIdentification1 }
     *     
     */
    public CounterpartyIdentification1 getRptgCtrPty() {
        return rptgCtrPty;
    }

    /**
     * Sets the value of the rptgCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CounterpartyIdentification1 }
     *     
     */
    public CounterpartyData51 setRptgCtrPty(CounterpartyIdentification1 value) {
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
    public CounterpartyData51 setOthrCtrPty(CounterpartyIdentification2 value) {
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
    public CounterpartyData51 setNttyRspnsblForRpt(OrganisationIdentification9Choice value) {
        this.nttyRspnsblForRpt = value;
        return this;
    }

    /**
     * Gets the value of the txSpcfcData property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionCounterpartyData3Choice }
     *     
     */
    public TransactionCounterpartyData3Choice getTxSpcfcData() {
        return txSpcfcData;
    }

    /**
     * Sets the value of the txSpcfcData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionCounterpartyData3Choice }
     *     
     */
    public CounterpartyData51 setTxSpcfcData(TransactionCounterpartyData3Choice value) {
        this.txSpcfcData = value;
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
