
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
 * Liability and assets that arise for a clearing member with respect to a central counterparty.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InitialMarginRequirement1", propOrder = {
    "initlMrgnXpsr",
    "cdt"
})
public class InitialMarginRequirement1 {

    @XmlElement(name = "InitlMrgnXpsr", required = true)
    protected List<InitialMarginExposure1> initlMrgnXpsr;
    @XmlElement(name = "Cdt", required = true)
    protected ActiveCurrencyAndAmount cdt;

    /**
     * Gets the value of the initlMrgnXpsr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the initlMrgnXpsr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInitlMrgnXpsr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InitialMarginExposure1 }
     * 
     * 
     * @return
     *     The value of the initlMrgnXpsr property.
     */
    public List<InitialMarginExposure1> getInitlMrgnXpsr() {
        if (initlMrgnXpsr == null) {
            initlMrgnXpsr = new ArrayList<>();
        }
        return this.initlMrgnXpsr;
    }

    /**
     * Gets the value of the cdt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCdt() {
        return cdt;
    }

    /**
     * Sets the value of the cdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public InitialMarginRequirement1 setCdt(ActiveCurrencyAndAmount value) {
        this.cdt = value;
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
     * Adds a new item to the initlMrgnXpsr list.
     * @see #getInitlMrgnXpsr()
     * 
     */
    public InitialMarginRequirement1 addInitlMrgnXpsr(InitialMarginExposure1 initlMrgnXpsr) {
        getInitlMrgnXpsr().add(initlMrgnXpsr);
        return this;
    }

}
