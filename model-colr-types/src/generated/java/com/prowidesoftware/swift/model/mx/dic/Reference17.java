
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
 * Information related to a linked transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reference17", propOrder = {
    "collSbstitnReqId",
    "collSbstitnRspnId"
})
public class Reference17 {

    @XmlElement(name = "CollSbstitnReqId", required = true)
    protected String collSbstitnReqId;
    @XmlElement(name = "CollSbstitnRspnId")
    protected String collSbstitnRspnId;

    /**
     * Gets the value of the collSbstitnReqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollSbstitnReqId() {
        return collSbstitnReqId;
    }

    /**
     * Sets the value of the collSbstitnReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference17 setCollSbstitnReqId(String value) {
        this.collSbstitnReqId = value;
        return this;
    }

    /**
     * Gets the value of the collSbstitnRspnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollSbstitnRspnId() {
        return collSbstitnRspnId;
    }

    /**
     * Sets the value of the collSbstitnRspnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference17 setCollSbstitnRspnId(String value) {
        this.collSbstitnRspnId = value;
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
