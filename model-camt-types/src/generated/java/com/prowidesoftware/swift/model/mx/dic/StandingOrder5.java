
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
@XmlType(name = "StandingOrder5", propOrder = {
    "amt",
    "cdtrAcct",
    "dbtrAcct",
    "exctnTp",
    "frqcy",
    "vldtyPrd",
    "zeroSweepInd"
})
public class StandingOrder5 {

    @XmlElement(name = "Amt")
    protected Amount2Choice amt;
    @XmlElement(name = "CdtrAcct")
    protected CashAccount24 cdtrAcct;
    @XmlElement(name = "DbtrAcct")
    protected CashAccount24 dbtrAcct;
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
    public StandingOrder5 setAmt(Amount2Choice value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount24 }
     *     
     */
    public CashAccount24 getCdtrAcct() {
        return cdtrAcct;
    }

    /**
     * Sets the value of the cdtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount24 }
     *     
     */
    public StandingOrder5 setCdtrAcct(CashAccount24 value) {
        this.cdtrAcct = value;
        return this;
    }

    /**
     * Gets the value of the dbtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount24 }
     *     
     */
    public CashAccount24 getDbtrAcct() {
        return dbtrAcct;
    }

    /**
     * Sets the value of the dbtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount24 }
     *     
     */
    public StandingOrder5 setDbtrAcct(CashAccount24 value) {
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
    public StandingOrder5 setExctnTp(ExecutionType1Choice value) {
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
    public StandingOrder5 setFrqcy(Frequency2Code value) {
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
    public StandingOrder5 setVldtyPrd(DatePeriod2Choice value) {
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
    public StandingOrder5 setZeroSweepInd(Boolean value) {
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
