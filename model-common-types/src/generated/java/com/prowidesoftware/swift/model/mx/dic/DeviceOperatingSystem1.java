
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
 * Information of the device operating system.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceOperatingSystem1", propOrder = {
    "id",
    "tp",
    "othrTp",
    "vrsn",
    "bld"
})
public class DeviceOperatingSystem1 {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected DeviceOperatingSystemType1Code tp;
    @XmlElement(name = "OthrTp")
    protected String othrTp;
    @XmlElement(name = "Vrsn")
    protected String vrsn;
    @XmlElement(name = "Bld")
    protected String bld;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DeviceOperatingSystem1 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceOperatingSystemType1Code }
     *     
     */
    public DeviceOperatingSystemType1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceOperatingSystemType1Code }
     *     
     */
    public DeviceOperatingSystem1 setTp(DeviceOperatingSystemType1Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the othrTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrTp() {
        return othrTp;
    }

    /**
     * Sets the value of the othrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DeviceOperatingSystem1 setOthrTp(String value) {
        this.othrTp = value;
        return this;
    }

    /**
     * Gets the value of the vrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVrsn() {
        return vrsn;
    }

    /**
     * Sets the value of the vrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DeviceOperatingSystem1 setVrsn(String value) {
        this.vrsn = value;
        return this;
    }

    /**
     * Gets the value of the bld property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBld() {
        return bld;
    }

    /**
     * Sets the value of the bld property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DeviceOperatingSystem1 setBld(String value) {
        this.bld = value;
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
