
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Payment token information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentToken3", propOrder = {
    "tknChrtc",
    "tknRqstr",
    "tknAssrncLvl"
})
public class CardPaymentToken3 {

    @XmlElement(name = "TknChrtc")
    protected List<String> tknChrtc;
    @XmlElement(name = "TknRqstr")
    protected PaymentTokenIdentifiers1 tknRqstr;
    @XmlElement(name = "TknAssrncLvl")
    protected BigDecimal tknAssrncLvl;

    /**
     * Gets the value of the tknChrtc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tknChrtc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTknChrtc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTknChrtc() {
        if (tknChrtc == null) {
            tknChrtc = new ArrayList<String>();
        }
        return this.tknChrtc;
    }

    /**
     * Gets the value of the tknRqstr property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTokenIdentifiers1 }
     *     
     */
    public PaymentTokenIdentifiers1 getTknRqstr() {
        return tknRqstr;
    }

    /**
     * Sets the value of the tknRqstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTokenIdentifiers1 }
     *     
     */
    public CardPaymentToken3 setTknRqstr(PaymentTokenIdentifiers1 value) {
        this.tknRqstr = value;
        return this;
    }

    /**
     * Gets the value of the tknAssrncLvl property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTknAssrncLvl() {
        return tknAssrncLvl;
    }

    /**
     * Sets the value of the tknAssrncLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CardPaymentToken3 setTknAssrncLvl(BigDecimal value) {
        this.tknAssrncLvl = value;
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
     * Adds a new item to the tknChrtc list.
     * @see #getTknChrtc()
     * 
     */
    public CardPaymentToken3 addTknChrtc(String tknChrtc) {
        getTknChrtc().add(tknChrtc);
        return this;
    }

}
