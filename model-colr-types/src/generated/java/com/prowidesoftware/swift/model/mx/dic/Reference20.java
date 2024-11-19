
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
 * Additional references linked to the updated interest request such the original InterestRequest identification, and optionaly the InterestResponse identification.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reference20", propOrder = {
    "intrstPmtReqId",
    "intrstPmtRspnId"
})
public class Reference20 {

    @XmlElement(name = "IntrstPmtReqId", required = true)
    protected String intrstPmtReqId;
    @XmlElement(name = "IntrstPmtRspnId")
    protected String intrstPmtRspnId;

    /**
     * Gets the value of the intrstPmtReqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntrstPmtReqId() {
        return intrstPmtReqId;
    }

    /**
     * Sets the value of the intrstPmtReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference20 setIntrstPmtReqId(String value) {
        this.intrstPmtReqId = value;
        return this;
    }

    /**
     * Gets the value of the intrstPmtRspnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntrstPmtRspnId() {
        return intrstPmtRspnId;
    }

    /**
     * Sets the value of the intrstPmtRspnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference20 setIntrstPmtRspnId(String value) {
        this.intrstPmtRspnId = value;
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
