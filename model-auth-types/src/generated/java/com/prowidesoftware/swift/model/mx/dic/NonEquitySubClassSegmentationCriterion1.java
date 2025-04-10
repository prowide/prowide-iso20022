
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides information about the sub-class according to one of the segmentation criteria defined as per local regulation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonEquitySubClassSegmentationCriterion1", propOrder = {
    "critNm",
    "critVal"
})
public class NonEquitySubClassSegmentationCriterion1 {

    @XmlElement(name = "CritNm", required = true)
    @XmlSchemaType(name = "string")
    protected NonEquitySubClassSegmentationCriteria1Code critNm;
    @XmlElement(name = "CritVal", required = true)
    protected String critVal;

    /**
     * Gets the value of the critNm property.
     * 
     * @return
     *     possible object is
     *     {@link NonEquitySubClassSegmentationCriteria1Code }
     *     
     */
    public NonEquitySubClassSegmentationCriteria1Code getCritNm() {
        return critNm;
    }

    /**
     * Sets the value of the critNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEquitySubClassSegmentationCriteria1Code }
     *     
     */
    public NonEquitySubClassSegmentationCriterion1 setCritNm(NonEquitySubClassSegmentationCriteria1Code value) {
        this.critNm = value;
        return this;
    }

    /**
     * Gets the value of the critVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCritVal() {
        return critVal;
    }

    /**
     * Sets the value of the critVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public NonEquitySubClassSegmentationCriterion1 setCritVal(String value) {
        this.critVal = value;
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
