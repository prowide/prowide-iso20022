
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
 * Information on the identification of the share classes of the fund.
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShareClassList1", propOrder = {
    "id",
    "ccy",
    "hghstNetAsstVal"
})
public class ShareClassList1 {

    @XmlElement(name = "Id", required = true)
    protected SecurityIdentification31Choice id;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "HghstNetAsstVal")
    protected Boolean hghstNetAsstVal;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification31Choice }
     *     
     */
    public SecurityIdentification31Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification31Choice }
     *     
     */
    public ShareClassList1 setId(SecurityIdentification31Choice value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ShareClassList1 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the hghstNetAsstVal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHghstNetAsstVal() {
        return hghstNetAsstVal;
    }

    /**
     * Sets the value of the hghstNetAsstVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ShareClassList1 setHghstNetAsstVal(Boolean value) {
        this.hghstNetAsstVal = value;
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
