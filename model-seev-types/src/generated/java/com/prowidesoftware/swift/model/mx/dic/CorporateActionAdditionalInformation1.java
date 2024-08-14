
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
 * Provides additional information about the delivery details, beneficial owner details, etc.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionAdditionalInformation1", propOrder = {
    "bnfclOwnrDtls",
    "regnDtls",
    "rcvrId",
    "certfctnInd",
    "certfctnTp",
    "dlvryDtls",
    "addtlInstr"
})
public class CorporateActionAdditionalInformation1 {

    @XmlElement(name = "BnfclOwnrDtls")
    protected List<BeneficialOwner1> bnfclOwnrDtls;
    @XmlElement(name = "RegnDtls")
    protected String regnDtls;
    @XmlElement(name = "RcvrId")
    protected PartyIdentification2Choice rcvrId;
    @XmlElement(name = "CertfctnInd")
    protected Boolean certfctnInd;
    @XmlElement(name = "CertfctnTp")
    protected BeneficiaryCertificationType1FormatChoice certfctnTp;
    @XmlElement(name = "DlvryDtls")
    protected List<ProceedsDelivery1> dlvryDtls;
    @XmlElement(name = "AddtlInstr")
    protected String addtlInstr;

    /**
     * Gets the value of the bnfclOwnrDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the bnfclOwnrDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBnfclOwnrDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BeneficialOwner1 }
     * 
     * 
     * @return
     *     The value of the bnfclOwnrDtls property.
     */
    public List<BeneficialOwner1> getBnfclOwnrDtls() {
        if (bnfclOwnrDtls == null) {
            bnfclOwnrDtls = new ArrayList<>();
        }
        return this.bnfclOwnrDtls;
    }

    /**
     * Gets the value of the regnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegnDtls() {
        return regnDtls;
    }

    /**
     * Sets the value of the regnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionAdditionalInformation1 setRegnDtls(String value) {
        this.regnDtls = value;
        return this;
    }

    /**
     * Gets the value of the rcvrId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getRcvrId() {
        return rcvrId;
    }

    /**
     * Sets the value of the rcvrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public CorporateActionAdditionalInformation1 setRcvrId(PartyIdentification2Choice value) {
        this.rcvrId = value;
        return this;
    }

    /**
     * Gets the value of the certfctnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCertfctnInd() {
        return certfctnInd;
    }

    /**
     * Sets the value of the certfctnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionAdditionalInformation1 setCertfctnInd(Boolean value) {
        this.certfctnInd = value;
        return this;
    }

    /**
     * Gets the value of the certfctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link BeneficiaryCertificationType1FormatChoice }
     *     
     */
    public BeneficiaryCertificationType1FormatChoice getCertfctnTp() {
        return certfctnTp;
    }

    /**
     * Sets the value of the certfctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeneficiaryCertificationType1FormatChoice }
     *     
     */
    public CorporateActionAdditionalInformation1 setCertfctnTp(BeneficiaryCertificationType1FormatChoice value) {
        this.certfctnTp = value;
        return this;
    }

    /**
     * Gets the value of the dlvryDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dlvryDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDlvryDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProceedsDelivery1 }
     * 
     * 
     * @return
     *     The value of the dlvryDtls property.
     */
    public List<ProceedsDelivery1> getDlvryDtls() {
        if (dlvryDtls == null) {
            dlvryDtls = new ArrayList<>();
        }
        return this.dlvryDtls;
    }

    /**
     * Gets the value of the addtlInstr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInstr() {
        return addtlInstr;
    }

    /**
     * Sets the value of the addtlInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionAdditionalInformation1 setAddtlInstr(String value) {
        this.addtlInstr = value;
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
     * Adds a new item to the bnfclOwnrDtls list.
     * @see #getBnfclOwnrDtls()
     * 
     */
    public CorporateActionAdditionalInformation1 addBnfclOwnrDtls(BeneficialOwner1 bnfclOwnrDtls) {
        getBnfclOwnrDtls().add(bnfclOwnrDtls);
        return this;
    }

    /**
     * Adds a new item to the dlvryDtls list.
     * @see #getDlvryDtls()
     * 
     */
    public CorporateActionAdditionalInformation1 addDlvryDtls(ProceedsDelivery1 dlvryDtls) {
        getDlvryDtls().add(dlvryDtls);
        return this;
    }

}
