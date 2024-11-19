
package com.prowidesoftware.swift.model.mx.dic;

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
 * This message is sent by a CSD to the issuer (or its agent) to provide the issuer (or its agent) with the CSD's client details for the distribution of the proceeds of a corporate action event:
 * - Gross or net payments.
 * - Delivery details for securities that have to be delivered outside of the CSD.
 * - Delivery details for cash amounts that have to be delivered outside of the CSD.
 * Usage
 * This message is used to request the issuer (or its agent) to put a standing instruction in place for proceeds.
 * The amendment of a standing instruction is done through a cancel-and-replace mechanism. First a standing instruction cancellation request is sent followed by a new standing instruction request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentCAStandingInstructionRequestV01", propOrder = {
    "id",
    "stgInstrGnlInf",
    "stgInstrDtls",
    "ctctDtls"
})
public class AgentCAStandingInstructionRequestV01 {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification8 id;
    @XmlElement(name = "StgInstrGnlInf", required = true)
    protected CorporateActionStandingInstructionGeneralInformation1 stgInstrGnlInf;
    @XmlElement(name = "StgInstrDtls", required = true)
    protected CorporateActionStandingInstruction1 stgInstrDtls;
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
    public AgentCAStandingInstructionRequestV01 setId(DocumentIdentification8 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the stgInstrGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionStandingInstructionGeneralInformation1 }
     *     
     */
    public CorporateActionStandingInstructionGeneralInformation1 getStgInstrGnlInf() {
        return stgInstrGnlInf;
    }

    /**
     * Sets the value of the stgInstrGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionStandingInstructionGeneralInformation1 }
     *     
     */
    public AgentCAStandingInstructionRequestV01 setStgInstrGnlInf(CorporateActionStandingInstructionGeneralInformation1 value) {
        this.stgInstrGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the stgInstrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionStandingInstruction1 }
     *     
     */
    public CorporateActionStandingInstruction1 getStgInstrDtls() {
        return stgInstrDtls;
    }

    /**
     * Sets the value of the stgInstrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionStandingInstruction1 }
     *     
     */
    public AgentCAStandingInstructionRequestV01 setStgInstrDtls(CorporateActionStandingInstruction1 value) {
        this.stgInstrDtls = value;
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
    public AgentCAStandingInstructionRequestV01 setCtctDtls(ContactPerson1 value) {
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
