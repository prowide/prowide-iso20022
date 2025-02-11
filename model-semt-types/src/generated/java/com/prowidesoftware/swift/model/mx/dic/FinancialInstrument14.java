
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
@XmlType(name = "FinancialInstrument14", propOrder = {
    "id",
    "instrmDesc",
    "undrlygInstrmId"
})
public class FinancialInstrument14 {

    @XmlElement(name = "Id", required = true)
    protected SecurityIdentification5Choice id;
    @XmlElement(name = "InstrmDesc")
    protected SecurityInstrumentDescription1 instrmDesc;
    @XmlElement(name = "UndrlygInstrmId")
    protected SecurityIdentification5Choice undrlygInstrmId;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification5Choice }
     *     
     */
    public SecurityIdentification5Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification5Choice }
     *     
     */
    public FinancialInstrument14 setId(SecurityIdentification5Choice value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the instrmDesc property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityInstrumentDescription1 }
     *     
     */
    public SecurityInstrumentDescription1 getInstrmDesc() {
        return instrmDesc;
    }

    /**
     * Sets the value of the instrmDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityInstrumentDescription1 }
     *     
     */
    public FinancialInstrument14 setInstrmDesc(SecurityInstrumentDescription1 value) {
        this.instrmDesc = value;
        return this;
    }

    /**
     * Gets the value of the undrlygInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification5Choice }
     *     
     */
    public SecurityIdentification5Choice getUndrlygInstrmId() {
        return undrlygInstrmId;
    }

    /**
     * Sets the value of the undrlygInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification5Choice }
     *     
     */
    public FinancialInstrument14 setUndrlygInstrmId(SecurityIdentification5Choice value) {
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
