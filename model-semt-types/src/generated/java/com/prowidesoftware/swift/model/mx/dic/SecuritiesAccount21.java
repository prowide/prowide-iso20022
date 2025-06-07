
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
 * Unambiguous identification for the account between the account owner and the account servicer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesAccount21", propOrder = {
    "acct",
    "subAcct",
    "baseCcy",
    "rptgCcy",
    "fxRate"
})
public class SecuritiesAccount21 {

    @XmlElement(name = "Acct", required = true)
    protected AccountIdentification5 acct;
    @XmlElement(name = "SubAcct")
    protected AccountIdentification5 subAcct;
    @XmlElement(name = "BaseCcy")
    protected String baseCcy;
    @XmlElement(name = "RptgCcy")
    protected String rptgCcy;
    @XmlElement(name = "FXRate")
    protected BigDecimal fxRate;

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification5 }
     *     
     */
    public AccountIdentification5 getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification5 }
     *     
     */
    public SecuritiesAccount21 setAcct(AccountIdentification5 value) {
        this.acct = value;
        return this;
    }

    /**
     * Gets the value of the subAcct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification5 }
     *     
     */
    public AccountIdentification5 getSubAcct() {
        return subAcct;
    }

    /**
     * Sets the value of the subAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification5 }
     *     
     */
    public SecuritiesAccount21 setSubAcct(AccountIdentification5 value) {
        this.subAcct = value;
        return this;
    }

    /**
     * Gets the value of the baseCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseCcy() {
        return baseCcy;
    }

    /**
     * Sets the value of the baseCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesAccount21 setBaseCcy(String value) {
        this.baseCcy = value;
        return this;
    }

    /**
     * Gets the value of the rptgCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptgCcy() {
        return rptgCcy;
    }

    /**
     * Sets the value of the rptgCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesAccount21 setRptgCcy(String value) {
        this.rptgCcy = value;
        return this;
    }

    /**
     * Gets the value of the fxRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFXRate() {
        return fxRate;
    }

    /**
     * Sets the value of the fxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public SecuritiesAccount21 setFXRate(BigDecimal value) {
        this.fxRate = value;
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
