
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
 * Specifies the details of incorrect information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnableToApplyIncorrect2", propOrder = {
    "tp",
    "addtlIncrrctInf"
})
public class UnableToApplyIncorrect2 {

    @XmlElement(name = "Tp", required = true)
    protected IncorrectData1Choice tp;
    @XmlElement(name = "AddtlIncrrctInf")
    protected String addtlIncrrctInf;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link IncorrectData1Choice }
     *     
     */
    public IncorrectData1Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncorrectData1Choice }
     *     
     */
    public UnableToApplyIncorrect2 setTp(IncorrectData1Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the addtlIncrrctInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlIncrrctInf() {
        return addtlIncrrctInf;
    }

    /**
     * Sets the value of the addtlIncrrctInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public UnableToApplyIncorrect2 setAddtlIncrrctInf(String value) {
        this.addtlIncrrctInf = value;
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
