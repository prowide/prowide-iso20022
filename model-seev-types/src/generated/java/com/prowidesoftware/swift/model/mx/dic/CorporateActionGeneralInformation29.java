
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
 * General information about the corporate action event.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionGeneralInformation29", propOrder = {
    "corpActnEvtId",
    "offclCorpActnEvtId",
    "clssActnNb",
    "evtTp",
    "undrlygSctyId",
    "addtlBizPrcInd"
})
public class CorporateActionGeneralInformation29 {

    @XmlElement(name = "CorpActnEvtId", required = true)
    protected String corpActnEvtId;
    @XmlElement(name = "OffclCorpActnEvtId")
    protected String offclCorpActnEvtId;
    @XmlElement(name = "ClssActnNb")
    protected String clssActnNb;
    @XmlElement(name = "EvtTp", required = true)
    protected CorporateActionEventType6Choice evtTp;
    @XmlElement(name = "UndrlygSctyId", required = true)
    protected SecurityIdentification15 undrlygSctyId;
    @XmlElement(name = "AddtlBizPrcInd")
    protected AdditionalBusinessProcessFormat5Choice addtlBizPrcInd;

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
    public CorporateActionGeneralInformation29 setCorpActnEvtId(String value) {
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
    public CorporateActionGeneralInformation29 setOffclCorpActnEvtId(String value) {
        this.offclCorpActnEvtId = value;
        return this;
    }

    /**
     * Gets the value of the clssActnNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClssActnNb() {
        return clssActnNb;
    }

    /**
     * Sets the value of the clssActnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionGeneralInformation29 setClssActnNb(String value) {
        this.clssActnNb = value;
        return this;
    }

    /**
     * Gets the value of the evtTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEventType6Choice }
     *     
     */
    public CorporateActionEventType6Choice getEvtTp() {
        return evtTp;
    }

    /**
     * Sets the value of the evtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEventType6Choice }
     *     
     */
    public CorporateActionGeneralInformation29 setEvtTp(CorporateActionEventType6Choice value) {
        this.evtTp = value;
        return this;
    }

    /**
     * Gets the value of the undrlygSctyId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification15 }
     *     
     */
    public SecurityIdentification15 getUndrlygSctyId() {
        return undrlygSctyId;
    }

    /**
     * Sets the value of the undrlygSctyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification15 }
     *     
     */
    public CorporateActionGeneralInformation29 setUndrlygSctyId(SecurityIdentification15 value) {
        this.undrlygSctyId = value;
        return this;
    }

    /**
     * Gets the value of the addtlBizPrcInd property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalBusinessProcessFormat5Choice }
     *     
     */
    public AdditionalBusinessProcessFormat5Choice getAddtlBizPrcInd() {
        return addtlBizPrcInd;
    }

    /**
     * Sets the value of the addtlBizPrcInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalBusinessProcessFormat5Choice }
     *     
     */
    public CorporateActionGeneralInformation29 setAddtlBizPrcInd(AdditionalBusinessProcessFormat5Choice value) {
        this.addtlBizPrcInd = value;
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
