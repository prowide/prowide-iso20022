
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
 * Contains customer reference values provided for this transaction and used for various reference processing at the
 * customer site. These values represent information most prevalently provided by travel agencies for transactions booked against a lodged account or central travel account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerReference1", propOrder = {
    "id",
    "dtl"
})
public class CustomerReference1 {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Dtl")
    protected String dtl;

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
    public CustomerReference1 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the dtl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtl() {
        return dtl;
    }

    /**
     * Sets the value of the dtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CustomerReference1 setDtl(String value) {
        this.dtl = value;
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
