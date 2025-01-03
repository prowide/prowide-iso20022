
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
 * Specifies the details of missing information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnableToApplyMissing2", propOrder = {
    "tp",
    "addtlMssngInf"
})
public class UnableToApplyMissing2 {

    @XmlElement(name = "Tp", required = true)
    protected MissingData1Choice tp;
    @XmlElement(name = "AddtlMssngInf")
    protected String addtlMssngInf;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link MissingData1Choice }
     *     
     */
    public MissingData1Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link MissingData1Choice }
     *     
     */
    public UnableToApplyMissing2 setTp(MissingData1Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the addtlMssngInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlMssngInf() {
        return addtlMssngInf;
    }

    /**
     * Sets the value of the addtlMssngInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public UnableToApplyMissing2 setAddtlMssngInf(String value) {
        this.addtlMssngInf = value;
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
