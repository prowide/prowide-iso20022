
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the quantity of a product in a trade transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Quantity2", propOrder = {
    "unitOfMeasrCd",
    "othrUnitOfMeasr",
    "val",
    "fctr"
})
public class Quantity2 {

    @XmlElement(name = "UnitOfMeasrCd")
    protected String unitOfMeasrCd;
    @XmlElement(name = "OthrUnitOfMeasr")
    protected String othrUnitOfMeasr;
    @XmlElement(name = "Val", required = true)
    protected BigDecimal val;
    @XmlElement(name = "Fctr")
    protected String fctr;

    /**
     * Gets the value of the unitOfMeasrCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasrCd() {
        return unitOfMeasrCd;
    }

    /**
     * Sets the value of the unitOfMeasrCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Quantity2 setUnitOfMeasrCd(String value) {
        this.unitOfMeasrCd = value;
        return this;
    }

    /**
     * Gets the value of the othrUnitOfMeasr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrUnitOfMeasr() {
        return othrUnitOfMeasr;
    }

    /**
     * Sets the value of the othrUnitOfMeasr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Quantity2 setOthrUnitOfMeasr(String value) {
        this.othrUnitOfMeasr = value;
        return this;
    }

    /**
     * Gets the value of the val property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVal() {
        return val;
    }

    /**
     * Sets the value of the val property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Quantity2 setVal(BigDecimal value) {
        this.val = value;
        return this;
    }

    /**
     * Gets the value of the fctr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFctr() {
        return fctr;
    }

    /**
     * Sets the value of the fctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Quantity2 setFctr(String value) {
        this.fctr = value;
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
