
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides information about the corporate action event.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionInformation2", propOrder = {
    "agtId",
    "issrCorpActnId",
    "corpActnPrcgId",
    "evtTp",
    "evtPrcgTp",
    "mndtryVlntryEvtTp",
    "undrlygScty",
    "othrUndrlygScty"
})
public class CorporateActionInformation2 {

    @XmlElement(name = "AgtId", required = true)
    protected PartyIdentification2Choice agtId;
    @XmlElement(name = "IssrCorpActnId", required = true)
    protected String issrCorpActnId;
    @XmlElement(name = "CorpActnPrcgId")
    protected String corpActnPrcgId;
    @XmlElement(name = "EvtTp", required = true)
    protected CorporateActionEventType2FormatChoice evtTp;
    @XmlElement(name = "EvtPrcgTp")
    protected CorporateActionEventProcessingType1FormatChoice evtPrcgTp;
    @XmlElement(name = "MndtryVlntryEvtTp", required = true)
    protected CorporateActionMandatoryVoluntary1FormatChoice mndtryVlntryEvtTp;
    @XmlElement(name = "UndrlygScty", required = true)
    protected FinancialInstrumentDescription3 undrlygScty;
    @XmlElement(name = "OthrUndrlygScty")
    protected List<FinancialInstrumentDescription3> othrUndrlygScty;

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
    public CorporateActionInformation2 setAgtId(PartyIdentification2Choice value) {
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
    public CorporateActionInformation2 setIssrCorpActnId(String value) {
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
    public CorporateActionInformation2 setCorpActnPrcgId(String value) {
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
    public CorporateActionInformation2 setEvtTp(CorporateActionEventType2FormatChoice value) {
        this.evtTp = value;
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
    public CorporateActionInformation2 setEvtPrcgTp(CorporateActionEventProcessingType1FormatChoice value) {
        this.evtPrcgTp = value;
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
    public CorporateActionInformation2 setMndtryVlntryEvtTp(CorporateActionMandatoryVoluntary1FormatChoice value) {
        this.mndtryVlntryEvtTp = value;
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
    public CorporateActionInformation2 setUndrlygScty(FinancialInstrumentDescription3 value) {
        this.undrlygScty = value;
        return this;
    }

    /**
     * Gets the value of the othrUndrlygScty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the othrUndrlygScty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrUndrlygScty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialInstrumentDescription3 }
     * 
     * 
     */
    public List<FinancialInstrumentDescription3> getOthrUndrlygScty() {
        if (othrUndrlygScty == null) {
            othrUndrlygScty = new ArrayList<FinancialInstrumentDescription3>();
        }
        return this.othrUndrlygScty;
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

    /**
     * Adds a new item to the othrUndrlygScty list.
     * @see #getOthrUndrlygScty()
     * 
     */
    public CorporateActionInformation2 addOthrUndrlygScty(FinancialInstrumentDescription3 othrUndrlygScty) {
        getOthrUndrlygScty().add(othrUndrlygScty);
        return this;
    }

}
