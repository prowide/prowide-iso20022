
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
 * Java class for HSMRemotePEDResponse complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HSMRemotePEDResponse", propOrder = {
    "actionCode",
    "hsmRemotePEDStatus"
})
public class SwHSMRemotePEDResponse {

    @XmlElement(name = "ActionCode", required = true)
    protected String actionCode;
    @XmlElement(name = "HSMRemotePEDStatus")
    protected SwHSMRemotePEDStatus hsmRemotePEDStatus;

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMRemotePEDResponse setActionCode(String value) {
        this.actionCode = value;
        return this;
    }

    /**
     * Gets the value of the hsmRemotePEDStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SwHSMRemotePEDStatus }
     *     
     */
    public SwHSMRemotePEDStatus getHSMRemotePEDStatus() {
        return hsmRemotePEDStatus;
    }

    /**
     * Sets the value of the hsmRemotePEDStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwHSMRemotePEDStatus }
     *     
     */
    public SwHSMRemotePEDResponse setHSMRemotePEDStatus(SwHSMRemotePEDStatus value) {
        this.hsmRemotePEDStatus = value;
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
