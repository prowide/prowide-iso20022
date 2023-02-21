
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
 * Attributes of a position in a financial instrument or financial product.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Position1", propOrder = {
    "pdctId",
    "rskRqrmnt",
    "grssNtnl",
    "netNtnl",
    "grssDltaEqvtVal",
    "netDltaEqvtVal",
    "grssDltaEqvtQty",
    "netDltaEqvtQty",
    "grssMktVal"
})
public class Position1 {

    @XmlElement(name = "PdctId", required = true)
    protected String pdctId;
    @XmlElement(name = "RskRqrmnt")
    protected EndOfDayRequirement1 rskRqrmnt;
    @XmlElement(name = "GrssNtnl", required = true)
    protected ActiveCurrencyAnd24Amount grssNtnl;
    @XmlElement(name = "NetNtnl", required = true)
    protected AmountAndDirection102 netNtnl;
    @XmlElement(name = "GrssDltaEqvtVal")
    protected ActiveCurrencyAndAmount grssDltaEqvtVal;
    @XmlElement(name = "NetDltaEqvtVal")
    protected AmountAndDirection102 netDltaEqvtVal;
    @XmlElement(name = "GrssDltaEqvtQty")
    protected BigDecimal grssDltaEqvtQty;
    @XmlElement(name = "NetDltaEqvtQty")
    protected BigDecimal netDltaEqvtQty;
    @XmlElement(name = "GrssMktVal", required = true)
    protected ActiveCurrencyAndAmount grssMktVal;

    /**
     * Gets the value of the pdctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdctId() {
        return pdctId;
    }

    /**
     * Sets the value of the pdctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Position1 setPdctId(String value) {
        this.pdctId = value;
        return this;
    }

    /**
     * Gets the value of the rskRqrmnt property.
     * 
     * @return
     *     possible object is
     *     {@link EndOfDayRequirement1 }
     *     
     */
    public EndOfDayRequirement1 getRskRqrmnt() {
        return rskRqrmnt;
    }

    /**
     * Sets the value of the rskRqrmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndOfDayRequirement1 }
     *     
     */
    public Position1 setRskRqrmnt(EndOfDayRequirement1 value) {
        this.rskRqrmnt = value;
        return this;
    }

    /**
     * Gets the value of the grssNtnl property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd24Amount }
     *     
     */
    public ActiveCurrencyAnd24Amount getGrssNtnl() {
        return grssNtnl;
    }

    /**
     * Sets the value of the grssNtnl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd24Amount }
     *     
     */
    public Position1 setGrssNtnl(ActiveCurrencyAnd24Amount value) {
        this.grssNtnl = value;
        return this;
    }

    /**
     * Gets the value of the netNtnl property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public AmountAndDirection102 getNetNtnl() {
        return netNtnl;
    }

    /**
     * Sets the value of the netNtnl property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public Position1 setNetNtnl(AmountAndDirection102 value) {
        this.netNtnl = value;
        return this;
    }

    /**
     * Gets the value of the grssDltaEqvtVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getGrssDltaEqvtVal() {
        return grssDltaEqvtVal;
    }

    /**
     * Sets the value of the grssDltaEqvtVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public Position1 setGrssDltaEqvtVal(ActiveCurrencyAndAmount value) {
        this.grssDltaEqvtVal = value;
        return this;
    }

    /**
     * Gets the value of the netDltaEqvtVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public AmountAndDirection102 getNetDltaEqvtVal() {
        return netDltaEqvtVal;
    }

    /**
     * Sets the value of the netDltaEqvtVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public Position1 setNetDltaEqvtVal(AmountAndDirection102 value) {
        this.netDltaEqvtVal = value;
        return this;
    }

    /**
     * Gets the value of the grssDltaEqvtQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrssDltaEqvtQty() {
        return grssDltaEqvtQty;
    }

    /**
     * Sets the value of the grssDltaEqvtQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Position1 setGrssDltaEqvtQty(BigDecimal value) {
        this.grssDltaEqvtQty = value;
        return this;
    }

    /**
     * Gets the value of the netDltaEqvtQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetDltaEqvtQty() {
        return netDltaEqvtQty;
    }

    /**
     * Sets the value of the netDltaEqvtQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Position1 setNetDltaEqvtQty(BigDecimal value) {
        this.netDltaEqvtQty = value;
        return this;
    }

    /**
     * Gets the value of the grssMktVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getGrssMktVal() {
        return grssMktVal;
    }

    /**
     * Sets the value of the grssMktVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public Position1 setGrssMktVal(ActiveCurrencyAndAmount value) {
        this.grssMktVal = value;
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
