
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
 * Environment related to the reconciliation of the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Environment3", propOrder = {
    "orgtr",
    "sndr",
    "rcvr",
    "dstn"
})
public class Environment3 {

    @XmlElement(name = "Orgtr")
    protected PartyIdentification197 orgtr;
    @XmlElement(name = "Sndr")
    protected PartyIdentification197 sndr;
    @XmlElement(name = "Rcvr")
    protected PartyIdentification197 rcvr;
    @XmlElement(name = "Dstn")
    protected PartyIdentification197 dstn;

    /**
     * Gets the value of the orgtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification197 }
     *     
     */
    public PartyIdentification197 getOrgtr() {
        return orgtr;
    }

    /**
     * Sets the value of the orgtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification197 }
     *     
     */
    public Environment3 setOrgtr(PartyIdentification197 value) {
        this.orgtr = value;
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
    public Environment3 setSndr(PartyIdentification197 value) {
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
    public Environment3 setRcvr(PartyIdentification197 value) {
        this.rcvr = value;
        return this;
    }

    /**
     * Gets the value of the dstn property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification197 }
     *     
     */
    public PartyIdentification197 getDstn() {
        return dstn;
    }

    /**
     * Sets the value of the dstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification197 }
     *     
     */
    public Environment3 setDstn(PartyIdentification197 value) {
        this.dstn = value;
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
