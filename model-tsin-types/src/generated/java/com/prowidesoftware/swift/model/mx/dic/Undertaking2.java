
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
 * Independent undertaking, such as a demand guarantee or standby letter of credit, that provides financial assurance, to be honoured on the presentation of documents that comply with its terms and conditions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Undertaking2", propOrder = {
    "nm",
    "bnfcry",
    "xpryDtls",
    "cntrUdrtkgAmt",
    "confChrgsPyblBy",
    "govncRulesAndLaw",
    "stdClmDocInd",
    "addtlInf"
})
public class Undertaking2 {

    @XmlElement(name = "Nm")
    @XmlSchemaType(name = "string")
    protected UndertakingName1Code nm;
    @XmlElement(name = "Bnfcry")
    protected PartyIdentification43 bnfcry;
    @XmlElement(name = "XpryDtls")
    protected ExpiryDetails2 xpryDtls;
    @XmlElement(name = "CntrUdrtkgAmt")
    protected UndertakingAmount1 cntrUdrtkgAmt;
    @XmlElement(name = "ConfChrgsPyblBy")
    protected String confChrgsPyblBy;
    @XmlElement(name = "GovncRulesAndLaw")
    protected GovernanceRules1 govncRulesAndLaw;
    @XmlElement(name = "StdClmDocInd")
    protected Boolean stdClmDocInd;
    @XmlElement(name = "AddtlInf")
    protected List<String> addtlInf;

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingName1Code }
     *     
     */
    public UndertakingName1Code getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingName1Code }
     *     
     */
    public Undertaking2 setNm(UndertakingName1Code value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the bnfcry property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *     
     */
    public PartyIdentification43 getBnfcry() {
        return bnfcry;
    }

    /**
     * Sets the value of the bnfcry property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *     
     */
    public Undertaking2 setBnfcry(PartyIdentification43 value) {
        this.bnfcry = value;
        return this;
    }

    /**
     * Gets the value of the xpryDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ExpiryDetails2 }
     *     
     */
    public ExpiryDetails2 getXpryDtls() {
        return xpryDtls;
    }

    /**
     * Sets the value of the xpryDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpiryDetails2 }
     *     
     */
    public Undertaking2 setXpryDtls(ExpiryDetails2 value) {
        this.xpryDtls = value;
        return this;
    }

    /**
     * Gets the value of the cntrUdrtkgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingAmount1 }
     *     
     */
    public UndertakingAmount1 getCntrUdrtkgAmt() {
        return cntrUdrtkgAmt;
    }

    /**
     * Sets the value of the cntrUdrtkgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingAmount1 }
     *     
     */
    public Undertaking2 setCntrUdrtkgAmt(UndertakingAmount1 value) {
        this.cntrUdrtkgAmt = value;
        return this;
    }

    /**
     * Gets the value of the confChrgsPyblBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfChrgsPyblBy() {
        return confChrgsPyblBy;
    }

    /**
     * Sets the value of the confChrgsPyblBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Undertaking2 setConfChrgsPyblBy(String value) {
        this.confChrgsPyblBy = value;
        return this;
    }

    /**
     * Gets the value of the govncRulesAndLaw property.
     * 
     * @return
     *     possible object is
     *     {@link GovernanceRules1 }
     *     
     */
    public GovernanceRules1 getGovncRulesAndLaw() {
        return govncRulesAndLaw;
    }

    /**
     * Sets the value of the govncRulesAndLaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link GovernanceRules1 }
     *     
     */
    public Undertaking2 setGovncRulesAndLaw(GovernanceRules1 value) {
        this.govncRulesAndLaw = value;
        return this;
    }

    /**
     * Gets the value of the stdClmDocInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStdClmDocInd() {
        return stdClmDocInd;
    }

    /**
     * Sets the value of the stdClmDocInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Undertaking2 setStdClmDocInd(Boolean value) {
        this.stdClmDocInd = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<String> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
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
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public Undertaking2 addAddtlInf(String addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
