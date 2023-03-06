
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the aggregated penalties amounts.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AggregatedPenaltyAmount1", propOrder = {
    "aggtdDbtAmt",
    "aggtdCdtAmt",
    "ctrPtyCSDAggtdAmt"
})
public class AggregatedPenaltyAmount1 {

    @XmlElement(name = "AggtdDbtAmt")
    protected ActiveCurrencyAndAmount aggtdDbtAmt;
    @XmlElement(name = "AggtdCdtAmt")
    protected ActiveCurrencyAndAmount aggtdCdtAmt;
    @XmlElement(name = "CtrPtyCSDAggtdAmt")
    protected List<AggregatedPenaltyAmount2> ctrPtyCSDAggtdAmt;

    /**
     * Gets the value of the aggtdDbtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAggtdDbtAmt() {
        return aggtdDbtAmt;
    }

    /**
     * Sets the value of the aggtdDbtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public AggregatedPenaltyAmount1 setAggtdDbtAmt(ActiveCurrencyAndAmount value) {
        this.aggtdDbtAmt = value;
        return this;
    }

    /**
     * Gets the value of the aggtdCdtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAggtdCdtAmt() {
        return aggtdCdtAmt;
    }

    /**
     * Sets the value of the aggtdCdtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public AggregatedPenaltyAmount1 setAggtdCdtAmt(ActiveCurrencyAndAmount value) {
        this.aggtdCdtAmt = value;
        return this;
    }

    /**
     * Gets the value of the ctrPtyCSDAggtdAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ctrPtyCSDAggtdAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtrPtyCSDAggtdAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AggregatedPenaltyAmount2 }
     * 
     * 
     */
    public List<AggregatedPenaltyAmount2> getCtrPtyCSDAggtdAmt() {
        if (ctrPtyCSDAggtdAmt == null) {
            ctrPtyCSDAggtdAmt = new ArrayList<AggregatedPenaltyAmount2>();
        }
        return this.ctrPtyCSDAggtdAmt;
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
     * Adds a new item to the ctrPtyCSDAggtdAmt list.
     * @see #getCtrPtyCSDAggtdAmt()
     * 
     */
    public AggregatedPenaltyAmount1 addCtrPtyCSDAggtdAmt(AggregatedPenaltyAmount2 ctrPtyCSDAggtdAmt) {
        getCtrPtyCSDAggtdAmt().add(ctrPtyCSDAggtdAmt);
        return this;
    }

}
