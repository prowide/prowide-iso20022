
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
@XmlType(name = "GeneralBusinessReport4", propOrder = {
    "bizInfRef",
    "gnlBizOrErr"
})
public class GeneralBusinessReport4 {

    @XmlElement(name = "BizInfRef", required = true)
    protected String bizInfRef;
    @XmlElement(name = "GnlBizOrErr", required = true)
    protected GeneralBusinessOrError4Choice gnlBizOrErr;

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
    public GeneralBusinessReport4 setBizInfRef(String value) {
        this.bizInfRef = value;
        return this;
    }

    /**
     * Gets the value of the gnlBizOrErr property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralBusinessOrError4Choice }
     *     
     */
    public GeneralBusinessOrError4Choice getGnlBizOrErr() {
        return gnlBizOrErr;
    }

    /**
     * Sets the value of the gnlBizOrErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralBusinessOrError4Choice }
     *     
     */
    public GeneralBusinessReport4 setGnlBizOrErr(GeneralBusinessOrError4Choice value) {
        this.gnlBizOrErr = value;
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
