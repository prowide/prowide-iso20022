
package com.prowidesoftware.swift.model.mx.dic;

import java.util.Calendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * The dates in relation with the money market fund life cycle.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedEvent2", propOrder = {
    "incptnDt",
    "mrgrDt",
    "lqdtnDt",
    "lastRptSnt"
})
public class RelatedEvent2 {

    @XmlElement(name = "IncptnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar incptnDt;
    @XmlElement(name = "MrgrDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar mrgrDt;
    @XmlElement(name = "LqdtnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar lqdtnDt;
    @XmlElement(name = "LastRptSnt")
    protected boolean lastRptSnt;

    /**
     * Gets the value of the incptnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getIncptnDt() {
        return incptnDt;
    }

    /**
     * Sets the value of the incptnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RelatedEvent2 setIncptnDt(Calendar value) {
        this.incptnDt = value;
        return this;
    }

    /**
     * Gets the value of the mrgrDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getMrgrDt() {
        return mrgrDt;
    }

    /**
     * Sets the value of the mrgrDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RelatedEvent2 setMrgrDt(Calendar value) {
        this.mrgrDt = value;
        return this;
    }

    /**
     * Gets the value of the lqdtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getLqdtnDt() {
        return lqdtnDt;
    }

    /**
     * Sets the value of the lqdtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RelatedEvent2 setLqdtnDt(Calendar value) {
        this.lqdtnDt = value;
        return this;
    }

    /**
     * Gets the value of the lastRptSnt property.
     * 
     */
    public boolean isLastRptSnt() {
        return lastRptSnt;
    }

    /**
     * Sets the value of the lastRptSnt property.
     * 
     */
    public RelatedEvent2 setLastRptSnt(boolean value) {
        this.lastRptSnt = value;
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
