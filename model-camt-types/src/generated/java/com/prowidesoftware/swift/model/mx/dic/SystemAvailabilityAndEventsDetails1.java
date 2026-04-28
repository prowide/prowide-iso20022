
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
 * Set of integrated applications that provides centralised services such as clearing, netting, reconciliation, trading and/or settlement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemAvailabilityAndEventsDetails1", propOrder = {
    "sysCcy",
    "ssnPrd",
    "evt",
    "clsrInf"
})
public class SystemAvailabilityAndEventsDetails1 {

    @XmlElement(name = "SysCcy", required = true)
    protected String sysCcy;
    @XmlElement(name = "SsnPrd")
    protected TimePeriodDetails ssnPrd;
    @XmlElement(name = "Evt")
    protected List<SystemEvent1> evt;
    @XmlElement(name = "ClsrInf")
    protected List<SystemClosureDetails> clsrInf;

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
    public SystemAvailabilityAndEventsDetails1 setSysCcy(String value) {
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
    public SystemAvailabilityAndEventsDetails1 setSsnPrd(TimePeriodDetails value) {
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
     * {@link SystemEvent1 }
     * 
     * 
     */
    public List<SystemEvent1> getEvt() {
        if (evt == null) {
            evt = new ArrayList<SystemEvent1>();
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
     * {@link SystemClosureDetails }
     * 
     * 
     */
    public List<SystemClosureDetails> getClsrInf() {
        if (clsrInf == null) {
            clsrInf = new ArrayList<SystemClosureDetails>();
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
    public SystemAvailabilityAndEventsDetails1 addEvt(SystemEvent1 evt) {
        getEvt().add(evt);
        return this;
    }

    /**
     * Adds a new item to the clsrInf list.
     * @see #getClsrInf()
     * 
     */
    public SystemAvailabilityAndEventsDetails1 addClsrInf(SystemClosureDetails clsrInf) {
        getClsrInf().add(clsrInf);
        return this;
    }

}
