
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Indicates the reference quantity of the transaction and the schedule applicable to the quantity computation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotionalQuantity9", propOrder = {
    "ttlQty",
    "unitOfMeasr",
    "dtls"
})
public class NotionalQuantity9 {

    @XmlElement(name = "TtlQty")
    protected BigDecimal ttlQty;
    @XmlElement(name = "UnitOfMeasr")
    protected UnitOfMeasure8Choice unitOfMeasr;
    @XmlElement(name = "Dtls")
    protected QuantityOrTerm1Choice dtls;

    /**
     * Gets the value of the ttlQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlQty() {
        return ttlQty;
    }

    /**
     * Sets the value of the ttlQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public NotionalQuantity9 setTtlQty(BigDecimal value) {
        this.ttlQty = value;
        return this;
    }

    /**
     * Gets the value of the unitOfMeasr property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasure8Choice }
     *     
     */
    public UnitOfMeasure8Choice getUnitOfMeasr() {
        return unitOfMeasr;
    }

    /**
     * Sets the value of the unitOfMeasr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasure8Choice }
     *     
     */
    public NotionalQuantity9 setUnitOfMeasr(UnitOfMeasure8Choice value) {
        this.unitOfMeasr = value;
        return this;
    }

    /**
     * Gets the value of the dtls property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityOrTerm1Choice }
     *     
     */
    public QuantityOrTerm1Choice getDtls() {
        return dtls;
    }

    /**
     * Sets the value of the dtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityOrTerm1Choice }
     *     
     */
    public NotionalQuantity9 setDtls(QuantityOrTerm1Choice value) {
        this.dtls = value;
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
