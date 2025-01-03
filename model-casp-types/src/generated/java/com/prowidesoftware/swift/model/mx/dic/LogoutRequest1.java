
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Content of the Logout Request message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogoutRequest1", propOrder = {
    "mntncAllwd"
})
public class LogoutRequest1 {

    @XmlElement(name = "MntncAllwd")
    protected Boolean mntncAllwd;

    /**
     * Gets the value of the mntncAllwd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMntncAllwd() {
        return mntncAllwd;
    }

    /**
     * Sets the value of the mntncAllwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public LogoutRequest1 setMntncAllwd(Boolean value) {
        this.mntncAllwd = value;
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
