
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
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
 * Indicates the details of the price applicable to the derivative transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceData1", propOrder = {
    "pric",
    "pricSchdl",
    "unitOfMeasr",
    "pricMltplr"
})
public class PriceData1 {

    @XmlElement(name = "Pric")
    protected SecuritiesTransactionPrice17Choice pric;
    @XmlElement(name = "PricSchdl")
    protected List<Schedule1> pricSchdl;
    @XmlElement(name = "UnitOfMeasr")
    @XmlSchemaType(name = "string")
    protected UnitOfMeasure12Code unitOfMeasr;
    @XmlElement(name = "PricMltplr")
    protected BigDecimal pricMltplr;

    /**
     * Gets the value of the pric property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice17Choice }
     *     
     */
    public SecuritiesTransactionPrice17Choice getPric() {
        return pric;
    }

    /**
     * Sets the value of the pric property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice17Choice }
     *     
     */
    public PriceData1 setPric(SecuritiesTransactionPrice17Choice value) {
        this.pric = value;
        return this;
    }

    /**
     * Gets the value of the pricSchdl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pricSchdl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricSchdl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Schedule1 }
     * 
     * 
     * @return
     *     The value of the pricSchdl property.
     */
    public List<Schedule1> getPricSchdl() {
        if (pricSchdl == null) {
            pricSchdl = new ArrayList<>();
        }
        return this.pricSchdl;
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
    public PriceData1 setUnitOfMeasr(UnitOfMeasure12Code value) {
        this.unitOfMeasr = value;
        return this;
    }

    /**
     * Gets the value of the pricMltplr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPricMltplr() {
        return pricMltplr;
    }

    /**
     * Sets the value of the pricMltplr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public PriceData1 setPricMltplr(BigDecimal value) {
        this.pricMltplr = value;
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

    /**
     * Adds a new item to the pricSchdl list.
     * @see #getPricSchdl()
     * 
     */
    public PriceData1 addPricSchdl(Schedule1 pricSchdl) {
        getPricSchdl().add(pricSchdl);
        return this;
    }

}
