
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
 * Information about an post trade risk reduction identifier.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostTradeRiskReductionIdentifier1", propOrder = {
    "strr",
    "id"
})
public class PostTradeRiskReductionIdentifier1 {

    @XmlElement(name = "Strr", required = true)
    protected String strr;
    @XmlElement(name = "Id", required = true)
    protected String id;

    /**
     * Gets the value of the strr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrr() {
        return strr;
    }

    /**
     * Sets the value of the strr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PostTradeRiskReductionIdentifier1 setStrr(String value) {
        this.strr = value;
        return this;
    }

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
    public PostTradeRiskReductionIdentifier1 setId(String value) {
        this.id = value;
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
