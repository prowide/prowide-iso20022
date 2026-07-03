
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
@XmlType(name = "AgentCANotificationAdviceV01", propOrder = {
    "id",
    "ntfctnTpAndLkg",
    "ntfctnGnlInf",
    "corpActnGnlInf",
    "corpActnDtls",
    "corpActnOptnDtls",
    "ctctDtls",
    "addtlInf"
})
public class AgentCANotificationAdviceV01 {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification8 id;
    @XmlElement(name = "NtfctnTpAndLkg", required = true)
    protected LinkedCorporateAction1 ntfctnTpAndLkg;
    @XmlElement(name = "NtfctnGnlInf", required = true)
    protected CorporateActionNotification1 ntfctnGnlInf;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionInformation2 corpActnGnlInf;
    @XmlElement(name = "CorpActnDtls", required = true)
    protected CorporateAction2 corpActnDtls;
    @XmlElement(name = "CorpActnOptnDtls")
    protected List<CorporateActionOption1> corpActnOptnDtls;
    @XmlElement(name = "CtctDtls")
    protected List<ContactPerson1> ctctDtls;
    @XmlElement(name = "AddtlInf")
    protected CorporateActionNarrative2 addtlInf;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public AgentCANotificationAdviceV01 setId(DocumentIdentification8 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the ntfctnTpAndLkg property.
     * 
     * @return
     *     possible object is
     *     {@link LinkedCorporateAction1 }
     *     
     */
    public LinkedCorporateAction1 getNtfctnTpAndLkg() {
        return ntfctnTpAndLkg;
    }

    /**
     * Sets the value of the ntfctnTpAndLkg property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkedCorporateAction1 }
     *     
     */
    public AgentCANotificationAdviceV01 setNtfctnTpAndLkg(LinkedCorporateAction1 value) {
        this.ntfctnTpAndLkg = value;
        return this;
    }

    /**
     * Gets the value of the ntfctnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNotification1 }
     *     
     */
    public CorporateActionNotification1 getNtfctnGnlInf() {
        return ntfctnGnlInf;
    }

    /**
     * Sets the value of the ntfctnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNotification1 }
     *     
     */
    public AgentCANotificationAdviceV01 setNtfctnGnlInf(CorporateActionNotification1 value) {
        this.ntfctnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the corpActnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionInformation2 }
     *     
     */
    public CorporateActionInformation2 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Sets the value of the corpActnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionInformation2 }
     *     
     */
    public AgentCANotificationAdviceV01 setCorpActnGnlInf(CorporateActionInformation2 value) {
        this.corpActnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the corpActnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateAction2 }
     *     
     */
    public CorporateAction2 getCorpActnDtls() {
        return corpActnDtls;
    }

    /**
     * Sets the value of the corpActnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateAction2 }
     *     
     */
    public AgentCANotificationAdviceV01 setCorpActnDtls(CorporateAction2 value) {
        this.corpActnDtls = value;
        return this;
    }

    /**
     * Gets the value of the corpActnOptnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the corpActnOptnDtls property.
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
     * {@link CorporateActionOption1 }
     * 
     * 
     */
    public List<CorporateActionOption1> getCorpActnOptnDtls() {
        if (corpActnOptnDtls == null) {
            corpActnOptnDtls = new ArrayList<CorporateActionOption1>();
        }
        return this.corpActnOptnDtls;
    }

    /**
     * Gets the value of the ctctDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ctctDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtctDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactPerson1 }
     * 
     * 
     */
    public List<ContactPerson1> getCtctDtls() {
        if (ctctDtls == null) {
            ctctDtls = new ArrayList<ContactPerson1>();
        }
        return this.ctctDtls;
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
    public AgentCANotificationAdviceV01 setAddtlInf(CorporateActionNarrative2 value) {
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
     * Adds a new item to the corpActnOptnDtls list.
     * @see #getCorpActnOptnDtls()
     * 
     */
    public AgentCANotificationAdviceV01 addCorpActnOptnDtls(CorporateActionOption1 corpActnOptnDtls) {
        getCorpActnOptnDtls().add(corpActnOptnDtls);
        return this;
    }

    /**
     * Adds a new item to the ctctDtls list.
     * @see #getCtctDtls()
     * 
     */
    public AgentCANotificationAdviceV01 addCtctDtls(ContactPerson1 ctctDtls) {
        getCtctDtls().add(ctctDtls);
        return this;
    }

}
