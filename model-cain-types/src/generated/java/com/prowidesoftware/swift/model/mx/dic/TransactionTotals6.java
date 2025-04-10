
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
 * Additional count which may be utilised for reconciliation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionTotals6", propOrder = {
    "authstn",
    "authstnRvsl",
    "nqry",
    "nqryRvsl",
    "pmts",
    "pmtRvsl",
    "trf",
    "trfRvsl",
    "feeColltn"
})
public class TransactionTotals6 {

    @XmlElement(name = "Authstn")
    protected BigDecimal authstn;
    @XmlElement(name = "AuthstnRvsl")
    protected BigDecimal authstnRvsl;
    @XmlElement(name = "Nqry")
    protected BigDecimal nqry;
    @XmlElement(name = "NqryRvsl")
    protected BigDecimal nqryRvsl;
    @XmlElement(name = "Pmts")
    protected BigDecimal pmts;
    @XmlElement(name = "PmtRvsl")
    protected BigDecimal pmtRvsl;
    @XmlElement(name = "Trf")
    protected BigDecimal trf;
    @XmlElement(name = "TrfRvsl")
    protected BigDecimal trfRvsl;
    @XmlElement(name = "FeeColltn")
    protected BigDecimal feeColltn;

    /**
     * Gets the value of the authstn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAuthstn() {
        return authstn;
    }

    /**
     * Sets the value of the authstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TransactionTotals6 setAuthstn(BigDecimal value) {
        this.authstn = value;
        return this;
    }

    /**
     * Gets the value of the authstnRvsl property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAuthstnRvsl() {
        return authstnRvsl;
    }

    /**
     * Sets the value of the authstnRvsl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TransactionTotals6 setAuthstnRvsl(BigDecimal value) {
        this.authstnRvsl = value;
        return this;
    }

    /**
     * Gets the value of the nqry property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNqry() {
        return nqry;
    }

    /**
     * Sets the value of the nqry property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TransactionTotals6 setNqry(BigDecimal value) {
        this.nqry = value;
        return this;
    }

    /**
     * Gets the value of the nqryRvsl property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNqryRvsl() {
        return nqryRvsl;
    }

    /**
     * Sets the value of the nqryRvsl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TransactionTotals6 setNqryRvsl(BigDecimal value) {
        this.nqryRvsl = value;
        return this;
    }

    /**
     * Gets the value of the pmts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPmts() {
        return pmts;
    }

    /**
     * Sets the value of the pmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TransactionTotals6 setPmts(BigDecimal value) {
        this.pmts = value;
        return this;
    }

    /**
     * Gets the value of the pmtRvsl property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPmtRvsl() {
        return pmtRvsl;
    }

    /**
     * Sets the value of the pmtRvsl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TransactionTotals6 setPmtRvsl(BigDecimal value) {
        this.pmtRvsl = value;
        return this;
    }

    /**
     * Gets the value of the trf property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTrf() {
        return trf;
    }

    /**
     * Sets the value of the trf property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TransactionTotals6 setTrf(BigDecimal value) {
        this.trf = value;
        return this;
    }

    /**
     * Gets the value of the trfRvsl property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTrfRvsl() {
        return trfRvsl;
    }

    /**
     * Sets the value of the trfRvsl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TransactionTotals6 setTrfRvsl(BigDecimal value) {
        this.trfRvsl = value;
        return this;
    }

    /**
     * Gets the value of the feeColltn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFeeColltn() {
        return feeColltn;
    }

    /**
     * Sets the value of the feeColltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TransactionTotals6 setFeeColltn(BigDecimal value) {
        this.feeColltn = value;
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
