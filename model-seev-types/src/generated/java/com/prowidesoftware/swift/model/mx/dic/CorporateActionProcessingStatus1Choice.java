
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
 * Specifies the status of the details of the corporate action event.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionProcessingStatus1Choice", propOrder = {
    "evtSts",
    "forInfOnlyInd"
})
public class CorporateActionProcessingStatus1Choice {

    @XmlElement(name = "EvtSts")
    protected CorporateActionEventStatus1 evtSts;
    @XmlElement(name = "ForInfOnlyInd")
    protected Boolean forInfOnlyInd;

    /**
     * Gets the value of the evtSts property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEventStatus1 }
     *     
     */
    public CorporateActionEventStatus1 getEvtSts() {
        return evtSts;
    }

    /**
     * Sets the value of the evtSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEventStatus1 }
     *     
     */
    public CorporateActionProcessingStatus1Choice setEvtSts(CorporateActionEventStatus1 value) {
        this.evtSts = value;
        return this;
    }

    /**
     * Gets the value of the forInfOnlyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForInfOnlyInd() {
        return forInfOnlyInd;
    }

    /**
     * Sets the value of the forInfOnlyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionProcessingStatus1Choice setForInfOnlyInd(Boolean value) {
        this.forInfOnlyInd = value;
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
