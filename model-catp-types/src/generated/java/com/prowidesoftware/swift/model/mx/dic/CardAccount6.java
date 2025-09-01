
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
@XmlType(name = "CardAccount6", propOrder = {
    "acctTp",
    "acctNm",
    "ccy",
    "acctIdr",
    "cdtRef",
    "svcr",
    "bal",
    "balDispFlg",
    "dfltAcctInd",
    "allwdSvcs",
    "wdrwlLmts",
    "dpstLmts"
})
public class CardAccount6 {

    @XmlElement(name = "AcctTp")
    @XmlSchemaType(name = "string")
    protected CardAccountType2Code acctTp;
    @XmlElement(name = "AcctNm")
    protected String acctNm;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "AcctIdr")
    protected AccountIdentification31Choice acctIdr;
    @XmlElement(name = "CdtRef")
    protected String cdtRef;
    @XmlElement(name = "Svcr")
    protected PartyIdentification72Choice svcr;
    @XmlElement(name = "Bal")
    protected AmountAndDirection43 bal;
    @XmlElement(name = "BalDispFlg")
    protected Boolean balDispFlg;
    @XmlElement(name = "DfltAcctInd")
    protected Boolean dfltAcctInd;
    @XmlElement(name = "AllwdSvcs")
    @XmlSchemaType(name = "string")
    protected List<ATMServiceType4Code> allwdSvcs;
    @XmlElement(name = "WdrwlLmts")
    protected ATMTransactionAmounts4 wdrwlLmts;
    @XmlElement(name = "DpstLmts")
    protected ATMTransactionAmounts5 dpstLmts;

    /**
     * Gets the value of the acctTp property.
     * 
     * @return
     *     possible object is
     *     {@link CardAccountType2Code }
     *     
     */
    public CardAccountType2Code getAcctTp() {
        return acctTp;
    }

    /**
     * Sets the value of the acctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAccountType2Code }
     *     
     */
    public CardAccount6 setAcctTp(CardAccountType2Code value) {
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
    public CardAccount6 setAcctNm(String value) {
        this.acctNm = value;
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
    public CardAccount6 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the acctIdr property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification31Choice }
     *     
     */
    public AccountIdentification31Choice getAcctIdr() {
        return acctIdr;
    }

    /**
     * Sets the value of the acctIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification31Choice }
     *     
     */
    public CardAccount6 setAcctIdr(AccountIdentification31Choice value) {
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
    public CardAccount6 setCdtRef(String value) {
        this.cdtRef = value;
        return this;
    }

    /**
     * Gets the value of the svcr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification72Choice }
     *     
     */
    public PartyIdentification72Choice getSvcr() {
        return svcr;
    }

    /**
     * Sets the value of the svcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification72Choice }
     *     
     */
    public CardAccount6 setSvcr(PartyIdentification72Choice value) {
        this.svcr = value;
        return this;
    }

    /**
     * Gets the value of the bal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection43 }
     *     
     */
    public AmountAndDirection43 getBal() {
        return bal;
    }

    /**
     * Sets the value of the bal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection43 }
     *     
     */
    public CardAccount6 setBal(AmountAndDirection43 value) {
        this.bal = value;
        return this;
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
    public CardAccount6 setBalDispFlg(Boolean value) {
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
    public CardAccount6 setDfltAcctInd(Boolean value) {
        this.dfltAcctInd = value;
        return this;
    }

    /**
     * Gets the value of the allwdSvcs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allwdSvcs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllwdSvcs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMServiceType4Code }
     * 
     * 
     */
    public List<ATMServiceType4Code> getAllwdSvcs() {
        if (allwdSvcs == null) {
            allwdSvcs = new ArrayList<ATMServiceType4Code>();
        }
        return this.allwdSvcs;
    }

    /**
     * Gets the value of the wdrwlLmts property.
     * 
     * @return
     *     possible object is
     *     {@link ATMTransactionAmounts4 }
     *     
     */
    public ATMTransactionAmounts4 getWdrwlLmts() {
        return wdrwlLmts;
    }

    /**
     * Sets the value of the wdrwlLmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMTransactionAmounts4 }
     *     
     */
    public CardAccount6 setWdrwlLmts(ATMTransactionAmounts4 value) {
        this.wdrwlLmts = value;
        return this;
    }

    /**
     * Gets the value of the dpstLmts property.
     * 
     * @return
     *     possible object is
     *     {@link ATMTransactionAmounts5 }
     *     
     */
    public ATMTransactionAmounts5 getDpstLmts() {
        return dpstLmts;
    }

    /**
     * Sets the value of the dpstLmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMTransactionAmounts5 }
     *     
     */
    public CardAccount6 setDpstLmts(ATMTransactionAmounts5 value) {
        this.dpstLmts = value;
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
     * Adds a new item to the allwdSvcs list.
     * @see #getAllwdSvcs()
     * 
     */
    public CardAccount6 addAllwdSvcs(ATMServiceType4Code allwdSvcs) {
        getAllwdSvcs().add(allwdSvcs);
        return this;
    }

}
