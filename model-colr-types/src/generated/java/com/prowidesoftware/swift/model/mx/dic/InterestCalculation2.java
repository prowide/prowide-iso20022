
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides the details of the interest calculation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestCalculation2", propOrder = {
    "clctnDt",
    "collAcctId",
    "fctvPrncplAmt",
    "prncplAmt",
    "mvmntAmt",
    "nbOfDays",
    "fctvRate",
    "intrstRate",
    "sprd",
    "acrdIntrstAmt",
    "aggtdIntrstAmt"
})
public class InterestCalculation2 {

    @XmlElement(name = "ClctnDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar clctnDt;
    @XmlElement(name = "CollAcctId")
    protected AccountIdentification1 collAcctId;
    @XmlElement(name = "FctvPrncplAmt", required = true)
    protected AmountAndDirection20 fctvPrncplAmt;
    @XmlElement(name = "PrncplAmt")
    protected AmountAndDirection20 prncplAmt;
    @XmlElement(name = "MvmntAmt")
    protected AmountAndDirection20 mvmntAmt;
    @XmlElement(name = "NbOfDays")
    protected BigDecimal nbOfDays;
    @XmlElement(name = "FctvRate", required = true)
    protected BigDecimal fctvRate;
    @XmlElement(name = "IntrstRate")
    protected BigDecimal intrstRate;
    @XmlElement(name = "Sprd")
    protected BigDecimal sprd;
    @XmlElement(name = "AcrdIntrstAmt", required = true)
    protected AmountAndDirection20 acrdIntrstAmt;
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
    public XMLGregorianCalendar getClctnDt() {
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
    public InterestCalculation2 setClctnDt(XMLGregorianCalendar value) {
        this.clctnDt = value;
        return this;
    }

    /**
     * Gets the value of the collAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification1 }
     *     
     */
    public AccountIdentification1 getCollAcctId() {
        return collAcctId;
    }

    /**
     * Sets the value of the collAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification1 }
     *     
     */
    public InterestCalculation2 setCollAcctId(AccountIdentification1 value) {
        this.collAcctId = value;
        return this;
    }

    /**
     * Gets the value of the fctvPrncplAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection20 }
     *     
     */
    public AmountAndDirection20 getFctvPrncplAmt() {
        return fctvPrncplAmt;
    }

    /**
     * Sets the value of the fctvPrncplAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection20 }
     *     
     */
    public InterestCalculation2 setFctvPrncplAmt(AmountAndDirection20 value) {
        this.fctvPrncplAmt = value;
        return this;
    }

    /**
     * Gets the value of the prncplAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection20 }
     *     
     */
    public AmountAndDirection20 getPrncplAmt() {
        return prncplAmt;
    }

    /**
     * Sets the value of the prncplAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection20 }
     *     
     */
    public InterestCalculation2 setPrncplAmt(AmountAndDirection20 value) {
        this.prncplAmt = value;
        return this;
    }

    /**
     * Gets the value of the mvmntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection20 }
     *     
     */
    public AmountAndDirection20 getMvmntAmt() {
        return mvmntAmt;
    }

    /**
     * Sets the value of the mvmntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection20 }
     *     
     */
    public InterestCalculation2 setMvmntAmt(AmountAndDirection20 value) {
        this.mvmntAmt = value;
        return this;
    }

    /**
     * Gets the value of the nbOfDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfDays() {
        return nbOfDays;
    }

    /**
     * Sets the value of the nbOfDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InterestCalculation2 setNbOfDays(BigDecimal value) {
        this.nbOfDays = value;
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
    public InterestCalculation2 setFctvRate(BigDecimal value) {
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
    public InterestCalculation2 setIntrstRate(BigDecimal value) {
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
    public InterestCalculation2 setSprd(BigDecimal value) {
        this.sprd = value;
        return this;
    }

    /**
     * Gets the value of the acrdIntrstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection20 }
     *     
     */
    public AmountAndDirection20 getAcrdIntrstAmt() {
        return acrdIntrstAmt;
    }

    /**
     * Sets the value of the acrdIntrstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection20 }
     *     
     */
    public InterestCalculation2 setAcrdIntrstAmt(AmountAndDirection20 value) {
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
    public InterestCalculation2 setAggtdIntrstAmt(ActiveCurrencyAndAmount value) {
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
