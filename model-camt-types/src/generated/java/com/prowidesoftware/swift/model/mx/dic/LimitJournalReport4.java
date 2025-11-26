
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
 * Reports either on the risk management limit or on a business error.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LimitJournalReport4", propOrder = {
    "lmtId",
    "lmtRpt"
})
public class LimitJournalReport4 {

    @XmlElement(name = "LmtId", required = true)
    protected LimitIdentification7 lmtId;
    @XmlElement(name = "LmtRpt", required = true)
    protected LimitJournalReportOrError8Choice lmtRpt;

    /**
     * Gets the value of the lmtId property.
     * 
     * @return
     *     possible object is
     *     {@link LimitIdentification7 }
     *     
     */
    public LimitIdentification7 getLmtId() {
        return lmtId;
    }

    /**
     * Sets the value of the lmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitIdentification7 }
     *     
     */
    public LimitJournalReport4 setLmtId(LimitIdentification7 value) {
        this.lmtId = value;
        return this;
    }

    /**
     * Gets the value of the lmtRpt property.
     * 
     * @return
     *     possible object is
     *     {@link LimitJournalReportOrError8Choice }
     *     
     */
    public LimitJournalReportOrError8Choice getLmtRpt() {
        return lmtRpt;
    }

    /**
     * Sets the value of the lmtRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitJournalReportOrError8Choice }
     *     
     */
    public LimitJournalReport4 setLmtRpt(LimitJournalReportOrError8Choice value) {
        this.lmtRpt = value;
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
