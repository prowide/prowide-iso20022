
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Defines the criteria based on which information is included.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesModificationQueryCriteria1", propOrder = {
    "modReqId",
    "instrQryTp",
    "prcgSts",
    "sfkpgAcct",
    "acctOwnr",
    "msgOrgtr",
    "creDtTm"
})
public class SecuritiesModificationQueryCriteria1 {

    @XmlElement(name = "ModReqId")
    protected List<String> modReqId;
    @XmlElement(name = "InstrQryTp", required = true)
    @XmlSchemaType(name = "string")
    protected InstructionQueryType1Code instrQryTp;
    @XmlElement(name = "PrcgSts")
    protected List<ModificationProcessingStatus9Choice> prcgSts;
    @XmlElement(name = "SfkpgAcct")
    protected List<SecuritiesAccount19> sfkpgAcct;
    @XmlElement(name = "AcctOwnr")
    protected List<SystemPartyIdentification8> acctOwnr;
    @XmlElement(name = "MsgOrgtr")
    protected List<SystemPartyIdentification8> msgOrgtr;
    @XmlElement(name = "CreDtTm")
    protected DateAndDateTimeSearch5Choice creDtTm;

    /**
     * Gets the value of the modReqId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the modReqId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModReqId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the modReqId property.
     */
    public List<String> getModReqId() {
        if (modReqId == null) {
            modReqId = new ArrayList<>();
        }
        return this.modReqId;
    }

    /**
     * Gets the value of the instrQryTp property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionQueryType1Code }
     *     
     */
    public InstructionQueryType1Code getInstrQryTp() {
        return instrQryTp;
    }

    /**
     * Sets the value of the instrQryTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionQueryType1Code }
     *     
     */
    public SecuritiesModificationQueryCriteria1 setInstrQryTp(InstructionQueryType1Code value) {
        this.instrQryTp = value;
        return this;
    }

    /**
     * Gets the value of the prcgSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prcgSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrcgSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModificationProcessingStatus9Choice }
     * 
     * 
     * @return
     *     The value of the prcgSts property.
     */
    public List<ModificationProcessingStatus9Choice> getPrcgSts() {
        if (prcgSts == null) {
            prcgSts = new ArrayList<>();
        }
        return this.prcgSts;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sfkpgAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSfkpgAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesAccount19 }
     * 
     * 
     * @return
     *     The value of the sfkpgAcct property.
     */
    public List<SecuritiesAccount19> getSfkpgAcct() {
        if (sfkpgAcct == null) {
            sfkpgAcct = new ArrayList<>();
        }
        return this.sfkpgAcct;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the acctOwnr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctOwnr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemPartyIdentification8 }
     * 
     * 
     * @return
     *     The value of the acctOwnr property.
     */
    public List<SystemPartyIdentification8> getAcctOwnr() {
        if (acctOwnr == null) {
            acctOwnr = new ArrayList<>();
        }
        return this.acctOwnr;
    }

    /**
     * Gets the value of the msgOrgtr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the msgOrgtr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMsgOrgtr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemPartyIdentification8 }
     * 
     * 
     * @return
     *     The value of the msgOrgtr property.
     */
    public List<SystemPartyIdentification8> getMsgOrgtr() {
        if (msgOrgtr == null) {
            msgOrgtr = new ArrayList<>();
        }
        return this.msgOrgtr;
    }

    /**
     * Gets the value of the creDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeSearch5Choice }
     *     
     */
    public DateAndDateTimeSearch5Choice getCreDtTm() {
        return creDtTm;
    }

    /**
     * Sets the value of the creDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeSearch5Choice }
     *     
     */
    public SecuritiesModificationQueryCriteria1 setCreDtTm(DateAndDateTimeSearch5Choice value) {
        this.creDtTm = value;
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
     * Adds a new item to the modReqId list.
     * @see #getModReqId()
     * 
     */
    public SecuritiesModificationQueryCriteria1 addModReqId(String modReqId) {
        getModReqId().add(modReqId);
        return this;
    }

    /**
     * Adds a new item to the prcgSts list.
     * @see #getPrcgSts()
     * 
     */
    public SecuritiesModificationQueryCriteria1 addPrcgSts(ModificationProcessingStatus9Choice prcgSts) {
        getPrcgSts().add(prcgSts);
        return this;
    }

    /**
     * Adds a new item to the sfkpgAcct list.
     * @see #getSfkpgAcct()
     * 
     */
    public SecuritiesModificationQueryCriteria1 addSfkpgAcct(SecuritiesAccount19 sfkpgAcct) {
        getSfkpgAcct().add(sfkpgAcct);
        return this;
    }

    /**
     * Adds a new item to the acctOwnr list.
     * @see #getAcctOwnr()
     * 
     */
    public SecuritiesModificationQueryCriteria1 addAcctOwnr(SystemPartyIdentification8 acctOwnr) {
        getAcctOwnr().add(acctOwnr);
        return this;
    }

    /**
     * Adds a new item to the msgOrgtr list.
     * @see #getMsgOrgtr()
     * 
     */
    public SecuritiesModificationQueryCriteria1 addMsgOrgtr(SystemPartyIdentification8 msgOrgtr) {
        getMsgOrgtr().add(msgOrgtr);
        return this;
    }

}
