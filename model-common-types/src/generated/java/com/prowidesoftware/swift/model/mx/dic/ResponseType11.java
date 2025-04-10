
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Response of a requested service.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseType11", propOrder = {
    "rspn",
    "rspnRsn",
    "addtlRspnInf"
})
public class ResponseType11 {

    @XmlElement(name = "Rspn", required = true)
    @XmlSchemaType(name = "string")
    protected Response11Code rspn;
    @XmlElement(name = "RspnRsn")
    @XmlSchemaType(name = "string")
    protected RetailerResultDetail1Code rspnRsn;
    @XmlElement(name = "AddtlRspnInf")
    protected String addtlRspnInf;

    /**
     * Gets the value of the rspn property.
     * 
     * @return
     *     possible object is
     *     {@link Response11Code }
     *     
     */
    public Response11Code getRspn() {
        return rspn;
    }

    /**
     * Sets the value of the rspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Response11Code }
     *     
     */
    public ResponseType11 setRspn(Response11Code value) {
        this.rspn = value;
        return this;
    }

    /**
     * Gets the value of the rspnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link RetailerResultDetail1Code }
     *     
     */
    public RetailerResultDetail1Code getRspnRsn() {
        return rspnRsn;
    }

    /**
     * Sets the value of the rspnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailerResultDetail1Code }
     *     
     */
    public ResponseType11 setRspnRsn(RetailerResultDetail1Code value) {
        this.rspnRsn = value;
        return this;
    }

    /**
     * Gets the value of the addtlRspnInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlRspnInf() {
        return addtlRspnInf;
    }

    /**
     * Sets the value of the addtlRspnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ResponseType11 setAddtlRspnInf(String value) {
        this.addtlRspnInf = value;
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
