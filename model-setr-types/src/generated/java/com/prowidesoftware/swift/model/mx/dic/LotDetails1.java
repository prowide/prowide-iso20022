
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Facilitates the redemption of one or more lots.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LotDetails1", propOrder = {
    "lotDesc",
    "tradDt",
    "ordrRef",
    "dealRef",
    "lotQtyAndAmt"
})
public class LotDetails1 {

    @XmlElement(name = "LotDesc")
    protected String lotDesc;
    @XmlElement(name = "TradDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate tradDt;
    @XmlElement(name = "OrdrRef", required = true)
    protected String ordrRef;
    @XmlElement(name = "DealRef")
    protected String dealRef;
    @XmlElement(name = "LotQtyAndAmt")
    protected SidePocketQuantityAndAmount1 lotQtyAndAmt;

    /**
     * Gets the value of the lotDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotDesc() {
        return lotDesc;
    }

    /**
     * Sets the value of the lotDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LotDetails1 setLotDesc(String value) {
        this.lotDesc = value;
        return this;
    }

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LotDetails1 setTradDt(LocalDate value) {
        this.tradDt = value;
        return this;
    }

    /**
     * Gets the value of the ordrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdrRef() {
        return ordrRef;
    }

    /**
     * Sets the value of the ordrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LotDetails1 setOrdrRef(String value) {
        this.ordrRef = value;
        return this;
    }

    /**
     * Gets the value of the dealRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealRef() {
        return dealRef;
    }

    /**
     * Sets the value of the dealRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LotDetails1 setDealRef(String value) {
        this.dealRef = value;
        return this;
    }

    /**
     * Gets the value of the lotQtyAndAmt property.
     * 
     * @return
     *     possible object is
     *     {@link SidePocketQuantityAndAmount1 }
     *     
     */
    public SidePocketQuantityAndAmount1 getLotQtyAndAmt() {
        return lotQtyAndAmt;
    }

    /**
     * Sets the value of the lotQtyAndAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SidePocketQuantityAndAmount1 }
     *     
     */
    public LotDetails1 setLotQtyAndAmt(SidePocketQuantityAndAmount1 value) {
        this.lotQtyAndAmt = value;
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
