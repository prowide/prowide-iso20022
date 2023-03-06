
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
 * An investor’s ability to bear losses.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LossBearing1", propOrder = {
    "noCptlLoss",
    "ltdCptlLoss",
    "ltdCptlLossLvl",
    "noCptlGrnt",
    "lossByndCptl",
    "othr"
})
public class LossBearing1 {

    @XmlElement(name = "NoCptlLoss")
    @XmlSchemaType(name = "string")
    protected TargetMarket1Code noCptlLoss;
    @XmlElement(name = "LtdCptlLoss")
    @XmlSchemaType(name = "string")
    protected TargetMarket1Code ltdCptlLoss;
    @XmlElement(name = "LtdCptlLossLvl")
    protected BigDecimal ltdCptlLossLvl;
    @XmlElement(name = "NoCptlGrnt")
    @XmlSchemaType(name = "string")
    protected TargetMarket1Code noCptlGrnt;
    @XmlElement(name = "LossByndCptl")
    @XmlSchemaType(name = "string")
    protected TargetMarket1Code lossByndCptl;
    @XmlElement(name = "Othr")
    protected List<OtherTargetMarketLossBearing1> othr;

    /**
     * Gets the value of the noCptlLoss property.
     * 
     * @return
     *     possible object is
     *     {@link TargetMarket1Code }
     *     
     */
    public TargetMarket1Code getNoCptlLoss() {
        return noCptlLoss;
    }

    /**
     * Sets the value of the noCptlLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetMarket1Code }
     *     
     */
    public LossBearing1 setNoCptlLoss(TargetMarket1Code value) {
        this.noCptlLoss = value;
        return this;
    }

    /**
     * Gets the value of the ltdCptlLoss property.
     * 
     * @return
     *     possible object is
     *     {@link TargetMarket1Code }
     *     
     */
    public TargetMarket1Code getLtdCptlLoss() {
        return ltdCptlLoss;
    }

    /**
     * Sets the value of the ltdCptlLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetMarket1Code }
     *     
     */
    public LossBearing1 setLtdCptlLoss(TargetMarket1Code value) {
        this.ltdCptlLoss = value;
        return this;
    }

    /**
     * Gets the value of the ltdCptlLossLvl property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLtdCptlLossLvl() {
        return ltdCptlLossLvl;
    }

    /**
     * Sets the value of the ltdCptlLossLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public LossBearing1 setLtdCptlLossLvl(BigDecimal value) {
        this.ltdCptlLossLvl = value;
        return this;
    }

    /**
     * Gets the value of the noCptlGrnt property.
     * 
     * @return
     *     possible object is
     *     {@link TargetMarket1Code }
     *     
     */
    public TargetMarket1Code getNoCptlGrnt() {
        return noCptlGrnt;
    }

    /**
     * Sets the value of the noCptlGrnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetMarket1Code }
     *     
     */
    public LossBearing1 setNoCptlGrnt(TargetMarket1Code value) {
        this.noCptlGrnt = value;
        return this;
    }

    /**
     * Gets the value of the lossByndCptl property.
     * 
     * @return
     *     possible object is
     *     {@link TargetMarket1Code }
     *     
     */
    public TargetMarket1Code getLossByndCptl() {
        return lossByndCptl;
    }

    /**
     * Sets the value of the lossByndCptl property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetMarket1Code }
     *     
     */
    public LossBearing1 setLossByndCptl(TargetMarket1Code value) {
        this.lossByndCptl = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the othr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherTargetMarketLossBearing1 }
     * 
     * 
     */
    public List<OtherTargetMarketLossBearing1> getOthr() {
        if (othr == null) {
            othr = new ArrayList<OtherTargetMarketLossBearing1>();
        }
        return this.othr;
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
     * Adds a new item to the othr list.
     * @see #getOthr()
     * 
     */
    public LossBearing1 addOthr(OtherTargetMarketLossBearing1 othr) {
        getOthr().add(othr);
        return this;
    }

}
