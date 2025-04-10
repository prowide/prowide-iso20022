
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
 * Indicates the reference amount from which contractual payments are determined and the schedule applicable to the payments.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotionalAmount7", propOrder = {
    "amt",
    "amtInFct",
    "wghtdAvrgDlta"
})
public class NotionalAmount7 {

    @XmlElement(name = "Amt")
    protected ActiveOrHistoricCurrencyAnd19DecimalAmount amt;
    @XmlElement(name = "AmtInFct")
    protected List<ActiveOrHistoricCurrencyAnd19DecimalAmount> amtInFct;
    @XmlElement(name = "WghtdAvrgDlta")
    protected BigDecimal wghtdAvrgDlta;

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd19DecimalAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd19DecimalAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd19DecimalAmount }
     *     
     */
    public NotionalAmount7 setAmt(ActiveOrHistoricCurrencyAnd19DecimalAmount value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the amtInFct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the amtInFct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmtInFct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActiveOrHistoricCurrencyAnd19DecimalAmount }
     * 
     * 
     * @return
     *     The value of the amtInFct property.
     */
    public List<ActiveOrHistoricCurrencyAnd19DecimalAmount> getAmtInFct() {
        if (amtInFct == null) {
            amtInFct = new ArrayList<>();
        }
        return this.amtInFct;
    }

    /**
     * Gets the value of the wghtdAvrgDlta property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWghtdAvrgDlta() {
        return wghtdAvrgDlta;
    }

    /**
     * Sets the value of the wghtdAvrgDlta property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public NotionalAmount7 setWghtdAvrgDlta(BigDecimal value) {
        this.wghtdAvrgDlta = value;
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
     * Adds a new item to the amtInFct list.
     * @see #getAmtInFct()
     * 
     */
    public NotionalAmount7 addAmtInFct(ActiveOrHistoricCurrencyAnd19DecimalAmount amtInFct) {
        getAmtInFct().add(amtInFct);
        return this;
    }

}
