
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Cash management feature limiting the maximum risk a party accepts to take with respect to a counterparty or a set of counterparties. A risk management limit is either bilateral, ie, for a counterparty, or multilateral, ie, for a set of counterparties or all other members in a system.The limit may also apply to sponsored members, ie, indirect members. In principle, a risk management limit is calculated on the net position between two members and is expressed as a credit or debit limit, from the point of view of the party setting the limit.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LimitIdentification7", propOrder = {
    "acctId",
    "tp",
    "lmtCcy",
    "acctOwnr",
    "bilLmtCtrPtyId"
})
public class LimitIdentification7 {

    @XmlElement(name = "AcctId", required = true)
    protected AccountIdentification4Choice acctId;
    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected LimitType4Code tp;
    @XmlElement(name = "LmtCcy")
    protected String lmtCcy;
    @XmlElement(name = "AcctOwnr", required = true)
    protected PartyIdentification136 acctOwnr;
    @XmlElement(name = "BilLmtCtrPtyId")
    protected SystemPartyIdentification8 bilLmtCtrPtyId;

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public AccountIdentification4Choice getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public LimitIdentification7 setAcctId(AccountIdentification4Choice value) {
        this.acctId = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link LimitType4Code }
     *     
     */
    public LimitType4Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitType4Code }
     *     
     */
    public LimitIdentification7 setTp(LimitType4Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the lmtCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLmtCcy() {
        return lmtCcy;
    }

    /**
     * Sets the value of the lmtCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LimitIdentification7 setLmtCcy(String value) {
        this.lmtCcy = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification136 }
     *     
     */
    public PartyIdentification136 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification136 }
     *     
     */
    public LimitIdentification7 setAcctOwnr(PartyIdentification136 value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the bilLmtCtrPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyIdentification8 }
     *     
     */
    public SystemPartyIdentification8 getBilLmtCtrPtyId() {
        return bilLmtCtrPtyId;
    }

    /**
     * Sets the value of the bilLmtCtrPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyIdentification8 }
     *     
     */
    public LimitIdentification7 setBilLmtCtrPtyId(SystemPartyIdentification8 value) {
        this.bilLmtCtrPtyId = value;
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
