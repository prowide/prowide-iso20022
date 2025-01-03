
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
 * Provides the summation of the call amounts for the variation margin and optionaly the segregated independent amount.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarginCallResult2", propOrder = {
    "vartnMrgnRslt",
    "sgrtdIndpdntAmt"
})
public class MarginCallResult2 {

    @XmlElement(name = "VartnMrgnRslt", required = true)
    protected Result1 vartnMrgnRslt;
    @XmlElement(name = "SgrtdIndpdntAmt")
    protected Result1 sgrtdIndpdntAmt;

    /**
     * Gets the value of the vartnMrgnRslt property.
     * 
     * @return
     *     possible object is
     *     {@link Result1 }
     *     
     */
    public Result1 getVartnMrgnRslt() {
        return vartnMrgnRslt;
    }

    /**
     * Sets the value of the vartnMrgnRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Result1 }
     *     
     */
    public MarginCallResult2 setVartnMrgnRslt(Result1 value) {
        this.vartnMrgnRslt = value;
        return this;
    }

    /**
     * Gets the value of the sgrtdIndpdntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Result1 }
     *     
     */
    public Result1 getSgrtdIndpdntAmt() {
        return sgrtdIndpdntAmt;
    }

    /**
     * Sets the value of the sgrtdIndpdntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Result1 }
     *     
     */
    public MarginCallResult2 setSgrtdIndpdntAmt(Result1 value) {
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
