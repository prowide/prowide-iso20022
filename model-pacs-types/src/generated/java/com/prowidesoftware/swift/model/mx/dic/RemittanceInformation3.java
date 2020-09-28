
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
 * Information supplied to enable the matching of an entry with the items that the transfer is intended to settle, eg, commercial invoices in an accounts' receivable system.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemittanceInformation3", propOrder = {
    "ustrd",
    "strd"
})
public class RemittanceInformation3 {

    @XmlElement(name = "Ustrd")
    protected String ustrd;
    @XmlElement(name = "Strd")
    protected StructuredRemittanceInformation6 strd;

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
    public RemittanceInformation3 setUstrd(String value) {
        this.ustrd = value;
        return this;
    }

    /**
     * Gets the value of the strd property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredRemittanceInformation6 }
     *     
     */
    public StructuredRemittanceInformation6 getStrd() {
        return strd;
    }

    /**
     * Sets the value of the strd property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredRemittanceInformation6 }
     *     
     */
    public RemittanceInformation3 setStrd(StructuredRemittanceInformation6 value) {
        this.strd = value;
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
