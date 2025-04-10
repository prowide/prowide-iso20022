
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * New standing order values.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandingOrder7", propOrder = {
    "amt",
    "cdtr",
    "cdtrAcct",
    "dbtr",
    "dbtrAcct",
    "exctnTp",
    "frqcy",
    "vldtyPrd",
    "zeroSweepInd"
})
public class StandingOrder7 {

    @XmlElement(name = "Amt")
    protected Amount2Choice amt;
    @XmlElement(name = "Cdtr")
    protected BranchAndFinancialInstitutionIdentification6 cdtr;
    @XmlElement(name = "CdtrAcct")
    protected CashAccount38 cdtrAcct;
    @XmlElement(name = "Dbtr")
    protected BranchAndFinancialInstitutionIdentification6 dbtr;
    @XmlElement(name = "DbtrAcct")
    protected CashAccount38 dbtrAcct;
    @XmlElement(name = "ExctnTp")
    protected ExecutionType1Choice exctnTp;
    @XmlElement(name = "Frqcy")
    @XmlSchemaType(name = "string")
    protected Frequency2Code frqcy;
    @XmlElement(name = "VldtyPrd")
    protected DatePeriod2Choice vldtyPrd;
    @XmlElement(name = "ZeroSweepInd")
    protected Boolean zeroSweepInd;

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount2Choice }
     *     
     */
    public Amount2Choice getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount2Choice }
     *     
     */
    public StandingOrder7 setAmt(Amount2Choice value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public StandingOrder7 setCdtr(BranchAndFinancialInstitutionIdentification6 value) {
        this.cdtr = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount38 }
     *     
     */
    public CashAccount38 getCdtrAcct() {
        return cdtrAcct;
    }

    /**
     * Sets the value of the cdtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount38 }
     *     
     */
    public StandingOrder7 setCdtrAcct(CashAccount38 value) {
        this.cdtrAcct = value;
        return this;
    }

    /**
     * Gets the value of the dbtr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public StandingOrder7 setDbtr(BranchAndFinancialInstitutionIdentification6 value) {
        this.dbtr = value;
        return this;
    }

    /**
     * Gets the value of the dbtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount38 }
     *     
     */
    public CashAccount38 getDbtrAcct() {
        return dbtrAcct;
    }

    /**
     * Sets the value of the dbtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount38 }
     *     
     */
    public StandingOrder7 setDbtrAcct(CashAccount38 value) {
        this.dbtrAcct = value;
        return this;
    }

    /**
     * Gets the value of the exctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link ExecutionType1Choice }
     *     
     */
    public ExecutionType1Choice getExctnTp() {
        return exctnTp;
    }

    /**
     * Sets the value of the exctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutionType1Choice }
     *     
     */
    public StandingOrder7 setExctnTp(ExecutionType1Choice value) {
        this.exctnTp = value;
        return this;
    }

    /**
     * Gets the value of the frqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency2Code }
     *     
     */
    public Frequency2Code getFrqcy() {
        return frqcy;
    }

    /**
     * Sets the value of the frqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency2Code }
     *     
     */
    public StandingOrder7 setFrqcy(Frequency2Code value) {
        this.frqcy = value;
        return this;
    }

    /**
     * Gets the value of the vldtyPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriod2Choice }
     *     
     */
    public DatePeriod2Choice getVldtyPrd() {
        return vldtyPrd;
    }

    /**
     * Sets the value of the vldtyPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriod2Choice }
     *     
     */
    public StandingOrder7 setVldtyPrd(DatePeriod2Choice value) {
        this.vldtyPrd = value;
        return this;
    }

    /**
     * Gets the value of the zeroSweepInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isZeroSweepInd() {
        return zeroSweepInd;
    }

    /**
     * Sets the value of the zeroSweepInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public StandingOrder7 setZeroSweepInd(Boolean value) {
        this.zeroSweepInd = value;
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
