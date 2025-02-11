
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
 * Security that is a sub-set of an investment fund, and is governed by the same investment fund policy, for example, dividend option or valuation currency.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrument64", propOrder = {
    "id",
    "nm",
    "shrtNm",
    "trfeeAcct",
    "subAcctDtls"
})
public class FinancialInstrument64 {

    @XmlElement(name = "Id", required = true)
    protected SecurityIdentification25Choice id;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "ShrtNm")
    protected String shrtNm;
    @XmlElement(name = "TrfeeAcct")
    protected Account24 trfeeAcct;
    @XmlElement(name = "SubAcctDtls")
    protected SubAccount5 subAcctDtls;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification25Choice }
     *     
     */
    public SecurityIdentification25Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification25Choice }
     *     
     */
    public FinancialInstrument64 setId(SecurityIdentification25Choice value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrument64 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the shrtNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShrtNm() {
        return shrtNm;
    }

    /**
     * Sets the value of the shrtNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrument64 setShrtNm(String value) {
        this.shrtNm = value;
        return this;
    }

    /**
     * Gets the value of the trfeeAcct property.
     * 
     * @return
     *     possible object is
     *     {@link Account24 }
     *     
     */
    public Account24 getTrfeeAcct() {
        return trfeeAcct;
    }

    /**
     * Sets the value of the trfeeAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account24 }
     *     
     */
    public FinancialInstrument64 setTrfeeAcct(Account24 value) {
        this.trfeeAcct = value;
        return this;
    }

    /**
     * Gets the value of the subAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SubAccount5 }
     *     
     */
    public SubAccount5 getSubAcctDtls() {
        return subAcctDtls;
    }

    /**
     * Sets the value of the subAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubAccount5 }
     *     
     */
    public FinancialInstrument64 setSubAcctDtls(SubAccount5 value) {
        this.subAcctDtls = value;
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
