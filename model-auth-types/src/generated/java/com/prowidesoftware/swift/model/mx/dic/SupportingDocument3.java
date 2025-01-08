
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
 * Currency control document supporting the contract registration.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupportingDocument3", propOrder = {
    "spprtgDocId",
    "orgnlReqId",
    "cert",
    "acctOwnr",
    "acctSvcr",
    "amdmnt",
    "ctrctRef",
    "ntry",
    "splmtryData"
})
public class SupportingDocument3 {

    @XmlElement(name = "SpprtgDocId", required = true)
    protected String spprtgDocId;
    @XmlElement(name = "OrgnlReqId")
    protected String orgnlReqId;
    @XmlElement(name = "Cert", required = true)
    protected DocumentIdentification28 cert;
    @XmlElement(name = "AcctOwnr", required = true)
    protected PartyIdentification135 acctOwnr;
    @XmlElement(name = "AcctSvcr", required = true)
    protected BranchAndFinancialInstitutionIdentification6 acctSvcr;
    @XmlElement(name = "Amdmnt")
    protected DocumentAmendment1 amdmnt;
    @XmlElement(name = "CtrctRef", required = true)
    protected ContractRegistrationReference2Choice ctrctRef;
    @XmlElement(name = "Ntry", required = true)
    protected List<SupportingDocumentEntry2> ntry;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the spprtgDocId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpprtgDocId() {
        return spprtgDocId;
    }

    /**
     * Sets the value of the spprtgDocId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SupportingDocument3 setSpprtgDocId(String value) {
        this.spprtgDocId = value;
        return this;
    }

    /**
     * Gets the value of the orgnlReqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlReqId() {
        return orgnlReqId;
    }

    /**
     * Sets the value of the orgnlReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SupportingDocument3 setOrgnlReqId(String value) {
        this.orgnlReqId = value;
        return this;
    }

    /**
     * Gets the value of the cert property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification28 }
     *     
     */
    public DocumentIdentification28 getCert() {
        return cert;
    }

    /**
     * Sets the value of the cert property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification28 }
     *     
     */
    public SupportingDocument3 setCert(DocumentIdentification28 value) {
        this.cert = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public SupportingDocument3 setAcctOwnr(PartyIdentification135 value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public SupportingDocument3 setAcctSvcr(BranchAndFinancialInstitutionIdentification6 value) {
        this.acctSvcr = value;
        return this;
    }

    /**
     * Gets the value of the amdmnt property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentAmendment1 }
     *     
     */
    public DocumentAmendment1 getAmdmnt() {
        return amdmnt;
    }

    /**
     * Sets the value of the amdmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentAmendment1 }
     *     
     */
    public SupportingDocument3 setAmdmnt(DocumentAmendment1 value) {
        this.amdmnt = value;
        return this;
    }

    /**
     * Gets the value of the ctrctRef property.
     * 
     * @return
     *     possible object is
     *     {@link ContractRegistrationReference2Choice }
     *     
     */
    public ContractRegistrationReference2Choice getCtrctRef() {
        return ctrctRef;
    }

    /**
     * Sets the value of the ctrctRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractRegistrationReference2Choice }
     *     
     */
    public SupportingDocument3 setCtrctRef(ContractRegistrationReference2Choice value) {
        this.ctrctRef = value;
        return this;
    }

    /**
     * Gets the value of the ntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupportingDocumentEntry2 }
     * 
     * 
     * @return
     *     The value of the ntry property.
     */
    public List<SupportingDocumentEntry2> getNtry() {
        if (ntry == null) {
            ntry = new ArrayList<>();
        }
        return this.ntry;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
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
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
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
     * Adds a new item to the ntry list.
     * @see #getNtry()
     * 
     */
    public SupportingDocument3 addNtry(SupportingDocumentEntry2 ntry) {
        getNtry().add(ntry);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public SupportingDocument3 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
