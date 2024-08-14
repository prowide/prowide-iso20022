
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Deposit account used by the central counterparty to make payments to and from its clearing members.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementAccount1", propOrder = {
    "id",
    "endOfDayInitlMrgnClld",
    "endOfDayVartnMrgnClld",
    "endOfDayDfltFndClld",
    "endOfDaySttlmClld",
    "endOfDayOthrClld",
    "endOfDayLqdtyClld"
})
public class SettlementAccount1 {

    @XmlElement(name = "Id", required = true)
    protected GenericIdentification165 id;
    @XmlElement(name = "EndOfDayInitlMrgnClld", required = true)
    protected AmountAndDirection102 endOfDayInitlMrgnClld;
    @XmlElement(name = "EndOfDayVartnMrgnClld", required = true)
    protected AmountAndDirection102 endOfDayVartnMrgnClld;
    @XmlElement(name = "EndOfDayDfltFndClld", required = true)
    protected AmountAndDirection102 endOfDayDfltFndClld;
    @XmlElement(name = "EndOfDaySttlmClld", required = true)
    protected AmountAndDirection102 endOfDaySttlmClld;
    @XmlElement(name = "EndOfDayOthrClld", required = true)
    protected AmountAndDirection102 endOfDayOthrClld;
    @XmlElement(name = "EndOfDayLqdtyClld", required = true)
    protected AmountAndDirection102 endOfDayLqdtyClld;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification165 }
     *     
     */
    public GenericIdentification165 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification165 }
     *     
     */
    public SettlementAccount1 setId(GenericIdentification165 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the endOfDayInitlMrgnClld property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public AmountAndDirection102 getEndOfDayInitlMrgnClld() {
        return endOfDayInitlMrgnClld;
    }

    /**
     * Sets the value of the endOfDayInitlMrgnClld property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public SettlementAccount1 setEndOfDayInitlMrgnClld(AmountAndDirection102 value) {
        this.endOfDayInitlMrgnClld = value;
        return this;
    }

    /**
     * Gets the value of the endOfDayVartnMrgnClld property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public AmountAndDirection102 getEndOfDayVartnMrgnClld() {
        return endOfDayVartnMrgnClld;
    }

    /**
     * Sets the value of the endOfDayVartnMrgnClld property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public SettlementAccount1 setEndOfDayVartnMrgnClld(AmountAndDirection102 value) {
        this.endOfDayVartnMrgnClld = value;
        return this;
    }

    /**
     * Gets the value of the endOfDayDfltFndClld property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public AmountAndDirection102 getEndOfDayDfltFndClld() {
        return endOfDayDfltFndClld;
    }

    /**
     * Sets the value of the endOfDayDfltFndClld property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public SettlementAccount1 setEndOfDayDfltFndClld(AmountAndDirection102 value) {
        this.endOfDayDfltFndClld = value;
        return this;
    }

    /**
     * Gets the value of the endOfDaySttlmClld property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public AmountAndDirection102 getEndOfDaySttlmClld() {
        return endOfDaySttlmClld;
    }

    /**
     * Sets the value of the endOfDaySttlmClld property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public SettlementAccount1 setEndOfDaySttlmClld(AmountAndDirection102 value) {
        this.endOfDaySttlmClld = value;
        return this;
    }

    /**
     * Gets the value of the endOfDayOthrClld property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public AmountAndDirection102 getEndOfDayOthrClld() {
        return endOfDayOthrClld;
    }

    /**
     * Sets the value of the endOfDayOthrClld property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public SettlementAccount1 setEndOfDayOthrClld(AmountAndDirection102 value) {
        this.endOfDayOthrClld = value;
        return this;
    }

    /**
     * Gets the value of the endOfDayLqdtyClld property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public AmountAndDirection102 getEndOfDayLqdtyClld() {
        return endOfDayLqdtyClld;
    }

    /**
     * Sets the value of the endOfDayLqdtyClld property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public SettlementAccount1 setEndOfDayLqdtyClld(AmountAndDirection102 value) {
        this.endOfDayLqdtyClld = value;
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
