
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
 * Account between an investor(s) and a fund manager or a fund. The account can contain holdings in any investment fund or investment fund class managed (or distributed) by the fund manager, within the same fund family.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentAccount56", propOrder = {
    "ownrId",
    "acctId",
    "acctNm",
    "acctDsgnt",
    "intrmyInf",
    "sctiesForm",
    "dmtrlsdInd",
    "incmPref",
    "bnfcryCertfctnCmpltn",
    "sfkpgPlc",
    "acctSvcr",
    "subAcctDtls",
    "sttlmPtiesDtls"
})
public class InvestmentAccount56 {

    @XmlElement(name = "OwnrId")
    protected List<PartyIdentification70Choice> ownrId;
    @XmlElement(name = "AcctId", required = true)
    protected String acctId;
    @XmlElement(name = "AcctNm")
    protected String acctNm;
    @XmlElement(name = "AcctDsgnt")
    protected String acctDsgnt;
    @XmlElement(name = "IntrmyInf")
    protected List<Intermediary34> intrmyInf;
    @XmlElement(name = "SctiesForm")
    @XmlSchemaType(name = "string")
    protected FormOfSecurity1Code sctiesForm;
    @XmlElement(name = "DmtrlsdInd")
    protected Boolean dmtrlsdInd;
    @XmlElement(name = "IncmPref")
    @XmlSchemaType(name = "string")
    protected IncomePreference2Code incmPref;
    @XmlElement(name = "BnfcryCertfctnCmpltn")
    @XmlSchemaType(name = "string")
    protected BeneficiaryCertificationCompletion1Code bnfcryCertfctnCmpltn;
    @XmlElement(name = "SfkpgPlc")
    protected SafekeepingPlaceFormat8Choice sfkpgPlc;
    @XmlElement(name = "AcctSvcr")
    protected PartyIdentification70Choice acctSvcr;
    @XmlElement(name = "SubAcctDtls")
    protected SubAccount5 subAcctDtls;
    @XmlElement(name = "SttlmPtiesDtls")
    protected ReceivingPartiesAndAccount14 sttlmPtiesDtls;

    /**
     * Gets the value of the ownrId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ownrId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOwnrId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification70Choice }
     * 
     * 
     */
    public List<PartyIdentification70Choice> getOwnrId() {
        if (ownrId == null) {
            ownrId = new ArrayList<PartyIdentification70Choice>();
        }
        return this.ownrId;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentAccount56 setAcctId(String value) {
        this.acctId = value;
        return this;
    }

    /**
     * Gets the value of the acctNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctNm() {
        return acctNm;
    }

    /**
     * Sets the value of the acctNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentAccount56 setAcctNm(String value) {
        this.acctNm = value;
        return this;
    }

    /**
     * Gets the value of the acctDsgnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctDsgnt() {
        return acctDsgnt;
    }

    /**
     * Sets the value of the acctDsgnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentAccount56 setAcctDsgnt(String value) {
        this.acctDsgnt = value;
        return this;
    }

    /**
     * Gets the value of the intrmyInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intrmyInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntrmyInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Intermediary34 }
     * 
     * 
     */
    public List<Intermediary34> getIntrmyInf() {
        if (intrmyInf == null) {
            intrmyInf = new ArrayList<Intermediary34>();
        }
        return this.intrmyInf;
    }

    /**
     * Gets the value of the sctiesForm property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfSecurity1Code }
     *     
     */
    public FormOfSecurity1Code getSctiesForm() {
        return sctiesForm;
    }

    /**
     * Sets the value of the sctiesForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfSecurity1Code }
     *     
     */
    public InvestmentAccount56 setSctiesForm(FormOfSecurity1Code value) {
        this.sctiesForm = value;
        return this;
    }

    /**
     * Gets the value of the dmtrlsdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDmtrlsdInd() {
        return dmtrlsdInd;
    }

    /**
     * Sets the value of the dmtrlsdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public InvestmentAccount56 setDmtrlsdInd(Boolean value) {
        this.dmtrlsdInd = value;
        return this;
    }

    /**
     * Gets the value of the incmPref property.
     * 
     * @return
     *     possible object is
     *     {@link IncomePreference2Code }
     *     
     */
    public IncomePreference2Code getIncmPref() {
        return incmPref;
    }

    /**
     * Sets the value of the incmPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncomePreference2Code }
     *     
     */
    public InvestmentAccount56 setIncmPref(IncomePreference2Code value) {
        this.incmPref = value;
        return this;
    }

    /**
     * Gets the value of the bnfcryCertfctnCmpltn property.
     * 
     * @return
     *     possible object is
     *     {@link BeneficiaryCertificationCompletion1Code }
     *     
     */
    public BeneficiaryCertificationCompletion1Code getBnfcryCertfctnCmpltn() {
        return bnfcryCertfctnCmpltn;
    }

    /**
     * Sets the value of the bnfcryCertfctnCmpltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeneficiaryCertificationCompletion1Code }
     *     
     */
    public InvestmentAccount56 setBnfcryCertfctnCmpltn(BeneficiaryCertificationCompletion1Code value) {
        this.bnfcryCertfctnCmpltn = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceFormat8Choice }
     *     
     */
    public SafekeepingPlaceFormat8Choice getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceFormat8Choice }
     *     
     */
    public InvestmentAccount56 setSfkpgPlc(SafekeepingPlaceFormat8Choice value) {
        this.sfkpgPlc = value;
        return this;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification70Choice }
     *     
     */
    public PartyIdentification70Choice getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification70Choice }
     *     
     */
    public InvestmentAccount56 setAcctSvcr(PartyIdentification70Choice value) {
        this.acctSvcr = value;
        return this;
    }

    /**
     * Gets the value of the subAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SubAccount5 }
     *     
     */
    public SubAccount5 getSubAcctDtls() {
        return subAcctDtls;
    }

    /**
     * Sets the value of the subAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubAccount5 }
     *     
     */
    public InvestmentAccount56 setSubAcctDtls(SubAccount5 value) {
        this.subAcctDtls = value;
        return this;
    }

    /**
     * Gets the value of the sttlmPtiesDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ReceivingPartiesAndAccount14 }
     *     
     */
    public ReceivingPartiesAndAccount14 getSttlmPtiesDtls() {
        return sttlmPtiesDtls;
    }

    /**
     * Sets the value of the sttlmPtiesDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivingPartiesAndAccount14 }
     *     
     */
    public InvestmentAccount56 setSttlmPtiesDtls(ReceivingPartiesAndAccount14 value) {
        this.sttlmPtiesDtls = value;
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
     * Adds a new item to the ownrId list.
     * @see #getOwnrId()
     * 
     */
    public InvestmentAccount56 addOwnrId(PartyIdentification70Choice ownrId) {
        getOwnrId().add(ownrId);
        return this;
    }

    /**
     * Adds a new item to the intrmyInf list.
     * @see #getIntrmyInf()
     * 
     */
    public InvestmentAccount56 addIntrmyInf(Intermediary34 intrmyInf) {
        getIntrmyInf().add(intrmyInf);
        return this;
    }

}
