
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
 * Tax related to an investment fund order.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tax30", propOrder = {
    "tp",
    "tax",
    "ctry",
    "xmptnInd",
    "xmptnRsn",
    "rcptId",
    "taxClctnDtls"
})
public class Tax30 {

    @XmlElement(name = "Tp", required = true)
    protected TaxType3Choice tp;
    @XmlElement(name = "Tax")
    protected TaxAmountOrRate4Choice tax;
    @XmlElement(name = "Ctry")
    protected String ctry;
    @XmlElement(name = "XmptnInd")
    protected boolean xmptnInd;
    @XmlElement(name = "XmptnRsn")
    protected ExemptionReason1Choice xmptnRsn;
    @XmlElement(name = "RcptId")
    protected PartyIdentification113 rcptId;
    @XmlElement(name = "TaxClctnDtls")
    protected TaxCalculationInformation9 taxClctnDtls;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link TaxType3Choice }
     *     
     */
    public TaxType3Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxType3Choice }
     *     
     */
    public Tax30 setTp(TaxType3Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link TaxAmountOrRate4Choice }
     *     
     */
    public TaxAmountOrRate4Choice getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxAmountOrRate4Choice }
     *     
     */
    public Tax30 setTax(TaxAmountOrRate4Choice value) {
        this.tax = value;
        return this;
    }

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Tax30 setCtry(String value) {
        this.ctry = value;
        return this;
    }

    /**
     * Gets the value of the xmptnInd property.
     * 
     */
    public boolean isXmptnInd() {
        return xmptnInd;
    }

    /**
     * Sets the value of the xmptnInd property.
     * 
     */
    public Tax30 setXmptnInd(boolean value) {
        this.xmptnInd = value;
        return this;
    }

    /**
     * Gets the value of the xmptnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link ExemptionReason1Choice }
     *     
     */
    public ExemptionReason1Choice getXmptnRsn() {
        return xmptnRsn;
    }

    /**
     * Sets the value of the xmptnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExemptionReason1Choice }
     *     
     */
    public Tax30 setXmptnRsn(ExemptionReason1Choice value) {
        this.xmptnRsn = value;
        return this;
    }

    /**
     * Gets the value of the rcptId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification113 }
     *     
     */
    public PartyIdentification113 getRcptId() {
        return rcptId;
    }

    /**
     * Sets the value of the rcptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification113 }
     *     
     */
    public Tax30 setRcptId(PartyIdentification113 value) {
        this.rcptId = value;
        return this;
    }

    /**
     * Gets the value of the taxClctnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TaxCalculationInformation9 }
     *     
     */
    public TaxCalculationInformation9 getTaxClctnDtls() {
        return taxClctnDtls;
    }

    /**
     * Sets the value of the taxClctnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxCalculationInformation9 }
     *     
     */
    public Tax30 setTaxClctnDtls(TaxCalculationInformation9 value) {
        this.taxClctnDtls = value;
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
