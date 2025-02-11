
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
 * Java class for HSMBox complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HSMBox", propOrder = {
    "hsmRoleNumber",
    "hsmHost",
    "hsmHostIP"
})
public class SwHSMBox {

    @XmlElement(name = "HSMRoleNumber", required = true)
    protected String hsmRoleNumber;
    @XmlElement(name = "HSMHost")
    protected String hsmHost;
    @XmlElement(name = "HSMHostIP", required = true)
    protected String hsmHostIP;

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
    public SwHSMBox setHSMRoleNumber(String value) {
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
    public SwHSMBox setHSMHost(String value) {
        this.hsmHost = value;
        return this;
    }

    /**
     * Gets the value of the hsmHostIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHSMHostIP() {
        return hsmHostIP;
    }

    /**
     * Sets the value of the hsmHostIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMBox setHSMHostIP(String value) {
        this.hsmHostIP = value;
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
