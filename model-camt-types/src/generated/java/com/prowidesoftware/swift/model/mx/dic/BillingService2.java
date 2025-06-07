
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the values used for every line item service in the statement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingService2", propOrder = {
    "svcDtl",
    "pric",
    "pmtMtd",
    "orgnlChrgPric",
    "orgnlChrgSttlmAmt",
    "balReqrdAcctAmt",
    "taxDsgnt",
    "taxClctn"
})
public class BillingService2 {

    @XmlElement(name = "SvcDtl", required = true)
    protected BillingServiceParameters3 svcDtl;
    @XmlElement(name = "Pric")
    protected BillingPrice1 pric;
    @XmlElement(name = "PmtMtd", required = true)
    @XmlSchemaType(name = "string")
    protected ServicePaymentMethod1Code pmtMtd;
    @XmlElement(name = "OrgnlChrgPric", required = true)
    protected AmountAndDirection34 orgnlChrgPric;
    @XmlElement(name = "OrgnlChrgSttlmAmt")
    protected AmountAndDirection34 orgnlChrgSttlmAmt;
    @XmlElement(name = "BalReqrdAcctAmt")
    protected AmountAndDirection34 balReqrdAcctAmt;
    @XmlElement(name = "TaxDsgnt", required = true)
    protected ServiceTaxDesignation1 taxDsgnt;
    @XmlElement(name = "TaxClctn")
    protected BillingMethod1Choice taxClctn;

    /**
     * Gets the value of the svcDtl property.
     * 
     * @return
     *     possible object is
     *     {@link BillingServiceParameters3 }
     *     
     */
    public BillingServiceParameters3 getSvcDtl() {
        return svcDtl;
    }

    /**
     * Sets the value of the svcDtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingServiceParameters3 }
     *     
     */
    public BillingService2 setSvcDtl(BillingServiceParameters3 value) {
        this.svcDtl = value;
        return this;
    }

    /**
     * Gets the value of the pric property.
     * 
     * @return
     *     possible object is
     *     {@link BillingPrice1 }
     *     
     */
    public BillingPrice1 getPric() {
        return pric;
    }

    /**
     * Sets the value of the pric property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingPrice1 }
     *     
     */
    public BillingService2 setPric(BillingPrice1 value) {
        this.pric = value;
        return this;
    }

    /**
     * Gets the value of the pmtMtd property.
     * 
     * @return
     *     possible object is
     *     {@link ServicePaymentMethod1Code }
     *     
     */
    public ServicePaymentMethod1Code getPmtMtd() {
        return pmtMtd;
    }

    /**
     * Sets the value of the pmtMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicePaymentMethod1Code }
     *     
     */
    public BillingService2 setPmtMtd(ServicePaymentMethod1Code value) {
        this.pmtMtd = value;
        return this;
    }

    /**
     * Gets the value of the orgnlChrgPric property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public AmountAndDirection34 getOrgnlChrgPric() {
        return orgnlChrgPric;
    }

    /**
     * Sets the value of the orgnlChrgPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public BillingService2 setOrgnlChrgPric(AmountAndDirection34 value) {
        this.orgnlChrgPric = value;
        return this;
    }

    /**
     * Gets the value of the orgnlChrgSttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public AmountAndDirection34 getOrgnlChrgSttlmAmt() {
        return orgnlChrgSttlmAmt;
    }

    /**
     * Sets the value of the orgnlChrgSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public BillingService2 setOrgnlChrgSttlmAmt(AmountAndDirection34 value) {
        this.orgnlChrgSttlmAmt = value;
        return this;
    }

    /**
     * Gets the value of the balReqrdAcctAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public AmountAndDirection34 getBalReqrdAcctAmt() {
        return balReqrdAcctAmt;
    }

    /**
     * Sets the value of the balReqrdAcctAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public BillingService2 setBalReqrdAcctAmt(AmountAndDirection34 value) {
        this.balReqrdAcctAmt = value;
        return this;
    }

    /**
     * Gets the value of the taxDsgnt property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceTaxDesignation1 }
     *     
     */
    public ServiceTaxDesignation1 getTaxDsgnt() {
        return taxDsgnt;
    }

    /**
     * Sets the value of the taxDsgnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceTaxDesignation1 }
     *     
     */
    public BillingService2 setTaxDsgnt(ServiceTaxDesignation1 value) {
        this.taxDsgnt = value;
        return this;
    }

    /**
     * Gets the value of the taxClctn property.
     * 
     * @return
     *     possible object is
     *     {@link BillingMethod1Choice }
     *     
     */
    public BillingMethod1Choice getTaxClctn() {
        return taxClctn;
    }

    /**
     * Sets the value of the taxClctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingMethod1Choice }
     *     
     */
    public BillingService2 setTaxClctn(BillingMethod1Choice value) {
        this.taxClctn = value;
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
