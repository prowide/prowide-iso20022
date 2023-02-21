
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
 * Provides details related to the order.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderStatus1", propOrder = {
    "workgInd",
    "sd",
    "rmngQty",
    "cmltvQty",
    "ttlNbRpts",
    "lastRptReqd",
    "ordrQtyDtls"
})
public class OrderStatus1 {

    @XmlElement(name = "WorkgInd")
    protected boolean workgInd;
    @XmlElement(name = "Sd", required = true)
    @XmlSchemaType(name = "string")
    protected Side1Code sd;
    @XmlElement(name = "RmngQty", required = true)
    protected FinancialInstrumentQuantityChoice rmngQty;
    @XmlElement(name = "CmltvQty", required = true)
    protected FinancialInstrumentQuantityChoice cmltvQty;
    @XmlElement(name = "TtlNbRpts", required = true)
    protected BigDecimal ttlNbRpts;
    @XmlElement(name = "LastRptReqd")
    protected boolean lastRptReqd;
    @XmlElement(name = "OrdrQtyDtls")
    protected OrderQuantity1 ordrQtyDtls;

    /**
     * Gets the value of the workgInd property.
     * 
     */
    public boolean isWorkgInd() {
        return workgInd;
    }

    /**
     * Sets the value of the workgInd property.
     * 
     */
    public OrderStatus1 setWorkgInd(boolean value) {
        this.workgInd = value;
        return this;
    }

    /**
     * Gets the value of the sd property.
     * 
     * @return
     *     possible object is
     *     {@link Side1Code }
     *     
     */
    public Side1Code getSd() {
        return sd;
    }

    /**
     * Sets the value of the sd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Side1Code }
     *     
     */
    public OrderStatus1 setSd(Side1Code value) {
        this.sd = value;
        return this;
    }

    /**
     * Gets the value of the rmngQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public FinancialInstrumentQuantityChoice getRmngQty() {
        return rmngQty;
    }

    /**
     * Sets the value of the rmngQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public OrderStatus1 setRmngQty(FinancialInstrumentQuantityChoice value) {
        this.rmngQty = value;
        return this;
    }

    /**
     * Gets the value of the cmltvQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public FinancialInstrumentQuantityChoice getCmltvQty() {
        return cmltvQty;
    }

    /**
     * Sets the value of the cmltvQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public OrderStatus1 setCmltvQty(FinancialInstrumentQuantityChoice value) {
        this.cmltvQty = value;
        return this;
    }

    /**
     * Gets the value of the ttlNbRpts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlNbRpts() {
        return ttlNbRpts;
    }

    /**
     * Sets the value of the ttlNbRpts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public OrderStatus1 setTtlNbRpts(BigDecimal value) {
        this.ttlNbRpts = value;
        return this;
    }

    /**
     * Gets the value of the lastRptReqd property.
     * 
     */
    public boolean isLastRptReqd() {
        return lastRptReqd;
    }

    /**
     * Sets the value of the lastRptReqd property.
     * 
     */
    public OrderStatus1 setLastRptReqd(boolean value) {
        this.lastRptReqd = value;
        return this;
    }

    /**
     * Gets the value of the ordrQtyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link OrderQuantity1 }
     *     
     */
    public OrderQuantity1 getOrdrQtyDtls() {
        return ordrQtyDtls;
    }

    /**
     * Sets the value of the ordrQtyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderQuantity1 }
     *     
     */
    public OrderStatus1 setOrdrQtyDtls(OrderQuantity1 value) {
        this.ordrQtyDtls = value;
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
