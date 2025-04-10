
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
 * Manufacturer configuration parameters of the point of interaction (POI).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTerminalParameters1", propOrder = {
    "clckSynctn",
    "tmZoneLine",
    "othrParams"
})
public class PaymentTerminalParameters1 {

    @XmlElement(name = "ClckSynctn")
    protected ClockSynchronisation1 clckSynctn;
    @XmlElement(name = "TmZoneLine")
    protected List<String> tmZoneLine;
    @XmlElement(name = "OthrParams")
    protected byte[] othrParams;

    /**
     * Gets the value of the clckSynctn property.
     * 
     * @return
     *     possible object is
     *     {@link ClockSynchronisation1 }
     *     
     */
    public ClockSynchronisation1 getClckSynctn() {
        return clckSynctn;
    }

    /**
     * Sets the value of the clckSynctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClockSynchronisation1 }
     *     
     */
    public PaymentTerminalParameters1 setClckSynctn(ClockSynchronisation1 value) {
        this.clckSynctn = value;
        return this;
    }

    /**
     * Gets the value of the tmZoneLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tmZoneLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTmZoneLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTmZoneLine() {
        if (tmZoneLine == null) {
            tmZoneLine = new ArrayList<String>();
        }
        return this.tmZoneLine;
    }

    /**
     * Gets the value of the othrParams property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getOthrParams() {
        return othrParams;
    }

    /**
     * Sets the value of the othrParams property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public PaymentTerminalParameters1 setOthrParams(byte[] value) {
        this.othrParams = value;
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
     * Adds a new item to the tmZoneLine list.
     * @see #getTmZoneLine()
     * 
     */
    public PaymentTerminalParameters1 addTmZoneLine(String tmZoneLine) {
        getTmZoneLine().add(tmZoneLine);
        return this;
    }

}
