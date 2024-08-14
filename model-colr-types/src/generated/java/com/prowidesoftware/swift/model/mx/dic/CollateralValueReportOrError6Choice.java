
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
 * Business report on collateral value or business error.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralValueReportOrError6Choice", propOrder = {
    "bizErr",
    "collVal"
})
public class CollateralValueReportOrError6Choice {

    @XmlElement(name = "BizErr")
    protected ErrorHandling5 bizErr;
    @XmlElement(name = "CollVal")
    protected CollateralValuePosition3 collVal;

    /**
     * Gets the value of the bizErr property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorHandling5 }
     *     
     */
    public ErrorHandling5 getBizErr() {
        return bizErr;
    }

    /**
     * Sets the value of the bizErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorHandling5 }
     *     
     */
    public CollateralValueReportOrError6Choice setBizErr(ErrorHandling5 value) {
        this.bizErr = value;
        return this;
    }

    /**
     * Gets the value of the collVal property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralValuePosition3 }
     *     
     */
    public CollateralValuePosition3 getCollVal() {
        return collVal;
    }

    /**
     * Sets the value of the collVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralValuePosition3 }
     *     
     */
    public CollateralValueReportOrError6Choice setCollVal(CollateralValuePosition3 value) {
        this.collVal = value;
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
