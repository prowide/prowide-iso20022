
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
 * Specifies two values to compare for a seniority type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompareSeniorityType1", propOrder = {
    "val1",
    "val2"
})
public class CompareSeniorityType1 {

    @XmlElement(name = "Val1")
    @XmlSchemaType(name = "string")
    protected DebtInstrumentSeniorityType2Code val1;
    @XmlElement(name = "Val2")
    @XmlSchemaType(name = "string")
    protected DebtInstrumentSeniorityType2Code val2;

    /**
     * Gets the value of the val1 property.
     * 
     * @return
     *     possible object is
     *     {@link DebtInstrumentSeniorityType2Code }
     *     
     */
    public DebtInstrumentSeniorityType2Code getVal1() {
        return val1;
    }

    /**
     * Sets the value of the val1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtInstrumentSeniorityType2Code }
     *     
     */
    public CompareSeniorityType1 setVal1(DebtInstrumentSeniorityType2Code value) {
        this.val1 = value;
        return this;
    }

    /**
     * Gets the value of the val2 property.
     * 
     * @return
     *     possible object is
     *     {@link DebtInstrumentSeniorityType2Code }
     *     
     */
    public DebtInstrumentSeniorityType2Code getVal2() {
        return val2;
    }

    /**
     * Sets the value of the val2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtInstrumentSeniorityType2Code }
     *     
     */
    public CompareSeniorityType1 setVal2(DebtInstrumentSeniorityType2Code value) {
        this.val2 = value;
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
