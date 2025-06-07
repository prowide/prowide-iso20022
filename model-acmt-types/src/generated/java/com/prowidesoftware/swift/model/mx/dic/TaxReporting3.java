
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information for tax reporting.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxReporting3", propOrder = {
    "taxtnCtry",
    "taxRate",
    "taxPyer",
    "taxRcpt",
    "cshAcctDtls",
    "desc"
})
public class TaxReporting3 {

    @XmlElement(name = "TaxtnCtry", required = true)
    protected String taxtnCtry;
    @XmlElement(name = "TaxRate")
    protected BigDecimal taxRate;
    @XmlElement(name = "TaxPyer")
    protected PartyIdentification125Choice taxPyer;
    @XmlElement(name = "TaxRcpt")
    protected PartyIdentification125Choice taxRcpt;
    @XmlElement(name = "CshAcctDtls")
    protected CashAccount204 cshAcctDtls;
    @XmlElement(name = "Desc")
    protected String desc;

    /**
     * Gets the value of the taxtnCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxtnCtry() {
        return taxtnCtry;
    }

    /**
     * Sets the value of the taxtnCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TaxReporting3 setTaxtnCtry(String value) {
        this.taxtnCtry = value;
        return this;
    }

    /**
     * Gets the value of the taxRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxRate() {
        return taxRate;
    }

    /**
     * Sets the value of the taxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TaxReporting3 setTaxRate(BigDecimal value) {
        this.taxRate = value;
        return this;
    }

    /**
     * Gets the value of the taxPyer property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification125Choice }
     *     
     */
    public PartyIdentification125Choice getTaxPyer() {
        return taxPyer;
    }

    /**
     * Sets the value of the taxPyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification125Choice }
     *     
     */
    public TaxReporting3 setTaxPyer(PartyIdentification125Choice value) {
        this.taxPyer = value;
        return this;
    }

    /**
     * Gets the value of the taxRcpt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification125Choice }
     *     
     */
    public PartyIdentification125Choice getTaxRcpt() {
        return taxRcpt;
    }

    /**
     * Sets the value of the taxRcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification125Choice }
     *     
     */
    public TaxReporting3 setTaxRcpt(PartyIdentification125Choice value) {
        this.taxRcpt = value;
        return this;
    }

    /**
     * Gets the value of the cshAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount204 }
     *     
     */
    public CashAccount204 getCshAcctDtls() {
        return cshAcctDtls;
    }

    /**
     * Sets the value of the cshAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount204 }
     *     
     */
    public TaxReporting3 setCshAcctDtls(CashAccount204 value) {
        this.cshAcctDtls = value;
        return this;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TaxReporting3 setDesc(String value) {
        this.desc = value;
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
