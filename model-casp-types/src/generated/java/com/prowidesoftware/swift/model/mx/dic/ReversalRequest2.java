
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
 * Data to request a Reversal.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReversalRequest2", propOrder = {
    "orgnlPmtTx",
    "rvslRsn",
    "rvsdAmt",
    "cstmrOrdr"
})
public class ReversalRequest2 {

    @XmlElement(name = "OrgnlPmtTx")
    protected CardPaymentTransaction100 orgnlPmtTx;
    @XmlElement(name = "RvslRsn", required = true)
    @XmlSchemaType(name = "string")
    protected ReversalReason1Code rvslRsn;
    @XmlElement(name = "RvsdAmt")
    protected BigDecimal rvsdAmt;
    @XmlElement(name = "CstmrOrdr")
    protected CustomerOrder1 cstmrOrdr;

    /**
     * Gets the value of the orgnlPmtTx property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransaction100 }
     *     
     */
    public CardPaymentTransaction100 getOrgnlPmtTx() {
        return orgnlPmtTx;
    }

    /**
     * Sets the value of the orgnlPmtTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransaction100 }
     *     
     */
    public ReversalRequest2 setOrgnlPmtTx(CardPaymentTransaction100 value) {
        this.orgnlPmtTx = value;
        return this;
    }

    /**
     * Gets the value of the rvslRsn property.
     * 
     * @return
     *     possible object is
     *     {@link ReversalReason1Code }
     *     
     */
    public ReversalReason1Code getRvslRsn() {
        return rvslRsn;
    }

    /**
     * Sets the value of the rvslRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReversalReason1Code }
     *     
     */
    public ReversalRequest2 setRvslRsn(ReversalReason1Code value) {
        this.rvslRsn = value;
        return this;
    }

    /**
     * Gets the value of the rvsdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRvsdAmt() {
        return rvsdAmt;
    }

    /**
     * Sets the value of the rvsdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ReversalRequest2 setRvsdAmt(BigDecimal value) {
        this.rvsdAmt = value;
        return this;
    }

    /**
     * Gets the value of the cstmrOrdr property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrder1 }
     *     
     */
    public CustomerOrder1 getCstmrOrdr() {
        return cstmrOrdr;
    }

    /**
     * Sets the value of the cstmrOrdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrder1 }
     *     
     */
    public ReversalRequest2 setCstmrOrdr(CustomerOrder1 value) {
        this.cstmrOrdr = value;
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
