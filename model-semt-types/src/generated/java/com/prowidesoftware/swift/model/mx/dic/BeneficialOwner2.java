
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
 * Provides information about the beneficial owner of the securities.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BeneficialOwner2", propOrder = {
    "bnfclOwnrId",
    "addtlId",
    "ntlty",
    "dmclCtry",
    "nonDmclCtry",
    "certfctnInd",
    "certfctnTp",
    "dclrtnDtls"
})
public class BeneficialOwner2 {

    @XmlElement(name = "BnfclOwnrId", required = true)
    protected PartyIdentification100 bnfclOwnrId;
    @XmlElement(name = "AddtlId")
    protected AlternateIdentification4 addtlId;
    @XmlElement(name = "Ntlty")
    protected String ntlty;
    @XmlElement(name = "DmclCtry")
    protected String dmclCtry;
    @XmlElement(name = "NonDmclCtry")
    protected String nonDmclCtry;
    @XmlElement(name = "CertfctnInd")
    protected Boolean certfctnInd;
    @XmlElement(name = "CertfctnTp")
    protected BeneficiaryCertificationType9Choice certfctnTp;
    @XmlElement(name = "DclrtnDtls")
    protected String dclrtnDtls;

    /**
     * Gets the value of the bnfclOwnrId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification100 }
     *     
     */
    public PartyIdentification100 getBnfclOwnrId() {
        return bnfclOwnrId;
    }

    /**
     * Sets the value of the bnfclOwnrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification100 }
     *     
     */
    public BeneficialOwner2 setBnfclOwnrId(PartyIdentification100 value) {
        this.bnfclOwnrId = value;
        return this;
    }

    /**
     * Gets the value of the addtlId property.
     * 
     * @return
     *     possible object is
     *     {@link AlternateIdentification4 }
     *     
     */
    public AlternateIdentification4 getAddtlId() {
        return addtlId;
    }

    /**
     * Sets the value of the addtlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternateIdentification4 }
     *     
     */
    public BeneficialOwner2 setAddtlId(AlternateIdentification4 value) {
        this.addtlId = value;
        return this;
    }

    /**
     * Gets the value of the ntlty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtlty() {
        return ntlty;
    }

    /**
     * Sets the value of the ntlty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BeneficialOwner2 setNtlty(String value) {
        this.ntlty = value;
        return this;
    }

    /**
     * Gets the value of the dmclCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDmclCtry() {
        return dmclCtry;
    }

    /**
     * Sets the value of the dmclCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BeneficialOwner2 setDmclCtry(String value) {
        this.dmclCtry = value;
        return this;
    }

    /**
     * Gets the value of the nonDmclCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonDmclCtry() {
        return nonDmclCtry;
    }

    /**
     * Sets the value of the nonDmclCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BeneficialOwner2 setNonDmclCtry(String value) {
        this.nonDmclCtry = value;
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
    public BeneficialOwner2 setCertfctnInd(Boolean value) {
        this.certfctnInd = value;
        return this;
    }

    /**
     * Gets the value of the certfctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link BeneficiaryCertificationType9Choice }
     *     
     */
    public BeneficiaryCertificationType9Choice getCertfctnTp() {
        return certfctnTp;
    }

    /**
     * Sets the value of the certfctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeneficiaryCertificationType9Choice }
     *     
     */
    public BeneficialOwner2 setCertfctnTp(BeneficiaryCertificationType9Choice value) {
        this.certfctnTp = value;
        return this;
    }

    /**
     * Gets the value of the dclrtnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDclrtnDtls() {
        return dclrtnDtls;
    }

    /**
     * Sets the value of the dclrtnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BeneficialOwner2 setDclrtnDtls(String value) {
        this.dclrtnDtls = value;
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
