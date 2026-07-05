
package com.prowidesoftware.swift.model.mx.sys.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for HSMTest complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HSMTest", propOrder = {
    "hsmHostIP",
    "hsmHost",
    "hsmTestName",
    "hsmTestDetails",
    "hsmTestResult",
    "hsmTestDateTime"
})
public class SwHSMTest {

    @XmlElement(name = "HSMHostIP")
    protected String hsmHostIP;
    @XmlElement(name = "HSMHost")
    protected String hsmHost;
    @XmlElement(name = "HSMTestName", required = true)
    protected String hsmTestName;
    @XmlElement(name = "HSMTestDetails")
    protected String hsmTestDetails;
    @XmlElement(name = "HSMTestResult", required = true)
    protected String hsmTestResult;
    @XmlElement(name = "HSMTestDateTime")
    protected String hsmTestDateTime;

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
    public SwHSMTest setHSMHostIP(String value) {
        this.hsmHostIP = value;
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
    public SwHSMTest setHSMHost(String value) {
        this.hsmHost = value;
        return this;
    }

    /**
     * Gets the value of the hsmTestName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHSMTestName() {
        return hsmTestName;
    }

    /**
     * Sets the value of the hsmTestName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMTest setHSMTestName(String value) {
        this.hsmTestName = value;
        return this;
    }

    /**
     * Gets the value of the hsmTestDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHSMTestDetails() {
        return hsmTestDetails;
    }

    /**
     * Sets the value of the hsmTestDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMTest setHSMTestDetails(String value) {
        this.hsmTestDetails = value;
        return this;
    }

    /**
     * Gets the value of the hsmTestResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHSMTestResult() {
        return hsmTestResult;
    }

    /**
     * Sets the value of the hsmTestResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMTest setHSMTestResult(String value) {
        this.hsmTestResult = value;
        return this;
    }

    /**
     * Gets the value of the hsmTestDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHSMTestDateTime() {
        return hsmTestDateTime;
    }

    /**
     * Sets the value of the hsmTestDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMTest setHSMTestDateTime(String value) {
        this.hsmTestDateTime = value;
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
