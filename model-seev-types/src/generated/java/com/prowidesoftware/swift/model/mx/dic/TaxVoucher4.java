
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
 * Specifies tax vouchers in the framework of a corporate action event.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxVoucher4", propOrder = {
    "id",
    "brgnDt",
    "brgnSttlmDt"
})
public class TaxVoucher4 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "BrgnDt")
    protected DateAndDateTime2Choice brgnDt;
    @XmlElement(name = "BrgnSttlmDt")
    protected DateAndDateTime2Choice brgnSttlmDt;

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
    public TaxVoucher4 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the brgnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getBrgnDt() {
        return brgnDt;
    }

    /**
     * Sets the value of the brgnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public TaxVoucher4 setBrgnDt(DateAndDateTime2Choice value) {
        this.brgnDt = value;
        return this;
    }

    /**
     * Gets the value of the brgnSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getBrgnSttlmDt() {
        return brgnSttlmDt;
    }

    /**
     * Sets the value of the brgnSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public TaxVoucher4 setBrgnSttlmDt(DateAndDateTime2Choice value) {
        this.brgnSttlmDt = value;
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
