
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
 * This message is sent by a CSD to an issuer (or its agent) to report the status, or a change in status, of a corporate action deactivation instruction or the status of a deactivation cancellation request.
 * Usage
 * This message is used to provide a status on the deactivation instruction, especially to confirm the deactivation of a Corporate Action event or option.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentCADeactivationStatusAdviceV01", propOrder = {
    "id",
    "agtCADeactvtnInstrId",
    "agtCADeactvtnCxlReqId",
    "corpActnGnlInf",
    "deactvtnInstrSts",
    "deactvtnCxlReqSts"
})
public class AgentCADeactivationStatusAdviceV01 {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification8 id;
    @XmlElement(name = "AgtCADeactvtnInstrId")
    protected DocumentIdentification8 agtCADeactvtnInstrId;
    @XmlElement(name = "AgtCADeactvtnCxlReqId")
    protected DocumentIdentification8 agtCADeactvtnCxlReqId;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionInformation1 corpActnGnlInf;
    @XmlElement(name = "DeactvtnInstrSts")
    protected List<CorporateActionDeactivationInstructionStatus1> deactvtnInstrSts;
    @XmlElement(name = "DeactvtnCxlReqSts")
    protected CorporateActionDeactivationCancellationStatus1Choice deactvtnCxlReqSts;

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
    public AgentCADeactivationStatusAdviceV01 setId(DocumentIdentification8 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the agtCADeactvtnInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getAgtCADeactvtnInstrId() {
        return agtCADeactvtnInstrId;
    }

    /**
     * Sets the value of the agtCADeactvtnInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public AgentCADeactivationStatusAdviceV01 setAgtCADeactvtnInstrId(DocumentIdentification8 value) {
        this.agtCADeactvtnInstrId = value;
        return this;
    }

    /**
     * Gets the value of the agtCADeactvtnCxlReqId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getAgtCADeactvtnCxlReqId() {
        return agtCADeactvtnCxlReqId;
    }

    /**
     * Sets the value of the agtCADeactvtnCxlReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public AgentCADeactivationStatusAdviceV01 setAgtCADeactvtnCxlReqId(DocumentIdentification8 value) {
        this.agtCADeactvtnCxlReqId = value;
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
    public AgentCADeactivationStatusAdviceV01 setCorpActnGnlInf(CorporateActionInformation1 value) {
        this.corpActnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the deactvtnInstrSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the deactvtnInstrSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeactvtnInstrSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionDeactivationInstructionStatus1 }
     * 
     * 
     * @return
     *     The value of the deactvtnInstrSts property.
     */
    public List<CorporateActionDeactivationInstructionStatus1> getDeactvtnInstrSts() {
        if (deactvtnInstrSts == null) {
            deactvtnInstrSts = new ArrayList<>();
        }
        return this.deactvtnInstrSts;
    }

    /**
     * Gets the value of the deactvtnCxlReqSts property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionDeactivationCancellationStatus1Choice }
     *     
     */
    public CorporateActionDeactivationCancellationStatus1Choice getDeactvtnCxlReqSts() {
        return deactvtnCxlReqSts;
    }

    /**
     * Sets the value of the deactvtnCxlReqSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionDeactivationCancellationStatus1Choice }
     *     
     */
    public AgentCADeactivationStatusAdviceV01 setDeactvtnCxlReqSts(CorporateActionDeactivationCancellationStatus1Choice value) {
        this.deactvtnCxlReqSts = value;
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
     * Adds a new item to the deactvtnInstrSts list.
     * @see #getDeactvtnInstrSts()
     * 
     */
    public AgentCADeactivationStatusAdviceV01 addDeactvtnInstrSts(CorporateActionDeactivationInstructionStatus1 deactvtnInstrSts) {
        getDeactvtnInstrSts().add(deactvtnInstrSts);
        return this;
    }

}
