
package com.prowidesoftware.swift.model.mx.dic;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
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
 * Provides the history of status and reasons for a pending, posted or cancelled transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusTrail4", propOrder = {
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
public class StatusTrail4 {

    @XmlElement(name = "StsDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime stsDt;
    @XmlElement(name = "SndgOrgId")
    protected OrganisationIdentification7 sndgOrgId;
    @XmlElement(name = "UsrId")
    protected String usrId;
    @XmlElement(name = "PrcgSts")
    protected ProcessingStatus19Choice prcgSts;
    @XmlElement(name = "IfrrdMtchgSts")
    protected MatchingStatus7Choice ifrrdMtchgSts;
    @XmlElement(name = "MtchgSts")
    protected MatchingStatus7Choice mtchgSts;
    @XmlElement(name = "SttlmSts")
    protected SettlementStatus7Choice sttlmSts;
    @XmlElement(name = "ModPrcgSts")
    protected ModificationProcessingStatus4Choice modPrcgSts;
    @XmlElement(name = "CxlSts")
    protected ProcessingStatus20Choice cxlSts;
    @XmlElement(name = "Sttld")
    protected ProprietaryReason1 sttld;
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
    public OffsetDateTime getStsDt() {
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
    public StatusTrail4 setStsDt(OffsetDateTime value) {
        this.stsDt = value;
        return this;
    }

    /**
     * Gets the value of the sndgOrgId property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification7 }
     *     
     */
    public OrganisationIdentification7 getSndgOrgId() {
        return sndgOrgId;
    }

    /**
     * Sets the value of the sndgOrgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification7 }
     *     
     */
    public StatusTrail4 setSndgOrgId(OrganisationIdentification7 value) {
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
    public StatusTrail4 setUsrId(String value) {
        this.usrId = value;
        return this;
    }

    /**
     * Gets the value of the prcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingStatus19Choice }
     *     
     */
    public ProcessingStatus19Choice getPrcgSts() {
        return prcgSts;
    }

    /**
     * Sets the value of the prcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingStatus19Choice }
     *     
     */
    public StatusTrail4 setPrcgSts(ProcessingStatus19Choice value) {
        this.prcgSts = value;
        return this;
    }

    /**
     * Gets the value of the ifrrdMtchgSts property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingStatus7Choice }
     *     
     */
    public MatchingStatus7Choice getIfrrdMtchgSts() {
        return ifrrdMtchgSts;
    }

    /**
     * Sets the value of the ifrrdMtchgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingStatus7Choice }
     *     
     */
    public StatusTrail4 setIfrrdMtchgSts(MatchingStatus7Choice value) {
        this.ifrrdMtchgSts = value;
        return this;
    }

    /**
     * Gets the value of the mtchgSts property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingStatus7Choice }
     *     
     */
    public MatchingStatus7Choice getMtchgSts() {
        return mtchgSts;
    }

    /**
     * Sets the value of the mtchgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingStatus7Choice }
     *     
     */
    public StatusTrail4 setMtchgSts(MatchingStatus7Choice value) {
        this.mtchgSts = value;
        return this;
    }

    /**
     * Gets the value of the sttlmSts property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementStatus7Choice }
     *     
     */
    public SettlementStatus7Choice getSttlmSts() {
        return sttlmSts;
    }

    /**
     * Sets the value of the sttlmSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementStatus7Choice }
     *     
     */
    public StatusTrail4 setSttlmSts(SettlementStatus7Choice value) {
        this.sttlmSts = value;
        return this;
    }

    /**
     * Gets the value of the modPrcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link ModificationProcessingStatus4Choice }
     *     
     */
    public ModificationProcessingStatus4Choice getModPrcgSts() {
        return modPrcgSts;
    }

    /**
     * Sets the value of the modPrcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationProcessingStatus4Choice }
     *     
     */
    public StatusTrail4 setModPrcgSts(ModificationProcessingStatus4Choice value) {
        this.modPrcgSts = value;
        return this;
    }

    /**
     * Gets the value of the cxlSts property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingStatus20Choice }
     *     
     */
    public ProcessingStatus20Choice getCxlSts() {
        return cxlSts;
    }

    /**
     * Sets the value of the cxlSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingStatus20Choice }
     *     
     */
    public StatusTrail4 setCxlSts(ProcessingStatus20Choice value) {
        this.cxlSts = value;
        return this;
    }

    /**
     * Gets the value of the sttld property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ProprietaryReason1 getSttld() {
        return sttld;
    }

    /**
     * Sets the value of the sttld property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public StatusTrail4 setSttld(ProprietaryReason1 value) {
        this.sttld = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
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
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
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
    public StatusTrail4 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
