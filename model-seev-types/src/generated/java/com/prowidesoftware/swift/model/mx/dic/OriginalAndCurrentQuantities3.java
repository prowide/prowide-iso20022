
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Signed face amount and amortised value.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalAndCurrentQuantities3", propOrder = {
    "shrtLngPos",
    "faceAmt",
    "amtsdVal"
})
public class OriginalAndCurrentQuantities3 {

    @XmlElement(name = "ShrtLngPos", required = true)
    @XmlSchemaType(name = "string")
    protected ShortLong1Code shrtLngPos;
    @XmlElement(name = "FaceAmt", required = true)
    protected BigDecimal faceAmt;
    @XmlElement(name = "AmtsdVal", required = true)
    protected BigDecimal amtsdVal;

    /**
     * Gets the value of the shrtLngPos property.
     * 
     * @return
     *     possible object is
     *     {@link ShortLong1Code }
     *     
     */
    public ShortLong1Code getShrtLngPos() {
        return shrtLngPos;
    }

    /**
     * Sets the value of the shrtLngPos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShortLong1Code }
     *     
     */
    public OriginalAndCurrentQuantities3 setShrtLngPos(ShortLong1Code value) {
        this.shrtLngPos = value;
        return this;
    }

    /**
     * Gets the value of the faceAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFaceAmt() {
        return faceAmt;
    }

    /**
     * Sets the value of the faceAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public OriginalAndCurrentQuantities3 setFaceAmt(BigDecimal value) {
        this.faceAmt = value;
        return this;
    }

    /**
     * Gets the value of the amtsdVal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmtsdVal() {
        return amtsdVal;
    }

    /**
     * Sets the value of the amtsdVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public OriginalAndCurrentQuantities3 setAmtsdVal(BigDecimal value) {
        this.amtsdVal = value;
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
