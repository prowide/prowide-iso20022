
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
 * Identification of the service to be billed.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingServiceIdentification2", propOrder = {
    "id",
    "subSvc",
    "desc"
})
public class BillingServiceIdentification2 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "SubSvc")
    protected BillingSubServiceIdentification1 subSvc;
    @XmlElement(name = "Desc", required = true)
    protected String desc;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BillingServiceIdentification2 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the subSvc property.
     * 
     * @return
     *     possible object is
     *     {@link BillingSubServiceIdentification1 }
     *     
     */
    public BillingSubServiceIdentification1 getSubSvc() {
        return subSvc;
    }

    /**
     * Sets the value of the subSvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingSubServiceIdentification1 }
     *     
     */
    public BillingServiceIdentification2 setSubSvc(BillingSubServiceIdentification1 value) {
        this.subSvc = value;
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
    public BillingServiceIdentification2 setDesc(String value) {
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
