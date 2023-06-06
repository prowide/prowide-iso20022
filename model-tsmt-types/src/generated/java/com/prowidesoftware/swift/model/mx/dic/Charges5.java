
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Charges related to a payment obligation contracted between two financial institutions related to the financing of a commercial transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Charges5", propOrder = {
    "chrgsPyer",
    "chrgsPyee",
    "amt",
    "pctg",
    "tp"
})
public class Charges5 {

    @XmlElement(name = "ChrgsPyer", required = true)
    @XmlSchemaType(name = "string")
    protected BankRole1Code chrgsPyer;
    @XmlElement(name = "ChrgsPyee", required = true)
    @XmlSchemaType(name = "string")
    protected BankRole1Code chrgsPyee;
    @XmlElement(name = "Amt")
    protected CurrencyAndAmount amt;
    @XmlElement(name = "Pctg")
    protected BigDecimal pctg;
    @XmlElement(name = "Tp")
    protected String tp;

    /**
     * Gets the value of the chrgsPyer property.
     * 
     * @return
     *     possible object is
     *     {@link BankRole1Code }
     *     
     */
    public BankRole1Code getChrgsPyer() {
        return chrgsPyer;
    }

    /**
     * Sets the value of the chrgsPyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankRole1Code }
     *     
     */
    public Charges5 setChrgsPyer(BankRole1Code value) {
        this.chrgsPyer = value;
        return this;
    }

    /**
     * Gets the value of the chrgsPyee property.
     * 
     * @return
     *     possible object is
     *     {@link BankRole1Code }
     *     
     */
    public BankRole1Code getChrgsPyee() {
        return chrgsPyee;
    }

    /**
     * Sets the value of the chrgsPyee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankRole1Code }
     *     
     */
    public Charges5 setChrgsPyee(BankRole1Code value) {
        this.chrgsPyee = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public Charges5 setAmt(CurrencyAndAmount value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the pctg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPctg() {
        return pctg;
    }

    /**
     * Sets the value of the pctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Charges5 setPctg(BigDecimal value) {
        this.pctg = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Charges5 setTp(String value) {
        this.tp = value;
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
