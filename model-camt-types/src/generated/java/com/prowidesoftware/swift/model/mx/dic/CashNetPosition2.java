
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
 * Specifies details of the cash net position.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashNetPosition2", propOrder = {
    "netPosId",
    "cshAcctOwnr",
    "cshAcct",
    "amt",
    "trstAmt",
    "authstnReqrd",
    "authstnRsn"
})
public class CashNetPosition2 {

    @XmlElement(name = "NetPosId", required = true)
    protected String netPosId;
    @XmlElement(name = "CshAcctOwnr")
    protected PartyIdentification125 cshAcctOwnr;
    @XmlElement(name = "CshAcct", required = true)
    protected CashAccount24 cshAcct;
    @XmlElement(name = "Amt", required = true)
    protected AmountAndDirection52 amt;
    @XmlElement(name = "TrstAmt")
    protected AmountAndDirection52 trstAmt;
    @XmlElement(name = "AuthstnReqrd")
    protected boolean authstnReqrd;
    @XmlElement(name = "AuthstnRsn")
    protected String authstnRsn;

    /**
     * Gets the value of the netPosId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetPosId() {
        return netPosId;
    }

    /**
     * Sets the value of the netPosId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CashNetPosition2 setNetPosId(String value) {
        this.netPosId = value;
        return this;
    }

    /**
     * Gets the value of the cshAcctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification125 }
     *     
     */
    public PartyIdentification125 getCshAcctOwnr() {
        return cshAcctOwnr;
    }

    /**
     * Sets the value of the cshAcctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification125 }
     *     
     */
    public CashNetPosition2 setCshAcctOwnr(PartyIdentification125 value) {
        this.cshAcctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the cshAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount24 }
     *     
     */
    public CashAccount24 getCshAcct() {
        return cshAcct;
    }

    /**
     * Sets the value of the cshAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount24 }
     *     
     */
    public CashNetPosition2 setCshAcct(CashAccount24 value) {
        this.cshAcct = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection52 }
     *     
     */
    public AmountAndDirection52 getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection52 }
     *     
     */
    public CashNetPosition2 setAmt(AmountAndDirection52 value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the trstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection52 }
     *     
     */
    public AmountAndDirection52 getTrstAmt() {
        return trstAmt;
    }

    /**
     * Sets the value of the trstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection52 }
     *     
     */
    public CashNetPosition2 setTrstAmt(AmountAndDirection52 value) {
        this.trstAmt = value;
        return this;
    }

    /**
     * Gets the value of the authstnReqrd property.
     * 
     */
    public boolean isAuthstnReqrd() {
        return authstnReqrd;
    }

    /**
     * Sets the value of the authstnReqrd property.
     * 
     */
    public CashNetPosition2 setAuthstnReqrd(boolean value) {
        this.authstnReqrd = value;
        return this;
    }

    /**
     * Gets the value of the authstnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthstnRsn() {
        return authstnRsn;
    }

    /**
     * Sets the value of the authstnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CashNetPosition2 setAuthstnRsn(String value) {
        this.authstnRsn = value;
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
