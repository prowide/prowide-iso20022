
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
 * Provides the margin terms for the variation margin and the segregated independent amount, or the segregated independent amount only.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarginTerms1Choice", propOrder = {
    "mrgnDtls",
    "sgrtdIndpdntAmtMrgn"
})
public class MarginTerms1Choice {

    @XmlElement(name = "MrgnDtls")
    protected Margin1 mrgnDtls;
    @XmlElement(name = "SgrtdIndpdntAmtMrgn")
    protected SegregatedIndependentAmountMargin1 sgrtdIndpdntAmtMrgn;

    /**
     * Gets the value of the mrgnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Margin1 }
     *     
     */
    public Margin1 getMrgnDtls() {
        return mrgnDtls;
    }

    /**
     * Sets the value of the mrgnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Margin1 }
     *     
     */
    public MarginTerms1Choice setMrgnDtls(Margin1 value) {
        this.mrgnDtls = value;
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
    public MarginTerms1Choice setSgrtdIndpdntAmtMrgn(SegregatedIndependentAmountMargin1 value) {
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
