
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
 * Java class for HSMSelfTest complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HSMSelfTest", propOrder = {
    "hsmSelfTestResult",
    "hsmSelfTestDateTime"
})
public class SwHSMSelfTest {

    @XmlElement(name = "HSMSelfTestResult", required = true)
    protected String hsmSelfTestResult;
    @XmlElement(name = "HSMSelfTestDateTime")
    protected String hsmSelfTestDateTime;

    /**
     * Gets the value of the hsmSelfTestResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHSMSelfTestResult() {
        return hsmSelfTestResult;
    }

    /**
     * Sets the value of the hsmSelfTestResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMSelfTest setHSMSelfTestResult(String value) {
        this.hsmSelfTestResult = value;
        return this;
    }

    /**
     * Gets the value of the hsmSelfTestDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHSMSelfTestDateTime() {
        return hsmSelfTestDateTime;
    }

    /**
     * Sets the value of the hsmSelfTestDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMSelfTest setHSMSelfTestDateTime(String value) {
        this.hsmSelfTestDateTime = value;
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
