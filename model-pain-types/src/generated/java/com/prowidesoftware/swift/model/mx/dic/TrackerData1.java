
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
 * Specifies the detailed information as provided by a payment tracking system.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackerData1", propOrder = {
    "confdDt",
    "confdAmt",
    "trckrRcrd"
})
public class TrackerData1 {

    @XmlElement(name = "ConfdDt", required = true)
    protected DateAndDateTime2Choice confdDt;
    @XmlElement(name = "ConfdAmt", required = true)
    protected ActiveCurrencyAndAmount confdAmt;
    @XmlElement(name = "TrckrRcrd", required = true)
    protected List<TrackerRecord1> trckrRcrd;

    /**
     * Gets the value of the confdDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getConfdDt() {
        return confdDt;
    }

    /**
     * Sets the value of the confdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public TrackerData1 setConfdDt(DateAndDateTime2Choice value) {
        this.confdDt = value;
        return this;
    }

    /**
     * Gets the value of the confdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getConfdAmt() {
        return confdAmt;
    }

    /**
     * Sets the value of the confdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public TrackerData1 setConfdAmt(ActiveCurrencyAndAmount value) {
        this.confdAmt = value;
        return this;
    }

    /**
     * Gets the value of the trckrRcrd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the trckrRcrd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrckrRcrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackerRecord1 }
     * 
     * 
     * @return
     *     The value of the trckrRcrd property.
     */
    public List<TrackerRecord1> getTrckrRcrd() {
        if (trckrRcrd == null) {
            trckrRcrd = new ArrayList<>();
        }
        return this.trckrRcrd;
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
     * Adds a new item to the trckrRcrd list.
     * @see #getTrckrRcrd()
     * 
     */
    public TrackerData1 addTrckrRcrd(TrackerRecord1 trckrRcrd) {
        getTrckrRcrd().add(trckrRcrd);
        return this;
    }

}
