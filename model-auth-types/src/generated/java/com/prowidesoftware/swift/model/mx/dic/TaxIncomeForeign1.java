
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
 * Specifies the tax income foreign details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxIncomeForeign1", propOrder = {
    "assessblIncm",
    "cshDstrbtn"
})
public class TaxIncomeForeign1 {

    @XmlElement(name = "AssessblIncm")
    protected TaxIncomeAmount2 assessblIncm;
    @XmlElement(name = "CshDstrbtn")
    protected TaxIncomeAmount3 cshDstrbtn;

    /**
     * Gets the value of the assessblIncm property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIncomeAmount2 }
     *     
     */
    public TaxIncomeAmount2 getAssessblIncm() {
        return assessblIncm;
    }

    /**
     * Sets the value of the assessblIncm property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIncomeAmount2 }
     *     
     */
    public TaxIncomeForeign1 setAssessblIncm(TaxIncomeAmount2 value) {
        this.assessblIncm = value;
        return this;
    }

    /**
     * Gets the value of the cshDstrbtn property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIncomeAmount3 }
     *     
     */
    public TaxIncomeAmount3 getCshDstrbtn() {
        return cshDstrbtn;
    }

    /**
     * Sets the value of the cshDstrbtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIncomeAmount3 }
     *     
     */
    public TaxIncomeForeign1 setCshDstrbtn(TaxIncomeAmount3 value) {
        this.cshDstrbtn = value;
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
