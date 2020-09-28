
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Defines the party fields used to search for a payment.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTransactionParty", propOrder = {
    "dbtr",
    "frstAgt",
    "instgAgtCrspdt",
    "instdAgtCrspdt",
    "intrmy",
    "fnlAgt",
    "cdtr"
})
public class PaymentTransactionParty {

    @XmlElement(name = "Dbtr")
    protected String dbtr;
    @XmlElement(name = "FrstAgt")
    protected String frstAgt;
    @XmlElement(name = "InstgAgtCrspdt")
    protected String instgAgtCrspdt;
    @XmlElement(name = "InstdAgtCrspdt")
    protected String instdAgtCrspdt;
    @XmlElement(name = "Intrmy")
    protected String intrmy;
    @XmlElement(name = "FnlAgt")
    protected String fnlAgt;
    @XmlElement(name = "Cdtr")
    protected String cdtr;

    /**
     * Gets the value of the dbtr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentTransactionParty setDbtr(String value) {
        this.dbtr = value;
        return this;
    }

    /**
     * Gets the value of the frstAgt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrstAgt() {
        return frstAgt;
    }

    /**
     * Sets the value of the frstAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentTransactionParty setFrstAgt(String value) {
        this.frstAgt = value;
        return this;
    }

    /**
     * Gets the value of the instgAgtCrspdt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstgAgtCrspdt() {
        return instgAgtCrspdt;
    }

    /**
     * Sets the value of the instgAgtCrspdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentTransactionParty setInstgAgtCrspdt(String value) {
        this.instgAgtCrspdt = value;
        return this;
    }

    /**
     * Gets the value of the instdAgtCrspdt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstdAgtCrspdt() {
        return instdAgtCrspdt;
    }

    /**
     * Sets the value of the instdAgtCrspdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentTransactionParty setInstdAgtCrspdt(String value) {
        this.instdAgtCrspdt = value;
        return this;
    }

    /**
     * Gets the value of the intrmy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntrmy() {
        return intrmy;
    }

    /**
     * Sets the value of the intrmy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentTransactionParty setIntrmy(String value) {
        this.intrmy = value;
        return this;
    }

    /**
     * Gets the value of the fnlAgt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFnlAgt() {
        return fnlAgt;
    }

    /**
     * Sets the value of the fnlAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentTransactionParty setFnlAgt(String value) {
        this.fnlAgt = value;
        return this;
    }

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentTransactionParty setCdtr(String value) {
        this.cdtr = value;
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
