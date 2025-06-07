
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
 * Provides details related to each single order being part of the list order.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderStatus3", propOrder = {
    "clntOrdrId",
    "scndryClntOrdrId",
    "sd",
    "workgInd",
    "rmngQty",
    "cmltvQty",
    "cancQty",
    "avrgPric",
    "snglOrdrStsDtls"
})
public class OrderStatus3 {

    @XmlElement(name = "ClntOrdrId", required = true)
    protected String clntOrdrId;
    @XmlElement(name = "ScndryClntOrdrId")
    protected String scndryClntOrdrId;
    @XmlElement(name = "Sd", required = true)
    @XmlSchemaType(name = "string")
    protected Side1Code sd;
    @XmlElement(name = "WorkgInd")
    protected boolean workgInd;
    @XmlElement(name = "RmngQty", required = true)
    protected FinancialInstrumentQuantityChoice rmngQty;
    @XmlElement(name = "CmltvQty", required = true)
    protected FinancialInstrumentQuantityChoice cmltvQty;
    @XmlElement(name = "CancQty")
    protected FinancialInstrumentQuantityChoice cancQty;
    @XmlElement(name = "AvrgPric")
    protected Price1 avrgPric;
    @XmlElement(name = "SnglOrdrStsDtls", required = true)
    protected OrderStatusAndReason5 snglOrdrStsDtls;

    /**
     * Gets the value of the clntOrdrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntOrdrId() {
        return clntOrdrId;
    }

    /**
     * Sets the value of the clntOrdrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OrderStatus3 setClntOrdrId(String value) {
        this.clntOrdrId = value;
        return this;
    }

    /**
     * Gets the value of the scndryClntOrdrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScndryClntOrdrId() {
        return scndryClntOrdrId;
    }

    /**
     * Sets the value of the scndryClntOrdrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OrderStatus3 setScndryClntOrdrId(String value) {
        this.scndryClntOrdrId = value;
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
    public OrderStatus3 setSd(Side1Code value) {
        this.sd = value;
        return this;
    }

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
    public OrderStatus3 setWorkgInd(boolean value) {
        this.workgInd = value;
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
    public OrderStatus3 setRmngQty(FinancialInstrumentQuantityChoice value) {
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
    public OrderStatus3 setCmltvQty(FinancialInstrumentQuantityChoice value) {
        this.cmltvQty = value;
        return this;
    }

    /**
     * Gets the value of the cancQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public FinancialInstrumentQuantityChoice getCancQty() {
        return cancQty;
    }

    /**
     * Sets the value of the cancQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public OrderStatus3 setCancQty(FinancialInstrumentQuantityChoice value) {
        this.cancQty = value;
        return this;
    }

    /**
     * Gets the value of the avrgPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price1 }
     *     
     */
    public Price1 getAvrgPric() {
        return avrgPric;
    }

    /**
     * Sets the value of the avrgPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price1 }
     *     
     */
    public OrderStatus3 setAvrgPric(Price1 value) {
        this.avrgPric = value;
        return this;
    }

    /**
     * Gets the value of the snglOrdrStsDtls property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatusAndReason5 }
     *     
     */
    public OrderStatusAndReason5 getSnglOrdrStsDtls() {
        return snglOrdrStsDtls;
    }

    /**
     * Sets the value of the snglOrdrStsDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatusAndReason5 }
     *     
     */
    public OrderStatus3 setSnglOrdrStsDtls(OrderStatusAndReason5 value) {
        this.snglOrdrStsDtls = value;
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
