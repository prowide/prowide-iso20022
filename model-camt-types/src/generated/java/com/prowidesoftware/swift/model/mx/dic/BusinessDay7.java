
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
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
@XmlType(name = "BusinessDay7", propOrder = {
    "sysDt",
    "sysSts",
    "sysInfPerCcy"
})
public class BusinessDay7 {

    @XmlElement(name = "SysDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sysDt;
    @XmlElement(name = "SysSts")
    protected SystemStatus3 sysSts;
    @XmlElement(name = "SysInfPerCcy")
    protected List<SystemAvailabilityAndEvents2> sysInfPerCcy;

    /**
     * Gets the value of the sysDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getSysDt() {
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
    public BusinessDay7 setSysDt(XMLGregorianCalendar value) {
        this.sysDt = value;
        return this;
    }

    /**
     * Gets the value of the sysSts property.
     * 
     * @return
     *     possible object is
     *     {@link SystemStatus3 }
     *     
     */
    public SystemStatus3 getSysSts() {
        return sysSts;
    }

    /**
     * Sets the value of the sysSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemStatus3 }
     *     
     */
    public BusinessDay7 setSysSts(SystemStatus3 value) {
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
     * {@link SystemAvailabilityAndEvents2 }
     * 
     * 
     */
    public List<SystemAvailabilityAndEvents2> getSysInfPerCcy() {
        if (sysInfPerCcy == null) {
            sysInfPerCcy = new ArrayList<SystemAvailabilityAndEvents2>();
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
    public BusinessDay7 addSysInfPerCcy(SystemAvailabilityAndEvents2 sysInfPerCcy) {
        getSysInfPerCcy().add(sysInfPerCcy);
        return this;
    }

}
