
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.Calendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Consideration, such as amount of money, paid or received in exchange for an amount of money that has been invested, loaned or borrowed for a certain period.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestCalculation1", propOrder = {
    "clctnDt",
    "fctvPrncplAmt",
    "prncplAmt",
    "mvmntAmt",
    "mvmntDrctn",
    "fctvRate",
    "intrstRate",
    "sprd",
    "acrdIntrstAmt",
    "aggtdIntrstAmt"
})
public class InterestCalculation1 {

    @XmlElement(name = "ClctnDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar clctnDt;
    @XmlElement(name = "FctvPrncplAmt", required = true)
    protected ActiveCurrencyAndAmount fctvPrncplAmt;
    @XmlElement(name = "PrncplAmt")
    protected ActiveCurrencyAndAmount prncplAmt;
    @XmlElement(name = "MvmntAmt")
    protected ActiveCurrencyAndAmount mvmntAmt;
    @XmlElement(name = "MvmntDrctn")
    @XmlSchemaType(name = "string")
    protected CreditDebitCode mvmntDrctn;
    @XmlElement(name = "FctvRate", required = true)
    protected BigDecimal fctvRate;
    @XmlElement(name = "IntrstRate")
    protected BigDecimal intrstRate;
    @XmlElement(name = "Sprd")
    protected BigDecimal sprd;
    @XmlElement(name = "AcrdIntrstAmt", required = true)
    protected ActiveCurrencyAndAmount acrdIntrstAmt;
    @XmlElement(name = "AggtdIntrstAmt")
    protected ActiveCurrencyAndAmount aggtdIntrstAmt;

    /**
     * Gets the value of the clctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getClctnDt() {
        return clctnDt;
    }

    /**
     * Sets the value of the clctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InterestCalculation1 setClctnDt(Calendar value) {
        this.clctnDt = value;
        return this;
    }

    /**
     * Gets the value of the fctvPrncplAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getFctvPrncplAmt() {
        return fctvPrncplAmt;
    }

    /**
     * Sets the value of the fctvPrncplAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public InterestCalculation1 setFctvPrncplAmt(ActiveCurrencyAndAmount value) {
        this.fctvPrncplAmt = value;
        return this;
    }

    /**
     * Gets the value of the prncplAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getPrncplAmt() {
        return prncplAmt;
    }

    /**
     * Sets the value of the prncplAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public InterestCalculation1 setPrncplAmt(ActiveCurrencyAndAmount value) {
        this.prncplAmt = value;
        return this;
    }

    /**
     * Gets the value of the mvmntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getMvmntAmt() {
        return mvmntAmt;
    }

    /**
     * Sets the value of the mvmntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public InterestCalculation1 setMvmntAmt(ActiveCurrencyAndAmount value) {
        this.mvmntAmt = value;
        return this;
    }

    /**
     * Gets the value of the mvmntDrctn property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebitCode }
     *     
     */
    public CreditDebitCode getMvmntDrctn() {
        return mvmntDrctn;
    }

    /**
     * Sets the value of the mvmntDrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebitCode }
     *     
     */
    public InterestCalculation1 setMvmntDrctn(CreditDebitCode value) {
        this.mvmntDrctn = value;
        return this;
    }

    /**
     * Gets the value of the fctvRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFctvRate() {
        return fctvRate;
    }

    /**
     * Sets the value of the fctvRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InterestCalculation1 setFctvRate(BigDecimal value) {
        this.fctvRate = value;
        return this;
    }

    /**
     * Gets the value of the intrstRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIntrstRate() {
        return intrstRate;
    }

    /**
     * Sets the value of the intrstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InterestCalculation1 setIntrstRate(BigDecimal value) {
        this.intrstRate = value;
        return this;
    }

    /**
     * Gets the value of the sprd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSprd() {
        return sprd;
    }

    /**
     * Sets the value of the sprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InterestCalculation1 setSprd(BigDecimal value) {
        this.sprd = value;
        return this;
    }

    /**
     * Gets the value of the acrdIntrstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAcrdIntrstAmt() {
        return acrdIntrstAmt;
    }

    /**
     * Sets the value of the acrdIntrstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public InterestCalculation1 setAcrdIntrstAmt(ActiveCurrencyAndAmount value) {
        this.acrdIntrstAmt = value;
        return this;
    }

    /**
     * Gets the value of the aggtdIntrstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAggtdIntrstAmt() {
        return aggtdIntrstAmt;
    }

    /**
     * Sets the value of the aggtdIntrstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public InterestCalculation1 setAggtdIntrstAmt(ActiveCurrencyAndAmount value) {
        this.aggtdIntrstAmt = value;
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
