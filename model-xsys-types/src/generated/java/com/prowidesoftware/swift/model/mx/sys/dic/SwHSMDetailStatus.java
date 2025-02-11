
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
 * Java class for HSMDetailStatus complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HSMDetailStatus", propOrder = {
    "hsmRoleNumber",
    "hsmHost",
    "hsmServiceStatus",
    "hsmsnlConnectivity",
    "hsmSelfTest"
})
public class SwHSMDetailStatus {

    @XmlElement(name = "HSMRoleNumber")
    protected String hsmRoleNumber;
    @XmlElement(name = "HSMHost", required = true)
    protected String hsmHost;
    @XmlElement(name = "HSMServiceStatus", required = true)
    protected String hsmServiceStatus;
    @XmlElement(name = "HSMSNLConnectivity", required = true)
    protected String hsmsnlConnectivity;
    @XmlElement(name = "HSMSelfTest", required = true)
    protected SwHSMSelfTest hsmSelfTest;

    /**
     * Gets the value of the hsmRoleNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHSMRoleNumber() {
        return hsmRoleNumber;
    }

    /**
     * Sets the value of the hsmRoleNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMDetailStatus setHSMRoleNumber(String value) {
        this.hsmRoleNumber = value;
        return this;
    }

    /**
     * Gets the value of the hsmHost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHSMHost() {
        return hsmHost;
    }

    /**
     * Sets the value of the hsmHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMDetailStatus setHSMHost(String value) {
        this.hsmHost = value;
        return this;
    }

    /**
     * Gets the value of the hsmServiceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHSMServiceStatus() {
        return hsmServiceStatus;
    }

    /**
     * Sets the value of the hsmServiceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMDetailStatus setHSMServiceStatus(String value) {
        this.hsmServiceStatus = value;
        return this;
    }

    /**
     * Gets the value of the hsmsnlConnectivity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHSMSNLConnectivity() {
        return hsmsnlConnectivity;
    }

    /**
     * Sets the value of the hsmsnlConnectivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMDetailStatus setHSMSNLConnectivity(String value) {
        this.hsmsnlConnectivity = value;
        return this;
    }

    /**
     * Gets the value of the hsmSelfTest property.
     * 
     * @return
     *     possible object is
     *     {@link SwHSMSelfTest }
     *     
     */
    public SwHSMSelfTest getHSMSelfTest() {
        return hsmSelfTest;
    }

    /**
     * Sets the value of the hsmSelfTest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwHSMSelfTest }
     *     
     */
    public SwHSMDetailStatus setHSMSelfTest(SwHSMSelfTest value) {
        this.hsmSelfTest = value;
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
