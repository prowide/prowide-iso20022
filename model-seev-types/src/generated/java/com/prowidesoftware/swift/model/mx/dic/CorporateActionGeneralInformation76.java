
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
@XmlType(name = "CorporateActionGeneralInformation76", propOrder = {
    "corpActnEvtId",
    "offclCorpActnEvtId",
    "clssActnNb",
    "evtPrcgTp",
    "evtTp",
    "mndtryVlntryEvtTp",
    "undrlygScty"
})
public class CorporateActionGeneralInformation76 {

    @XmlElement(name = "CorpActnEvtId", required = true)
    protected String corpActnEvtId;
    @XmlElement(name = "OffclCorpActnEvtId")
    protected String offclCorpActnEvtId;
    @XmlElement(name = "ClssActnNb")
    protected String clssActnNb;
    @XmlElement(name = "EvtPrcgTp")
    protected CorporateActionEventProcessingType1Choice evtPrcgTp;
    @XmlElement(name = "EvtTp", required = true)
    protected CorporateActionEventType21Choice evtTp;
    @XmlElement(name = "MndtryVlntryEvtTp", required = true)
    protected CorporateActionMandatoryVoluntary2Choice mndtryVlntryEvtTp;
    @XmlElement(name = "UndrlygScty", required = true)
    protected FinancialInstrumentAttributes55 undrlygScty;

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
    public CorporateActionGeneralInformation76 setCorpActnEvtId(String value) {
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
    public CorporateActionGeneralInformation76 setOffclCorpActnEvtId(String value) {
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
    public CorporateActionGeneralInformation76 setClssActnNb(String value) {
        this.clssActnNb = value;
        return this;
    }

    /**
     * Gets the value of the evtPrcgTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEventProcessingType1Choice }
     *     
     */
    public CorporateActionEventProcessingType1Choice getEvtPrcgTp() {
        return evtPrcgTp;
    }

    /**
     * Sets the value of the evtPrcgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEventProcessingType1Choice }
     *     
     */
    public CorporateActionGeneralInformation76 setEvtPrcgTp(CorporateActionEventProcessingType1Choice value) {
        this.evtPrcgTp = value;
        return this;
    }

    /**
     * Gets the value of the evtTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEventType21Choice }
     *     
     */
    public CorporateActionEventType21Choice getEvtTp() {
        return evtTp;
    }

    /**
     * Sets the value of the evtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEventType21Choice }
     *     
     */
    public CorporateActionGeneralInformation76 setEvtTp(CorporateActionEventType21Choice value) {
        this.evtTp = value;
        return this;
    }

    /**
     * Gets the value of the mndtryVlntryEvtTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionMandatoryVoluntary2Choice }
     *     
     */
    public CorporateActionMandatoryVoluntary2Choice getMndtryVlntryEvtTp() {
        return mndtryVlntryEvtTp;
    }

    /**
     * Sets the value of the mndtryVlntryEvtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionMandatoryVoluntary2Choice }
     *     
     */
    public CorporateActionGeneralInformation76 setMndtryVlntryEvtTp(CorporateActionMandatoryVoluntary2Choice value) {
        this.mndtryVlntryEvtTp = value;
        return this;
    }

    /**
     * Gets the value of the undrlygScty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributes55 }
     *     
     */
    public FinancialInstrumentAttributes55 getUndrlygScty() {
        return undrlygScty;
    }

    /**
     * Sets the value of the undrlygScty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributes55 }
     *     
     */
    public CorporateActionGeneralInformation76 setUndrlygScty(FinancialInstrumentAttributes55 value) {
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
