
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
 * Trace of response by the entities in the path from the issuer to the ATM.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseType8", propOrder = {
    "rspndrId",
    "cdfctn",
    "rspn",
    "rspnRsn",
    "addtlRspnInf"
})
public class ResponseType8 {

    @XmlElement(name = "RspndrId", required = true)
    protected String rspndrId;
    @XmlElement(name = "Cdfctn")
    protected String cdfctn;
    @XmlElement(name = "Rspn", required = true)
    protected String rspn;
    @XmlElement(name = "RspnRsn")
    protected String rspnRsn;
    @XmlElement(name = "AddtlRspnInf")
    protected String addtlRspnInf;

    /**
     * Gets the value of the rspndrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRspndrId() {
        return rspndrId;
    }

    /**
     * Sets the value of the rspndrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ResponseType8 setRspndrId(String value) {
        this.rspndrId = value;
        return this;
    }

    /**
     * Gets the value of the cdfctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdfctn() {
        return cdfctn;
    }

    /**
     * Sets the value of the cdfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ResponseType8 setCdfctn(String value) {
        this.cdfctn = value;
        return this;
    }

    /**
     * Gets the value of the rspn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRspn() {
        return rspn;
    }

    /**
     * Sets the value of the rspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ResponseType8 setRspn(String value) {
        this.rspn = value;
        return this;
    }

    /**
     * Gets the value of the rspnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRspnRsn() {
        return rspnRsn;
    }

    /**
     * Sets the value of the rspnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ResponseType8 setRspnRsn(String value) {
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
    public ResponseType8 setAddtlRspnInf(String value) {
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
