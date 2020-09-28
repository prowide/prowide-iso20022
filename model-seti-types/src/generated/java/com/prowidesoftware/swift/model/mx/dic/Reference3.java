
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
 * Additional references linked to the quote.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reference3", propOrder = {
    "qtReqId",
    "qtRspnId"
})
public class Reference3 {

    @XmlElement(name = "QtReqId")
    protected String qtReqId;
    @XmlElement(name = "QtRspnId")
    protected String qtRspnId;

    /**
     * Gets the value of the qtReqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtReqId() {
        return qtReqId;
    }

    /**
     * Sets the value of the qtReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference3 setQtReqId(String value) {
        this.qtReqId = value;
        return this;
    }

    /**
     * Gets the value of the qtRspnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtRspnId() {
        return qtRspnId;
    }

    /**
     * Sets the value of the qtRspnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference3 setQtRspnId(String value) {
        this.qtRspnId = value;
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
