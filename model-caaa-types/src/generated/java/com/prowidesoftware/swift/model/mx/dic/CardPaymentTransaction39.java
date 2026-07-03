
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
 * Authorisation response from the acquirer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentTransaction39", propOrder = {
    "authstnRslt",
    "txVrfctnRslt",
    "dclndPdctCd",
    "bal",
    "prtctdBal",
    "actn",
    "ccyConvs"
})
public class CardPaymentTransaction39 {

    @XmlElement(name = "AuthstnRslt", required = true)
    protected AuthorisationResult4 authstnRslt;
    @XmlElement(name = "TxVrfctnRslt")
    protected List<TransactionVerificationResult3> txVrfctnRslt;
    @XmlElement(name = "DclndPdctCd")
    protected List<String> dclndPdctCd;
    @XmlElement(name = "Bal")
    protected AmountAndDirection41 bal;
    @XmlElement(name = "PrtctdBal")
    protected ContentInformationType10 prtctdBal;
    @XmlElement(name = "Actn")
    protected List<Action3> actn;
    @XmlElement(name = "CcyConvs")
    protected CurrencyConversion3 ccyConvs;

    /**
     * Gets the value of the authstnRslt property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorisationResult4 }
     *     
     */
    public AuthorisationResult4 getAuthstnRslt() {
        return authstnRslt;
    }

    /**
     * Sets the value of the authstnRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorisationResult4 }
     *     
     */
    public CardPaymentTransaction39 setAuthstnRslt(AuthorisationResult4 value) {
        this.authstnRslt = value;
        return this;
    }

    /**
     * Gets the value of the txVrfctnRslt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txVrfctnRslt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxVrfctnRslt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionVerificationResult3 }
     * 
     * 
     */
    public List<TransactionVerificationResult3> getTxVrfctnRslt() {
        if (txVrfctnRslt == null) {
            txVrfctnRslt = new ArrayList<TransactionVerificationResult3>();
        }
        return this.txVrfctnRslt;
    }

    /**
     * Gets the value of the dclndPdctCd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dclndPdctCd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDclndPdctCd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDclndPdctCd() {
        if (dclndPdctCd == null) {
            dclndPdctCd = new ArrayList<String>();
        }
        return this.dclndPdctCd;
    }

    /**
     * Gets the value of the bal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection41 }
     *     
     */
    public AmountAndDirection41 getBal() {
        return bal;
    }

    /**
     * Sets the value of the bal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection41 }
     *     
     */
    public CardPaymentTransaction39 setBal(AmountAndDirection41 value) {
        this.bal = value;
        return this;
    }

    /**
     * Gets the value of the prtctdBal property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdBal() {
        return prtctdBal;
    }

    /**
     * Sets the value of the prtctdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public CardPaymentTransaction39 setPrtctdBal(ContentInformationType10 value) {
        this.prtctdBal = value;
        return this;
    }

    /**
     * Gets the value of the actn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Action3 }
     * 
     * 
     */
    public List<Action3> getActn() {
        if (actn == null) {
            actn = new ArrayList<Action3>();
        }
        return this.actn;
    }

    /**
     * Gets the value of the ccyConvs property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyConversion3 }
     *     
     */
    public CurrencyConversion3 getCcyConvs() {
        return ccyConvs;
    }

    /**
     * Sets the value of the ccyConvs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyConversion3 }
     *     
     */
    public CardPaymentTransaction39 setCcyConvs(CurrencyConversion3 value) {
        this.ccyConvs = value;
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
     * Adds a new item to the txVrfctnRslt list.
     * @see #getTxVrfctnRslt()
     * 
     */
    public CardPaymentTransaction39 addTxVrfctnRslt(TransactionVerificationResult3 txVrfctnRslt) {
        getTxVrfctnRslt().add(txVrfctnRslt);
        return this;
    }

    /**
     * Adds a new item to the dclndPdctCd list.
     * @see #getDclndPdctCd()
     * 
     */
    public CardPaymentTransaction39 addDclndPdctCd(String dclndPdctCd) {
        getDclndPdctCd().add(dclndPdctCd);
        return this;
    }

    /**
     * Adds a new item to the actn list.
     * @see #getActn()
     * 
     */
    public CardPaymentTransaction39 addActn(Action3 actn) {
        getActn().add(actn);
        return this;
    }

}
