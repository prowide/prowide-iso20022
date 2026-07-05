
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
 * Identification of the competent authority which supervises the reporting counterparty.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompetentAuthority1", propOrder = {
    "id",
    "onbrdgSts"
})
public class CompetentAuthority1 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "OnbrdgSts")
    protected boolean onbrdgSts;

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
    public CompetentAuthority1 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the onbrdgSts property.
     * 
     */
    public boolean isOnbrdgSts() {
        return onbrdgSts;
    }

    /**
     * Sets the value of the onbrdgSts property.
     * 
     */
    public CompetentAuthority1 setOnbrdgSts(boolean value) {
        this.onbrdgSts = value;
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
