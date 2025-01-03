
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
 * Contact person details in a bank.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankContactPerson1Choice", propOrder = {
    "buyrBkCtctPrsn",
    "sellrBkCtctPrsn"
})
public class BankContactPerson1Choice {

    @XmlElement(name = "BuyrBkCtctPrsn")
    protected List<ContactIdentification1> buyrBkCtctPrsn;
    @XmlElement(name = "SellrBkCtctPrsn")
    protected List<ContactIdentification1> sellrBkCtctPrsn;

    /**
     * Gets the value of the buyrBkCtctPrsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the buyrBkCtctPrsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuyrBkCtctPrsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactIdentification1 }
     * 
     * 
     * @return
     *     The value of the buyrBkCtctPrsn property.
     */
    public List<ContactIdentification1> getBuyrBkCtctPrsn() {
        if (buyrBkCtctPrsn == null) {
            buyrBkCtctPrsn = new ArrayList<>();
        }
        return this.buyrBkCtctPrsn;
    }

    /**
     * Gets the value of the sellrBkCtctPrsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sellrBkCtctPrsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSellrBkCtctPrsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactIdentification1 }
     * 
     * 
     * @return
     *     The value of the sellrBkCtctPrsn property.
     */
    public List<ContactIdentification1> getSellrBkCtctPrsn() {
        if (sellrBkCtctPrsn == null) {
            sellrBkCtctPrsn = new ArrayList<>();
        }
        return this.sellrBkCtctPrsn;
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
     * Adds a new item to the buyrBkCtctPrsn list.
     * @see #getBuyrBkCtctPrsn()
     * 
     */
    public BankContactPerson1Choice addBuyrBkCtctPrsn(ContactIdentification1 buyrBkCtctPrsn) {
        getBuyrBkCtctPrsn().add(buyrBkCtctPrsn);
        return this;
    }

    /**
     * Adds a new item to the sellrBkCtctPrsn list.
     * @see #getSellrBkCtctPrsn()
     * 
     */
    public BankContactPerson1Choice addSellrBkCtctPrsn(ContactIdentification1 sellrBkCtctPrsn) {
        getSellrBkCtctPrsn().add(sellrBkCtctPrsn);
        return this;
    }

}
