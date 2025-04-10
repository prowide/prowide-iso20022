
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
 * Defines the criteria based on which information is included.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntraBalanceQueryCriteria12", propOrder = {
    "modReqId",
    "prcgSts",
    "cshAcct",
    "cshAcctOwnr",
    "cshAcctSvcr",
    "msgOrgtr",
    "creDtTm"
})
public class IntraBalanceQueryCriteria12 {

    @XmlElement(name = "ModReqId")
    protected List<String> modReqId;
    @XmlElement(name = "PrcgSts")
    protected List<ModificationProcessingStatus9Choice> prcgSts;
    @XmlElement(name = "CshAcct")
    protected List<AccountIdentificationSearchCriteria2Choice> cshAcct;
    @XmlElement(name = "CshAcctOwnr")
    protected List<SystemPartyIdentification8> cshAcctOwnr;
    @XmlElement(name = "CshAcctSvcr")
    protected BranchAndFinancialInstitutionIdentification8 cshAcctSvcr;
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
     * Gets the value of the cshAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cshAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountIdentificationSearchCriteria2Choice }
     * 
     * 
     * @return
     *     The value of the cshAcct property.
     */
    public List<AccountIdentificationSearchCriteria2Choice> getCshAcct() {
        if (cshAcct == null) {
            cshAcct = new ArrayList<>();
        }
        return this.cshAcct;
    }

    /**
     * Gets the value of the cshAcctOwnr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cshAcctOwnr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshAcctOwnr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemPartyIdentification8 }
     * 
     * 
     * @return
     *     The value of the cshAcctOwnr property.
     */
    public List<SystemPartyIdentification8> getCshAcctOwnr() {
        if (cshAcctOwnr == null) {
            cshAcctOwnr = new ArrayList<>();
        }
        return this.cshAcctOwnr;
    }

    /**
     * Gets the value of the cshAcctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification8 getCshAcctSvcr() {
        return cshAcctSvcr;
    }

    /**
     * Sets the value of the cshAcctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public IntraBalanceQueryCriteria12 setCshAcctSvcr(BranchAndFinancialInstitutionIdentification8 value) {
        this.cshAcctSvcr = value;
        return this;
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
    public IntraBalanceQueryCriteria12 setCreDtTm(DateAndDateTimeSearch5Choice value) {
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
    public IntraBalanceQueryCriteria12 addModReqId(String modReqId) {
        getModReqId().add(modReqId);
        return this;
    }

    /**
     * Adds a new item to the prcgSts list.
     * @see #getPrcgSts()
     * 
     */
    public IntraBalanceQueryCriteria12 addPrcgSts(ModificationProcessingStatus9Choice prcgSts) {
        getPrcgSts().add(prcgSts);
        return this;
    }

    /**
     * Adds a new item to the cshAcct list.
     * @see #getCshAcct()
     * 
     */
    public IntraBalanceQueryCriteria12 addCshAcct(AccountIdentificationSearchCriteria2Choice cshAcct) {
        getCshAcct().add(cshAcct);
        return this;
    }

    /**
     * Adds a new item to the cshAcctOwnr list.
     * @see #getCshAcctOwnr()
     * 
     */
    public IntraBalanceQueryCriteria12 addCshAcctOwnr(SystemPartyIdentification8 cshAcctOwnr) {
        getCshAcctOwnr().add(cshAcctOwnr);
        return this;
    }

    /**
     * Adds a new item to the msgOrgtr list.
     * @see #getMsgOrgtr()
     * 
     */
    public IntraBalanceQueryCriteria12 addMsgOrgtr(SystemPartyIdentification8 msgOrgtr) {
        getMsgOrgtr().add(msgOrgtr);
        return this;
    }

}
