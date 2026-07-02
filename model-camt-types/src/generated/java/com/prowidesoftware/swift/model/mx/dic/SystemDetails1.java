
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides details about a system and about a member of a system.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemDetails1", propOrder = {
    "sysId",
    "mmbId"
})
public class SystemDetails1 {

    @XmlElement(name = "SysId")
    protected SystemIdentificationChoice sysId;
    @XmlElement(name = "MmbId", required = true)
    protected MemberIdentificationChoice mmbId;

    /**
     * Gets the value of the sysId property.
     * 
     * @return
     *     possible object is
     *     {@link SystemIdentificationChoice }
     *     
     */
    public SystemIdentificationChoice getSysId() {
        return sysId;
    }

    /**
     * Sets the value of the sysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemIdentificationChoice }
     *     
     */
    public SystemDetails1 setSysId(SystemIdentificationChoice value) {
        this.sysId = value;
        return this;
    }

    /**
     * Gets the value of the mmbId property.
     * 
     * @return
     *     possible object is
     *     {@link MemberIdentificationChoice }
     *     
     */
    public MemberIdentificationChoice getMmbId() {
        return mmbId;
    }

    /**
     * Sets the value of the mmbId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberIdentificationChoice }
     *     
     */
    public SystemDetails1 setMmbId(MemberIdentificationChoice value) {
        this.mmbId = value;
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
