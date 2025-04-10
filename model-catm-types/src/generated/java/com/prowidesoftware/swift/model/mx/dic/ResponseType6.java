
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
@XmlType(name = "ResponseType6", propOrder = {
    "rspn",
    "rspnDtl",
    "addtlRspn"
})
public class ResponseType6 {

    @XmlElement(name = "Rspn", required = true)
    @XmlSchemaType(name = "string")
    protected Response2Code rspn;
    @XmlElement(name = "RspnDtl")
    @XmlSchemaType(name = "string")
    protected ResultDetail3Code rspnDtl;
    @XmlElement(name = "AddtlRspn")
    protected String addtlRspn;

    /**
     * Gets the value of the rspn property.
     * 
     * @return
     *     possible object is
     *     {@link Response2Code }
     *     
     */
    public Response2Code getRspn() {
        return rspn;
    }

    /**
     * Sets the value of the rspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Response2Code }
     *     
     */
    public ResponseType6 setRspn(Response2Code value) {
        this.rspn = value;
        return this;
    }

    /**
     * Gets the value of the rspnDtl property.
     * 
     * @return
     *     possible object is
     *     {@link ResultDetail3Code }
     *     
     */
    public ResultDetail3Code getRspnDtl() {
        return rspnDtl;
    }

    /**
     * Sets the value of the rspnDtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultDetail3Code }
     *     
     */
    public ResponseType6 setRspnDtl(ResultDetail3Code value) {
        this.rspnDtl = value;
        return this;
    }

    /**
     * Gets the value of the addtlRspn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlRspn() {
        return addtlRspn;
    }

    /**
     * Sets the value of the addtlRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ResponseType6 setAddtlRspn(String value) {
        this.addtlRspn = value;
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
