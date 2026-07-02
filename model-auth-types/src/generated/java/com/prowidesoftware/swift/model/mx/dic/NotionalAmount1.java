
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
 * Indicates the reference amount from which contractual payments are determined and the schedule applicable to the payments.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotionalAmount1", propOrder = {
    "amt",
    "schdl"
})
public class NotionalAmount1 {

    @XmlElement(name = "Amt", required = true)
    protected AmountAndDirection106 amt;
    @XmlElement(name = "Schdl")
    protected List<Schedule3> schdl;

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
    public NotionalAmount1 setAmt(AmountAndDirection106 value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the schdl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the schdl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchdl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Schedule3 }
     * 
     * 
     */
    public List<Schedule3> getSchdl() {
        if (schdl == null) {
            schdl = new ArrayList<Schedule3>();
        }
        return this.schdl;
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
     * Adds a new item to the schdl list.
     * @see #getSchdl()
     * 
     */
    public NotionalAmount1 addSchdl(Schedule3 schdl) {
        getSchdl().add(schdl);
        return this;
    }

}
