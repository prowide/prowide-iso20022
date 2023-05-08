
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
 * Provides the dispute notification details for the variation margin and optionaly the segregated independent amount.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisputeNotification1", propOrder = {
    "vartnMrgnDspt",
    "sgrtdIndpdntAmtDspt"
})
public class DisputeNotification1 {

    @XmlElement(name = "VartnMrgnDspt", required = true)
    protected VariationMarginDispute1 vartnMrgnDspt;
    @XmlElement(name = "SgrtdIndpdntAmtDspt")
    protected SegregatedIndependentAmountDispute1 sgrtdIndpdntAmtDspt;

    /**
     * Gets the value of the vartnMrgnDspt property.
     * 
     * @return
     *     possible object is
     *     {@link VariationMarginDispute1 }
     *     
     */
    public VariationMarginDispute1 getVartnMrgnDspt() {
        return vartnMrgnDspt;
    }

    /**
     * Sets the value of the vartnMrgnDspt property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariationMarginDispute1 }
     *     
     */
    public DisputeNotification1 setVartnMrgnDspt(VariationMarginDispute1 value) {
        this.vartnMrgnDspt = value;
        return this;
    }

    /**
     * Gets the value of the sgrtdIndpdntAmtDspt property.
     * 
     * @return
     *     possible object is
     *     {@link SegregatedIndependentAmountDispute1 }
     *     
     */
    public SegregatedIndependentAmountDispute1 getSgrtdIndpdntAmtDspt() {
        return sgrtdIndpdntAmtDspt;
    }

    /**
     * Sets the value of the sgrtdIndpdntAmtDspt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegregatedIndependentAmountDispute1 }
     *     
     */
    public DisputeNotification1 setSgrtdIndpdntAmtDspt(SegregatedIndependentAmountDispute1 value) {
        this.sgrtdIndpdntAmtDspt = value;
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
