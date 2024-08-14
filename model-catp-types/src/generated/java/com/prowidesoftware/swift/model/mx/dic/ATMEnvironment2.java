
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
 * Environment of the withdrawal transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMEnvironment2", propOrder = {
    "acqrr",
    "atmMgr",
    "hstgNtty",
    "atm",
    "cstmr",
    "prtctdCardData",
    "plainCardData"
})
public class ATMEnvironment2 {

    @XmlElement(name = "Acqrr")
    protected Acquirer7 acqrr;
    @XmlElement(name = "ATMMgr")
    protected Acquirer8 atmMgr;
    @XmlElement(name = "HstgNtty")
    protected TerminalHosting1 hstgNtty;
    @XmlElement(name = "ATM", required = true)
    protected AutomatedTellerMachine2 atm;
    @XmlElement(name = "Cstmr", required = true)
    protected ATMCustomer2 cstmr;
    @XmlElement(name = "PrtctdCardData")
    protected ContentInformationType10 prtctdCardData;
    @XmlElement(name = "PlainCardData")
    protected PlainCardData14 plainCardData;

    /**
     * Gets the value of the acqrr property.
     * 
     * @return
     *     possible object is
     *     {@link Acquirer7 }
     *     
     */
    public Acquirer7 getAcqrr() {
        return acqrr;
    }

    /**
     * Sets the value of the acqrr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Acquirer7 }
     *     
     */
    public ATMEnvironment2 setAcqrr(Acquirer7 value) {
        this.acqrr = value;
        return this;
    }

    /**
     * Gets the value of the atmMgr property.
     * 
     * @return
     *     possible object is
     *     {@link Acquirer8 }
     *     
     */
    public Acquirer8 getATMMgr() {
        return atmMgr;
    }

    /**
     * Sets the value of the atmMgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Acquirer8 }
     *     
     */
    public ATMEnvironment2 setATMMgr(Acquirer8 value) {
        this.atmMgr = value;
        return this;
    }

    /**
     * Gets the value of the hstgNtty property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalHosting1 }
     *     
     */
    public TerminalHosting1 getHstgNtty() {
        return hstgNtty;
    }

    /**
     * Sets the value of the hstgNtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalHosting1 }
     *     
     */
    public ATMEnvironment2 setHstgNtty(TerminalHosting1 value) {
        this.hstgNtty = value;
        return this;
    }

    /**
     * Gets the value of the atm property.
     * 
     * @return
     *     possible object is
     *     {@link AutomatedTellerMachine2 }
     *     
     */
    public AutomatedTellerMachine2 getATM() {
        return atm;
    }

    /**
     * Sets the value of the atm property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutomatedTellerMachine2 }
     *     
     */
    public ATMEnvironment2 setATM(AutomatedTellerMachine2 value) {
        this.atm = value;
        return this;
    }

    /**
     * Gets the value of the cstmr property.
     * 
     * @return
     *     possible object is
     *     {@link ATMCustomer2 }
     *     
     */
    public ATMCustomer2 getCstmr() {
        return cstmr;
    }

    /**
     * Sets the value of the cstmr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCustomer2 }
     *     
     */
    public ATMEnvironment2 setCstmr(ATMCustomer2 value) {
        this.cstmr = value;
        return this;
    }

    /**
     * Gets the value of the prtctdCardData property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdCardData() {
        return prtctdCardData;
    }

    /**
     * Sets the value of the prtctdCardData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ATMEnvironment2 setPrtctdCardData(ContentInformationType10 value) {
        this.prtctdCardData = value;
        return this;
    }

    /**
     * Gets the value of the plainCardData property.
     * 
     * @return
     *     possible object is
     *     {@link PlainCardData14 }
     *     
     */
    public PlainCardData14 getPlainCardData() {
        return plainCardData;
    }

    /**
     * Sets the value of the plainCardData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlainCardData14 }
     *     
     */
    public ATMEnvironment2 setPlainCardData(PlainCardData14 value) {
        this.plainCardData = value;
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
