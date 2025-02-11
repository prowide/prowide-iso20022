
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
 * Identifies the financial instrument.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrument15", propOrder = {
    "id",
    "instrmDesc",
    "undrlygInstrmId"
})
public class FinancialInstrument15 {

    @XmlElement(name = "Id", required = true)
    protected SecurityIdentification6Choice id;
    @XmlElement(name = "InstrmDesc")
    protected SecurityInstrumentDescription2 instrmDesc;
    @XmlElement(name = "UndrlygInstrmId")
    protected SecurityIdentification6Choice undrlygInstrmId;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification6Choice }
     *     
     */
    public SecurityIdentification6Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification6Choice }
     *     
     */
    public FinancialInstrument15 setId(SecurityIdentification6Choice value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the instrmDesc property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityInstrumentDescription2 }
     *     
     */
    public SecurityInstrumentDescription2 getInstrmDesc() {
        return instrmDesc;
    }

    /**
     * Sets the value of the instrmDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityInstrumentDescription2 }
     *     
     */
    public FinancialInstrument15 setInstrmDesc(SecurityInstrumentDescription2 value) {
        this.instrmDesc = value;
        return this;
    }

    /**
     * Gets the value of the undrlygInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification6Choice }
     *     
     */
    public SecurityIdentification6Choice getUndrlygInstrmId() {
        return undrlygInstrmId;
    }

    /**
     * Sets the value of the undrlygInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification6Choice }
     *     
     */
    public FinancialInstrument15 setUndrlygInstrmId(SecurityIdentification6Choice value) {
        this.undrlygInstrmId = value;
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
