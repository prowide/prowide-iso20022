
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
 * Amount of an underlying of a derivative or security that constitutes one lot of such derivative on an exchange.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractSize1", propOrder = {
    "lotSz",
    "unit"
})
public class ContractSize1 {

    @XmlElement(name = "LotSz", required = true)
    protected BigDecimal lotSz;
    @XmlElement(name = "Unit")
    protected UnitOfMeasure5Choice unit;

    /**
     * Gets the value of the lotSz property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLotSz() {
        return lotSz;
    }

    /**
     * Sets the value of the lotSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ContractSize1 setLotSz(BigDecimal value) {
        this.lotSz = value;
        return this;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasure5Choice }
     *     
     */
    public UnitOfMeasure5Choice getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasure5Choice }
     *     
     */
    public ContractSize1 setUnit(UnitOfMeasure5Choice value) {
        this.unit = value;
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
