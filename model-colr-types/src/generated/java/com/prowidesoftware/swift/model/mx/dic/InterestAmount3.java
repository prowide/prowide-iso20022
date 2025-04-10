
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
 * Provides the elements related to the interest amount calculation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestAmount3", propOrder = {
    "acrdIntrstAmt",
    "valDt",
    "intrstMtd",
    "intrstPrd",
    "intrstRate",
    "dayCntBsis",
    "apldWhldgTax",
    "clctnMtd",
    "clctnFrqcy",
    "collPurp",
    "opngCollBal",
    "clsgCollBal",
    "stdSttlmInstrs",
    "addtlInf"
})
public class InterestAmount3 {

    @XmlElement(name = "AcrdIntrstAmt", required = true)
    protected ActiveCurrencyAndAmount acrdIntrstAmt;
    @XmlElement(name = "ValDt", required = true)
    protected DateAndDateTime2Choice valDt;
    @XmlElement(name = "IntrstMtd", required = true)
    @XmlSchemaType(name = "string")
    protected InterestMethod1Code intrstMtd;
    @XmlElement(name = "IntrstPrd", required = true)
    protected DatePeriod2 intrstPrd;
    @XmlElement(name = "IntrstRate")
    protected InterestRate1Choice intrstRate;
    @XmlElement(name = "DayCntBsis")
    @XmlSchemaType(name = "string")
    protected InterestComputationMethod2Code dayCntBsis;
    @XmlElement(name = "ApldWhldgTax")
    protected Boolean apldWhldgTax;
    @XmlElement(name = "ClctnMtd")
    @XmlSchemaType(name = "string")
    protected CalculationMethod1Code clctnMtd;
    @XmlElement(name = "ClctnFrqcy")
    @XmlSchemaType(name = "string")
    protected Frequency1Code clctnFrqcy;
    @XmlElement(name = "CollPurp", required = true)
    protected CollateralPurpose1Choice collPurp;
    @XmlElement(name = "OpngCollBal")
    protected CollateralBalance1 opngCollBal;
    @XmlElement(name = "ClsgCollBal", required = true)
    protected CollateralBalance1 clsgCollBal;
    @XmlElement(name = "StdSttlmInstrs")
    protected String stdSttlmInstrs;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;

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
    public InterestAmount3 setAcrdIntrstAmt(ActiveCurrencyAndAmount value) {
        this.acrdIntrstAmt = value;
        return this;
    }

    /**
     * Gets the value of the valDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getValDt() {
        return valDt;
    }

    /**
     * Sets the value of the valDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public InterestAmount3 setValDt(DateAndDateTime2Choice value) {
        this.valDt = value;
        return this;
    }

    /**
     * Gets the value of the intrstMtd property.
     * 
     * @return
     *     possible object is
     *     {@link InterestMethod1Code }
     *     
     */
    public InterestMethod1Code getIntrstMtd() {
        return intrstMtd;
    }

    /**
     * Sets the value of the intrstMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestMethod1Code }
     *     
     */
    public InterestAmount3 setIntrstMtd(InterestMethod1Code value) {
        this.intrstMtd = value;
        return this;
    }

    /**
     * Gets the value of the intrstPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriod2 }
     *     
     */
    public DatePeriod2 getIntrstPrd() {
        return intrstPrd;
    }

    /**
     * Sets the value of the intrstPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriod2 }
     *     
     */
    public InterestAmount3 setIntrstPrd(DatePeriod2 value) {
        this.intrstPrd = value;
        return this;
    }

    /**
     * Gets the value of the intrstRate property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRate1Choice }
     *     
     */
    public InterestRate1Choice getIntrstRate() {
        return intrstRate;
    }

    /**
     * Sets the value of the intrstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRate1Choice }
     *     
     */
    public InterestAmount3 setIntrstRate(InterestRate1Choice value) {
        this.intrstRate = value;
        return this;
    }

    /**
     * Gets the value of the dayCntBsis property.
     * 
     * @return
     *     possible object is
     *     {@link InterestComputationMethod2Code }
     *     
     */
    public InterestComputationMethod2Code getDayCntBsis() {
        return dayCntBsis;
    }

    /**
     * Sets the value of the dayCntBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestComputationMethod2Code }
     *     
     */
    public InterestAmount3 setDayCntBsis(InterestComputationMethod2Code value) {
        this.dayCntBsis = value;
        return this;
    }

    /**
     * Gets the value of the apldWhldgTax property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApldWhldgTax() {
        return apldWhldgTax;
    }

    /**
     * Sets the value of the apldWhldgTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public InterestAmount3 setApldWhldgTax(Boolean value) {
        this.apldWhldgTax = value;
        return this;
    }

    /**
     * Gets the value of the clctnMtd property.
     * 
     * @return
     *     possible object is
     *     {@link CalculationMethod1Code }
     *     
     */
    public CalculationMethod1Code getClctnMtd() {
        return clctnMtd;
    }

    /**
     * Sets the value of the clctnMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationMethod1Code }
     *     
     */
    public InterestAmount3 setClctnMtd(CalculationMethod1Code value) {
        this.clctnMtd = value;
        return this;
    }

    /**
     * Gets the value of the clctnFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency1Code }
     *     
     */
    public Frequency1Code getClctnFrqcy() {
        return clctnFrqcy;
    }

    /**
     * Sets the value of the clctnFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency1Code }
     *     
     */
    public InterestAmount3 setClctnFrqcy(Frequency1Code value) {
        this.clctnFrqcy = value;
        return this;
    }

    /**
     * Gets the value of the collPurp property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralPurpose1Choice }
     *     
     */
    public CollateralPurpose1Choice getCollPurp() {
        return collPurp;
    }

    /**
     * Sets the value of the collPurp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralPurpose1Choice }
     *     
     */
    public InterestAmount3 setCollPurp(CollateralPurpose1Choice value) {
        this.collPurp = value;
        return this;
    }

    /**
     * Gets the value of the opngCollBal property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralBalance1 }
     *     
     */
    public CollateralBalance1 getOpngCollBal() {
        return opngCollBal;
    }

    /**
     * Sets the value of the opngCollBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralBalance1 }
     *     
     */
    public InterestAmount3 setOpngCollBal(CollateralBalance1 value) {
        this.opngCollBal = value;
        return this;
    }

    /**
     * Gets the value of the clsgCollBal property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralBalance1 }
     *     
     */
    public CollateralBalance1 getClsgCollBal() {
        return clsgCollBal;
    }

    /**
     * Sets the value of the clsgCollBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralBalance1 }
     *     
     */
    public InterestAmount3 setClsgCollBal(CollateralBalance1 value) {
        this.clsgCollBal = value;
        return this;
    }

    /**
     * Gets the value of the stdSttlmInstrs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStdSttlmInstrs() {
        return stdSttlmInstrs;
    }

    /**
     * Sets the value of the stdSttlmInstrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InterestAmount3 setStdSttlmInstrs(String value) {
        this.stdSttlmInstrs = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InterestAmount3 setAddtlInf(String value) {
        this.addtlInf = value;
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
