
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
 * This message is sent by a CSD to the issuer (or its agent) to provide information about the clients' election instruction, the registration details, the delivery details, etc. In case of an election with underlying resource movements, it also confirms that these have been completed. This message may also be sent in case of an amendment of an election, once the CSD has completed the required resource movements.
 * Usage
 * This message can be used for a new election advice or an amended election advice.
 * If this message is used for a new election advice, the function of the message must be 'new election'.
 * If this message is used for an amended election advice, the function of the message must be 'option change' and the identification of the previously sent election advice must be present.
 * This message can include the cash movements and/or securities movements in the case of an election with underlying resource movements. Additionally, this message can include delivery, certification and beneficial owner details.
 * Note: this information can be also sent separately in the Agent Corporate Action Information advice message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentCAElectionAdviceV01", propOrder = {
    "id",
    "elctnAdvcTpAndLkg",
    "corpActnGnlInf",
    "elctnDtls",
    "addtlInf",
    "ctctDtls"
})
public class AgentCAElectionAdviceV01 {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification8 id;
    @XmlElement(name = "ElctnAdvcTpAndLkg", required = true)
    protected ElectionAdviceFunction1 elctnAdvcTpAndLkg;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionInformation1 corpActnGnlInf;
    @XmlElement(name = "ElctnDtls", required = true)
    protected CorporateActionElection3 elctnDtls;
    @XmlElement(name = "AddtlInf")
    protected CorporateActionAdditionalInformation1 addtlInf;
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
    public AgentCAElectionAdviceV01 setId(DocumentIdentification8 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the elctnAdvcTpAndLkg property.
     * 
     * @return
     *     possible object is
     *     {@link ElectionAdviceFunction1 }
     *     
     */
    public ElectionAdviceFunction1 getElctnAdvcTpAndLkg() {
        return elctnAdvcTpAndLkg;
    }

    /**
     * Sets the value of the elctnAdvcTpAndLkg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectionAdviceFunction1 }
     *     
     */
    public AgentCAElectionAdviceV01 setElctnAdvcTpAndLkg(ElectionAdviceFunction1 value) {
        this.elctnAdvcTpAndLkg = value;
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
    public AgentCAElectionAdviceV01 setCorpActnGnlInf(CorporateActionInformation1 value) {
        this.corpActnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the elctnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionElection3 }
     *     
     */
    public CorporateActionElection3 getElctnDtls() {
        return elctnDtls;
    }

    /**
     * Sets the value of the elctnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionElection3 }
     *     
     */
    public AgentCAElectionAdviceV01 setElctnDtls(CorporateActionElection3 value) {
        this.elctnDtls = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionAdditionalInformation1 }
     *     
     */
    public CorporateActionAdditionalInformation1 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionAdditionalInformation1 }
     *     
     */
    public AgentCAElectionAdviceV01 setAddtlInf(CorporateActionAdditionalInformation1 value) {
        this.addtlInf = value;
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
    public AgentCAElectionAdviceV01 setCtctDtls(ContactPerson1 value) {
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
