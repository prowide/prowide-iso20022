
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
 * RemittanceInformationSEPA1Choice_DFU1
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemittanceInformationSEPA1Choice_DFU1", propOrder = {
    "ustrd",
    "strd"
})
public class RemittanceInformationSEPA1ChoiceDFU1 {

    @XmlElement(name = "Ustrd")
    protected String ustrd;
    @XmlElement(name = "Strd")
    protected StructuredRemittanceInformationSEPA1DFU1 strd;

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
    public RemittanceInformationSEPA1ChoiceDFU1 setUstrd(String value) {
        this.ustrd = value;
        return this;
    }

    /**
     * Gets the value of the strd property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredRemittanceInformationSEPA1DFU1 }
     *     
     */
    public StructuredRemittanceInformationSEPA1DFU1 getStrd() {
        return strd;
    }

    /**
     * Sets the value of the strd property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredRemittanceInformationSEPA1DFU1 }
     *     
     */
    public RemittanceInformationSEPA1ChoiceDFU1 setStrd(StructuredRemittanceInformationSEPA1DFU1 value) {
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
