
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
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
@XmlType(name = "Tax31", propOrder = {
    "tp",
    "apldAmt",
    "apldRate",
    "ctry",
    "rcptId",
    "taxClctnDtls"
})
public class Tax31 {

    @XmlElement(name = "Tp", required = true)
    protected TaxType3Choice tp;
    @XmlElement(name = "ApldAmt", required = true)
    protected ActiveCurrencyAndAmount apldAmt;
    @XmlElement(name = "ApldRate")
    protected BigDecimal apldRate;
    @XmlElement(name = "Ctry")
    protected String ctry;
    @XmlElement(name = "RcptId")
    protected PartyIdentification113 rcptId;
    @XmlElement(name = "TaxClctnDtls")
    protected TaxCalculationInformation10 taxClctnDtls;

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
    public Tax31 setTp(TaxType3Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the apldAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getApldAmt() {
        return apldAmt;
    }

    /**
     * Sets the value of the apldAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public Tax31 setApldAmt(ActiveCurrencyAndAmount value) {
        this.apldAmt = value;
        return this;
    }

    /**
     * Gets the value of the apldRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getApldRate() {
        return apldRate;
    }

    /**
     * Sets the value of the apldRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Tax31 setApldRate(BigDecimal value) {
        this.apldRate = value;
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
    public Tax31 setCtry(String value) {
        this.ctry = value;
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
    public Tax31 setRcptId(PartyIdentification113 value) {
        this.rcptId = value;
        return this;
    }

    /**
     * Gets the value of the taxClctnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TaxCalculationInformation10 }
     *     
     */
    public TaxCalculationInformation10 getTaxClctnDtls() {
        return taxClctnDtls;
    }

    /**
     * Sets the value of the taxClctnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxCalculationInformation10 }
     *     
     */
    public Tax31 setTaxClctnDtls(TaxCalculationInformation10 value) {
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
