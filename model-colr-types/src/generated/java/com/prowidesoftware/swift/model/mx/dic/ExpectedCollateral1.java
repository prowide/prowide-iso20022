
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
 * Provides the expected collateral type and direction for the variation margin and optionaly the segregated independent amount.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpectedCollateral1", propOrder = {
    "vartnMrgn",
    "sgrtdIndpdntAmt"
})
public class ExpectedCollateral1 {

    @XmlElement(name = "VartnMrgn", required = true)
    protected ExpectedCollateralMovement1 vartnMrgn;
    @XmlElement(name = "SgrtdIndpdntAmt")
    protected ExpectedCollateralMovement1 sgrtdIndpdntAmt;

    /**
     * Gets the value of the vartnMrgn property.
     * 
     * @return
     *     possible object is
     *     {@link ExpectedCollateralMovement1 }
     *     
     */
    public ExpectedCollateralMovement1 getVartnMrgn() {
        return vartnMrgn;
    }

    /**
     * Sets the value of the vartnMrgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpectedCollateralMovement1 }
     *     
     */
    public ExpectedCollateral1 setVartnMrgn(ExpectedCollateralMovement1 value) {
        this.vartnMrgn = value;
        return this;
    }

    /**
     * Gets the value of the sgrtdIndpdntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ExpectedCollateralMovement1 }
     *     
     */
    public ExpectedCollateralMovement1 getSgrtdIndpdntAmt() {
        return sgrtdIndpdntAmt;
    }

    /**
     * Sets the value of the sgrtdIndpdntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpectedCollateralMovement1 }
     *     
     */
    public ExpectedCollateral1 setSgrtdIndpdntAmt(ExpectedCollateralMovement1 value) {
        this.sgrtdIndpdntAmt = value;
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
