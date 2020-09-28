
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
 * Credit default swap derivative specific for reporting on a single name credit default swap.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditDefaultSwapSingleName2", propOrder = {
    "svrgnIssr",
    "refPty",
    "ntnlCcy"
})
public class CreditDefaultSwapSingleName2 {

    @XmlElement(name = "SvrgnIssr")
    protected boolean svrgnIssr;
    @XmlElement(name = "RefPty")
    protected DerivativePartyIdentification1Choice refPty;
    @XmlElement(name = "NtnlCcy", required = true)
    protected String ntnlCcy;

    /**
     * Gets the value of the svrgnIssr property.
     * 
     */
    public boolean isSvrgnIssr() {
        return svrgnIssr;
    }

    /**
     * Sets the value of the svrgnIssr property.
     * 
     */
    public CreditDefaultSwapSingleName2 setSvrgnIssr(boolean value) {
        this.svrgnIssr = value;
        return this;
    }

    /**
     * Gets the value of the refPty property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativePartyIdentification1Choice }
     *     
     */
    public DerivativePartyIdentification1Choice getRefPty() {
        return refPty;
    }

    /**
     * Sets the value of the refPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativePartyIdentification1Choice }
     *     
     */
    public CreditDefaultSwapSingleName2 setRefPty(DerivativePartyIdentification1Choice value) {
        this.refPty = value;
        return this;
    }

    /**
     * Gets the value of the ntnlCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtnlCcy() {
        return ntnlCcy;
    }

    /**
     * Sets the value of the ntnlCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CreditDefaultSwapSingleName2 setNtnlCcy(String value) {
        this.ntnlCcy = value;
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
