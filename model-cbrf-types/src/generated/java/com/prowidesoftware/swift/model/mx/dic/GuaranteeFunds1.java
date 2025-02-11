
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
 * Guarantee funds details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuaranteeFunds1", propOrder = {
    "grntFndsUsgTp",
    "grntFndInf"
})
public class GuaranteeFunds1 {

    @XmlElement(name = "GrntFndsUsgTp", required = true)
    protected String grntFndsUsgTp;
    @XmlElement(name = "GrntFndInf")
    protected GuaranteeFundInformation1 grntFndInf;

    /**
     * Gets the value of the grntFndsUsgTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrntFndsUsgTp() {
        return grntFndsUsgTp;
    }

    /**
     * Sets the value of the grntFndsUsgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public GuaranteeFunds1 setGrntFndsUsgTp(String value) {
        this.grntFndsUsgTp = value;
        return this;
    }

    /**
     * Gets the value of the grntFndInf property.
     * 
     * @return
     *     possible object is
     *     {@link GuaranteeFundInformation1 }
     *     
     */
    public GuaranteeFundInformation1 getGrntFndInf() {
        return grntFndInf;
    }

    /**
     * Sets the value of the grntFndInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuaranteeFundInformation1 }
     *     
     */
    public GuaranteeFunds1 setGrntFndInf(GuaranteeFundInformation1 value) {
        this.grntFndInf = value;
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
