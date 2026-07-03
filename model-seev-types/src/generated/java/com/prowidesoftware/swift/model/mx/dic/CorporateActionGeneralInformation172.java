
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
@XmlType(name = "CorporateActionGeneralInformation172", propOrder = {
    "agtCorpActnEvtId",
    "corpActnEvtId",
    "offclCorpActnEvtId",
    "evtPrcgTp",
    "evtTp",
    "subEvtTp",
    "mndtryVlntryEvtTp",
    "undrlygScty"
})
public class CorporateActionGeneralInformation172 {

    @XmlElement(name = "AgtCorpActnEvtId", required = true)
    protected String agtCorpActnEvtId;
    @XmlElement(name = "CorpActnEvtId")
    protected String corpActnEvtId;
    @XmlElement(name = "OffclCorpActnEvtId")
    protected String offclCorpActnEvtId;
    @XmlElement(name = "EvtPrcgTp")
    @XmlSchemaType(name = "string")
    protected CorporateActionEventProcessingType2Code evtPrcgTp;
    @XmlElement(name = "EvtTp", required = true)
    protected CorporateActionEventType106Choice evtTp;
    @XmlElement(name = "SubEvtTp")
    @XmlSchemaType(name = "string")
    protected DTCCSubEventType9Code subEvtTp;
    @XmlElement(name = "MndtryVlntryEvtTp", required = true)
    protected CorporateActionMandatoryVoluntary3Choice mndtryVlntryEvtTp;
    @XmlElement(name = "UndrlygScty", required = true)
    protected List<FinancialInstrumentAttributes126> undrlygScty;

    /**
     * Gets the value of the agtCorpActnEvtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgtCorpActnEvtId() {
        return agtCorpActnEvtId;
    }

    /**
     * Sets the value of the agtCorpActnEvtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionGeneralInformation172 setAgtCorpActnEvtId(String value) {
        this.agtCorpActnEvtId = value;
        return this;
    }

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
    public CorporateActionGeneralInformation172 setCorpActnEvtId(String value) {
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
    public CorporateActionGeneralInformation172 setOffclCorpActnEvtId(String value) {
        this.offclCorpActnEvtId = value;
        return this;
    }

    /**
     * Gets the value of the evtPrcgTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEventProcessingType2Code }
     *     
     */
    public CorporateActionEventProcessingType2Code getEvtPrcgTp() {
        return evtPrcgTp;
    }

    /**
     * Sets the value of the evtPrcgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEventProcessingType2Code }
     *     
     */
    public CorporateActionGeneralInformation172 setEvtPrcgTp(CorporateActionEventProcessingType2Code value) {
        this.evtPrcgTp = value;
        return this;
    }

    /**
     * Gets the value of the evtTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEventType106Choice }
     *     
     */
    public CorporateActionEventType106Choice getEvtTp() {
        return evtTp;
    }

    /**
     * Sets the value of the evtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEventType106Choice }
     *     
     */
    public CorporateActionGeneralInformation172 setEvtTp(CorporateActionEventType106Choice value) {
        this.evtTp = value;
        return this;
    }

    /**
     * Gets the value of the subEvtTp property.
     * 
     * @return
     *     possible object is
     *     {@link DTCCSubEventType9Code }
     *     
     */
    public DTCCSubEventType9Code getSubEvtTp() {
        return subEvtTp;
    }

    /**
     * Sets the value of the subEvtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCCSubEventType9Code }
     *     
     */
    public CorporateActionGeneralInformation172 setSubEvtTp(DTCCSubEventType9Code value) {
        this.subEvtTp = value;
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
    public CorporateActionGeneralInformation172 setMndtryVlntryEvtTp(CorporateActionMandatoryVoluntary3Choice value) {
        this.mndtryVlntryEvtTp = value;
        return this;
    }

    /**
     * Gets the value of the undrlygScty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the undrlygScty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndrlygScty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialInstrumentAttributes126 }
     * 
     * 
     */
    public List<FinancialInstrumentAttributes126> getUndrlygScty() {
        if (undrlygScty == null) {
            undrlygScty = new ArrayList<FinancialInstrumentAttributes126>();
        }
        return this.undrlygScty;
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
     * Adds a new item to the undrlygScty list.
     * @see #getUndrlygScty()
     * 
     */
    public CorporateActionGeneralInformation172 addUndrlygScty(FinancialInstrumentAttributes126 undrlygScty) {
        getUndrlygScty().add(undrlygScty);
        return this;
    }

}
