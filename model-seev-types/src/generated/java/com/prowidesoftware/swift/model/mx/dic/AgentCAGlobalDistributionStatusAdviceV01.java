
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
 * This message is sent by an issuer (or its agent) to the CSD to authorise/prohibit the CSD to process the entitlement movements.
 * Usage
 * This message is used to authorise/prohibit the CSD to process the movements requested in the Global Distribution Authorisation Request message.
 * Once the amendment request has been accepted by the issuer (or its agent), the CSD will process any resource movement and send an Agent Corporate Action Election Advice message with the function, option change, to confirm that the amendment has been booked at the CSD.
 * The issuer (or its agent) can provide the status in 2 different ways:
 * - Provide a global status, in which case the building block Global Movement Status must be present; or
 * - Provide a status by individual movements, in which case, the building block Individual Movement Status must be present. An individual movement cannot be rejected.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentCAGlobalDistributionStatusAdviceV01", propOrder = {
    "id",
    "agtCAGblDstrbtnAuthstnReqId",
    "corpActnGnlInf",
    "gblMvmntSts",
    "indvMvmntSts"
})
public class AgentCAGlobalDistributionStatusAdviceV01 {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification8 id;
    @XmlElement(name = "AgtCAGblDstrbtnAuthstnReqId", required = true)
    protected DocumentIdentification8 agtCAGblDstrbtnAuthstnReqId;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionInformation1 corpActnGnlInf;
    @XmlElement(name = "GblMvmntSts")
    protected GlobalDistributionStatus1 gblMvmntSts;
    @XmlElement(name = "IndvMvmntSts")
    protected List<IndividualMovementStatus1> indvMvmntSts;

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
    public AgentCAGlobalDistributionStatusAdviceV01 setId(DocumentIdentification8 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the agtCAGblDstrbtnAuthstnReqId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getAgtCAGblDstrbtnAuthstnReqId() {
        return agtCAGblDstrbtnAuthstnReqId;
    }

    /**
     * Sets the value of the agtCAGblDstrbtnAuthstnReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public AgentCAGlobalDistributionStatusAdviceV01 setAgtCAGblDstrbtnAuthstnReqId(DocumentIdentification8 value) {
        this.agtCAGblDstrbtnAuthstnReqId = value;
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
    public AgentCAGlobalDistributionStatusAdviceV01 setCorpActnGnlInf(CorporateActionInformation1 value) {
        this.corpActnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the gblMvmntSts property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalDistributionStatus1 }
     *     
     */
    public GlobalDistributionStatus1 getGblMvmntSts() {
        return gblMvmntSts;
    }

    /**
     * Sets the value of the gblMvmntSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalDistributionStatus1 }
     *     
     */
    public AgentCAGlobalDistributionStatusAdviceV01 setGblMvmntSts(GlobalDistributionStatus1 value) {
        this.gblMvmntSts = value;
        return this;
    }

    /**
     * Gets the value of the indvMvmntSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indvMvmntSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndvMvmntSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndividualMovementStatus1 }
     * 
     * 
     */
    public List<IndividualMovementStatus1> getIndvMvmntSts() {
        if (indvMvmntSts == null) {
            indvMvmntSts = new ArrayList<IndividualMovementStatus1>();
        }
        return this.indvMvmntSts;
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
     * Adds a new item to the indvMvmntSts list.
     * @see #getIndvMvmntSts()
     * 
     */
    public AgentCAGlobalDistributionStatusAdviceV01 addIndvMvmntSts(IndividualMovementStatus1 indvMvmntSts) {
        getIndvMvmntSts().add(indvMvmntSts);
        return this;
    }

}
