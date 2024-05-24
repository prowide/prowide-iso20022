
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
 * Specifies the compensation for a valuation request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdjustmentCompensation1", propOrder = {
    "initlAmt",
    "dueChrgs",
    "amtDue",
    "compstnAgt",
    "compstnAcct",
    "prd",
    "intrstRate",
    "rsn"
})
public class AdjustmentCompensation1 {

    @XmlElement(name = "InitlAmt")
    protected ActiveCurrencyAndAmount initlAmt;
    @XmlElement(name = "DueChrgs")
    protected ActiveCurrencyAndAmount dueChrgs;
    @XmlElement(name = "AmtDue", required = true)
    protected ActiveCurrencyAndAmount amtDue;
    @XmlElement(name = "CompstnAgt")
    protected BranchAndFinancialInstitutionIdentification6 compstnAgt;
    @XmlElement(name = "CompstnAcct")
    protected CashAccount40 compstnAcct;
    @XmlElement(name = "Prd")
    protected DatePeriod5 prd;
    @XmlElement(name = "IntrstRate")
    protected BigDecimal intrstRate;
    @XmlElement(name = "Rsn")
    protected String rsn;

    /**
     * Gets the value of the initlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getInitlAmt() {
        return initlAmt;
    }

    /**
     * Sets the value of the initlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public AdjustmentCompensation1 setInitlAmt(ActiveCurrencyAndAmount value) {
        this.initlAmt = value;
        return this;
    }

    /**
     * Gets the value of the dueChrgs property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getDueChrgs() {
        return dueChrgs;
    }

    /**
     * Sets the value of the dueChrgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public AdjustmentCompensation1 setDueChrgs(ActiveCurrencyAndAmount value) {
        this.dueChrgs = value;
        return this;
    }

    /**
     * Gets the value of the amtDue property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAmtDue() {
        return amtDue;
    }

    /**
     * Sets the value of the amtDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public AdjustmentCompensation1 setAmtDue(ActiveCurrencyAndAmount value) {
        this.amtDue = value;
        return this;
    }

    /**
     * Gets the value of the compstnAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getCompstnAgt() {
        return compstnAgt;
    }

    /**
     * Sets the value of the compstnAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public AdjustmentCompensation1 setCompstnAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.compstnAgt = value;
        return this;
    }

    /**
     * Gets the value of the compstnAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getCompstnAcct() {
        return compstnAcct;
    }

    /**
     * Sets the value of the compstnAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public AdjustmentCompensation1 setCompstnAcct(CashAccount40 value) {
        this.compstnAcct = value;
        return this;
    }

    /**
     * Gets the value of the prd property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriod5 }
     *     
     */
    public DatePeriod5 getPrd() {
        return prd;
    }

    /**
     * Sets the value of the prd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriod5 }
     *     
     */
    public AdjustmentCompensation1 setPrd(DatePeriod5 value) {
        this.prd = value;
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
    public AdjustmentCompensation1 setIntrstRate(BigDecimal value) {
        this.intrstRate = value;
        return this;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdjustmentCompensation1 setRsn(String value) {
        this.rsn = value;
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
