
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
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
@XmlType(name = "AttendanceCard2", propOrder = {
    "attndncCardLbllg",
    "dlvryMtd",
    "othrAdr"
})
public class AttendanceCard2 {

    @XmlElement(name = "AttndncCardLbllg")
    protected String attndncCardLbllg;
    @XmlElement(name = "DlvryMtd", required = true)
    @XmlSchemaType(name = "string")
    protected DeliveryPlace1Code dlvryMtd;
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
    public AttendanceCard2 setAttndncCardLbllg(String value) {
        this.attndncCardLbllg = value;
        return this;
    }

    /**
     * Gets the value of the dlvryMtd property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryPlace1Code }
     *     
     */
    public DeliveryPlace1Code getDlvryMtd() {
        return dlvryMtd;
    }

    /**
     * Sets the value of the dlvryMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryPlace1Code }
     *     
     */
    public AttendanceCard2 setDlvryMtd(DeliveryPlace1Code value) {
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
    public AttendanceCard2 setOthrAdr(NameAndAddress9 value) {
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
