
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
 * Environment of the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Environment27", propOrder = {
    "sttlmInstn",
    "orgtr",
    "sndr",
    "rcvr",
    "dstn",
    "fi",
    "othrInstn"
})
public class Environment27 {

    @XmlElement(name = "SttlmInstn")
    protected PartyIdentification263 sttlmInstn;
    @XmlElement(name = "Orgtr")
    protected PartyIdentification263 orgtr;
    @XmlElement(name = "Sndr")
    protected PartyIdentification263 sndr;
    @XmlElement(name = "Rcvr")
    protected PartyIdentification263 rcvr;
    @XmlElement(name = "Dstn")
    protected PartyIdentification263 dstn;
    @XmlElement(name = "FI")
    protected FinancialInstitution6 fi;
    @XmlElement(name = "OthrInstn")
    protected PartyIdentification258 othrInstn;

    /**
     * Gets the value of the sttlmInstn property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification263 }
     *     
     */
    public PartyIdentification263 getSttlmInstn() {
        return sttlmInstn;
    }

    /**
     * Sets the value of the sttlmInstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification263 }
     *     
     */
    public Environment27 setSttlmInstn(PartyIdentification263 value) {
        this.sttlmInstn = value;
        return this;
    }

    /**
     * Gets the value of the orgtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification263 }
     *     
     */
    public PartyIdentification263 getOrgtr() {
        return orgtr;
    }

    /**
     * Sets the value of the orgtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification263 }
     *     
     */
    public Environment27 setOrgtr(PartyIdentification263 value) {
        this.orgtr = value;
        return this;
    }

    /**
     * Gets the value of the sndr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification263 }
     *     
     */
    public PartyIdentification263 getSndr() {
        return sndr;
    }

    /**
     * Sets the value of the sndr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification263 }
     *     
     */
    public Environment27 setSndr(PartyIdentification263 value) {
        this.sndr = value;
        return this;
    }

    /**
     * Gets the value of the rcvr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification263 }
     *     
     */
    public PartyIdentification263 getRcvr() {
        return rcvr;
    }

    /**
     * Sets the value of the rcvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification263 }
     *     
     */
    public Environment27 setRcvr(PartyIdentification263 value) {
        this.rcvr = value;
        return this;
    }

    /**
     * Gets the value of the dstn property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification263 }
     *     
     */
    public PartyIdentification263 getDstn() {
        return dstn;
    }

    /**
     * Sets the value of the dstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification263 }
     *     
     */
    public Environment27 setDstn(PartyIdentification263 value) {
        this.dstn = value;
        return this;
    }

    /**
     * Gets the value of the fi property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitution6 }
     *     
     */
    public FinancialInstitution6 getFI() {
        return fi;
    }

    /**
     * Sets the value of the fi property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitution6 }
     *     
     */
    public Environment27 setFI(FinancialInstitution6 value) {
        this.fi = value;
        return this;
    }

    /**
     * Gets the value of the othrInstn property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification258 }
     *     
     */
    public PartyIdentification258 getOthrInstn() {
        return othrInstn;
    }

    /**
     * Sets the value of the othrInstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification258 }
     *     
     */
    public Environment27 setOthrInstn(PartyIdentification258 value) {
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
