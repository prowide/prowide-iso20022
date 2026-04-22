
package com.prowidesoftware.swift.model.mx.dic;

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
 * Specifies the header details of the cash obligation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashObligationHeader1", propOrder = {
    "rptId",
    "sttlmDt",
    "cshOblgtnSts",
    "mktInfrstrctrTxId"
})
public class CashObligationHeader1 {

    @XmlElement(name = "RptId")
    protected String rptId;
    @XmlElement(name = "SttlmDt", required = true)
    protected DateAndDateTime1Choice sttlmDt;
    @XmlElement(name = "CshOblgtnSts", required = true)
    @XmlSchemaType(name = "string")
    protected CashObligationStatus1Code cshOblgtnSts;
    @XmlElement(name = "MktInfrstrctrTxId")
    protected String mktInfrstrctrTxId;

    /**
     * Gets the value of the rptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptId() {
        return rptId;
    }

    /**
     * Sets the value of the rptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CashObligationHeader1 setRptId(String value) {
        this.rptId = value;
        return this;
    }

    /**
     * Gets the value of the sttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime1Choice }
     *     
     */
    public DateAndDateTime1Choice getSttlmDt() {
        return sttlmDt;
    }

    /**
     * Sets the value of the sttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime1Choice }
     *     
     */
    public CashObligationHeader1 setSttlmDt(DateAndDateTime1Choice value) {
        this.sttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the cshOblgtnSts property.
     * 
     * @return
     *     possible object is
     *     {@link CashObligationStatus1Code }
     *     
     */
    public CashObligationStatus1Code getCshOblgtnSts() {
        return cshOblgtnSts;
    }

    /**
     * Sets the value of the cshOblgtnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashObligationStatus1Code }
     *     
     */
    public CashObligationHeader1 setCshOblgtnSts(CashObligationStatus1Code value) {
        this.cshOblgtnSts = value;
        return this;
    }

    /**
     * Gets the value of the mktInfrstrctrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMktInfrstrctrTxId() {
        return mktInfrstrctrTxId;
    }

    /**
     * Sets the value of the mktInfrstrctrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CashObligationHeader1 setMktInfrstrctrTxId(String value) {
        this.mktInfrstrctrTxId = value;
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
