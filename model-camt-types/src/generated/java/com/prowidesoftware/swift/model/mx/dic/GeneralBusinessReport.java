
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
 * Reports either on the business information or on a business error.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralBusinessReport", propOrder = {
    "bizInfRef",
    "bizErr",
    "gnlBizInf"
})
public class GeneralBusinessReport {

    @XmlElement(name = "BizInfRef", required = true)
    protected String bizInfRef;
    @XmlElement(name = "BizErr")
    protected ErrorHandling2 bizErr;
    @XmlElement(name = "GnlBizInf")
    protected GeneralBusinessInformation gnlBizInf;

    /**
     * Gets the value of the bizInfRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizInfRef() {
        return bizInfRef;
    }

    /**
     * Sets the value of the bizInfRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public GeneralBusinessReport setBizInfRef(String value) {
        this.bizInfRef = value;
        return this;
    }

    /**
     * Gets the value of the bizErr property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorHandling2 }
     *     
     */
    public ErrorHandling2 getBizErr() {
        return bizErr;
    }

    /**
     * Sets the value of the bizErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorHandling2 }
     *     
     */
    public GeneralBusinessReport setBizErr(ErrorHandling2 value) {
        this.bizErr = value;
        return this;
    }

    /**
     * Gets the value of the gnlBizInf property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralBusinessInformation }
     *     
     */
    public GeneralBusinessInformation getGnlBizInf() {
        return gnlBizInf;
    }

    /**
     * Sets the value of the gnlBizInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralBusinessInformation }
     *     
     */
    public GeneralBusinessReport setGnlBizInf(GeneralBusinessInformation value) {
        this.gnlBizInf = value;
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
