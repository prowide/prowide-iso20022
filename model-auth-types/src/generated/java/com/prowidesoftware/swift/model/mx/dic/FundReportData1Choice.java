
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
 * Choice defining money market fund report data that are either new or have been corrected or have been invalidated.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundReportData1Choice", propOrder = {
    "upd",
    "cxl"
})
public class FundReportData1Choice {

    @XmlElement(name = "Upd")
    protected FundReportUpdate1 upd;
    @XmlElement(name = "Cxl")
    protected FundReportCancellation1 cxl;

    /**
     * Gets the value of the upd property.
     * 
     * @return
     *     possible object is
     *     {@link FundReportUpdate1 }
     *     
     */
    public FundReportUpdate1 getUpd() {
        return upd;
    }

    /**
     * Sets the value of the upd property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundReportUpdate1 }
     *     
     */
    public FundReportData1Choice setUpd(FundReportUpdate1 value) {
        this.upd = value;
        return this;
    }

    /**
     * Gets the value of the cxl property.
     * 
     * @return
     *     possible object is
     *     {@link FundReportCancellation1 }
     *     
     */
    public FundReportCancellation1 getCxl() {
        return cxl;
    }

    /**
     * Sets the value of the cxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundReportCancellation1 }
     *     
     */
    public FundReportData1Choice setCxl(FundReportCancellation1 value) {
        this.cxl = value;
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
