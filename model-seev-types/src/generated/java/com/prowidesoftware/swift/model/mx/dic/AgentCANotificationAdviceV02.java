
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Scope
 * This message is sent by an issuer (or its agent) to a CSD to:
 * - Provide a CSD with the details of a corporate action along with the possible options available to the clients of that CSD; and
 * - to update a corporate action notification. A notification advice can be initially sent as a preliminary advice and subsequently replaced by another notification advice with updated information.
 * Usage
 * This message is used:
 * - to provide a CSD with the details of a corporate action along with the possible options available to the clients of that CSD. The information can be complete or incomplete.
 * - to update a corporate action notification advice. A notification advice can be initially sent as a preliminary advice and subsequently replaced by another notification advice with updated information. As per SMPG recommendation, all the information should be provided in the update, not only updated information.
 * An Agent Corporate Action Notification Status Advice is sent in reply to the Agent Corporate Action Notification Advice.
 * Note: The amendment of a corporate action notification is done through a replacement mechanism in line with both the ISO 15022 messages used in the flow between the CSD and its clients, and the ISO 20022 proxy voting messages.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentCANotificationAdviceV02", propOrder = {
    "pgntn",
    "ntfctnGnlInf",
    "prvsNtfctnId",
    "agtInf",
    "corpActnGnlInf",
    "corpActnDtls",
    "corpActnOptnDtls",
    "addtlInf"
})
public class AgentCANotificationAdviceV02 {

    @XmlElement(name = "Pgntn")
    protected Pagination1 pgntn;
    @XmlElement(name = "NtfctnGnlInf", required = true)
    protected CorporateActionNotification12 ntfctnGnlInf;
    @XmlElement(name = "PrvsNtfctnId")
    protected DocumentIdentification31 prvsNtfctnId;
    @XmlElement(name = "AgtInf", required = true)
    protected List<CorporateActionAgent2> agtInf;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionGeneralInformation172 corpActnGnlInf;
    @XmlElement(name = "CorpActnDtls", required = true)
    protected CorporateAction83 corpActnDtls;
    @XmlElement(name = "CorpActnOptnDtls")
    protected List<CorporateActionOption235> corpActnOptnDtls;
    @XmlElement(name = "AddtlInf")
    protected CorporateActionNarrative2 addtlInf;

    /**
     * Gets the value of the pgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination1 }
     *     
     */
    public Pagination1 getPgntn() {
        return pgntn;
    }

    /**
     * Sets the value of the pgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination1 }
     *     
     */
    public AgentCANotificationAdviceV02 setPgntn(Pagination1 value) {
        this.pgntn = value;
        return this;
    }

    /**
     * Gets the value of the ntfctnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNotification12 }
     *     
     */
    public CorporateActionNotification12 getNtfctnGnlInf() {
        return ntfctnGnlInf;
    }

    /**
     * Sets the value of the ntfctnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNotification12 }
     *     
     */
    public AgentCANotificationAdviceV02 setNtfctnGnlInf(CorporateActionNotification12 value) {
        this.ntfctnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the prvsNtfctnId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification31 }
     *     
     */
    public DocumentIdentification31 getPrvsNtfctnId() {
        return prvsNtfctnId;
    }

    /**
     * Sets the value of the prvsNtfctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification31 }
     *     
     */
    public AgentCANotificationAdviceV02 setPrvsNtfctnId(DocumentIdentification31 value) {
        this.prvsNtfctnId = value;
        return this;
    }

    /**
     * Gets the value of the agtInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the agtInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgtInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionAgent2 }
     * 
     * 
     * @return
     *     The value of the agtInf property.
     */
    public List<CorporateActionAgent2> getAgtInf() {
        if (agtInf == null) {
            agtInf = new ArrayList<>();
        }
        return this.agtInf;
    }

    /**
     * Gets the value of the corpActnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionGeneralInformation172 }
     *     
     */
    public CorporateActionGeneralInformation172 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Sets the value of the corpActnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionGeneralInformation172 }
     *     
     */
    public AgentCANotificationAdviceV02 setCorpActnGnlInf(CorporateActionGeneralInformation172 value) {
        this.corpActnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the corpActnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateAction83 }
     *     
     */
    public CorporateAction83 getCorpActnDtls() {
        return corpActnDtls;
    }

    /**
     * Sets the value of the corpActnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateAction83 }
     *     
     */
    public AgentCANotificationAdviceV02 setCorpActnDtls(CorporateAction83 value) {
        this.corpActnDtls = value;
        return this;
    }

    /**
     * Gets the value of the corpActnOptnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the corpActnOptnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorpActnOptnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionOption235 }
     * 
     * 
     * @return
     *     The value of the corpActnOptnDtls property.
     */
    public List<CorporateActionOption235> getCorpActnOptnDtls() {
        if (corpActnOptnDtls == null) {
            corpActnOptnDtls = new ArrayList<>();
        }
        return this.corpActnOptnDtls;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNarrative2 }
     *     
     */
    public CorporateActionNarrative2 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNarrative2 }
     *     
     */
    public AgentCANotificationAdviceV02 setAddtlInf(CorporateActionNarrative2 value) {
        this.addtlInf = value;
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

    /**
     * Adds a new item to the agtInf list.
     * @see #getAgtInf()
     * 
     */
    public AgentCANotificationAdviceV02 addAgtInf(CorporateActionAgent2 agtInf) {
        getAgtInf().add(agtInf);
        return this;
    }

    /**
     * Adds a new item to the corpActnOptnDtls list.
     * @see #getCorpActnOptnDtls()
     * 
     */
    public AgentCANotificationAdviceV02 addCorpActnOptnDtls(CorporateActionOption235 corpActnOptnDtls) {
        getCorpActnOptnDtls().add(corpActnOptnDtls);
        return this;
    }

}
