
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
 * Choice to provide the summation of the call amounts for the variation margin and the segregated independent amount, or the segregated independent amount only.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarginCallResult2Choice", propOrder = {
    "mrgnCallRsltDtls",
    "mrgnCallAmt",
    "sgrtdIndpdntAmt"
})
public class MarginCallResult2Choice {

    @XmlElement(name = "MrgnCallRsltDtls")
    protected MarginCallResult2 mrgnCallRsltDtls;
    @XmlElement(name = "MrgnCallAmt")
    protected Result1 mrgnCallAmt;
    @XmlElement(name = "SgrtdIndpdntAmt")
    protected Result1 sgrtdIndpdntAmt;

    /**
     * Gets the value of the mrgnCallRsltDtls property.
     * 
     * @return
     *     possible object is
     *     {@link MarginCallResult2 }
     *     
     */
    public MarginCallResult2 getMrgnCallRsltDtls() {
        return mrgnCallRsltDtls;
    }

    /**
     * Sets the value of the mrgnCallRsltDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginCallResult2 }
     *     
     */
    public MarginCallResult2Choice setMrgnCallRsltDtls(MarginCallResult2 value) {
        this.mrgnCallRsltDtls = value;
        return this;
    }

    /**
     * Gets the value of the mrgnCallAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Result1 }
     *     
     */
    public Result1 getMrgnCallAmt() {
        return mrgnCallAmt;
    }

    /**
     * Sets the value of the mrgnCallAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Result1 }
     *     
     */
    public MarginCallResult2Choice setMrgnCallAmt(Result1 value) {
        this.mrgnCallAmt = value;
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
    public MarginCallResult2Choice setSgrtdIndpdntAmt(Result1 value) {
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
