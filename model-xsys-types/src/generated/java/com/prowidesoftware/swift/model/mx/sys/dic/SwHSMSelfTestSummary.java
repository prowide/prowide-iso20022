
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
 * Java class for HSMSelfTestSummary complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HSMSelfTestSummary", propOrder = {
    "hsmSelfTestReportFilename"
})
public class SwHSMSelfTestSummary {

    @XmlElement(name = "HSMSelfTestReportFilename")
    protected String hsmSelfTestReportFilename;

    /**
     * Gets the value of the hsmSelfTestReportFilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHSMSelfTestReportFilename() {
        return hsmSelfTestReportFilename;
    }

    /**
     * Sets the value of the hsmSelfTestReportFilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMSelfTestSummary setHSMSelfTestReportFilename(String value) {
        this.hsmSelfTestReportFilename = value;
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
