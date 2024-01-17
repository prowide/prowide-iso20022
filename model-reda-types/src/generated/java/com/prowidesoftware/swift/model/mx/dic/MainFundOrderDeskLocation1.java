
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
 * U-003-2009 Addition and Modification of choice component. S-009-2009 They are not valid business options in the redemption processing context. S-015-2009 Add new data elements to indicate time zone.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MainFundOrderDeskLocation1", propOrder = {
    "ctry",
    "tmZoneOffSet"
})
public class MainFundOrderDeskLocation1 {

    @XmlElement(name = "Ctry", required = true)
    protected String ctry;
    @XmlElement(name = "TmZoneOffSet", required = true)
    protected UTCOffset1 tmZoneOffSet;

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MainFundOrderDeskLocation1 setCtry(String value) {
        this.ctry = value;
        return this;
    }

    /**
     * Gets the value of the tmZoneOffSet property.
     * 
     * @return
     *     possible object is
     *     {@link UTCOffset1 }
     *     
     */
    public UTCOffset1 getTmZoneOffSet() {
        return tmZoneOffSet;
    }

    /**
     * Sets the value of the tmZoneOffSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link UTCOffset1 }
     *     
     */
    public MainFundOrderDeskLocation1 setTmZoneOffSet(UTCOffset1 value) {
        this.tmZoneOffSet = value;
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
