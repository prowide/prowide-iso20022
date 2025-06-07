
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
 * Net position of a segregated holding of a single security within the overall position held in the securities account, for example, sub-balance per status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HoldingBalance10", propOrder = {
    "bal",
    "balTp",
    "sfkpgPlc"
})
public class HoldingBalance10 {

    @XmlElement(name = "Bal", required = true)
    protected UnitOrFaceAmountOrCode2Choice bal;
    @XmlElement(name = "BalTp")
    @XmlSchemaType(name = "string")
    protected SecuritiesEntryType2Code balTp;
    @XmlElement(name = "SfkpgPlc")
    protected SafekeepingPlaceFormat28Choice sfkpgPlc;

    /**
     * Gets the value of the bal property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmountOrCode2Choice }
     *     
     */
    public UnitOrFaceAmountOrCode2Choice getBal() {
        return bal;
    }

    /**
     * Sets the value of the bal property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmountOrCode2Choice }
     *     
     */
    public HoldingBalance10 setBal(UnitOrFaceAmountOrCode2Choice value) {
        this.bal = value;
        return this;
    }

    /**
     * Gets the value of the balTp property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesEntryType2Code }
     *     
     */
    public SecuritiesEntryType2Code getBalTp() {
        return balTp;
    }

    /**
     * Sets the value of the balTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesEntryType2Code }
     *     
     */
    public HoldingBalance10 setBalTp(SecuritiesEntryType2Code value) {
        this.balTp = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceFormat28Choice }
     *     
     */
    public SafekeepingPlaceFormat28Choice getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceFormat28Choice }
     *     
     */
    public HoldingBalance10 setSfkpgPlc(SafekeepingPlaceFormat28Choice value) {
        this.sfkpgPlc = value;
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
