
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
 * Reference to the related subscription order the performance fee is based on.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedSubscription1", propOrder = {
    "ref",
    "rltdQty",
    "rltdAmt",
    "cntngntLqdtnPerUnit",
    "dprctnDpstPerUnit",
    "equlstnCdtPerUnit"
})
public class RelatedSubscription1 {

    @XmlElement(name = "Ref", required = true)
    protected AdditionalReference11 ref;
    @XmlElement(name = "RltdQty")
    protected BigDecimal rltdQty;
    @XmlElement(name = "RltdAmt")
    protected ActiveOrHistoricCurrencyAndAmount rltdAmt;
    @XmlElement(name = "CntngntLqdtnPerUnit")
    protected ActiveOrHistoricCurrencyAndAmount cntngntLqdtnPerUnit;
    @XmlElement(name = "DprctnDpstPerUnit")
    protected ActiveOrHistoricCurrencyAndAmount dprctnDpstPerUnit;
    @XmlElement(name = "EqulstnCdtPerUnit")
    protected ActiveOrHistoricCurrencyAndAmount equlstnCdtPerUnit;

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference11 }
     *     
     */
    public AdditionalReference11 getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference11 }
     *     
     */
    public RelatedSubscription1 setRef(AdditionalReference11 value) {
        this.ref = value;
        return this;
    }

    /**
     * Gets the value of the rltdQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRltdQty() {
        return rltdQty;
    }

    /**
     * Sets the value of the rltdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public RelatedSubscription1 setRltdQty(BigDecimal value) {
        this.rltdQty = value;
        return this;
    }

    /**
     * Gets the value of the rltdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getRltdAmt() {
        return rltdAmt;
    }

    /**
     * Sets the value of the rltdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public RelatedSubscription1 setRltdAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.rltdAmt = value;
        return this;
    }

    /**
     * Gets the value of the cntngntLqdtnPerUnit property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getCntngntLqdtnPerUnit() {
        return cntngntLqdtnPerUnit;
    }

    /**
     * Sets the value of the cntngntLqdtnPerUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public RelatedSubscription1 setCntngntLqdtnPerUnit(ActiveOrHistoricCurrencyAndAmount value) {
        this.cntngntLqdtnPerUnit = value;
        return this;
    }

    /**
     * Gets the value of the dprctnDpstPerUnit property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getDprctnDpstPerUnit() {
        return dprctnDpstPerUnit;
    }

    /**
     * Sets the value of the dprctnDpstPerUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public RelatedSubscription1 setDprctnDpstPerUnit(ActiveOrHistoricCurrencyAndAmount value) {
        this.dprctnDpstPerUnit = value;
        return this;
    }

    /**
     * Gets the value of the equlstnCdtPerUnit property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getEqulstnCdtPerUnit() {
        return equlstnCdtPerUnit;
    }

    /**
     * Sets the value of the equlstnCdtPerUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public RelatedSubscription1 setEqulstnCdtPerUnit(ActiveOrHistoricCurrencyAndAmount value) {
        this.equlstnCdtPerUnit = value;
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
