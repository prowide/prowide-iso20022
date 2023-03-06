
package com.prowidesoftware.swift.model.mx.sys.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for SNLVersion complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SNLVersion", propOrder = {
    "snlRelease",
    "osRelease"
})
public class SwSNLVersion {

    @XmlElement(name = "SNLRelease", required = true)
    protected String snlRelease;
    @XmlElement(name = "OSRelease", required = true)
    protected String osRelease;

    /**
     * Gets the value of the snlRelease property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNLRelease() {
        return snlRelease;
    }

    /**
     * Sets the value of the snlRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwSNLVersion setSNLRelease(String value) {
        this.snlRelease = value;
        return this;
    }

    /**
     * Gets the value of the osRelease property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOSRelease() {
        return osRelease;
    }

    /**
     * Sets the value of the osRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwSNLVersion setOSRelease(String value) {
        this.osRelease = value;
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
