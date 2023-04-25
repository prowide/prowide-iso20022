
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
 * Autorisation of the mandate holder.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Authorisation2", propOrder = {
    "maxAmtByTx",
    "maxAmtByPrd",
    "maxAmtByBlkSubmissn"
})
public class Authorisation2 {

    @XmlElement(name = "MaxAmtByTx")
    protected FixedAmountOrUnlimited1Choice maxAmtByTx;
    @XmlElement(name = "MaxAmtByPrd")
    protected List<MaximumAmountByPeriod1> maxAmtByPrd;
    @XmlElement(name = "MaxAmtByBlkSubmissn")
    protected FixedAmountOrUnlimited1Choice maxAmtByBlkSubmissn;

    /**
     * Gets the value of the maxAmtByTx property.
     * 
     * @return
     *     possible object is
     *     {@link FixedAmountOrUnlimited1Choice }
     *     
     */
    public FixedAmountOrUnlimited1Choice getMaxAmtByTx() {
        return maxAmtByTx;
    }

    /**
     * Sets the value of the maxAmtByTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link FixedAmountOrUnlimited1Choice }
     *     
     */
    public Authorisation2 setMaxAmtByTx(FixedAmountOrUnlimited1Choice value) {
        this.maxAmtByTx = value;
        return this;
    }

    /**
     * Gets the value of the maxAmtByPrd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the maxAmtByPrd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaxAmtByPrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaximumAmountByPeriod1 }
     * 
     * 
     * @return
     *     The value of the maxAmtByPrd property.
     */
    public List<MaximumAmountByPeriod1> getMaxAmtByPrd() {
        if (maxAmtByPrd == null) {
            maxAmtByPrd = new ArrayList<>();
        }
        return this.maxAmtByPrd;
    }

    /**
     * Gets the value of the maxAmtByBlkSubmissn property.
     * 
     * @return
     *     possible object is
     *     {@link FixedAmountOrUnlimited1Choice }
     *     
     */
    public FixedAmountOrUnlimited1Choice getMaxAmtByBlkSubmissn() {
        return maxAmtByBlkSubmissn;
    }

    /**
     * Sets the value of the maxAmtByBlkSubmissn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FixedAmountOrUnlimited1Choice }
     *     
     */
    public Authorisation2 setMaxAmtByBlkSubmissn(FixedAmountOrUnlimited1Choice value) {
        this.maxAmtByBlkSubmissn = value;
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
     * Adds a new item to the maxAmtByPrd list.
     * @see #getMaxAmtByPrd()
     * 
     */
    public Authorisation2 addMaxAmtByPrd(MaximumAmountByPeriod1 maxAmtByPrd) {
        getMaxAmtByPrd().add(maxAmtByPrd);
        return this;
    }

}
