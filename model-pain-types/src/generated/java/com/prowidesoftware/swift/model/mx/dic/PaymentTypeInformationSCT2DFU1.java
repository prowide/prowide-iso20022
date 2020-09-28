
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
 * PaymentTypeInformationSCT2_DFU1
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTypeInformationSCT2_DFU1", propOrder = {
    "svcLvl",
    "ctgyPurp"
})
public class PaymentTypeInformationSCT2DFU1 {

    @XmlElement(name = "SvcLvl", required = true)
    protected ServiceLevelSEPADFU1 svcLvl;
    @XmlElement(name = "CtgyPurp")
    protected CategoryPurposeSEPADFU1 ctgyPurp;

    /**
     * Gets the value of the svcLvl property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceLevelSEPADFU1 }
     *     
     */
    public ServiceLevelSEPADFU1 getSvcLvl() {
        return svcLvl;
    }

    /**
     * Sets the value of the svcLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceLevelSEPADFU1 }
     *     
     */
    public PaymentTypeInformationSCT2DFU1 setSvcLvl(ServiceLevelSEPADFU1 value) {
        this.svcLvl = value;
        return this;
    }

    /**
     * Gets the value of the ctgyPurp property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryPurposeSEPADFU1 }
     *     
     */
    public CategoryPurposeSEPADFU1 getCtgyPurp() {
        return ctgyPurp;
    }

    /**
     * Sets the value of the ctgyPurp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryPurposeSEPADFU1 }
     *     
     */
    public PaymentTypeInformationSCT2DFU1 setCtgyPurp(CategoryPurposeSEPADFU1 value) {
        this.ctgyPurp = value;
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
