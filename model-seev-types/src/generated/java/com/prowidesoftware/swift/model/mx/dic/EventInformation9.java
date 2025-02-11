
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
 * Provides information about event of a corporate action.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventInformation9", propOrder = {
    "corpActnEvtId",
    "offclCorpActnEvtId",
    "evtTp",
    "mndtryVlntryEvtTp",
    "lastNtfctnId"
})
public class EventInformation9 {

    @XmlElement(name = "CorpActnEvtId", required = true)
    protected String corpActnEvtId;
    @XmlElement(name = "OffclCorpActnEvtId")
    protected String offclCorpActnEvtId;
    @XmlElement(name = "EvtTp", required = true)
    protected CorporateActionEventType52Choice evtTp;
    @XmlElement(name = "MndtryVlntryEvtTp", required = true)
    protected CorporateActionMandatoryVoluntary3Choice mndtryVlntryEvtTp;
    @XmlElement(name = "LastNtfctnId")
    protected NotificationIdentification3 lastNtfctnId;

    /**
     * Gets the value of the corpActnEvtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorpActnEvtId() {
        return corpActnEvtId;
    }

    /**
     * Sets the value of the corpActnEvtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public EventInformation9 setCorpActnEvtId(String value) {
        this.corpActnEvtId = value;
        return this;
    }

    /**
     * Gets the value of the offclCorpActnEvtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffclCorpActnEvtId() {
        return offclCorpActnEvtId;
    }

    /**
     * Sets the value of the offclCorpActnEvtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public EventInformation9 setOffclCorpActnEvtId(String value) {
        this.offclCorpActnEvtId = value;
        return this;
    }

    /**
     * Gets the value of the evtTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEventType52Choice }
     *     
     */
    public CorporateActionEventType52Choice getEvtTp() {
        return evtTp;
    }

    /**
     * Sets the value of the evtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEventType52Choice }
     *     
     */
    public EventInformation9 setEvtTp(CorporateActionEventType52Choice value) {
        this.evtTp = value;
        return this;
    }

    /**
     * Gets the value of the mndtryVlntryEvtTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionMandatoryVoluntary3Choice }
     *     
     */
    public CorporateActionMandatoryVoluntary3Choice getMndtryVlntryEvtTp() {
        return mndtryVlntryEvtTp;
    }

    /**
     * Sets the value of the mndtryVlntryEvtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionMandatoryVoluntary3Choice }
     *     
     */
    public EventInformation9 setMndtryVlntryEvtTp(CorporateActionMandatoryVoluntary3Choice value) {
        this.mndtryVlntryEvtTp = value;
        return this;
    }

    /**
     * Gets the value of the lastNtfctnId property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationIdentification3 }
     *     
     */
    public NotificationIdentification3 getLastNtfctnId() {
        return lastNtfctnId;
    }

    /**
     * Sets the value of the lastNtfctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationIdentification3 }
     *     
     */
    public EventInformation9 setLastNtfctnId(NotificationIdentification3 value) {
        this.lastNtfctnId = value;
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
