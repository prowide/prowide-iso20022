
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
 * Choice between ISIN and an alternative format for the identification of a financial instrument. ISIN is the preferred format.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasketConstituents3", propOrder = {
    "instrmId",
    "qty",
    "unitOfMeasr"
})
public class BasketConstituents3 {

    @XmlElement(name = "InstrmId", required = true)
    protected InstrumentIdentification6Choice instrmId;
    @XmlElement(name = "Qty")
    protected BigDecimal qty;
    @XmlElement(name = "UnitOfMeasr")
    protected UnitOfMeasure8Choice unitOfMeasr;

    /**
     * Gets the value of the instrmId property.
     * 
     * @return
     *     possible object is
     *     {@link InstrumentIdentification6Choice }
     *     
     */
    public InstrumentIdentification6Choice getInstrmId() {
        return instrmId;
    }

    /**
     * Sets the value of the instrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrumentIdentification6Choice }
     *     
     */
    public BasketConstituents3 setInstrmId(InstrumentIdentification6Choice value) {
        this.instrmId = value;
        return this;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public BasketConstituents3 setQty(BigDecimal value) {
        this.qty = value;
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
    public BasketConstituents3 setUnitOfMeasr(UnitOfMeasure8Choice value) {
        this.unitOfMeasr = value;
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
