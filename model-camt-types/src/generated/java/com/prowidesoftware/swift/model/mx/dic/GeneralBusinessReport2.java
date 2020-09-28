
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
 * Reports either on the business information or on a business error.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralBusinessReport2", propOrder = {
    "bizInfRef",
    "bizErr",
    "gnlBizInf"
})
public class GeneralBusinessReport2 {

    @XmlElement(name = "BizInfRef", required = true)
    protected String bizInfRef;
    @XmlElement(name = "BizErr")
    protected ErrorHandling3 bizErr;
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
    public GeneralBusinessReport2 setBizInfRef(String value) {
        this.bizInfRef = value;
        return this;
    }

    /**
     * Gets the value of the bizErr property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorHandling3 }
     *     
     */
    public ErrorHandling3 getBizErr() {
        return bizErr;
    }

    /**
     * Sets the value of the bizErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorHandling3 }
     *     
     */
    public GeneralBusinessReport2 setBizErr(ErrorHandling3 value) {
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
    public GeneralBusinessReport2 setGnlBizInf(GeneralBusinessInformation value) {
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
