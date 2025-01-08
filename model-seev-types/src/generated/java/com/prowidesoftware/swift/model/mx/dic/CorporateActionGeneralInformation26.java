
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
 * General information about the corporate action event.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionGeneralInformation26", propOrder = {
    "corpActnEvtId",
    "offclCorpActnEvtId",
    "evtTp",
    "undrlygSctyId"
})
public class CorporateActionGeneralInformation26 {

    @XmlElement(name = "CorpActnEvtId", required = true)
    protected String corpActnEvtId;
    @XmlElement(name = "OffclCorpActnEvtId")
    protected String offclCorpActnEvtId;
    @XmlElement(name = "EvtTp", required = true)
    protected CorporateActionEventType3Choice evtTp;
    @XmlElement(name = "UndrlygSctyId")
    protected SecurityIdentification14 undrlygSctyId;

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
    public CorporateActionGeneralInformation26 setCorpActnEvtId(String value) {
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
    public CorporateActionGeneralInformation26 setOffclCorpActnEvtId(String value) {
        this.offclCorpActnEvtId = value;
        return this;
    }

    /**
     * Gets the value of the evtTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEventType3Choice }
     *     
     */
    public CorporateActionEventType3Choice getEvtTp() {
        return evtTp;
    }

    /**
     * Sets the value of the evtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEventType3Choice }
     *     
     */
    public CorporateActionGeneralInformation26 setEvtTp(CorporateActionEventType3Choice value) {
        this.evtTp = value;
        return this;
    }

    /**
     * Gets the value of the undrlygSctyId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification14 }
     *     
     */
    public SecurityIdentification14 getUndrlygSctyId() {
        return undrlygSctyId;
    }

    /**
     * Sets the value of the undrlygSctyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification14 }
     *     
     */
    public CorporateActionGeneralInformation26 setUndrlygSctyId(SecurityIdentification14 value) {
        this.undrlygSctyId = value;
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
