
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
 * This message is sent by an issuer (or its agent) to a CSD to report the status, or change in status, of an information advice.
 * Usage
 * This message must be used in response to an Agent Corporate Action Information Advice in the case of a rejection. However, it may also be used to report other statuses.
 * The information advice identification must be present to link this message to the information advice for which the status is provided.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentCAInformationStatusAdviceV01", propOrder = {
    "id",
    "agtCAInfAdvcId",
    "corpActnAddtlInf",
    "infStsDtls"
})
public class AgentCAInformationStatusAdviceV01 {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification8 id;
    @XmlElement(name = "AgtCAInfAdvcId", required = true)
    protected DocumentIdentification8 agtCAInfAdvcId;
    @XmlElement(name = "CorpActnAddtlInf")
    protected CorporateActionAdditionalInformation1 corpActnAddtlInf;
    @XmlElement(name = "InfStsDtls", required = true)
    protected CorporateActionInformationStatus1Choice infStsDtls;

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
    public AgentCAInformationStatusAdviceV01 setId(DocumentIdentification8 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the agtCAInfAdvcId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getAgtCAInfAdvcId() {
        return agtCAInfAdvcId;
    }

    /**
     * Sets the value of the agtCAInfAdvcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public AgentCAInformationStatusAdviceV01 setAgtCAInfAdvcId(DocumentIdentification8 value) {
        this.agtCAInfAdvcId = value;
        return this;
    }

    /**
     * Gets the value of the corpActnAddtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionAdditionalInformation1 }
     *     
     */
    public CorporateActionAdditionalInformation1 getCorpActnAddtlInf() {
        return corpActnAddtlInf;
    }

    /**
     * Sets the value of the corpActnAddtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionAdditionalInformation1 }
     *     
     */
    public AgentCAInformationStatusAdviceV01 setCorpActnAddtlInf(CorporateActionAdditionalInformation1 value) {
        this.corpActnAddtlInf = value;
        return this;
    }

    /**
     * Gets the value of the infStsDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionInformationStatus1Choice }
     *     
     */
    public CorporateActionInformationStatus1Choice getInfStsDtls() {
        return infStsDtls;
    }

    /**
     * Sets the value of the infStsDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionInformationStatus1Choice }
     *     
     */
    public AgentCAInformationStatusAdviceV01 setInfStsDtls(CorporateActionInformationStatus1Choice value) {
        this.infStsDtls = value;
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
