
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
 * Contains a coupled clearing member and clearing fee.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearingMemberFee1", propOrder = {
    "clrMmbId",
    "clrFee"
})
public class ClearingMemberFee1 {

    @XmlElement(name = "ClrMmbId", required = true)
    protected PartyIdentification118Choice clrMmbId;
    @XmlElement(name = "ClrFee", required = true)
    protected ActiveCurrencyAndAmount clrFee;

    /**
     * Gets the value of the clrMmbId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification118Choice }
     *     
     */
    public PartyIdentification118Choice getClrMmbId() {
        return clrMmbId;
    }

    /**
     * Sets the value of the clrMmbId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification118Choice }
     *     
     */
    public ClearingMemberFee1 setClrMmbId(PartyIdentification118Choice value) {
        this.clrMmbId = value;
        return this;
    }

    /**
     * Gets the value of the clrFee property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getClrFee() {
        return clrFee;
    }

    /**
     * Sets the value of the clrFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ClearingMemberFee1 setClrFee(ActiveCurrencyAndAmount value) {
        this.clrFee = value;
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
