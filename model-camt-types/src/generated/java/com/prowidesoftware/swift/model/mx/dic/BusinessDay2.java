
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Payment system operational information, such as opening, closure, session period or events, given per currency.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessDay2", propOrder = {
    "sysDt",
    "sysSts",
    "sysInfPerCcy"
})
public class BusinessDay2 {

    @XmlElement(name = "SysDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar sysDt;
    @XmlElement(name = "SysSts")
    protected SystemStatus1 sysSts;
    @XmlElement(name = "SysInfPerCcy")
    protected List<SystemAvailabilityAndEvents1> sysInfPerCcy;

    /**
     * Gets the value of the sysDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getSysDt() {
        return sysDt;
    }

    /**
     * Sets the value of the sysDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BusinessDay2 setSysDt(Calendar value) {
        this.sysDt = value;
        return this;
    }

    /**
     * Gets the value of the sysSts property.
     * 
     * @return
     *     possible object is
     *     {@link SystemStatus1 }
     *     
     */
    public SystemStatus1 getSysSts() {
        return sysSts;
    }

    /**
     * Sets the value of the sysSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemStatus1 }
     *     
     */
    public BusinessDay2 setSysSts(SystemStatus1 value) {
        this.sysSts = value;
        return this;
    }

    /**
     * Gets the value of the sysInfPerCcy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sysInfPerCcy property.
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
     * {@link SystemAvailabilityAndEvents1 }
     * 
     * 
     * @return
     *     The value of the sysInfPerCcy property.
     */
    public List<SystemAvailabilityAndEvents1> getSysInfPerCcy() {
        if (sysInfPerCcy == null) {
            sysInfPerCcy = new ArrayList<>();
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
    public BusinessDay2 addSysInfPerCcy(SystemAvailabilityAndEvents1 sysInfPerCcy) {
        getSysInfPerCcy().add(sysInfPerCcy);
        return this;
    }

}
