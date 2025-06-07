
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides the history of status and reasons for a pending, posted or cancelled transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusTrail9", propOrder = {
    "stsDt",
    "sndgOrgId",
    "usrId",
    "prcgSts",
    "ifrrdMtchgSts",
    "mtchgSts",
    "sttlmSts",
    "modPrcgSts",
    "cxlSts",
    "sttld",
    "splmtryData"
})
public class StatusTrail9 {

    @XmlElement(name = "StsDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar stsDt;
    @XmlElement(name = "SndgOrgId")
    protected OrganisationIdentification32 sndgOrgId;
    @XmlElement(name = "UsrId")
    protected String usrId;
    @XmlElement(name = "PrcgSts")
    protected ProcessingStatus76Choice prcgSts;
    @XmlElement(name = "IfrrdMtchgSts")
    protected MatchingStatus30Choice ifrrdMtchgSts;
    @XmlElement(name = "MtchgSts")
    protected MatchingStatus30Choice mtchgSts;
    @XmlElement(name = "SttlmSts")
    protected SettlementStatus22Choice sttlmSts;
    @XmlElement(name = "ModPrcgSts")
    protected ModificationProcessingStatus8Choice modPrcgSts;
    @XmlElement(name = "CxlSts")
    protected ProcessingStatus61Choice cxlSts;
    @XmlElement(name = "Sttld")
    protected ProprietaryReason5 sttld;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the stsDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getStsDt() {
        return stsDt;
    }

    /**
     * Sets the value of the stsDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StatusTrail9 setStsDt(XMLGregorianCalendar value) {
        this.stsDt = value;
        return this;
    }

    /**
     * Gets the value of the sndgOrgId property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification32 }
     *     
     */
    public OrganisationIdentification32 getSndgOrgId() {
        return sndgOrgId;
    }

    /**
     * Sets the value of the sndgOrgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification32 }
     *     
     */
    public StatusTrail9 setSndgOrgId(OrganisationIdentification32 value) {
        this.sndgOrgId = value;
        return this;
    }

    /**
     * Gets the value of the usrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsrId() {
        return usrId;
    }

    /**
     * Sets the value of the usrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StatusTrail9 setUsrId(String value) {
        this.usrId = value;
        return this;
    }

    /**
     * Gets the value of the prcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingStatus76Choice }
     *     
     */
    public ProcessingStatus76Choice getPrcgSts() {
        return prcgSts;
    }

    /**
     * Sets the value of the prcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingStatus76Choice }
     *     
     */
    public StatusTrail9 setPrcgSts(ProcessingStatus76Choice value) {
        this.prcgSts = value;
        return this;
    }

    /**
     * Gets the value of the ifrrdMtchgSts property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingStatus30Choice }
     *     
     */
    public MatchingStatus30Choice getIfrrdMtchgSts() {
        return ifrrdMtchgSts;
    }

    /**
     * Sets the value of the ifrrdMtchgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingStatus30Choice }
     *     
     */
    public StatusTrail9 setIfrrdMtchgSts(MatchingStatus30Choice value) {
        this.ifrrdMtchgSts = value;
        return this;
    }

    /**
     * Gets the value of the mtchgSts property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingStatus30Choice }
     *     
     */
    public MatchingStatus30Choice getMtchgSts() {
        return mtchgSts;
    }

    /**
     * Sets the value of the mtchgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingStatus30Choice }
     *     
     */
    public StatusTrail9 setMtchgSts(MatchingStatus30Choice value) {
        this.mtchgSts = value;
        return this;
    }

    /**
     * Gets the value of the sttlmSts property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementStatus22Choice }
     *     
     */
    public SettlementStatus22Choice getSttlmSts() {
        return sttlmSts;
    }

    /**
     * Sets the value of the sttlmSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementStatus22Choice }
     *     
     */
    public StatusTrail9 setSttlmSts(SettlementStatus22Choice value) {
        this.sttlmSts = value;
        return this;
    }

    /**
     * Gets the value of the modPrcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link ModificationProcessingStatus8Choice }
     *     
     */
    public ModificationProcessingStatus8Choice getModPrcgSts() {
        return modPrcgSts;
    }

    /**
     * Sets the value of the modPrcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationProcessingStatus8Choice }
     *     
     */
    public StatusTrail9 setModPrcgSts(ModificationProcessingStatus8Choice value) {
        this.modPrcgSts = value;
        return this;
    }

    /**
     * Gets the value of the cxlSts property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingStatus61Choice }
     *     
     */
    public ProcessingStatus61Choice getCxlSts() {
        return cxlSts;
    }

    /**
     * Sets the value of the cxlSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingStatus61Choice }
     *     
     */
    public StatusTrail9 setCxlSts(ProcessingStatus61Choice value) {
        this.cxlSts = value;
        return this;
    }

    /**
     * Gets the value of the sttld property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason5 }
     *     
     */
    public ProprietaryReason5 getSttld() {
        return sttld;
    }

    /**
     * Sets the value of the sttld property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason5 }
     *     
     */
    public StatusTrail9 setSttld(ProprietaryReason5 value) {
        this.sttld = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
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
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public StatusTrail9 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
