
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
 * Identification of a linked corporate action event.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionEventReference1", propOrder = {
    "evtId",
    "lkgTp"
})
public class CorporateActionEventReference1 {

    @XmlElement(name = "EvtId", required = true)
    protected CorporateActionEventReference1Choice evtId;
    @XmlElement(name = "LkgTp")
    protected ProcessingPosition1Choice lkgTp;

    /**
     * Gets the value of the evtId property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEventReference1Choice }
     *     
     */
    public CorporateActionEventReference1Choice getEvtId() {
        return evtId;
    }

    /**
     * Sets the value of the evtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEventReference1Choice }
     *     
     */
    public CorporateActionEventReference1 setEvtId(CorporateActionEventReference1Choice value) {
        this.evtId = value;
        return this;
    }

    /**
     * Gets the value of the lkgTp property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingPosition1Choice }
     *     
     */
    public ProcessingPosition1Choice getLkgTp() {
        return lkgTp;
    }

    /**
     * Sets the value of the lkgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingPosition1Choice }
     *     
     */
    public CorporateActionEventReference1 setLkgTp(ProcessingPosition1Choice value) {
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
