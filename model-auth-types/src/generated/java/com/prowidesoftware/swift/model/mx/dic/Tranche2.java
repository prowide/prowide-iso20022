
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
 * Indicates derivative contract was tranched.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tranche2", propOrder = {
    "attchmntPt",
    "dtchmntPt"
})
public class Tranche2 {

    @XmlElement(name = "AttchmntPt")
    protected BigDecimal attchmntPt;
    @XmlElement(name = "DtchmntPt")
    protected BigDecimal dtchmntPt;

    /**
     * Gets the value of the attchmntPt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAttchmntPt() {
        return attchmntPt;
    }

    /**
     * Sets the value of the attchmntPt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Tranche2 setAttchmntPt(BigDecimal value) {
        this.attchmntPt = value;
        return this;
    }

    /**
     * Gets the value of the dtchmntPt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDtchmntPt() {
        return dtchmntPt;
    }

    /**
     * Sets the value of the dtchmntPt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Tranche2 setDtchmntPt(BigDecimal value) {
        this.dtchmntPt = value;
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
