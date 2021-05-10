
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies details related to the attendance card.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttendanceCard3", propOrder = {
    "attndncCardLbllg",
    "dlvryMtd",
    "othrAdr"
})
public class AttendanceCard3 {

    @XmlElement(name = "AttndncCardLbllg")
    protected String attndncCardLbllg;
    @XmlElement(name = "DlvryMtd", required = true)
    @XmlSchemaType(name = "string")
    protected DeliveryPlace3Code dlvryMtd;
    @XmlElement(name = "OthrAdr")
    protected NameAndAddress9 othrAdr;

    /**
     * Gets the value of the attndncCardLbllg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttndncCardLbllg() {
        return attndncCardLbllg;
    }

    /**
     * Sets the value of the attndncCardLbllg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AttendanceCard3 setAttndncCardLbllg(String value) {
        this.attndncCardLbllg = value;
        return this;
    }

    /**
     * Gets the value of the dlvryMtd property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryPlace3Code }
     *     
     */
    public DeliveryPlace3Code getDlvryMtd() {
        return dlvryMtd;
    }

    /**
     * Sets the value of the dlvryMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryPlace3Code }
     *     
     */
    public AttendanceCard3 setDlvryMtd(DeliveryPlace3Code value) {
        this.dlvryMtd = value;
        return this;
    }

    /**
     * Gets the value of the othrAdr property.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddress9 }
     *     
     */
    public NameAndAddress9 getOthrAdr() {
        return othrAdr;
    }

    /**
     * Sets the value of the othrAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddress9 }
     *     
     */
    public AttendanceCard3 setOthrAdr(NameAndAddress9 value) {
        this.othrAdr = value;
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

}
