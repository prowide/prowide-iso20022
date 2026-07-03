
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
 * Defines the elements used to calculate the collateral margin call for the variation margin and optionally the segregated independent amount.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Margin1", propOrder = {
    "vartnMrgn",
    "sgrtdIndpdntAmtMrgn"
})
public class Margin1 {

    @XmlElement(name = "VartnMrgn", required = true)
    protected VariationMargin1 vartnMrgn;
    @XmlElement(name = "SgrtdIndpdntAmtMrgn")
    protected SegregatedIndependentAmountMargin1 sgrtdIndpdntAmtMrgn;

    /**
     * Gets the value of the vartnMrgn property.
     * 
     * @return
     *     possible object is
     *     {@link VariationMargin1 }
     *     
     */
    public VariationMargin1 getVartnMrgn() {
        return vartnMrgn;
    }

    /**
     * Sets the value of the vartnMrgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariationMargin1 }
     *     
     */
    public Margin1 setVartnMrgn(VariationMargin1 value) {
        this.vartnMrgn = value;
        return this;
    }

    /**
     * Gets the value of the sgrtdIndpdntAmtMrgn property.
     * 
     * @return
     *     possible object is
     *     {@link SegregatedIndependentAmountMargin1 }
     *     
     */
    public SegregatedIndependentAmountMargin1 getSgrtdIndpdntAmtMrgn() {
        return sgrtdIndpdntAmtMrgn;
    }

    /**
     * Sets the value of the sgrtdIndpdntAmtMrgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegregatedIndependentAmountMargin1 }
     *     
     */
    public Margin1 setSgrtdIndpdntAmtMrgn(SegregatedIndependentAmountMargin1 value) {
        this.sgrtdIndpdntAmtMrgn = value;
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
