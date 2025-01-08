
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
 * Posting of an item to a cash account, in the context of a cash transaction, that results in an increase or decrease to the balance of the account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Value", propOrder = {
    "baseCcyItm",
    "altrnCcyItm"
})
public class Value {

    @XmlElement(name = "BaseCcyItm", required = true)
    protected ActiveOrHistoricCurrencyAndAmount baseCcyItm;
    @XmlElement(name = "AltrnCcyItm", required = true)
    protected List<ActiveOrHistoricCurrencyAndAmount> altrnCcyItm;

    /**
     * Gets the value of the baseCcyItm property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getBaseCcyItm() {
        return baseCcyItm;
    }

    /**
     * Sets the value of the baseCcyItm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public Value setBaseCcyItm(ActiveOrHistoricCurrencyAndAmount value) {
        this.baseCcyItm = value;
        return this;
    }

    /**
     * Gets the value of the altrnCcyItm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the altrnCcyItm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltrnCcyItm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActiveOrHistoricCurrencyAndAmount }
     * 
     * 
     * @return
     *     The value of the altrnCcyItm property.
     */
    public List<ActiveOrHistoricCurrencyAndAmount> getAltrnCcyItm() {
        if (altrnCcyItm == null) {
            altrnCcyItm = new ArrayList<>();
        }
        return this.altrnCcyItm;
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
     * Adds a new item to the altrnCcyItm list.
     * @see #getAltrnCcyItm()
     * 
     */
    public Value addAltrnCcyItm(ActiveOrHistoricCurrencyAndAmount altrnCcyItm) {
        getAltrnCcyItm().add(altrnCcyItm);
        return this;
    }

}
