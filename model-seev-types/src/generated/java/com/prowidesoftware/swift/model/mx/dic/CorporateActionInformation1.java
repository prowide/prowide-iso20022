
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
@XmlType(name = "CorporateActionInformation1", propOrder = {
    "agtId",
    "issrCorpActnId",
    "corpActnPrcgId",
    "evtTp",
    "mndtryVlntryEvtTp",
    "evtPrcgTp",
    "undrlygScty"
})
public class CorporateActionInformation1 {

    @XmlElement(name = "AgtId", required = true)
    protected PartyIdentification2Choice agtId;
    @XmlElement(name = "IssrCorpActnId")
    protected String issrCorpActnId;
    @XmlElement(name = "CorpActnPrcgId")
    protected String corpActnPrcgId;
    @XmlElement(name = "EvtTp", required = true)
    protected CorporateActionEventType2FormatChoice evtTp;
    @XmlElement(name = "MndtryVlntryEvtTp", required = true)
    protected CorporateActionMandatoryVoluntary1FormatChoice mndtryVlntryEvtTp;
    @XmlElement(name = "EvtPrcgTp")
    protected CorporateActionEventProcessingType1FormatChoice evtPrcgTp;
    @XmlElement(name = "UndrlygScty", required = true)
    protected FinancialInstrumentDescription3 undrlygScty;

    /**
     * Gets the value of the agtId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getAgtId() {
        return agtId;
    }

    /**
     * Sets the value of the agtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public CorporateActionInformation1 setAgtId(PartyIdentification2Choice value) {
        this.agtId = value;
        return this;
    }

    /**
     * Gets the value of the issrCorpActnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssrCorpActnId() {
        return issrCorpActnId;
    }

    /**
     * Sets the value of the issrCorpActnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionInformation1 setIssrCorpActnId(String value) {
        this.issrCorpActnId = value;
        return this;
    }

    /**
     * Gets the value of the corpActnPrcgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorpActnPrcgId() {
        return corpActnPrcgId;
    }

    /**
     * Sets the value of the corpActnPrcgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionInformation1 setCorpActnPrcgId(String value) {
        this.corpActnPrcgId = value;
        return this;
    }

    /**
     * Gets the value of the evtTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEventType2FormatChoice }
     *     
     */
    public CorporateActionEventType2FormatChoice getEvtTp() {
        return evtTp;
    }

    /**
     * Sets the value of the evtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEventType2FormatChoice }
     *     
     */
    public CorporateActionInformation1 setEvtTp(CorporateActionEventType2FormatChoice value) {
        this.evtTp = value;
        return this;
    }

    /**
     * Gets the value of the mndtryVlntryEvtTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionMandatoryVoluntary1FormatChoice }
     *     
     */
    public CorporateActionMandatoryVoluntary1FormatChoice getMndtryVlntryEvtTp() {
        return mndtryVlntryEvtTp;
    }

    /**
     * Sets the value of the mndtryVlntryEvtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionMandatoryVoluntary1FormatChoice }
     *     
     */
    public CorporateActionInformation1 setMndtryVlntryEvtTp(CorporateActionMandatoryVoluntary1FormatChoice value) {
        this.mndtryVlntryEvtTp = value;
        return this;
    }

    /**
     * Gets the value of the evtPrcgTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEventProcessingType1FormatChoice }
     *     
     */
    public CorporateActionEventProcessingType1FormatChoice getEvtPrcgTp() {
        return evtPrcgTp;
    }

    /**
     * Sets the value of the evtPrcgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEventProcessingType1FormatChoice }
     *     
     */
    public CorporateActionInformation1 setEvtPrcgTp(CorporateActionEventProcessingType1FormatChoice value) {
        this.evtPrcgTp = value;
        return this;
    }

    /**
     * Gets the value of the undrlygScty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentDescription3 }
     *     
     */
    public FinancialInstrumentDescription3 getUndrlygScty() {
        return undrlygScty;
    }

    /**
     * Sets the value of the undrlygScty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentDescription3 }
     *     
     */
    public CorporateActionInformation1 setUndrlygScty(FinancialInstrumentDescription3 value) {
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
