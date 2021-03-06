
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
 * Choice of fund parameters.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundParameters4Choice", propOrder = {
    "noCrit",
    "params"
})
public class FundParameters4Choice {

    @XmlElement(name = "NoCrit")
    @XmlSchemaType(name = "string")
    protected NoCriteria1Code noCrit;
    @XmlElement(name = "Params")
    protected FundParameters5 params;

    /**
     * Gets the value of the noCrit property.
     * 
     * @return
     *     possible object is
     *     {@link NoCriteria1Code }
     *     
     */
    public NoCriteria1Code getNoCrit() {
        return noCrit;
    }

    /**
     * Sets the value of the noCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoCriteria1Code }
     *     
     */
    public FundParameters4Choice setNoCrit(NoCriteria1Code value) {
        this.noCrit = value;
        return this;
    }

    /**
     * Gets the value of the params property.
     * 
     * @return
     *     possible object is
     *     {@link FundParameters5 }
     *     
     */
    public FundParameters5 getParams() {
        return params;
    }

    /**
     * Sets the value of the params property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundParameters5 }
     *     
     */
    public FundParameters4Choice setParams(FundParameters5 value) {
        this.params = value;
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
