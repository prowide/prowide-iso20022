
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
 * Specifies the type of adjustment applied to the amount of goods/services by means of a code or free text.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdjustmentType1Choice", propOrder = {
    "tp",
    "othrAdjstmntTp"
})
public class AdjustmentType1Choice {

    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected AdjustmentType2Code tp;
    @XmlElement(name = "OthrAdjstmntTp")
    protected String othrAdjstmntTp;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustmentType2Code }
     *     
     */
    public AdjustmentType2Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustmentType2Code }
     *     
     */
    public AdjustmentType1Choice setTp(AdjustmentType2Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the othrAdjstmntTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrAdjstmntTp() {
        return othrAdjstmntTp;
    }

    /**
     * Sets the value of the othrAdjstmntTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdjustmentType1Choice setOthrAdjstmntTp(String value) {
        this.othrAdjstmntTp = value;
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
