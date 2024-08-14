
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Environment of the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Environment9", propOrder = {
    "sttlmInstn",
    "sndr",
    "rcvr",
    "fi",
    "othrInstn"
})
public class Environment9 {

    @XmlElement(name = "SttlmInstn")
    protected PartyIdentification197 sttlmInstn;
    @XmlElement(name = "Sndr")
    protected PartyIdentification197 sndr;
    @XmlElement(name = "Rcvr")
    protected PartyIdentification197 rcvr;
    @XmlElement(name = "FI")
    protected FinancialInstitution5 fi;
    @XmlElement(name = "OthrInstn")
    protected PartyIdentification197 othrInstn;

    /**
     * Gets the value of the sttlmInstn property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification197 }
     *     
     */
    public PartyIdentification197 getSttlmInstn() {
        return sttlmInstn;
    }

    /**
     * Sets the value of the sttlmInstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification197 }
     *     
     */
    public Environment9 setSttlmInstn(PartyIdentification197 value) {
        this.sttlmInstn = value;
        return this;
    }

    /**
     * Gets the value of the sndr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification197 }
     *     
     */
    public PartyIdentification197 getSndr() {
        return sndr;
    }

    /**
     * Sets the value of the sndr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification197 }
     *     
     */
    public Environment9 setSndr(PartyIdentification197 value) {
        this.sndr = value;
        return this;
    }

    /**
     * Gets the value of the rcvr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification197 }
     *     
     */
    public PartyIdentification197 getRcvr() {
        return rcvr;
    }

    /**
     * Sets the value of the rcvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification197 }
     *     
     */
    public Environment9 setRcvr(PartyIdentification197 value) {
        this.rcvr = value;
        return this;
    }

    /**
     * Gets the value of the fi property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitution5 }
     *     
     */
    public FinancialInstitution5 getFI() {
        return fi;
    }

    /**
     * Sets the value of the fi property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitution5 }
     *     
     */
    public Environment9 setFI(FinancialInstitution5 value) {
        this.fi = value;
        return this;
    }

    /**
     * Gets the value of the othrInstn property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification197 }
     *     
     */
    public PartyIdentification197 getOthrInstn() {
        return othrInstn;
    }

    /**
     * Sets the value of the othrInstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification197 }
     *     
     */
    public Environment9 setOthrInstn(PartyIdentification197 value) {
        this.othrInstn = value;
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
