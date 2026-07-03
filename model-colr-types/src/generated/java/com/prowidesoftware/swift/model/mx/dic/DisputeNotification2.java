
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
 * Provides the dispute notification details for the variation margin and optionaly the segregated independent amount.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisputeNotification2", propOrder = {
    "vartnMrgnDspt",
    "sgrtdIndpdntAmtDspt"
})
public class DisputeNotification2 {

    @XmlElement(name = "VartnMrgnDspt", required = true)
    protected VariationMarginDispute1 vartnMrgnDspt;
    @XmlElement(name = "SgrtdIndpdntAmtDspt")
    protected SegregatedIndependentAmountDispute2 sgrtdIndpdntAmtDspt;

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
    public DisputeNotification2 setVartnMrgnDspt(VariationMarginDispute1 value) {
        this.vartnMrgnDspt = value;
        return this;
    }

    /**
     * Gets the value of the sgrtdIndpdntAmtDspt property.
     * 
     * @return
     *     possible object is
     *     {@link SegregatedIndependentAmountDispute2 }
     *     
     */
    public SegregatedIndependentAmountDispute2 getSgrtdIndpdntAmtDspt() {
        return sgrtdIndpdntAmtDspt;
    }

    /**
     * Sets the value of the sgrtdIndpdntAmtDspt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegregatedIndependentAmountDispute2 }
     *     
     */
    public DisputeNotification2 setSgrtdIndpdntAmtDspt(SegregatedIndependentAmountDispute2 value) {
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
