
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
 * This message is sent by an issuer (or its agent) to a CSD to order:
 * - the global or individual debit of exercised resources (cash and/or securities), per event and optionally per option and per resource for all or individual CSD client's accounts;
 * - and/or the individual credits of the outturn resources per event and optionally per option and per resource for a given CSD client's account.
 * Usage
 * This message is used to instruct:
 * - the global debit of the exercised resources from the CSD client's available or sequestered balance, in which case, the order type must be 'global debit order';
 * - the individual debits and credits:
 * - the individual debit of the exercised resources from the CSD client's available or sequestered balance and/or
 * - the individual credit of the outturn resources to the CSD client's account.
 * The order type must be 'individual order';
 * - a return order, in the case of a scaleback, i.e. the return of the exercised resources to the CSD client's account. The order type must be either 'global return order' or 'individual return order'; and
 * change of option, e.g. in the case of the closure of an option, by moving the exercised resources from one option to another option within the sequestered balances in accordance to the new option conditions. The order type must be 'option change order'.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentCAMovementInstructionV01", propOrder = {
    "id",
    "agtCAElctnAdvcId",
    "corpActnGnlInf",
    "mvmntGnlInf",
    "undrlygSctiesMvmntDtls",
    "undrlygCshMvmntDtls",
    "prcdsMvmntDtls"
})
public class AgentCAMovementInstructionV01 {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification8 id;
    @XmlElement(name = "AgtCAElctnAdvcId")
    protected DocumentIdentification8 agtCAElctnAdvcId;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionInformation1 corpActnGnlInf;
    @XmlElement(name = "MvmntGnlInf", required = true)
    protected CorporateActionMovement1 mvmntGnlInf;
    @XmlElement(name = "UndrlygSctiesMvmntDtls")
    protected List<UnderlyingSecurityMovement1> undrlygSctiesMvmntDtls;
    @XmlElement(name = "UndrlygCshMvmntDtls")
    protected List<CashMovement2> undrlygCshMvmntDtls;
    @XmlElement(name = "PrcdsMvmntDtls")
    protected ProceedsMovement1 prcdsMvmntDtls;

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
    public AgentCAMovementInstructionV01 setId(DocumentIdentification8 value) {
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
    public AgentCAMovementInstructionV01 setAgtCAElctnAdvcId(DocumentIdentification8 value) {
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
    public AgentCAMovementInstructionV01 setCorpActnGnlInf(CorporateActionInformation1 value) {
        this.corpActnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the mvmntGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionMovement1 }
     *     
     */
    public CorporateActionMovement1 getMvmntGnlInf() {
        return mvmntGnlInf;
    }

    /**
     * Sets the value of the mvmntGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionMovement1 }
     *     
     */
    public AgentCAMovementInstructionV01 setMvmntGnlInf(CorporateActionMovement1 value) {
        this.mvmntGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the undrlygSctiesMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the undrlygSctiesMvmntDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndrlygSctiesMvmntDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnderlyingSecurityMovement1 }
     * 
     * 
     * @return
     *     The value of the undrlygSctiesMvmntDtls property.
     */
    public List<UnderlyingSecurityMovement1> getUndrlygSctiesMvmntDtls() {
        if (undrlygSctiesMvmntDtls == null) {
            undrlygSctiesMvmntDtls = new ArrayList<>();
        }
        return this.undrlygSctiesMvmntDtls;
    }

    /**
     * Gets the value of the undrlygCshMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the undrlygCshMvmntDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndrlygCshMvmntDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashMovement2 }
     * 
     * 
     * @return
     *     The value of the undrlygCshMvmntDtls property.
     */
    public List<CashMovement2> getUndrlygCshMvmntDtls() {
        if (undrlygCshMvmntDtls == null) {
            undrlygCshMvmntDtls = new ArrayList<>();
        }
        return this.undrlygCshMvmntDtls;
    }

    /**
     * Gets the value of the prcdsMvmntDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ProceedsMovement1 }
     *     
     */
    public ProceedsMovement1 getPrcdsMvmntDtls() {
        return prcdsMvmntDtls;
    }

    /**
     * Sets the value of the prcdsMvmntDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProceedsMovement1 }
     *     
     */
    public AgentCAMovementInstructionV01 setPrcdsMvmntDtls(ProceedsMovement1 value) {
        this.prcdsMvmntDtls = value;
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
     * Adds a new item to the undrlygSctiesMvmntDtls list.
     * @see #getUndrlygSctiesMvmntDtls()
     * 
     */
    public AgentCAMovementInstructionV01 addUndrlygSctiesMvmntDtls(UnderlyingSecurityMovement1 undrlygSctiesMvmntDtls) {
        getUndrlygSctiesMvmntDtls().add(undrlygSctiesMvmntDtls);
        return this;
    }

    /**
     * Adds a new item to the undrlygCshMvmntDtls list.
     * @see #getUndrlygCshMvmntDtls()
     * 
     */
    public AgentCAMovementInstructionV01 addUndrlygCshMvmntDtls(CashMovement2 undrlygCshMvmntDtls) {
        getUndrlygCshMvmntDtls().add(undrlygCshMvmntDtls);
        return this;
    }

}
