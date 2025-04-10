
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
 * Provides further details on the charges related to the payment transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Charges15", propOrder = {
    "ttlChrgsAndTaxAmt",
    "rcrd"
})
public class Charges15 {

    @XmlElement(name = "TtlChrgsAndTaxAmt")
    protected ActiveOrHistoricCurrencyAndAmount ttlChrgsAndTaxAmt;
    @XmlElement(name = "Rcrd")
    protected List<ChargesRecord8> rcrd;

    /**
     * Gets the value of the ttlChrgsAndTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTtlChrgsAndTaxAmt() {
        return ttlChrgsAndTaxAmt;
    }

    /**
     * Sets the value of the ttlChrgsAndTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public Charges15 setTtlChrgsAndTaxAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlChrgsAndTaxAmt = value;
        return this;
    }

    /**
     * Gets the value of the rcrd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rcrd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRcrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChargesRecord8 }
     * 
     * 
     * @return
     *     The value of the rcrd property.
     */
    public List<ChargesRecord8> getRcrd() {
        if (rcrd == null) {
            rcrd = new ArrayList<>();
        }
        return this.rcrd;
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
     * Adds a new item to the rcrd list.
     * @see #getRcrd()
     * 
     */
    public Charges15 addRcrd(ChargesRecord8 rcrd) {
        getRcrd().add(rcrd);
        return this;
    }

}
