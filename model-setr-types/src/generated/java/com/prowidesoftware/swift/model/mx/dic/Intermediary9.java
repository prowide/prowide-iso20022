
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Party that provides services to investors relating to financial products.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Intermediary9", propOrder = {
    "id",
    "acct",
    "ordrOrgtrElgblty",
    "tradgPtyCpcty",
    "role",
    "xtndedRole"
})
public class Intermediary9 {

    @XmlElement(name = "Id", required = true)
    protected PartyIdentification2Choice id;
    @XmlElement(name = "Acct")
    protected Account7 acct;
    @XmlElement(name = "OrdrOrgtrElgblty")
    @XmlSchemaType(name = "string")
    protected OrderOriginatorEligibility1Code ordrOrgtrElgblty;
    @XmlElement(name = "TradgPtyCpcty")
    @XmlSchemaType(name = "string")
    protected TradingCapacity2Code tradgPtyCpcty;
    @XmlElement(name = "Role")
    @XmlSchemaType(name = "string")
    protected InvestmentFundRole2Code role;
    @XmlElement(name = "XtndedRole")
    protected String xtndedRole;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public Intermediary9 setId(PartyIdentification2Choice value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link Account7 }
     *     
     */
    public Account7 getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account7 }
     *     
     */
    public Intermediary9 setAcct(Account7 value) {
        this.acct = value;
        return this;
    }

    /**
     * Gets the value of the ordrOrgtrElgblty property.
     * 
     * @return
     *     possible object is
     *     {@link OrderOriginatorEligibility1Code }
     *     
     */
    public OrderOriginatorEligibility1Code getOrdrOrgtrElgblty() {
        return ordrOrgtrElgblty;
    }

    /**
     * Sets the value of the ordrOrgtrElgblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderOriginatorEligibility1Code }
     *     
     */
    public Intermediary9 setOrdrOrgtrElgblty(OrderOriginatorEligibility1Code value) {
        this.ordrOrgtrElgblty = value;
        return this;
    }

    /**
     * Gets the value of the tradgPtyCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link TradingCapacity2Code }
     *     
     */
    public TradingCapacity2Code getTradgPtyCpcty() {
        return tradgPtyCpcty;
    }

    /**
     * Sets the value of the tradgPtyCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingCapacity2Code }
     *     
     */
    public Intermediary9 setTradgPtyCpcty(TradingCapacity2Code value) {
        this.tradgPtyCpcty = value;
        return this;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentFundRole2Code }
     *     
     */
    public InvestmentFundRole2Code getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentFundRole2Code }
     *     
     */
    public Intermediary9 setRole(InvestmentFundRole2Code value) {
        this.role = value;
        return this;
    }

    /**
     * Gets the value of the xtndedRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedRole() {
        return xtndedRole;
    }

    /**
     * Sets the value of the xtndedRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Intermediary9 setXtndedRole(String value) {
        this.xtndedRole = value;
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
