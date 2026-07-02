
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Customer account information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardAccount18", propOrder = {
    "acctTp",
    "acctNm",
    "acctUsgCd",
    "ccy",
    "acctIdr",
    "cdtRef",
    "svcr",
    "bal",
    "balDispFlg",
    "dfltAcctInd",
    "allwdSvc"
})
public class CardAccount18 {

    @XmlElement(name = "AcctTp")
    @XmlSchemaType(name = "string")
    protected CardAccountType3Code acctTp;
    @XmlElement(name = "AcctNm")
    protected String acctNm;
    @XmlElement(name = "AcctUsgCd")
    @XmlSchemaType(name = "string")
    protected ATMAccountUsage1Code acctUsgCd;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "AcctIdr")
    protected AccountIdentification80Choice acctIdr;
    @XmlElement(name = "CdtRef")
    protected String cdtRef;
    @XmlElement(name = "Svcr")
    protected PartyIdentification177Choice svcr;
    @XmlElement(name = "Bal")
    protected List<AmountAndDirection111> bal;
    @XmlElement(name = "BalDispFlg")
    protected Boolean balDispFlg;
    @XmlElement(name = "DfltAcctInd")
    protected Boolean dfltAcctInd;
    @XmlElement(name = "AllwdSvc")
    protected List<ATMService29> allwdSvc;

    /**
     * Gets the value of the acctTp property.
     * 
     * @return
     *     possible object is
     *     {@link CardAccountType3Code }
     *     
     */
    public CardAccountType3Code getAcctTp() {
        return acctTp;
    }

    /**
     * Sets the value of the acctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAccountType3Code }
     *     
     */
    public CardAccount18 setAcctTp(CardAccountType3Code value) {
        this.acctTp = value;
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
    public CardAccount18 setAcctNm(String value) {
        this.acctNm = value;
        return this;
    }

    /**
     * Gets the value of the acctUsgCd property.
     * 
     * @return
     *     possible object is
     *     {@link ATMAccountUsage1Code }
     *     
     */
    public ATMAccountUsage1Code getAcctUsgCd() {
        return acctUsgCd;
    }

    /**
     * Sets the value of the acctUsgCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMAccountUsage1Code }
     *     
     */
    public CardAccount18 setAcctUsgCd(ATMAccountUsage1Code value) {
        this.acctUsgCd = value;
        return this;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardAccount18 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the acctIdr property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification80Choice }
     *     
     */
    public AccountIdentification80Choice getAcctIdr() {
        return acctIdr;
    }

    /**
     * Sets the value of the acctIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification80Choice }
     *     
     */
    public CardAccount18 setAcctIdr(AccountIdentification80Choice value) {
        this.acctIdr = value;
        return this;
    }

    /**
     * Gets the value of the cdtRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdtRef() {
        return cdtRef;
    }

    /**
     * Sets the value of the cdtRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardAccount18 setCdtRef(String value) {
        this.cdtRef = value;
        return this;
    }

    /**
     * Gets the value of the svcr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification177Choice }
     *     
     */
    public PartyIdentification177Choice getSvcr() {
        return svcr;
    }

    /**
     * Sets the value of the svcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification177Choice }
     *     
     */
    public CardAccount18 setSvcr(PartyIdentification177Choice value) {
        this.svcr = value;
        return this;
    }

    /**
     * Gets the value of the bal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountAndDirection111 }
     * 
     * 
     */
    public List<AmountAndDirection111> getBal() {
        if (bal == null) {
            bal = new ArrayList<AmountAndDirection111>();
        }
        return this.bal;
    }

    /**
     * Gets the value of the balDispFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBalDispFlg() {
        return balDispFlg;
    }

    /**
     * Sets the value of the balDispFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CardAccount18 setBalDispFlg(Boolean value) {
        this.balDispFlg = value;
        return this;
    }

    /**
     * Gets the value of the dfltAcctInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDfltAcctInd() {
        return dfltAcctInd;
    }

    /**
     * Sets the value of the dfltAcctInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CardAccount18 setDfltAcctInd(Boolean value) {
        this.dfltAcctInd = value;
        return this;
    }

    /**
     * Gets the value of the allwdSvc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allwdSvc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllwdSvc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMService29 }
     * 
     * 
     */
    public List<ATMService29> getAllwdSvc() {
        if (allwdSvc == null) {
            allwdSvc = new ArrayList<ATMService29>();
        }
        return this.allwdSvc;
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
     * Adds a new item to the bal list.
     * @see #getBal()
     * 
     */
    public CardAccount18 addBal(AmountAndDirection111 bal) {
        getBal().add(bal);
        return this;
    }

    /**
     * Adds a new item to the allwdSvc list.
     * @see #getAllwdSvc()
     * 
     */
    public CardAccount18 addAllwdSvc(ATMService29 allwdSvc) {
        getAllwdSvc().add(allwdSvc);
        return this;
    }

}
