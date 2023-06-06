
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Choice between a fixed rate and a variable rate.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestRate1Choice", propOrder = {
    "fxdIntrstRate",
    "varblIntrstRate"
})
public class InterestRate1Choice {

    @XmlElement(name = "FxdIntrstRate")
    protected BigDecimal fxdIntrstRate;
    @XmlElement(name = "VarblIntrstRate")
    protected VariableInterest1Rate varblIntrstRate;

    /**
     * Gets the value of the fxdIntrstRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFxdIntrstRate() {
        return fxdIntrstRate;
    }

    /**
     * Sets the value of the fxdIntrstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InterestRate1Choice setFxdIntrstRate(BigDecimal value) {
        this.fxdIntrstRate = value;
        return this;
    }

    /**
     * Gets the value of the varblIntrstRate property.
     * 
     * @return
     *     possible object is
     *     {@link VariableInterest1Rate }
     *     
     */
    public VariableInterest1Rate getVarblIntrstRate() {
        return varblIntrstRate;
    }

    /**
     * Sets the value of the varblIntrstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariableInterest1Rate }
     *     
     */
    public InterestRate1Choice setVarblIntrstRate(VariableInterest1Rate value) {
        this.varblIntrstRate = value;
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
