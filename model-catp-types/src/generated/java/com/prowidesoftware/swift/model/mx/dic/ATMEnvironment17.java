
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
 * Environment of the inquiry.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMEnvironment17", propOrder = {
    "acqrr",
    "atmMgrId",
    "hstgNtty",
    "atm",
    "cstmr",
    "card"
})
public class ATMEnvironment17 {

    @XmlElement(name = "Acqrr")
    protected Acquirer7 acqrr;
    @XmlElement(name = "ATMMgrId")
    protected String atmMgrId;
    @XmlElement(name = "HstgNtty")
    protected TerminalHosting1 hstgNtty;
    @XmlElement(name = "ATM", required = true)
    protected AutomatedTellerMachine11 atm;
    @XmlElement(name = "Cstmr")
    protected ATMCustomer8 cstmr;
    @XmlElement(name = "Card")
    protected PaymentCard36 card;

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
    public ATMEnvironment17 setAcqrr(Acquirer7 value) {
        this.acqrr = value;
        return this;
    }

    /**
     * Gets the value of the atmMgrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATMMgrId() {
        return atmMgrId;
    }

    /**
     * Sets the value of the atmMgrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMEnvironment17 setATMMgrId(String value) {
        this.atmMgrId = value;
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
    public ATMEnvironment17 setHstgNtty(TerminalHosting1 value) {
        this.hstgNtty = value;
        return this;
    }

    /**
     * Gets the value of the atm property.
     * 
     * @return
     *     possible object is
     *     {@link AutomatedTellerMachine11 }
     *     
     */
    public AutomatedTellerMachine11 getATM() {
        return atm;
    }

    /**
     * Sets the value of the atm property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutomatedTellerMachine11 }
     *     
     */
    public ATMEnvironment17 setATM(AutomatedTellerMachine11 value) {
        this.atm = value;
        return this;
    }

    /**
     * Gets the value of the cstmr property.
     * 
     * @return
     *     possible object is
     *     {@link ATMCustomer8 }
     *     
     */
    public ATMCustomer8 getCstmr() {
        return cstmr;
    }

    /**
     * Sets the value of the cstmr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCustomer8 }
     *     
     */
    public ATMEnvironment17 setCstmr(ATMCustomer8 value) {
        this.cstmr = value;
        return this;
    }

    /**
     * Gets the value of the card property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCard36 }
     *     
     */
    public PaymentCard36 getCard() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCard36 }
     *     
     */
    public ATMEnvironment17 setCard(PaymentCard36 value) {
        this.card = value;
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
