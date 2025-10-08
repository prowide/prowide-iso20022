
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
 * The IntraBalanceMovementModificationRequestStatusAdvice message is sent from a settlement infrastructure to an account owner/requestor to advise the status of an intra-balance movement modification request previously sent by the account owner/requestor.
 * 
 * Usage: 
 * The message may be used to: 
 * - re-send a message previously sent (the sub-function of the message is "Duplicate")
 * - provide a third party with a copy of a message for information (the sub-function of the message is "Copy")
 * - re-send to a third party a copy of a message for information (the sub-function of the message is "CopyDuplicate").
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntraBalanceMovementModificationRequestStatusAdviceV02", propOrder = {
    "id",
    "reqRef",
    "cshAcct",
    "cshAcctOwnr",
    "cshAcctSvcr",
    "reqDtls",
    "prcgSts",
    "undrlygIntraBal",
    "splmtryData"
})
public class IntraBalanceMovementModificationRequestStatusAdviceV02 {

    @XmlElement(name = "Id")
    protected DocumentIdentification51 id;
    @XmlElement(name = "ReqRef", required = true)
    protected String reqRef;
    @XmlElement(name = "CshAcct", required = true)
    protected CashAccount40 cshAcct;
    @XmlElement(name = "CshAcctOwnr")
    protected SystemPartyIdentification8 cshAcctOwnr;
    @XmlElement(name = "CshAcctSvcr")
    protected BranchAndFinancialInstitutionIdentification8 cshAcctSvcr;
    @XmlElement(name = "ReqDtls")
    protected RequestDetails22 reqDtls;
    @XmlElement(name = "PrcgSts", required = true)
    protected ProcessingStatus71Choice prcgSts;
    @XmlElement(name = "UndrlygIntraBal")
    protected IntraBalance5 undrlygIntraBal;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification51 }
     *     
     */
    public DocumentIdentification51 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification51 }
     *     
     */
    public IntraBalanceMovementModificationRequestStatusAdviceV02 setId(DocumentIdentification51 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the reqRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqRef() {
        return reqRef;
    }

    /**
     * Sets the value of the reqRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IntraBalanceMovementModificationRequestStatusAdviceV02 setReqRef(String value) {
        this.reqRef = value;
        return this;
    }

    /**
     * Gets the value of the cshAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getCshAcct() {
        return cshAcct;
    }

    /**
     * Sets the value of the cshAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public IntraBalanceMovementModificationRequestStatusAdviceV02 setCshAcct(CashAccount40 value) {
        this.cshAcct = value;
        return this;
    }

    /**
     * Gets the value of the cshAcctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyIdentification8 }
     *     
     */
    public SystemPartyIdentification8 getCshAcctOwnr() {
        return cshAcctOwnr;
    }

    /**
     * Sets the value of the cshAcctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyIdentification8 }
     *     
     */
    public IntraBalanceMovementModificationRequestStatusAdviceV02 setCshAcctOwnr(SystemPartyIdentification8 value) {
        this.cshAcctOwnr = value;
        return this;
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
    public IntraBalanceMovementModificationRequestStatusAdviceV02 setCshAcctSvcr(BranchAndFinancialInstitutionIdentification8 value) {
        this.cshAcctSvcr = value;
        return this;
    }

    /**
     * Gets the value of the reqDtls property.
     * 
     * @return
     *     possible object is
     *     {@link RequestDetails22 }
     *     
     */
    public RequestDetails22 getReqDtls() {
        return reqDtls;
    }

    /**
     * Sets the value of the reqDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestDetails22 }
     *     
     */
    public IntraBalanceMovementModificationRequestStatusAdviceV02 setReqDtls(RequestDetails22 value) {
        this.reqDtls = value;
        return this;
    }

    /**
     * Gets the value of the prcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingStatus71Choice }
     *     
     */
    public ProcessingStatus71Choice getPrcgSts() {
        return prcgSts;
    }

    /**
     * Sets the value of the prcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingStatus71Choice }
     *     
     */
    public IntraBalanceMovementModificationRequestStatusAdviceV02 setPrcgSts(ProcessingStatus71Choice value) {
        this.prcgSts = value;
        return this;
    }

    /**
     * Gets the value of the undrlygIntraBal property.
     * 
     * @return
     *     possible object is
     *     {@link IntraBalance5 }
     *     
     */
    public IntraBalance5 getUndrlygIntraBal() {
        return undrlygIntraBal;
    }

    /**
     * Sets the value of the undrlygIntraBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraBalance5 }
     *     
     */
    public IntraBalanceMovementModificationRequestStatusAdviceV02 setUndrlygIntraBal(IntraBalance5 value) {
        this.undrlygIntraBal = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
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
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public IntraBalanceMovementModificationRequestStatusAdviceV02 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
