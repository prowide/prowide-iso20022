
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
 * Environment of the key download.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMEnvironment15", propOrder = {
    "acqrr",
    "atmMgrId",
    "hstgNtty",
    "atm"
})
public class ATMEnvironment15 {

    @XmlElement(name = "Acqrr")
    protected Acquirer7 acqrr;
    @XmlElement(name = "ATMMgrId")
    protected String atmMgrId;
    @XmlElement(name = "HstgNtty")
    protected TerminalHosting1 hstgNtty;
    @XmlElement(name = "ATM", required = true)
    protected AutomatedTellerMachine6 atm;

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
    public ATMEnvironment15 setAcqrr(Acquirer7 value) {
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
    public ATMEnvironment15 setATMMgrId(String value) {
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
    public ATMEnvironment15 setHstgNtty(TerminalHosting1 value) {
        this.hstgNtty = value;
        return this;
    }

    /**
     * Gets the value of the atm property.
     * 
     * @return
     *     possible object is
     *     {@link AutomatedTellerMachine6 }
     *     
     */
    public AutomatedTellerMachine6 getATM() {
        return atm;
    }

    /**
     * Sets the value of the atm property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutomatedTellerMachine6 }
     *     
     */
    public ATMEnvironment15 setATM(AutomatedTellerMachine6 value) {
        this.atm = value;
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
