
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
@XmlType(name = "InvestmentAccount10", propOrder = {
    "ownrId",
    "acctId",
    "acctNm",
    "acctDsgnt",
    "intrmyInf",
    "sctiesForm",
    "dmtrlsdInd",
    "incmPref",
    "bnfcryCertfctnInd",
    "sfkpgPlc",
    "acctSvcr"
})
public class InvestmentAccount10 {

    @XmlElement(name = "OwnrId")
    protected List<PartyIdentification1Choice> ownrId;
    @XmlElement(name = "AcctId", required = true)
    protected AccountIdentification1 acctId;
    @XmlElement(name = "AcctNm")
    protected String acctNm;
    @XmlElement(name = "AcctDsgnt")
    protected String acctDsgnt;
    @XmlElement(name = "IntrmyInf")
    protected List<Intermediary1> intrmyInf;
    @XmlElement(name = "SctiesForm")
    @XmlSchemaType(name = "string")
    protected FormOfSecurity1Code sctiesForm;
    @XmlElement(name = "DmtrlsdInd")
    protected Boolean dmtrlsdInd;
    @XmlElement(name = "IncmPref")
    @XmlSchemaType(name = "string")
    protected IncomePreference1Code incmPref;
    @XmlElement(name = "BnfcryCertfctnInd")
    protected Boolean bnfcryCertfctnInd;
    @XmlElement(name = "SfkpgPlc")
    protected PartyIdentification1Choice sfkpgPlc;
    @XmlElement(name = "AcctSvcr")
    protected PartyIdentification1Choice acctSvcr;

    /**
     * Gets the value of the ownrId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ownrId property.
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
     * {@link PartyIdentification1Choice }
     * 
     * 
     * @return
     *     The value of the ownrId property.
     */
    public List<PartyIdentification1Choice> getOwnrId() {
        if (ownrId == null) {
            ownrId = new ArrayList<>();
        }
        return this.ownrId;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification1 }
     *     
     */
    public AccountIdentification1 getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification1 }
     *     
     */
    public InvestmentAccount10 setAcctId(AccountIdentification1 value) {
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
    public InvestmentAccount10 setAcctNm(String value) {
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
    public InvestmentAccount10 setAcctDsgnt(String value) {
        this.acctDsgnt = value;
        return this;
    }

    /**
     * Gets the value of the intrmyInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the intrmyInf property.
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
     * {@link Intermediary1 }
     * 
     * 
     * @return
     *     The value of the intrmyInf property.
     */
    public List<Intermediary1> getIntrmyInf() {
        if (intrmyInf == null) {
            intrmyInf = new ArrayList<>();
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
    public InvestmentAccount10 setSctiesForm(FormOfSecurity1Code value) {
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
    public InvestmentAccount10 setDmtrlsdInd(Boolean value) {
        this.dmtrlsdInd = value;
        return this;
    }

    /**
     * Gets the value of the incmPref property.
     * 
     * @return
     *     possible object is
     *     {@link IncomePreference1Code }
     *     
     */
    public IncomePreference1Code getIncmPref() {
        return incmPref;
    }

    /**
     * Sets the value of the incmPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncomePreference1Code }
     *     
     */
    public InvestmentAccount10 setIncmPref(IncomePreference1Code value) {
        this.incmPref = value;
        return this;
    }

    /**
     * Gets the value of the bnfcryCertfctnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBnfcryCertfctnInd() {
        return bnfcryCertfctnInd;
    }

    /**
     * Sets the value of the bnfcryCertfctnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public InvestmentAccount10 setBnfcryCertfctnInd(Boolean value) {
        this.bnfcryCertfctnInd = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification1Choice }
     *     
     */
    public PartyIdentification1Choice getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification1Choice }
     *     
     */
    public InvestmentAccount10 setSfkpgPlc(PartyIdentification1Choice value) {
        this.sfkpgPlc = value;
        return this;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification1Choice }
     *     
     */
    public PartyIdentification1Choice getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification1Choice }
     *     
     */
    public InvestmentAccount10 setAcctSvcr(PartyIdentification1Choice value) {
        this.acctSvcr = value;
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
    public InvestmentAccount10 addOwnrId(PartyIdentification1Choice ownrId) {
        getOwnrId().add(ownrId);
        return this;
    }

    /**
     * Adds a new item to the intrmyInf list.
     * @see #getIntrmyInf()
     * 
     */
    public InvestmentAccount10 addIntrmyInf(Intermediary1 intrmyInf) {
        getIntrmyInf().add(intrmyInf);
        return this;
    }

}
