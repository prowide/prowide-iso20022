
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
@XmlType(name = "CorporateActionGeneralInformation194", propOrder = {
    "corpActnEvtId",
    "offclCorpActnEvtId",
    "clssActnNb",
    "evtPrcgTp",
    "evtTp",
    "mndtryVlntryEvtTp",
    "undrlygScty"
})
public class CorporateActionGeneralInformation194 {

    @XmlElement(name = "CorpActnEvtId", required = true)
    protected String corpActnEvtId;
    @XmlElement(name = "OffclCorpActnEvtId")
    protected String offclCorpActnEvtId;
    @XmlElement(name = "ClssActnNb")
    protected String clssActnNb;
    @XmlElement(name = "EvtPrcgTp")
    protected CorporateActionEventProcessingType3Choice evtPrcgTp;
    @XmlElement(name = "EvtTp", required = true)
    protected CorporateActionEventType124Choice evtTp;
    @XmlElement(name = "MndtryVlntryEvtTp", required = true)
    protected CorporateActionMandatoryVoluntary4Choice mndtryVlntryEvtTp;
    @XmlElement(name = "UndrlygScty", required = true)
    protected FinancialInstrumentAttributes136 undrlygScty;

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
    public CorporateActionGeneralInformation194 setCorpActnEvtId(String value) {
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
    public CorporateActionGeneralInformation194 setOffclCorpActnEvtId(String value) {
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
    public CorporateActionGeneralInformation194 setClssActnNb(String value) {
        this.clssActnNb = value;
        return this;
    }

    /**
     * Gets the value of the evtPrcgTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEventProcessingType3Choice }
     *     
     */
    public CorporateActionEventProcessingType3Choice getEvtPrcgTp() {
        return evtPrcgTp;
    }

    /**
     * Sets the value of the evtPrcgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEventProcessingType3Choice }
     *     
     */
    public CorporateActionGeneralInformation194 setEvtPrcgTp(CorporateActionEventProcessingType3Choice value) {
        this.evtPrcgTp = value;
        return this;
    }

    /**
     * Gets the value of the evtTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEventType124Choice }
     *     
     */
    public CorporateActionEventType124Choice getEvtTp() {
        return evtTp;
    }

    /**
     * Sets the value of the evtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEventType124Choice }
     *     
     */
    public CorporateActionGeneralInformation194 setEvtTp(CorporateActionEventType124Choice value) {
        this.evtTp = value;
        return this;
    }

    /**
     * Gets the value of the mndtryVlntryEvtTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionMandatoryVoluntary4Choice }
     *     
     */
    public CorporateActionMandatoryVoluntary4Choice getMndtryVlntryEvtTp() {
        return mndtryVlntryEvtTp;
    }

    /**
     * Sets the value of the mndtryVlntryEvtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionMandatoryVoluntary4Choice }
     *     
     */
    public CorporateActionGeneralInformation194 setMndtryVlntryEvtTp(CorporateActionMandatoryVoluntary4Choice value) {
        this.mndtryVlntryEvtTp = value;
        return this;
    }

    /**
     * Gets the value of the undrlygScty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributes136 }
     *     
     */
    public FinancialInstrumentAttributes136 getUndrlygScty() {
        return undrlygScty;
    }

    /**
     * Sets the value of the undrlygScty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributes136 }
     *     
     */
    public CorporateActionGeneralInformation194 setUndrlygScty(FinancialInstrumentAttributes136 value) {
        this.undrlygScty = value;
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
