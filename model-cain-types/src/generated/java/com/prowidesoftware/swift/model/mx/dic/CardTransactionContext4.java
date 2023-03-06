
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
 * Context of the card transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardTransactionContext4", propOrder = {
    "spclConds"
})
public class CardTransactionContext4 {

    @XmlElement(name = "SpclConds")
    protected List<CardTransactionCondition1> spclConds;

    /**
     * Gets the value of the spclConds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spclConds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpclConds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardTransactionCondition1 }
     * 
     * 
     */
    public List<CardTransactionCondition1> getSpclConds() {
        if (spclConds == null) {
            spclConds = new ArrayList<CardTransactionCondition1>();
        }
        return this.spclConds;
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
     * Adds a new item to the spclConds list.
     * @see #getSpclConds()
     * 
     */
    public CardTransactionContext4 addSpclConds(CardTransactionCondition1 spclConds) {
        getSpclConds().add(spclConds);
        return this;
    }

}
