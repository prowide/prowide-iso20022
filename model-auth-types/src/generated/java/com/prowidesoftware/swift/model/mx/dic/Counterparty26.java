
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
 * Information related to counterparty identification.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Counterparty26", propOrder = {
    "id",
    "ntr",
    "tradgCpcty",
    "ctrPtySd"
})
public class Counterparty26 {

    @XmlElement(name = "Id", required = true)
    protected OrganisationIdentification7Choice id;
    @XmlElement(name = "Ntr")
    protected CounterpartyTradeNature5Choice ntr;
    @XmlElement(name = "TradgCpcty")
    @XmlSchemaType(name = "string")
    protected TradingCapacity7Code tradgCpcty;
    @XmlElement(name = "CtrPtySd")
    @XmlSchemaType(name = "string")
    protected OptionParty1Code ctrPtySd;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification7Choice }
     *     
     */
    public OrganisationIdentification7Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification7Choice }
     *     
     */
    public Counterparty26 setId(OrganisationIdentification7Choice value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the ntr property.
     * 
     * @return
     *     possible object is
     *     {@link CounterpartyTradeNature5Choice }
     *     
     */
    public CounterpartyTradeNature5Choice getNtr() {
        return ntr;
    }

    /**
     * Sets the value of the ntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CounterpartyTradeNature5Choice }
     *     
     */
    public Counterparty26 setNtr(CounterpartyTradeNature5Choice value) {
        this.ntr = value;
        return this;
    }

    /**
     * Gets the value of the tradgCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link TradingCapacity7Code }
     *     
     */
    public TradingCapacity7Code getTradgCpcty() {
        return tradgCpcty;
    }

    /**
     * Sets the value of the tradgCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingCapacity7Code }
     *     
     */
    public Counterparty26 setTradgCpcty(TradingCapacity7Code value) {
        this.tradgCpcty = value;
        return this;
    }

    /**
     * Gets the value of the ctrPtySd property.
     * 
     * @return
     *     possible object is
     *     {@link OptionParty1Code }
     *     
     */
    public OptionParty1Code getCtrPtySd() {
        return ctrPtySd;
    }

    /**
     * Sets the value of the ctrPtySd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionParty1Code }
     *     
     */
    public Counterparty26 setCtrPtySd(OptionParty1Code value) {
        this.ctrPtySd = value;
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
