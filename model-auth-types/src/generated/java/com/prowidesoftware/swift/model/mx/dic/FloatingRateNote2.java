
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
 * Provides the details of a debt instrument in which the periodic interest payments are calculated on the basis of the value (that is, fixing of an underlying reference rate such as the Euribor) on predefined dates (that is, fixing dates) and which has a maturity of no more than one year.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FloatingRateNote2", propOrder = {
    "refRateIndx",
    "bsisPtSprd"
})
public class FloatingRateNote2 {

    @XmlElement(name = "RefRateIndx", required = true)
    protected String refRateIndx;
    @XmlElement(name = "BsisPtSprd", required = true)
    protected BigDecimal bsisPtSprd;

    /**
     * Gets the value of the refRateIndx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefRateIndx() {
        return refRateIndx;
    }

    /**
     * Sets the value of the refRateIndx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FloatingRateNote2 setRefRateIndx(String value) {
        this.refRateIndx = value;
        return this;
    }

    /**
     * Gets the value of the bsisPtSprd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBsisPtSprd() {
        return bsisPtSprd;
    }

    /**
     * Sets the value of the bsisPtSprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FloatingRateNote2 setBsisPtSprd(BigDecimal value) {
        this.bsisPtSprd = value;
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
