
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
 * Distinct pool of financial instruments managed by a single investment policy. May or not be part of an umbrella fund.The pool is issued in at least one investment fund class.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundIdentification1", propOrder = {
    "fndId",
    "acctIdWthCtdn",
    "ctdnId"
})
public class FundIdentification1 {

    @XmlElement(name = "FndId", required = true)
    protected String fndId;
    @XmlElement(name = "AcctIdWthCtdn")
    protected String acctIdWthCtdn;
    @XmlElement(name = "CtdnId")
    protected PartyIdentification7Choice ctdnId;

    /**
     * Gets the value of the fndId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFndId() {
        return fndId;
    }

    /**
     * Sets the value of the fndId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FundIdentification1 setFndId(String value) {
        this.fndId = value;
        return this;
    }

    /**
     * Gets the value of the acctIdWthCtdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctIdWthCtdn() {
        return acctIdWthCtdn;
    }

    /**
     * Sets the value of the acctIdWthCtdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FundIdentification1 setAcctIdWthCtdn(String value) {
        this.acctIdWthCtdn = value;
        return this;
    }

    /**
     * Gets the value of the ctdnId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification7Choice }
     *     
     */
    public PartyIdentification7Choice getCtdnId() {
        return ctdnId;
    }

    /**
     * Sets the value of the ctdnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification7Choice }
     *     
     */
    public FundIdentification1 setCtdnId(PartyIdentification7Choice value) {
        this.ctdnId = value;
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
