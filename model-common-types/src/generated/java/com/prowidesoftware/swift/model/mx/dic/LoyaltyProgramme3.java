
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Loyalty programme used for partial payment in loyalty value (debit) and computation of loyalty value gained on the monetary value paid by the customer (credit).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyProgramme3", propOrder = {
    "prgrmmElgbltyInd",
    "prgrmmIssr",
    "lltyMmb"
})
public class LoyaltyProgramme3 {

    @XmlElement(name = "PrgrmmElgbltyInd", type = Boolean.class)
    protected List<Boolean> prgrmmElgbltyInd;
    @XmlElement(name = "PrgrmmIssr")
    protected String prgrmmIssr;
    @XmlElement(name = "LltyMmb")
    protected LoyaltyMember2 lltyMmb;

    /**
     * Gets the value of the prgrmmElgbltyInd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prgrmmElgbltyInd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrgrmmElgbltyInd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Boolean }
     * 
     * 
     */
    public List<Boolean> getPrgrmmElgbltyInd() {
        if (prgrmmElgbltyInd == null) {
            prgrmmElgbltyInd = new ArrayList<Boolean>();
        }
        return this.prgrmmElgbltyInd;
    }

    /**
     * Gets the value of the prgrmmIssr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrgrmmIssr() {
        return prgrmmIssr;
    }

    /**
     * Sets the value of the prgrmmIssr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoyaltyProgramme3 setPrgrmmIssr(String value) {
        this.prgrmmIssr = value;
        return this;
    }

    /**
     * Gets the value of the lltyMmb property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyMember2 }
     *     
     */
    public LoyaltyMember2 getLltyMmb() {
        return lltyMmb;
    }

    /**
     * Sets the value of the lltyMmb property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyMember2 }
     *     
     */
    public LoyaltyProgramme3 setLltyMmb(LoyaltyMember2 value) {
        this.lltyMmb = value;
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
     * Adds a new item to the prgrmmElgbltyInd list.
     * @see #getPrgrmmElgbltyInd()
     * 
     */
    public LoyaltyProgramme3 addPrgrmmElgbltyInd(Boolean prgrmmElgbltyInd) {
        getPrgrmmElgbltyInd().add(prgrmmElgbltyInd);
        return this;
    }

}
