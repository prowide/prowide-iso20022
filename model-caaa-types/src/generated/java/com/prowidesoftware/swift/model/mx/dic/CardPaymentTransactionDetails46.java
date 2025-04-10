
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
 * Details of the payment transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentTransactionDetails46", propOrder = {
    "ccy",
    "ttlAmt",
    "amtQlfr",
    "dtldAmt",
    "iccRltdData"
})
public class CardPaymentTransactionDetails46 {

    @XmlElement(name = "Ccy", required = true)
    protected String ccy;
    @XmlElement(name = "TtlAmt", required = true)
    protected BigDecimal ttlAmt;
    @XmlElement(name = "AmtQlfr")
    @XmlSchemaType(name = "string")
    protected TypeOfAmount8Code amtQlfr;
    @XmlElement(name = "DtldAmt")
    protected DetailedAmount15 dtldAmt;
    @XmlElement(name = "ICCRltdData")
    protected byte[] iccRltdData;

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardPaymentTransactionDetails46 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the ttlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlAmt() {
        return ttlAmt;
    }

    /**
     * Sets the value of the ttlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CardPaymentTransactionDetails46 setTtlAmt(BigDecimal value) {
        this.ttlAmt = value;
        return this;
    }

    /**
     * Gets the value of the amtQlfr property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfAmount8Code }
     *     
     */
    public TypeOfAmount8Code getAmtQlfr() {
        return amtQlfr;
    }

    /**
     * Sets the value of the amtQlfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfAmount8Code }
     *     
     */
    public CardPaymentTransactionDetails46 setAmtQlfr(TypeOfAmount8Code value) {
        this.amtQlfr = value;
        return this;
    }

    /**
     * Gets the value of the dtldAmt property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedAmount15 }
     *     
     */
    public DetailedAmount15 getDtldAmt() {
        return dtldAmt;
    }

    /**
     * Sets the value of the dtldAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedAmount15 }
     *     
     */
    public CardPaymentTransactionDetails46 setDtldAmt(DetailedAmount15 value) {
        this.dtldAmt = value;
        return this;
    }

    /**
     * Gets the value of the iccRltdData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getICCRltdData() {
        return iccRltdData;
    }

    /**
     * Sets the value of the iccRltdData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public CardPaymentTransactionDetails46 setICCRltdData(byte[] value) {
        this.iccRltdData = value;
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
