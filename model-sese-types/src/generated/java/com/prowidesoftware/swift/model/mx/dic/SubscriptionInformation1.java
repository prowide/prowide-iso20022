
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Execution of a subscription order.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionInformation1", propOrder = {
    "dtOfFrstSbcpt",
    "eqtyCmpnt",
    "cshCmpnt",
    "ttlAmtYrToDt"
})
public class SubscriptionInformation1 {

    @XmlElement(name = "DtOfFrstSbcpt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtOfFrstSbcpt;
    @XmlElement(name = "EqtyCmpnt")
    protected ActiveCurrencyAndAmount eqtyCmpnt;
    @XmlElement(name = "CshCmpnt")
    protected ActiveCurrencyAndAmount cshCmpnt;
    @XmlElement(name = "TtlAmtYrToDt", required = true)
    protected ActiveCurrencyAndAmount ttlAmtYrToDt;

    /**
     * Gets the value of the dtOfFrstSbcpt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtOfFrstSbcpt() {
        return dtOfFrstSbcpt;
    }

    /**
     * Sets the value of the dtOfFrstSbcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public SubscriptionInformation1 setDtOfFrstSbcpt(XMLGregorianCalendar value) {
        this.dtOfFrstSbcpt = value;
        return this;
    }

    /**
     * Gets the value of the eqtyCmpnt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getEqtyCmpnt() {
        return eqtyCmpnt;
    }

    /**
     * Sets the value of the eqtyCmpnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public SubscriptionInformation1 setEqtyCmpnt(ActiveCurrencyAndAmount value) {
        this.eqtyCmpnt = value;
        return this;
    }

    /**
     * Gets the value of the cshCmpnt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCshCmpnt() {
        return cshCmpnt;
    }

    /**
     * Sets the value of the cshCmpnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public SubscriptionInformation1 setCshCmpnt(ActiveCurrencyAndAmount value) {
        this.cshCmpnt = value;
        return this;
    }

    /**
     * Gets the value of the ttlAmtYrToDt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlAmtYrToDt() {
        return ttlAmtYrToDt;
    }

    /**
     * Sets the value of the ttlAmtYrToDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public SubscriptionInformation1 setTtlAmtYrToDt(ActiveCurrencyAndAmount value) {
        this.ttlAmtYrToDt = value;
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
