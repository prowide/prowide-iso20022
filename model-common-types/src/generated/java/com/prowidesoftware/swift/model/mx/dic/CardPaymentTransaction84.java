
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
@XmlType(name = "CardPaymentTransaction84", propOrder = {
    "authstnRslt",
    "txVrfctnRslt",
    "allwdPdctCd",
    "notAllwdPdctCd",
    "addtlAvlblPdct",
    "bal",
    "prtctdBal",
    "actn",
    "ccyConvsElgblty"
})
public class CardPaymentTransaction84 {

    @XmlElement(name = "AuthstnRslt", required = true)
    protected AuthorisationResult10 authstnRslt;
    @XmlElement(name = "TxVrfctnRslt")
    protected List<TransactionVerificationResult4> txVrfctnRslt;
    @XmlElement(name = "AllwdPdctCd")
    protected List<Product4> allwdPdctCd;
    @XmlElement(name = "NotAllwdPdctCd")
    protected List<Product4> notAllwdPdctCd;
    @XmlElement(name = "AddtlAvlblPdct")
    protected List<Product5> addtlAvlblPdct;
    @XmlElement(name = "Bal")
    protected AmountAndDirection93 bal;
    @XmlElement(name = "PrtctdBal")
    protected ContentInformationType17 prtctdBal;
    @XmlElement(name = "Actn")
    protected List<Action8> actn;
    @XmlElement(name = "CcyConvsElgblty")
    protected CurrencyConversion14 ccyConvsElgblty;

    /**
     * Gets the value of the authstnRslt property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorisationResult10 }
     *     
     */
    public AuthorisationResult10 getAuthstnRslt() {
        return authstnRslt;
    }

    /**
     * Sets the value of the authstnRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorisationResult10 }
     *     
     */
    public CardPaymentTransaction84 setAuthstnRslt(AuthorisationResult10 value) {
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
     * {@link TransactionVerificationResult4 }
     * 
     * 
     */
    public List<TransactionVerificationResult4> getTxVrfctnRslt() {
        if (txVrfctnRslt == null) {
            txVrfctnRslt = new ArrayList<TransactionVerificationResult4>();
        }
        return this.txVrfctnRslt;
    }

    /**
     * Gets the value of the allwdPdctCd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allwdPdctCd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllwdPdctCd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Product4 }
     * 
     * 
     */
    public List<Product4> getAllwdPdctCd() {
        if (allwdPdctCd == null) {
            allwdPdctCd = new ArrayList<Product4>();
        }
        return this.allwdPdctCd;
    }

    /**
     * Gets the value of the notAllwdPdctCd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notAllwdPdctCd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotAllwdPdctCd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Product4 }
     * 
     * 
     */
    public List<Product4> getNotAllwdPdctCd() {
        if (notAllwdPdctCd == null) {
            notAllwdPdctCd = new ArrayList<Product4>();
        }
        return this.notAllwdPdctCd;
    }

    /**
     * Gets the value of the addtlAvlblPdct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlAvlblPdct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlAvlblPdct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Product5 }
     * 
     * 
     */
    public List<Product5> getAddtlAvlblPdct() {
        if (addtlAvlblPdct == null) {
            addtlAvlblPdct = new ArrayList<Product5>();
        }
        return this.addtlAvlblPdct;
    }

    /**
     * Gets the value of the bal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection93 }
     *     
     */
    public AmountAndDirection93 getBal() {
        return bal;
    }

    /**
     * Sets the value of the bal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection93 }
     *     
     */
    public CardPaymentTransaction84 setBal(AmountAndDirection93 value) {
        this.bal = value;
        return this;
    }

    /**
     * Gets the value of the prtctdBal property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType17 }
     *     
     */
    public ContentInformationType17 getPrtctdBal() {
        return prtctdBal;
    }

    /**
     * Sets the value of the prtctdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType17 }
     *     
     */
    public CardPaymentTransaction84 setPrtctdBal(ContentInformationType17 value) {
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
     * {@link Action8 }
     * 
     * 
     */
    public List<Action8> getActn() {
        if (actn == null) {
            actn = new ArrayList<Action8>();
        }
        return this.actn;
    }

    /**
     * Gets the value of the ccyConvsElgblty property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyConversion14 }
     *     
     */
    public CurrencyConversion14 getCcyConvsElgblty() {
        return ccyConvsElgblty;
    }

    /**
     * Sets the value of the ccyConvsElgblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyConversion14 }
     *     
     */
    public CardPaymentTransaction84 setCcyConvsElgblty(CurrencyConversion14 value) {
        this.ccyConvsElgblty = value;
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
    public CardPaymentTransaction84 addTxVrfctnRslt(TransactionVerificationResult4 txVrfctnRslt) {
        getTxVrfctnRslt().add(txVrfctnRslt);
        return this;
    }

    /**
     * Adds a new item to the allwdPdctCd list.
     * @see #getAllwdPdctCd()
     * 
     */
    public CardPaymentTransaction84 addAllwdPdctCd(Product4 allwdPdctCd) {
        getAllwdPdctCd().add(allwdPdctCd);
        return this;
    }

    /**
     * Adds a new item to the notAllwdPdctCd list.
     * @see #getNotAllwdPdctCd()
     * 
     */
    public CardPaymentTransaction84 addNotAllwdPdctCd(Product4 notAllwdPdctCd) {
        getNotAllwdPdctCd().add(notAllwdPdctCd);
        return this;
    }

    /**
     * Adds a new item to the addtlAvlblPdct list.
     * @see #getAddtlAvlblPdct()
     * 
     */
    public CardPaymentTransaction84 addAddtlAvlblPdct(Product5 addtlAvlblPdct) {
        getAddtlAvlblPdct().add(addtlAvlblPdct);
        return this;
    }

    /**
     * Adds a new item to the actn list.
     * @see #getActn()
     * 
     */
    public CardPaymentTransaction84 addActn(Action8 actn) {
        getActn().add(actn);
        return this;
    }

}
