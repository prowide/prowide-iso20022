
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
@XmlType(name = "Intermediary49", propOrder = {
    "id",
    "acct",
    "ordrOrgtrElgblty",
    "tradgPtyCpcty",
    "role"
})
public class Intermediary49 {

    @XmlElement(name = "Id", required = true)
    protected PartyIdentification139 id;
    @XmlElement(name = "Acct")
    protected Account35 acct;
    @XmlElement(name = "OrdrOrgtrElgblty")
    @XmlSchemaType(name = "string")
    protected OrderOriginatorEligibility1Code ordrOrgtrElgblty;
    @XmlElement(name = "TradgPtyCpcty")
    @XmlSchemaType(name = "string")
    protected TradingCapacity8Code tradgPtyCpcty;
    @XmlElement(name = "Role")
    protected InvestmentFundRole2Choice role;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification139 }
     *     
     */
    public PartyIdentification139 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification139 }
     *     
     */
    public Intermediary49 setId(PartyIdentification139 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link Account35 }
     *     
     */
    public Account35 getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account35 }
     *     
     */
    public Intermediary49 setAcct(Account35 value) {
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
    public Intermediary49 setOrdrOrgtrElgblty(OrderOriginatorEligibility1Code value) {
        this.ordrOrgtrElgblty = value;
        return this;
    }

    /**
     * Gets the value of the tradgPtyCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link TradingCapacity8Code }
     *     
     */
    public TradingCapacity8Code getTradgPtyCpcty() {
        return tradgPtyCpcty;
    }

    /**
     * Sets the value of the tradgPtyCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingCapacity8Code }
     *     
     */
    public Intermediary49 setTradgPtyCpcty(TradingCapacity8Code value) {
        this.tradgPtyCpcty = value;
        return this;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentFundRole2Choice }
     *     
     */
    public InvestmentFundRole2Choice getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentFundRole2Choice }
     *     
     */
    public Intermediary49 setRole(InvestmentFundRole2Choice value) {
        this.role = value;
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
