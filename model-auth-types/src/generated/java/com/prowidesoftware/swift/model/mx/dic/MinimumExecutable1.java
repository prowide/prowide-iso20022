
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
 * Minimum execution size of any individual potential execution.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MinimumExecutable1", propOrder = {
    "sz",
    "frstExctnOnly"
})
public class MinimumExecutable1 {

    @XmlElement(name = "Sz")
    protected FinancialInstrumentQuantity25Choice sz;
    @XmlElement(name = "FrstExctnOnly")
    protected Boolean frstExctnOnly;

    /**
     * Gets the value of the sz property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity25Choice }
     *     
     */
    public FinancialInstrumentQuantity25Choice getSz() {
        return sz;
    }

    /**
     * Sets the value of the sz property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity25Choice }
     *     
     */
    public MinimumExecutable1 setSz(FinancialInstrumentQuantity25Choice value) {
        this.sz = value;
        return this;
    }

    /**
     * Gets the value of the frstExctnOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFrstExctnOnly() {
        return frstExctnOnly;
    }

    /**
     * Sets the value of the frstExctnOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public MinimumExecutable1 setFrstExctnOnly(Boolean value) {
        this.frstExctnOnly = value;
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
