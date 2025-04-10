
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
 * Indicates the reference amount from which contractual payments are determined and the schedule applicable to the payments.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotionalAmount6", propOrder = {
    "amt",
    "schdlPrd",
    "ccy"
})
public class NotionalAmount6 {

    @XmlElement(name = "Amt")
    protected AmountAndDirection106 amt;
    @XmlElement(name = "SchdlPrd")
    protected List<Schedule11> schdlPrd;
    @XmlElement(name = "Ccy")
    protected String ccy;

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection106 }
     *     
     */
    public AmountAndDirection106 getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection106 }
     *     
     */
    public NotionalAmount6 setAmt(AmountAndDirection106 value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the schdlPrd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the schdlPrd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchdlPrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Schedule11 }
     * 
     * 
     * @return
     *     The value of the schdlPrd property.
     */
    public List<Schedule11> getSchdlPrd() {
        if (schdlPrd == null) {
            schdlPrd = new ArrayList<>();
        }
        return this.schdlPrd;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public NotionalAmount6 setCcy(String value) {
        this.ccy = value;
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
     * Adds a new item to the schdlPrd list.
     * @see #getSchdlPrd()
     * 
     */
    public NotionalAmount6 addSchdlPrd(Schedule11 schdlPrd) {
        getSchdlPrd().add(schdlPrd);
        return this;
    }

}
