
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
 * Aggregated position held in a securities account for a specified financial instrument.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentAggregateBalance2", propOrder = {
    "sttldBal",
    "traddBal",
    "balBrkdwn"
})
public class FinancialInstrumentAggregateBalance2 {

    @XmlElement(name = "SttldBal")
    protected FinancialInstrumentQuantity1Choice sttldBal;
    @XmlElement(name = "TraddBal")
    protected FinancialInstrumentQuantity1Choice traddBal;
    @XmlElement(name = "BalBrkdwn")
    protected List<SubBalanceBreakdown1> balBrkdwn;

    /**
     * Gets the value of the sttldBal property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getSttldBal() {
        return sttldBal;
    }

    /**
     * Sets the value of the sttldBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentAggregateBalance2 setSttldBal(FinancialInstrumentQuantity1Choice value) {
        this.sttldBal = value;
        return this;
    }

    /**
     * Gets the value of the traddBal property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getTraddBal() {
        return traddBal;
    }

    /**
     * Sets the value of the traddBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentAggregateBalance2 setTraddBal(FinancialInstrumentQuantity1Choice value) {
        this.traddBal = value;
        return this;
    }

    /**
     * Gets the value of the balBrkdwn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the balBrkdwn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalBrkdwn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubBalanceBreakdown1 }
     * 
     * 
     */
    public List<SubBalanceBreakdown1> getBalBrkdwn() {
        if (balBrkdwn == null) {
            balBrkdwn = new ArrayList<SubBalanceBreakdown1>();
        }
        return this.balBrkdwn;
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
     * Adds a new item to the balBrkdwn list.
     * @see #getBalBrkdwn()
     * 
     */
    public FinancialInstrumentAggregateBalance2 addBalBrkdwn(SubBalanceBreakdown1 balBrkdwn) {
        getBalBrkdwn().add(balBrkdwn);
        return this;
    }

}
