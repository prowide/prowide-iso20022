
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
 * Provides the details for a call/put option.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Option12", propOrder = {
    "tp",
    "dtOrPrd"
})
public class Option12 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected OptionType1Code tp;
    @XmlElement(name = "DtOrPrd", required = true)
    protected OptionDateOrPeriod1Choice dtOrPrd;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link OptionType1Code }
     *     
     */
    public OptionType1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionType1Code }
     *     
     */
    public Option12 setTp(OptionType1Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the dtOrPrd property.
     * 
     * @return
     *     possible object is
     *     {@link OptionDateOrPeriod1Choice }
     *     
     */
    public OptionDateOrPeriod1Choice getDtOrPrd() {
        return dtOrPrd;
    }

    /**
     * Sets the value of the dtOrPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionDateOrPeriod1Choice }
     *     
     */
    public Option12 setDtOrPrd(OptionDateOrPeriod1Choice value) {
        this.dtOrPrd = value;
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
