
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
 * Choice between a date or a date and time format.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateLogDateTime1Choice", propOrder = {
    "dt",
    "dtTm"
})
public class UpdateLogDateTime1Choice {

    @XmlElement(name = "Dt")
    protected UpdateLogDate1 dt;
    @XmlElement(name = "DtTm")
    protected UpdateLogDateTime1 dtTm;

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateLogDate1 }
     *     
     */
    public UpdateLogDate1 getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateLogDate1 }
     *     
     */
    public UpdateLogDateTime1Choice setDt(UpdateLogDate1 value) {
        this.dt = value;
        return this;
    }

    /**
     * Gets the value of the dtTm property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateLogDateTime1 }
     *     
     */
    public UpdateLogDateTime1 getDtTm() {
        return dtTm;
    }

    /**
     * Sets the value of the dtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateLogDateTime1 }
     *     
     */
    public UpdateLogDateTime1Choice setDtTm(UpdateLogDateTime1 value) {
        this.dtTm = value;
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
