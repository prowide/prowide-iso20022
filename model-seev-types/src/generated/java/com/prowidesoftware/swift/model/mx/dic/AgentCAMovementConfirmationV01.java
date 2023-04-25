
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
 * This message is sent by a CSD to an issuer (or its agent) to confirm the settlement of resource movements.
 * Usage
 * This message is used to confirm the settlement of the movements resulting from an:
 * - Agent Corporate Action Movement Instruction message. It confirms the settlement of the exercised resources and/or proceeds movements in which case the building block Agent Corporate Action Movement Instruction Identification must be present. An Agent Corporate Action Movement Instruction message may be responded to by more than one Agent Corporate Action Movement Confirmation messages.
 * - Agent Corporate Action Global Distribution Status Advice authorising the global distribution. It confirms the settlement of the exercised resources and/or proceeds movements. The building block Agent Corporate Action Global Distribution Status Advice Identification must be present. An Agent Corporate Action Global Distribution Status Advice message may be responded to by more than one Agent Corporate Action Movement Confirmation messages.
 * - Agent Corporate Action Election Status Advice that rejects an election advice. It confirms the return of the exercised resources. The building block Agent Corporate Action Election Status Advice Identification must be present. An Agent Corporate Action Election Status Advice message may be responded to by more than one Agent Corporate Action Movement Confirmation messages.
 * - Agent Corporate Action Election Status Advice where an election cancellation request has been accepted. It confirms the return of the exercised resources. The building block Agent Corporate Action Election Status Advice Identification must be present. An Agent Corporate Action Election Status Advice message may be responded to by more than one Agent Corporate Action Movement Confirmation messages.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentCAMovementConfirmationV01", propOrder = {
    "id",
    "agtCAMvmntInstrId",
    "agtCAElctnStsAdvcId",
    "agtCAGblDstrbtnStsAdvcId",
    "corpActnGnlInf",
    "sctiesMvmntDtls",
    "cshMvmntDtls"
})
public class AgentCAMovementConfirmationV01 {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification8 id;
    @XmlElement(name = "AgtCAMvmntInstrId")
    protected DocumentIdentification8 agtCAMvmntInstrId;
    @XmlElement(name = "AgtCAElctnStsAdvcId")
    protected DocumentIdentification8 agtCAElctnStsAdvcId;
    @XmlElement(name = "AgtCAGblDstrbtnStsAdvcId")
    protected DocumentIdentification8 agtCAGblDstrbtnStsAdvcId;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionInformation1 corpActnGnlInf;
    @XmlElement(name = "SctiesMvmntDtls")
    protected List<CorporateActionSecuritiesMovement1> sctiesMvmntDtls;
    @XmlElement(name = "CshMvmntDtls")
    protected List<CashMovement3> cshMvmntDtls;

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
    public AgentCAMovementConfirmationV01 setId(DocumentIdentification8 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the agtCAMvmntInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getAgtCAMvmntInstrId() {
        return agtCAMvmntInstrId;
    }

    /**
     * Sets the value of the agtCAMvmntInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public AgentCAMovementConfirmationV01 setAgtCAMvmntInstrId(DocumentIdentification8 value) {
        this.agtCAMvmntInstrId = value;
        return this;
    }

    /**
     * Gets the value of the agtCAElctnStsAdvcId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getAgtCAElctnStsAdvcId() {
        return agtCAElctnStsAdvcId;
    }

    /**
     * Sets the value of the agtCAElctnStsAdvcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public AgentCAMovementConfirmationV01 setAgtCAElctnStsAdvcId(DocumentIdentification8 value) {
        this.agtCAElctnStsAdvcId = value;
        return this;
    }

    /**
     * Gets the value of the agtCAGblDstrbtnStsAdvcId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getAgtCAGblDstrbtnStsAdvcId() {
        return agtCAGblDstrbtnStsAdvcId;
    }

    /**
     * Sets the value of the agtCAGblDstrbtnStsAdvcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public AgentCAMovementConfirmationV01 setAgtCAGblDstrbtnStsAdvcId(DocumentIdentification8 value) {
        this.agtCAGblDstrbtnStsAdvcId = value;
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
    public AgentCAMovementConfirmationV01 setCorpActnGnlInf(CorporateActionInformation1 value) {
        this.corpActnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the sctiesMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sctiesMvmntDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctiesMvmntDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionSecuritiesMovement1 }
     * 
     * 
     * @return
     *     The value of the sctiesMvmntDtls property.
     */
    public List<CorporateActionSecuritiesMovement1> getSctiesMvmntDtls() {
        if (sctiesMvmntDtls == null) {
            sctiesMvmntDtls = new ArrayList<>();
        }
        return this.sctiesMvmntDtls;
    }

    /**
     * Gets the value of the cshMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cshMvmntDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshMvmntDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashMovement3 }
     * 
     * 
     * @return
     *     The value of the cshMvmntDtls property.
     */
    public List<CashMovement3> getCshMvmntDtls() {
        if (cshMvmntDtls == null) {
            cshMvmntDtls = new ArrayList<>();
        }
        return this.cshMvmntDtls;
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
     * Adds a new item to the sctiesMvmntDtls list.
     * @see #getSctiesMvmntDtls()
     * 
     */
    public AgentCAMovementConfirmationV01 addSctiesMvmntDtls(CorporateActionSecuritiesMovement1 sctiesMvmntDtls) {
        getSctiesMvmntDtls().add(sctiesMvmntDtls);
        return this;
    }

    /**
     * Adds a new item to the cshMvmntDtls list.
     * @see #getCshMvmntDtls()
     * 
     */
    public AgentCAMovementConfirmationV01 addCshMvmntDtls(CashMovement3 cshMvmntDtls) {
        getCshMvmntDtls().add(cshMvmntDtls);
        return this;
    }

}
