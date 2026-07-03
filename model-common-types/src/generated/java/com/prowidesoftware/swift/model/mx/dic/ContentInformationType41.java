
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
 * General cryptographic message syntax (CMS) containing encrypted data.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentInformationType41", propOrder = {
    "macData",
    "mac"
})
public class ContentInformationType41 {

    @XmlElement(name = "MACData", required = true)
    protected MACData1 macData;
    @XmlElement(name = "MAC", required = true)
    protected String mac;

    /**
     * Gets the value of the macData property.
     * 
     * @return
     *     possible object is
     *     {@link MACData1 }
     *     
     */
    public MACData1 getMACData() {
        return macData;
    }

    /**
     * Sets the value of the macData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MACData1 }
     *     
     */
    public ContentInformationType41 setMACData(MACData1 value) {
        this.macData = value;
        return this;
    }

    /**
     * Gets the value of the mac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAC() {
        return mac;
    }

    /**
     * Sets the value of the mac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ContentInformationType41 setMAC(String value) {
        this.mac = value;
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
