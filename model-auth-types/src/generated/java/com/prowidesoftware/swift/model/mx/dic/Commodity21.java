
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Data specific to commodities and related fields used as a collateral.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Commodity21", propOrder = {
    "clssfctn",
    "qty",
    "unitPric",
    "mktVal",
    "unitOfMeasr"
})
public class Commodity21 {

    @XmlElement(name = "Clssfctn")
    protected CompareCommodityAssetClass2 clssfctn;
    @XmlElement(name = "Qty")
    protected CompareDecimalNumber2 qty;
    @XmlElement(name = "UnitPric")
    protected CompareUnitPrice3 unitPric;
    @XmlElement(name = "MktVal")
    protected CompareActiveOrHistoricCurrencyAndAmount2 mktVal;
    @XmlElement(name = "UnitOfMeasr")
    protected CompareUnitOfMeasure2 unitOfMeasr;

    /**
     * Gets the value of the clssfctn property.
     * 
     * @return
     *     possible object is
     *     {@link CompareCommodityAssetClass2 }
     *     
     */
    public CompareCommodityAssetClass2 getClssfctn() {
        return clssfctn;
    }

    /**
     * Sets the value of the clssfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareCommodityAssetClass2 }
     *     
     */
    public Commodity21 setClssfctn(CompareCommodityAssetClass2 value) {
        this.clssfctn = value;
        return this;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDecimalNumber2 }
     *     
     */
    public CompareDecimalNumber2 getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDecimalNumber2 }
     *     
     */
    public Commodity21 setQty(CompareDecimalNumber2 value) {
        this.qty = value;
        return this;
    }

    /**
     * Gets the value of the unitPric property.
     * 
     * @return
     *     possible object is
     *     {@link CompareUnitPrice3 }
     *     
     */
    public CompareUnitPrice3 getUnitPric() {
        return unitPric;
    }

    /**
     * Sets the value of the unitPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareUnitPrice3 }
     *     
     */
    public Commodity21 setUnitPric(CompareUnitPrice3 value) {
        this.unitPric = value;
        return this;
    }

    /**
     * Gets the value of the mktVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount2 }
     *     
     */
    public CompareActiveOrHistoricCurrencyAndAmount2 getMktVal() {
        return mktVal;
    }

    /**
     * Sets the value of the mktVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount2 }
     *     
     */
    public Commodity21 setMktVal(CompareActiveOrHistoricCurrencyAndAmount2 value) {
        this.mktVal = value;
        return this;
    }

    /**
     * Gets the value of the unitOfMeasr property.
     * 
     * @return
     *     possible object is
     *     {@link CompareUnitOfMeasure2 }
     *     
     */
    public CompareUnitOfMeasure2 getUnitOfMeasr() {
        return unitOfMeasr;
    }

    /**
     * Sets the value of the unitOfMeasr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareUnitOfMeasure2 }
     *     
     */
    public Commodity21 setUnitOfMeasr(CompareUnitOfMeasure2 value) {
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
