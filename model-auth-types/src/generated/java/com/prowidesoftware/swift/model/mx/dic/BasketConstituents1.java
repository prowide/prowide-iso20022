
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
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
@XmlType(name = "BasketConstituents1", propOrder = {
    "instrmId",
    "qty",
    "unitOfMeasr"
})
public class BasketConstituents1 {

    @XmlElement(name = "InstrmId", required = true)
    protected InstrumentIdentification1Choice instrmId;
    @XmlElement(name = "Qty")
    protected BigDecimal qty;
    @XmlElement(name = "UnitOfMeasr")
    @XmlSchemaType(name = "string")
    protected UnitOfMeasure12Code unitOfMeasr;

    /**
     * Gets the value of the instrmId property.
     * 
     * @return
     *     possible object is
     *     {@link InstrumentIdentification1Choice }
     *     
     */
    public InstrumentIdentification1Choice getInstrmId() {
        return instrmId;
    }

    /**
     * Sets the value of the instrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrumentIdentification1Choice }
     *     
     */
    public BasketConstituents1 setInstrmId(InstrumentIdentification1Choice value) {
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
    public BasketConstituents1 setQty(BigDecimal value) {
        this.qty = value;
        return this;
    }

    /**
     * Gets the value of the unitOfMeasr property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasure12Code }
     *     
     */
    public UnitOfMeasure12Code getUnitOfMeasr() {
        return unitOfMeasr;
    }

    /**
     * Sets the value of the unitOfMeasr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasure12Code }
     *     
     */
    public BasketConstituents1 setUnitOfMeasr(UnitOfMeasure12Code value) {
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
