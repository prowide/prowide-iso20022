
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
 * Choice between specification of the balance type in structured or free text format.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesBalanceType1Choice", propOrder = {
    "strd",
    "ustrd"
})
public class SecuritiesBalanceType1Choice {

    @XmlElement(name = "Strd")
    @XmlSchemaType(name = "string")
    protected SecuritiesBalanceType1Code strd;
    @XmlElement(name = "Ustrd")
    protected String ustrd;

    /**
     * Gets the value of the strd property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesBalanceType1Code }
     *     
     */
    public SecuritiesBalanceType1Code getStrd() {
        return strd;
    }

    /**
     * Sets the value of the strd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesBalanceType1Code }
     *     
     */
    public SecuritiesBalanceType1Choice setStrd(SecuritiesBalanceType1Code value) {
        this.strd = value;
        return this;
    }

    /**
     * Gets the value of the ustrd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUstrd() {
        return ustrd;
    }

    /**
     * Sets the value of the ustrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesBalanceType1Choice setUstrd(String value) {
        this.ustrd = value;
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
