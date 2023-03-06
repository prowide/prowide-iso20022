
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
 * Provides detailed ownership information about the shareholding quantity to be disclosed,  or the shareholding quantity not to be disclosed and the shareholding quantity below threshold.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountSubLevel22", propOrder = {
    "nonDscldShrhldgQty",
    "blwThrshldShrhldgQty",
    "dsclsr"
})
public class AccountSubLevel22 {

    @XmlElement(name = "NonDscldShrhldgQty")
    protected FinancialInstrumentQuantity18Choice nonDscldShrhldgQty;
    @XmlElement(name = "BlwThrshldShrhldgQty")
    protected FinancialInstrumentQuantity18Choice blwThrshldShrhldgQty;
    @XmlElement(name = "Dsclsr")
    protected List<AccountSubLevel23> dsclsr;

    /**
     * Gets the value of the nonDscldShrhldgQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public FinancialInstrumentQuantity18Choice getNonDscldShrhldgQty() {
        return nonDscldShrhldgQty;
    }

    /**
     * Sets the value of the nonDscldShrhldgQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public AccountSubLevel22 setNonDscldShrhldgQty(FinancialInstrumentQuantity18Choice value) {
        this.nonDscldShrhldgQty = value;
        return this;
    }

    /**
     * Gets the value of the blwThrshldShrhldgQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public FinancialInstrumentQuantity18Choice getBlwThrshldShrhldgQty() {
        return blwThrshldShrhldgQty;
    }

    /**
     * Sets the value of the blwThrshldShrhldgQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public AccountSubLevel22 setBlwThrshldShrhldgQty(FinancialInstrumentQuantity18Choice value) {
        this.blwThrshldShrhldgQty = value;
        return this;
    }

    /**
     * Gets the value of the dsclsr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dsclsr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDsclsr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountSubLevel23 }
     * 
     * 
     */
    public List<AccountSubLevel23> getDsclsr() {
        if (dsclsr == null) {
            dsclsr = new ArrayList<AccountSubLevel23>();
        }
        return this.dsclsr;
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
     * Adds a new item to the dsclsr list.
     * @see #getDsclsr()
     * 
     */
    public AccountSubLevel22 addDsclsr(AccountSubLevel23 dsclsr) {
        getDsclsr().add(dsclsr);
        return this;
    }

}
