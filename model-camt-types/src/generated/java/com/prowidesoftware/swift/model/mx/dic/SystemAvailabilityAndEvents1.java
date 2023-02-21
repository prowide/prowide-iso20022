
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
 * Specifies the details about the system availability and the related system events that might impact the availability.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemAvailabilityAndEvents1", propOrder = {
    "sysCcy",
    "ssnPrd",
    "evt",
    "clsrInf"
})
public class SystemAvailabilityAndEvents1 {

    @XmlElement(name = "SysCcy")
    protected String sysCcy;
    @XmlElement(name = "SsnPrd")
    protected TimePeriodDetails ssnPrd;
    @XmlElement(name = "Evt")
    protected List<SystemEvent2> evt;
    @XmlElement(name = "ClsrInf")
    protected List<SystemClosure1> clsrInf;

    /**
     * Gets the value of the sysCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysCcy() {
        return sysCcy;
    }

    /**
     * Sets the value of the sysCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SystemAvailabilityAndEvents1 setSysCcy(String value) {
        this.sysCcy = value;
        return this;
    }

    /**
     * Gets the value of the ssnPrd property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodDetails }
     *     
     */
    public TimePeriodDetails getSsnPrd() {
        return ssnPrd;
    }

    /**
     * Sets the value of the ssnPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodDetails }
     *     
     */
    public SystemAvailabilityAndEvents1 setSsnPrd(TimePeriodDetails value) {
        this.ssnPrd = value;
        return this;
    }

    /**
     * Gets the value of the evt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemEvent2 }
     * 
     * 
     */
    public List<SystemEvent2> getEvt() {
        if (evt == null) {
            evt = new ArrayList<SystemEvent2>();
        }
        return this.evt;
    }

    /**
     * Gets the value of the clsrInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clsrInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClsrInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemClosure1 }
     * 
     * 
     */
    public List<SystemClosure1> getClsrInf() {
        if (clsrInf == null) {
            clsrInf = new ArrayList<SystemClosure1>();
        }
        return this.clsrInf;
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
     * Adds a new item to the evt list.
     * @see #getEvt()
     * 
     */
    public SystemAvailabilityAndEvents1 addEvt(SystemEvent2 evt) {
        getEvt().add(evt);
        return this;
    }

    /**
     * Adds a new item to the clsrInf list.
     * @see #getClsrInf()
     * 
     */
    public SystemAvailabilityAndEvents1 addClsrInf(SystemClosure1 clsrInf) {
        getClsrInf().add(clsrInf);
        return this;
    }

}
