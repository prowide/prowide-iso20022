
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
 * Additional details to clarify response codes.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseDetails1", propOrder = {
    "rspnCd",
    "addtlDtls"
})
public class ResponseDetails1 {

    @XmlElement(name = "RspnCd", required = true)
    protected String rspnCd;
    @XmlElement(name = "AddtlDtls")
    protected String addtlDtls;

    /**
     * Gets the value of the rspnCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRspnCd() {
        return rspnCd;
    }

    /**
     * Sets the value of the rspnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ResponseDetails1 setRspnCd(String value) {
        this.rspnCd = value;
        return this;
    }

    /**
     * Gets the value of the addtlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlDtls() {
        return addtlDtls;
    }

    /**
     * Sets the value of the addtlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ResponseDetails1 setAddtlDtls(String value) {
        this.addtlDtls = value;
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
