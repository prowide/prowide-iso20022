
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
 * Authorisation response from the acquirer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentTransaction114", propOrder = {
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
public class CardPaymentTransaction114 {

    @XmlElement(name = "AuthstnRslt", required = true)
    protected AuthorisationResult17 authstnRslt;
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
    protected ContentInformationType32 prtctdBal;
    @XmlElement(name = "Actn")
    protected List<Action12> actn;
    @XmlElement(name = "CcyConvsElgblty")
    protected CurrencyConversion23 ccyConvsElgblty;

    /**
     * Gets the value of the authstnRslt property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorisationResult17 }
     *     
     */
    public AuthorisationResult17 getAuthstnRslt() {
        return authstnRslt;
    }

    /**
     * Sets the value of the authstnRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorisationResult17 }
     *     
     */
    public CardPaymentTransaction114 setAuthstnRslt(AuthorisationResult17 value) {
        this.authstnRslt = value;
        return this;
    }

    /**
     * Gets the value of the txVrfctnRslt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the txVrfctnRslt property.
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
     * @return
     *     The value of the txVrfctnRslt property.
     */
    public List<TransactionVerificationResult4> getTxVrfctnRslt() {
        if (txVrfctnRslt == null) {
            txVrfctnRslt = new ArrayList<>();
        }
        return this.txVrfctnRslt;
    }

    /**
     * Gets the value of the allwdPdctCd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the allwdPdctCd property.
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
     * @return
     *     The value of the allwdPdctCd property.
     */
    public List<Product4> getAllwdPdctCd() {
        if (allwdPdctCd == null) {
            allwdPdctCd = new ArrayList<>();
        }
        return this.allwdPdctCd;
    }

    /**
     * Gets the value of the notAllwdPdctCd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the notAllwdPdctCd property.
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
     * @return
     *     The value of the notAllwdPdctCd property.
     */
    public List<Product4> getNotAllwdPdctCd() {
        if (notAllwdPdctCd == null) {
            notAllwdPdctCd = new ArrayList<>();
        }
        return this.notAllwdPdctCd;
    }

    /**
     * Gets the value of the addtlAvlblPdct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlAvlblPdct property.
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
     * @return
     *     The value of the addtlAvlblPdct property.
     */
    public List<Product5> getAddtlAvlblPdct() {
        if (addtlAvlblPdct == null) {
            addtlAvlblPdct = new ArrayList<>();
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
    public CardPaymentTransaction114 setBal(AmountAndDirection93 value) {
        this.bal = value;
        return this;
    }

    /**
     * Gets the value of the prtctdBal property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType32 }
     *     
     */
    public ContentInformationType32 getPrtctdBal() {
        return prtctdBal;
    }

    /**
     * Sets the value of the prtctdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType32 }
     *     
     */
    public CardPaymentTransaction114 setPrtctdBal(ContentInformationType32 value) {
        this.prtctdBal = value;
        return this;
    }

    /**
     * Gets the value of the actn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the actn property.
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
     * {@link Action12 }
     * 
     * 
     * @return
     *     The value of the actn property.
     */
    public List<Action12> getActn() {
        if (actn == null) {
            actn = new ArrayList<>();
        }
        return this.actn;
    }

    /**
     * Gets the value of the ccyConvsElgblty property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyConversion23 }
     *     
     */
    public CurrencyConversion23 getCcyConvsElgblty() {
        return ccyConvsElgblty;
    }

    /**
     * Sets the value of the ccyConvsElgblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyConversion23 }
     *     
     */
    public CardPaymentTransaction114 setCcyConvsElgblty(CurrencyConversion23 value) {
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
    public CardPaymentTransaction114 addTxVrfctnRslt(TransactionVerificationResult4 txVrfctnRslt) {
        getTxVrfctnRslt().add(txVrfctnRslt);
        return this;
    }

    /**
     * Adds a new item to the allwdPdctCd list.
     * @see #getAllwdPdctCd()
     * 
     */
    public CardPaymentTransaction114 addAllwdPdctCd(Product4 allwdPdctCd) {
        getAllwdPdctCd().add(allwdPdctCd);
        return this;
    }

    /**
     * Adds a new item to the notAllwdPdctCd list.
     * @see #getNotAllwdPdctCd()
     * 
     */
    public CardPaymentTransaction114 addNotAllwdPdctCd(Product4 notAllwdPdctCd) {
        getNotAllwdPdctCd().add(notAllwdPdctCd);
        return this;
    }

    /**
     * Adds a new item to the addtlAvlblPdct list.
     * @see #getAddtlAvlblPdct()
     * 
     */
    public CardPaymentTransaction114 addAddtlAvlblPdct(Product5 addtlAvlblPdct) {
        getAddtlAvlblPdct().add(addtlAvlblPdct);
        return this;
    }

    /**
     * Adds a new item to the actn list.
     * @see #getActn()
     * 
     */
    public CardPaymentTransaction114 addActn(Action12 actn) {
        getActn().add(actn);
        return this;
    }

}
