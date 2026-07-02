
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
 * Account between an investor(s) and a fund manager or a fund. The account can contain holdings in any investment fund or investment fund class managed (or distributed) by the fund manager, within the same fund family.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentAccount44", propOrder = {
    "nm",
    "dsgnt",
    "fndTp",
    "fndFmlyNm",
    "sctyDtls",
    "ownrId",
    "intrmy",
    "acctSvcr"
})
public class InvestmentAccount44 {

    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Dsgnt")
    protected String dsgnt;
    @XmlElement(name = "FndTp")
    protected String fndTp;
    @XmlElement(name = "FndFmlyNm")
    protected String fndFmlyNm;
    @XmlElement(name = "SctyDtls")
    protected FinancialInstrument10 sctyDtls;
    @XmlElement(name = "OwnrId")
    protected OwnerIdentification1Choice ownrId;
    @XmlElement(name = "Intrmy")
    protected List<Intermediary7> intrmy;
    @XmlElement(name = "AcctSvcr")
    protected PartyIdentification2Choice acctSvcr;

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentAccount44 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the dsgnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsgnt() {
        return dsgnt;
    }

    /**
     * Sets the value of the dsgnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentAccount44 setDsgnt(String value) {
        this.dsgnt = value;
        return this;
    }

    /**
     * Gets the value of the fndTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFndTp() {
        return fndTp;
    }

    /**
     * Sets the value of the fndTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentAccount44 setFndTp(String value) {
        this.fndTp = value;
        return this;
    }

    /**
     * Gets the value of the fndFmlyNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFndFmlyNm() {
        return fndFmlyNm;
    }

    /**
     * Sets the value of the fndFmlyNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentAccount44 setFndFmlyNm(String value) {
        this.fndFmlyNm = value;
        return this;
    }

    /**
     * Gets the value of the sctyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument10 }
     *     
     */
    public FinancialInstrument10 getSctyDtls() {
        return sctyDtls;
    }

    /**
     * Sets the value of the sctyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument10 }
     *     
     */
    public InvestmentAccount44 setSctyDtls(FinancialInstrument10 value) {
        this.sctyDtls = value;
        return this;
    }

    /**
     * Gets the value of the ownrId property.
     * 
     * @return
     *     possible object is
     *     {@link OwnerIdentification1Choice }
     *     
     */
    public OwnerIdentification1Choice getOwnrId() {
        return ownrId;
    }

    /**
     * Sets the value of the ownrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnerIdentification1Choice }
     *     
     */
    public InvestmentAccount44 setOwnrId(OwnerIdentification1Choice value) {
        this.ownrId = value;
        return this;
    }

    /**
     * Gets the value of the intrmy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intrmy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntrmy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Intermediary7 }
     * 
     * 
     */
    public List<Intermediary7> getIntrmy() {
        if (intrmy == null) {
            intrmy = new ArrayList<Intermediary7>();
        }
        return this.intrmy;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public InvestmentAccount44 setAcctSvcr(PartyIdentification2Choice value) {
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
     * Adds a new item to the intrmy list.
     * @see #getIntrmy()
     * 
     */
    public InvestmentAccount44 addIntrmy(Intermediary7 intrmy) {
        getIntrmy().add(intrmy);
        return this;
    }

}
