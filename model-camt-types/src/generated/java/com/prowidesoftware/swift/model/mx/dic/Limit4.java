
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Details on the limits.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Limit4", propOrder = {
    "amt",
    "cdtDbtInd",
    "sts",
    "startDtTm",
    "usdAmt",
    "usdAmtCdtDbtInd",
    "usdPctg",
    "rmngAmt"
})
public class Limit4 {

    @XmlElement(name = "Amt", required = true)
    protected Amount2Choice amt;
    @XmlElement(name = "CdtDbtInd")
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "Sts")
    @XmlSchemaType(name = "string")
    protected LimitStatus1Code sts;
    @XmlElement(name = "StartDtTm")
    protected DateAndDateTimeChoice startDtTm;
    @XmlElement(name = "UsdAmt")
    protected Amount2Choice usdAmt;
    @XmlElement(name = "UsdAmtCdtDbtInd")
    @XmlSchemaType(name = "string")
    protected CreditDebitCode usdAmtCdtDbtInd;
    @XmlElement(name = "UsdPctg")
    protected BigDecimal usdPctg;
    @XmlElement(name = "RmngAmt")
    protected Amount2Choice rmngAmt;

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
    public Limit4 setAmt(Amount2Choice value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the cdtDbtInd property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebitCode }
     *     
     */
    public CreditDebitCode getCdtDbtInd() {
        return cdtDbtInd;
    }

    /**
     * Sets the value of the cdtDbtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebitCode }
     *     
     */
    public Limit4 setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
        return this;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link LimitStatus1Code }
     *     
     */
    public LimitStatus1Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitStatus1Code }
     *     
     */
    public Limit4 setSts(LimitStatus1Code value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the startDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getStartDtTm() {
        return startDtTm;
    }

    /**
     * Sets the value of the startDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public Limit4 setStartDtTm(DateAndDateTimeChoice value) {
        this.startDtTm = value;
        return this;
    }

    /**
     * Gets the value of the usdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount2Choice }
     *     
     */
    public Amount2Choice getUsdAmt() {
        return usdAmt;
    }

    /**
     * Sets the value of the usdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount2Choice }
     *     
     */
    public Limit4 setUsdAmt(Amount2Choice value) {
        this.usdAmt = value;
        return this;
    }

    /**
     * Gets the value of the usdAmtCdtDbtInd property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebitCode }
     *     
     */
    public CreditDebitCode getUsdAmtCdtDbtInd() {
        return usdAmtCdtDbtInd;
    }

    /**
     * Sets the value of the usdAmtCdtDbtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebitCode }
     *     
     */
    public Limit4 setUsdAmtCdtDbtInd(CreditDebitCode value) {
        this.usdAmtCdtDbtInd = value;
        return this;
    }

    /**
     * Gets the value of the usdPctg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUsdPctg() {
        return usdPctg;
    }

    /**
     * Sets the value of the usdPctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Limit4 setUsdPctg(BigDecimal value) {
        this.usdPctg = value;
        return this;
    }

    /**
     * Gets the value of the rmngAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount2Choice }
     *     
     */
    public Amount2Choice getRmngAmt() {
        return rmngAmt;
    }

    /**
     * Sets the value of the rmngAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount2Choice }
     *     
     */
    public Limit4 setRmngAmt(Amount2Choice value) {
        this.rmngAmt = value;
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
