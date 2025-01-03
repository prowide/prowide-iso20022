
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
 * Identification of a linked corporate action event.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionEventReference3", propOrder = {
    "evtId",
    "lkgTp"
})
public class CorporateActionEventReference3 {

    @XmlElement(name = "EvtId", required = true)
    protected CorporateActionEventReference3Choice evtId;
    @XmlElement(name = "LkgTp")
    protected ProcessingPosition7Choice lkgTp;

    /**
     * Gets the value of the evtId property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEventReference3Choice }
     *     
     */
    public CorporateActionEventReference3Choice getEvtId() {
        return evtId;
    }

    /**
     * Sets the value of the evtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEventReference3Choice }
     *     
     */
    public CorporateActionEventReference3 setEvtId(CorporateActionEventReference3Choice value) {
        this.evtId = value;
        return this;
    }

    /**
     * Gets the value of the lkgTp property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingPosition7Choice }
     *     
     */
    public ProcessingPosition7Choice getLkgTp() {
        return lkgTp;
    }

    /**
     * Sets the value of the lkgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingPosition7Choice }
     *     
     */
    public CorporateActionEventReference3 setLkgTp(ProcessingPosition7Choice value) {
        this.lkgTp = value;
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
