
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Recommended actions as result of risk assessment.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecommendationAction2", propOrder = {
    "actn",
    "dtls"
})
public class RecommendationAction2 {

    @XmlElement(name = "Actn")
    @XmlSchemaType(name = "string")
    protected RecommendedActionCode1 actn;
    @XmlElement(name = "Dtls")
    protected String dtls;

    /**
     * Gets the value of the actn property.
     * 
     * @return
     *     possible object is
     *     {@link RecommendedActionCode1 }
     *     
     */
    public RecommendedActionCode1 getActn() {
        return actn;
    }

    /**
     * Sets the value of the actn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecommendedActionCode1 }
     *     
     */
    public RecommendationAction2 setActn(RecommendedActionCode1 value) {
        this.actn = value;
        return this;
    }

    /**
     * Gets the value of the dtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtls() {
        return dtls;
    }

    /**
     * Sets the value of the dtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RecommendationAction2 setDtls(String value) {
        this.dtls = value;
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
