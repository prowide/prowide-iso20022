
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
 * Provides the expected collateral type and direction for the variation margin and optionaly the segregated independent amount.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpectedCollateral2", propOrder = {
    "vartnMrgn",
    "sgrtdIndpdntAmt"
})
public class ExpectedCollateral2 {

    @XmlElement(name = "VartnMrgn", required = true)
    protected ExpectedCollateralMovement2 vartnMrgn;
    @XmlElement(name = "SgrtdIndpdntAmt")
    protected ExpectedCollateralMovement2 sgrtdIndpdntAmt;

    /**
     * Gets the value of the vartnMrgn property.
     * 
     * @return
     *     possible object is
     *     {@link ExpectedCollateralMovement2 }
     *     
     */
    public ExpectedCollateralMovement2 getVartnMrgn() {
        return vartnMrgn;
    }

    /**
     * Sets the value of the vartnMrgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpectedCollateralMovement2 }
     *     
     */
    public ExpectedCollateral2 setVartnMrgn(ExpectedCollateralMovement2 value) {
        this.vartnMrgn = value;
        return this;
    }

    /**
     * Gets the value of the sgrtdIndpdntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ExpectedCollateralMovement2 }
     *     
     */
    public ExpectedCollateralMovement2 getSgrtdIndpdntAmt() {
        return sgrtdIndpdntAmt;
    }

    /**
     * Sets the value of the sgrtdIndpdntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpectedCollateralMovement2 }
     *     
     */
    public ExpectedCollateral2 setSgrtdIndpdntAmt(ExpectedCollateralMovement2 value) {
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
