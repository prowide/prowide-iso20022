
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
 * Payment system operational information, eg, opening, closure, session period or events. given per currency.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessDayInformationDetails1", propOrder = {
    "sysSts",
    "sysInfPerCcy"
})
public class BusinessDayInformationDetails1 {

    @XmlElement(name = "SysSts")
    protected SystemStatusDetails1 sysSts;
    @XmlElement(name = "SysInfPerCcy")
    protected List<SystemAvailabilityAndEventsDetails1> sysInfPerCcy;

    /**
     * Gets the value of the sysSts property.
     * 
     * @return
     *     possible object is
     *     {@link SystemStatusDetails1 }
     *     
     */
    public SystemStatusDetails1 getSysSts() {
        return sysSts;
    }

    /**
     * Sets the value of the sysSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemStatusDetails1 }
     *     
     */
    public BusinessDayInformationDetails1 setSysSts(SystemStatusDetails1 value) {
        this.sysSts = value;
        return this;
    }

    /**
     * Gets the value of the sysInfPerCcy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sysInfPerCcy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSysInfPerCcy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemAvailabilityAndEventsDetails1 }
     * 
     * 
     */
    public List<SystemAvailabilityAndEventsDetails1> getSysInfPerCcy() {
        if (sysInfPerCcy == null) {
            sysInfPerCcy = new ArrayList<SystemAvailabilityAndEventsDetails1>();
        }
        return this.sysInfPerCcy;
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
     * Adds a new item to the sysInfPerCcy list.
     * @see #getSysInfPerCcy()
     * 
     */
    public BusinessDayInformationDetails1 addSysInfPerCcy(SystemAvailabilityAndEventsDetails1 sysInfPerCcy) {
        getSysInfPerCcy().add(sysInfPerCcy);
        return this;
    }

}
