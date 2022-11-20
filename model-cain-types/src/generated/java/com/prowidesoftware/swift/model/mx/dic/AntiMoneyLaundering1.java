
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
 * Information requested against money laundering for a transfer transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AntiMoneyLaundering1", propOrder = {
    "sndrNm",
    "sndrAdr",
    "sndrNtlIdr",
    "ntlIdrCtry",
    "sndrPsptNb",
    "psptIssgCtry",
    "sndrTaxIdr",
    "taxCtry",
    "sndrCstmrIdr",
    "sndrDtAndPlcOfBirth",
    "rcvrNm",
    "txRef"
})
public class AntiMoneyLaundering1 {

    @XmlElement(name = "SndrNm")
    protected String sndrNm;
    @XmlElement(name = "SndrAdr")
    protected PostalAddress18 sndrAdr;
    @XmlElement(name = "SndrNtlIdr")
    protected String sndrNtlIdr;
    @XmlElement(name = "NtlIdrCtry")
    protected String ntlIdrCtry;
    @XmlElement(name = "SndrPsptNb")
    protected String sndrPsptNb;
    @XmlElement(name = "PsptIssgCtry")
    protected String psptIssgCtry;
    @XmlElement(name = "SndrTaxIdr")
    protected String sndrTaxIdr;
    @XmlElement(name = "TaxCtry")
    protected String taxCtry;
    @XmlElement(name = "SndrCstmrIdr")
    protected String sndrCstmrIdr;
    @XmlElement(name = "SndrDtAndPlcOfBirth")
    protected DateAndPlaceOfBirth sndrDtAndPlcOfBirth;
    @XmlElement(name = "RcvrNm")
    protected String rcvrNm;
    @XmlElement(name = "TxRef")
    protected String txRef;

    /**
     * Gets the value of the sndrNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSndrNm() {
        return sndrNm;
    }

    /**
     * Sets the value of the sndrNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AntiMoneyLaundering1 setSndrNm(String value) {
        this.sndrNm = value;
        return this;
    }

    /**
     * Gets the value of the sndrAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress18 }
     *     
     */
    public PostalAddress18 getSndrAdr() {
        return sndrAdr;
    }

    /**
     * Sets the value of the sndrAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress18 }
     *     
     */
    public AntiMoneyLaundering1 setSndrAdr(PostalAddress18 value) {
        this.sndrAdr = value;
        return this;
    }

    /**
     * Gets the value of the sndrNtlIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSndrNtlIdr() {
        return sndrNtlIdr;
    }

    /**
     * Sets the value of the sndrNtlIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AntiMoneyLaundering1 setSndrNtlIdr(String value) {
        this.sndrNtlIdr = value;
        return this;
    }

    /**
     * Gets the value of the ntlIdrCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtlIdrCtry() {
        return ntlIdrCtry;
    }

    /**
     * Sets the value of the ntlIdrCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AntiMoneyLaundering1 setNtlIdrCtry(String value) {
        this.ntlIdrCtry = value;
        return this;
    }

    /**
     * Gets the value of the sndrPsptNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSndrPsptNb() {
        return sndrPsptNb;
    }

    /**
     * Sets the value of the sndrPsptNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AntiMoneyLaundering1 setSndrPsptNb(String value) {
        this.sndrPsptNb = value;
        return this;
    }

    /**
     * Gets the value of the psptIssgCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPsptIssgCtry() {
        return psptIssgCtry;
    }

    /**
     * Sets the value of the psptIssgCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AntiMoneyLaundering1 setPsptIssgCtry(String value) {
        this.psptIssgCtry = value;
        return this;
    }

    /**
     * Gets the value of the sndrTaxIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSndrTaxIdr() {
        return sndrTaxIdr;
    }

    /**
     * Sets the value of the sndrTaxIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AntiMoneyLaundering1 setSndrTaxIdr(String value) {
        this.sndrTaxIdr = value;
        return this;
    }

    /**
     * Gets the value of the taxCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxCtry() {
        return taxCtry;
    }

    /**
     * Sets the value of the taxCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AntiMoneyLaundering1 setTaxCtry(String value) {
        this.taxCtry = value;
        return this;
    }

    /**
     * Gets the value of the sndrCstmrIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSndrCstmrIdr() {
        return sndrCstmrIdr;
    }

    /**
     * Sets the value of the sndrCstmrIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AntiMoneyLaundering1 setSndrCstmrIdr(String value) {
        this.sndrCstmrIdr = value;
        return this;
    }

    /**
     * Gets the value of the sndrDtAndPlcOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndPlaceOfBirth }
     *     
     */
    public DateAndPlaceOfBirth getSndrDtAndPlcOfBirth() {
        return sndrDtAndPlcOfBirth;
    }

    /**
     * Sets the value of the sndrDtAndPlcOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndPlaceOfBirth }
     *     
     */
    public AntiMoneyLaundering1 setSndrDtAndPlcOfBirth(DateAndPlaceOfBirth value) {
        this.sndrDtAndPlcOfBirth = value;
        return this;
    }

    /**
     * Gets the value of the rcvrNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcvrNm() {
        return rcvrNm;
    }

    /**
     * Sets the value of the rcvrNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AntiMoneyLaundering1 setRcvrNm(String value) {
        this.rcvrNm = value;
        return this;
    }

    /**
     * Gets the value of the txRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxRef() {
        return txRef;
    }

    /**
     * Sets the value of the txRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AntiMoneyLaundering1 setTxRef(String value) {
        this.txRef = value;
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
