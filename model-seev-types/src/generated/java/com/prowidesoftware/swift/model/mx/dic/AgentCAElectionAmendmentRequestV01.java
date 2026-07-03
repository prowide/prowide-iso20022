
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
 * Scope
 * This message is sent by a CSD to the issuer (or its agent) to request the authorisation of an amendment of a previously sent Agent Corporate Action Election Advice message.
 * Usage
 * This message is used to request the amendment of a previously sent Agent Corporate Action Election Advice message.
 * Once the amendment request has been accepted by the issuer (or its agent), the CSD will process any resource movement and send an Agent Corporate Action Election Advice message with the function, option change, to confirm that the amendment has been booked at the CSD.
 * This message is used when the terms and conditions of the corporate action event allow amendments.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentCAElectionAmendmentRequestV01", propOrder = {
    "id",
    "agtCAElctnAdvcId",
    "corpActnGnlInf",
    "acctDtls",
    "orgnlElctnDtls",
    "amddElctnDtls",
    "ctctDtls"
})
public class AgentCAElectionAmendmentRequestV01 {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification8 id;
    @XmlElement(name = "AgtCAElctnAdvcId", required = true)
    protected DocumentIdentification8 agtCAElctnAdvcId;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionInformation1 corpActnGnlInf;
    @XmlElement(name = "AcctDtls", required = true)
    protected SecuritiesAccount7 acctDtls;
    @XmlElement(name = "OrgnlElctnDtls", required = true)
    protected CorporateActionElection1 orgnlElctnDtls;
    @XmlElement(name = "AmddElctnDtls", required = true)
    protected CorporateActionElection2 amddElctnDtls;
    @XmlElement(name = "CtctDtls")
    protected ContactPerson1 ctctDtls;

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
    public AgentCAElectionAmendmentRequestV01 setId(DocumentIdentification8 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the agtCAElctnAdvcId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getAgtCAElctnAdvcId() {
        return agtCAElctnAdvcId;
    }

    /**
     * Sets the value of the agtCAElctnAdvcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public AgentCAElectionAmendmentRequestV01 setAgtCAElctnAdvcId(DocumentIdentification8 value) {
        this.agtCAElctnAdvcId = value;
        return this;
    }

    /**
     * Gets the value of the corpActnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionInformation1 }
     *     
     */
    public CorporateActionInformation1 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Sets the value of the corpActnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionInformation1 }
     *     
     */
    public AgentCAElectionAmendmentRequestV01 setCorpActnGnlInf(CorporateActionInformation1 value) {
        this.corpActnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the acctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount7 }
     *     
     */
    public SecuritiesAccount7 getAcctDtls() {
        return acctDtls;
    }

    /**
     * Sets the value of the acctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount7 }
     *     
     */
    public AgentCAElectionAmendmentRequestV01 setAcctDtls(SecuritiesAccount7 value) {
        this.acctDtls = value;
        return this;
    }

    /**
     * Gets the value of the orgnlElctnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionElection1 }
     *     
     */
    public CorporateActionElection1 getOrgnlElctnDtls() {
        return orgnlElctnDtls;
    }

    /**
     * Sets the value of the orgnlElctnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionElection1 }
     *     
     */
    public AgentCAElectionAmendmentRequestV01 setOrgnlElctnDtls(CorporateActionElection1 value) {
        this.orgnlElctnDtls = value;
        return this;
    }

    /**
     * Gets the value of the amddElctnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionElection2 }
     *     
     */
    public CorporateActionElection2 getAmddElctnDtls() {
        return amddElctnDtls;
    }

    /**
     * Sets the value of the amddElctnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionElection2 }
     *     
     */
    public AgentCAElectionAmendmentRequestV01 setAmddElctnDtls(CorporateActionElection2 value) {
        this.amddElctnDtls = value;
        return this;
    }

    /**
     * Gets the value of the ctctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ContactPerson1 }
     *     
     */
    public ContactPerson1 getCtctDtls() {
        return ctctDtls;
    }

    /**
     * Sets the value of the ctctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPerson1 }
     *     
     */
    public AgentCAElectionAmendmentRequestV01 setCtctDtls(ContactPerson1 value) {
        this.ctctDtls = value;
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
