
package com.prowidesoftware.swift.model.mx.sys.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for SessionHistoryRequest complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SessionHistoryRequest", propOrder = {
    "rptCrit"
})
public class SessionHistoryRequest {

    @XmlElement(name = "RptCrit", required = true)
    protected SessionHistoryCriteria rptCrit;

    /**
     * Gets the value of the rptCrit property.
     * 
     * @return
     *     possible object is
     *     {@link SessionHistoryCriteria }
     *     
     */
    public SessionHistoryCriteria getRptCrit() {
        return rptCrit;
    }

    /**
     * Sets the value of the rptCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionHistoryCriteria }
     *     
     */
    public SessionHistoryRequest setRptCrit(SessionHistoryCriteria value) {
        this.rptCrit = value;
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
