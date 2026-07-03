
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Part of an investor's subscription amount that is held by the fund in order to pay incentive / performance fees at the end of the fiscal year.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Equalisation3", propOrder = {
    "amt",
    "rate",
    "equlstnMthdlgyTp",
    "hghWtrmrk",
    "grssAsstVal"
})
public class Equalisation3 {

    @XmlElement(name = "Amt")
    protected ActiveCurrencyAndAmount amt;
    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    @XmlElement(name = "EqulstnMthdlgyTp")
    protected List<EqualisationMethodologyType2> equlstnMthdlgyTp;
    @XmlElement(name = "HghWtrmrk")
    protected ActiveOrHistoricCurrencyAndAmount hghWtrmrk;
    @XmlElement(name = "GrssAsstVal")
    protected ActiveOrHistoricCurrencyAndAmount grssAsstVal;

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public Equalisation3 setAmt(ActiveCurrencyAndAmount value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Equalisation3 setRate(BigDecimal value) {
        this.rate = value;
        return this;
    }

    /**
     * Gets the value of the equlstnMthdlgyTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equlstnMthdlgyTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEqulstnMthdlgyTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EqualisationMethodologyType2 }
     * 
     * 
     */
    public List<EqualisationMethodologyType2> getEqulstnMthdlgyTp() {
        if (equlstnMthdlgyTp == null) {
            equlstnMthdlgyTp = new ArrayList<EqualisationMethodologyType2>();
        }
        return this.equlstnMthdlgyTp;
    }

    /**
     * Gets the value of the hghWtrmrk property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getHghWtrmrk() {
        return hghWtrmrk;
    }

    /**
     * Sets the value of the hghWtrmrk property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public Equalisation3 setHghWtrmrk(ActiveOrHistoricCurrencyAndAmount value) {
        this.hghWtrmrk = value;
        return this;
    }

    /**
     * Gets the value of the grssAsstVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getGrssAsstVal() {
        return grssAsstVal;
    }

    /**
     * Sets the value of the grssAsstVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public Equalisation3 setGrssAsstVal(ActiveOrHistoricCurrencyAndAmount value) {
        this.grssAsstVal = value;
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
     * Adds a new item to the equlstnMthdlgyTp list.
     * @see #getEqulstnMthdlgyTp()
     * 
     */
    public Equalisation3 addEqulstnMthdlgyTp(EqualisationMethodologyType2 equlstnMthdlgyTp) {
        getEqulstnMthdlgyTp().add(equlstnMthdlgyTp);
        return this;
    }

}
