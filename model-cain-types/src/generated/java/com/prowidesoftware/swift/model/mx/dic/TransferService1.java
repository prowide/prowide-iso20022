
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
 * Funds transfer service
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferService1", propOrder = {
    "svcPrvdr",
    "svcNm",
    "ref",
    "bizPurp",
    "desc"
})
public class TransferService1 {

    @XmlElement(name = "SvcPrvdr")
    protected String svcPrvdr;
    @XmlElement(name = "SvcNm")
    protected String svcNm;
    @XmlElement(name = "Ref")
    protected String ref;
    @XmlElement(name = "BizPurp")
    protected String bizPurp;
    @XmlElement(name = "Desc")
    protected String desc;

    /**
     * Gets the value of the svcPrvdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcPrvdr() {
        return svcPrvdr;
    }

    /**
     * Sets the value of the svcPrvdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransferService1 setSvcPrvdr(String value) {
        this.svcPrvdr = value;
        return this;
    }

    /**
     * Gets the value of the svcNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcNm() {
        return svcNm;
    }

    /**
     * Sets the value of the svcNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransferService1 setSvcNm(String value) {
        this.svcNm = value;
        return this;
    }

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransferService1 setRef(String value) {
        this.ref = value;
        return this;
    }

    /**
     * Gets the value of the bizPurp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizPurp() {
        return bizPurp;
    }

    /**
     * Sets the value of the bizPurp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransferService1 setBizPurp(String value) {
        this.bizPurp = value;
        return this;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransferService1 setDesc(String value) {
        this.desc = value;
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
