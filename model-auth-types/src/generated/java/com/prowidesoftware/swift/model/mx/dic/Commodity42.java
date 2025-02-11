
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Data specific to commodities and related informations used as a collateral.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Commodity42", propOrder = {
    "clssfctn",
    "qty",
    "unitPric",
    "mktVal",
    "unitOfMeasr"
})
public class Commodity42 {

    @XmlElement(name = "Clssfctn")
    protected CompareCommodityAssetClass3 clssfctn;
    @XmlElement(name = "Qty")
    protected CompareDecimalNumber3 qty;
    @XmlElement(name = "UnitPric")
    protected CompareUnitPrice6 unitPric;
    @XmlElement(name = "MktVal")
    protected CompareAmountAndDirection2 mktVal;
    @XmlElement(name = "UnitOfMeasr")
    protected CompareUnitOfMeasure3 unitOfMeasr;

    /**
     * Gets the value of the clssfctn property.
     * 
     * @return
     *     possible object is
     *     {@link CompareCommodityAssetClass3 }
     *     
     */
    public CompareCommodityAssetClass3 getClssfctn() {
        return clssfctn;
    }

    /**
     * Sets the value of the clssfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareCommodityAssetClass3 }
     *     
     */
    public Commodity42 setClssfctn(CompareCommodityAssetClass3 value) {
        this.clssfctn = value;
        return this;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDecimalNumber3 }
     *     
     */
    public CompareDecimalNumber3 getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDecimalNumber3 }
     *     
     */
    public Commodity42 setQty(CompareDecimalNumber3 value) {
        this.qty = value;
        return this;
    }

    /**
     * Gets the value of the unitPric property.
     * 
     * @return
     *     possible object is
     *     {@link CompareUnitPrice6 }
     *     
     */
    public CompareUnitPrice6 getUnitPric() {
        return unitPric;
    }

    /**
     * Sets the value of the unitPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareUnitPrice6 }
     *     
     */
    public Commodity42 setUnitPric(CompareUnitPrice6 value) {
        this.unitPric = value;
        return this;
    }

    /**
     * Gets the value of the mktVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareAmountAndDirection2 }
     *     
     */
    public CompareAmountAndDirection2 getMktVal() {
        return mktVal;
    }

    /**
     * Sets the value of the mktVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareAmountAndDirection2 }
     *     
     */
    public Commodity42 setMktVal(CompareAmountAndDirection2 value) {
        this.mktVal = value;
        return this;
    }

    /**
     * Gets the value of the unitOfMeasr property.
     * 
     * @return
     *     possible object is
     *     {@link CompareUnitOfMeasure3 }
     *     
     */
    public CompareUnitOfMeasure3 getUnitOfMeasr() {
        return unitOfMeasr;
    }

    /**
     * Sets the value of the unitOfMeasr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareUnitOfMeasure3 }
     *     
     */
    public Commodity42 setUnitOfMeasr(CompareUnitOfMeasure3 value) {
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
