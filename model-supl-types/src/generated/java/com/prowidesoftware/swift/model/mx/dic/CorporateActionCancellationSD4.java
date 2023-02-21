
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
 * Provides additional information regarding additional comments.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionCancellationSD4", propOrder = {
    "plcAndNm",
    "xtrnlCmnts"
})
public class CorporateActionCancellationSD4 {

    @XmlElement(name = "PlcAndNm")
    protected String plcAndNm;
    @XmlElement(name = "XtrnlCmnts")
    protected String xtrnlCmnts;

    /**
     * Gets the value of the plcAndNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcAndNm() {
        return plcAndNm;
    }

    /**
     * Sets the value of the plcAndNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionCancellationSD4 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the xtrnlCmnts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtrnlCmnts() {
        return xtrnlCmnts;
    }

    /**
     * Sets the value of the xtrnlCmnts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionCancellationSD4 setXtrnlCmnts(String value) {
        this.xtrnlCmnts = value;
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
