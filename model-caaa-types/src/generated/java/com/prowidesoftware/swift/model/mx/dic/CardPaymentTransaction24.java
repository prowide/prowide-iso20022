
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
@XmlType(name = "CardPaymentTransaction24", propOrder = {
    "authstnRslt",
    "txVrfctnRslt",
    "bal",
    "actn",
    "ccyConvs"
})
public class CardPaymentTransaction24 {

    @XmlElement(name = "AuthstnRslt", required = true)
    protected AuthorisationResult1 authstnRslt;
    @XmlElement(name = "TxVrfctnRslt")
    protected TransactionVerificationResult2 txVrfctnRslt;
    @XmlElement(name = "Bal")
    protected AmountAndDirection41 bal;
    @XmlElement(name = "Actn")
    protected List<Action3> actn;
    @XmlElement(name = "CcyConvs")
    protected CurrencyConversion1 ccyConvs;

    /**
     * Gets the value of the authstnRslt property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorisationResult1 }
     *     
     */
    public AuthorisationResult1 getAuthstnRslt() {
        return authstnRslt;
    }

    /**
     * Sets the value of the authstnRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorisationResult1 }
     *     
     */
    public CardPaymentTransaction24 setAuthstnRslt(AuthorisationResult1 value) {
        this.authstnRslt = value;
        return this;
    }

    /**
     * Gets the value of the txVrfctnRslt property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionVerificationResult2 }
     *     
     */
    public TransactionVerificationResult2 getTxVrfctnRslt() {
        return txVrfctnRslt;
    }

    /**
     * Sets the value of the txVrfctnRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionVerificationResult2 }
     *     
     */
    public CardPaymentTransaction24 setTxVrfctnRslt(TransactionVerificationResult2 value) {
        this.txVrfctnRslt = value;
        return this;
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
    public CardPaymentTransaction24 setBal(AmountAndDirection41 value) {
        this.bal = value;
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
     *     {@link CurrencyConversion1 }
     *     
     */
    public CurrencyConversion1 getCcyConvs() {
        return ccyConvs;
    }

    /**
     * Sets the value of the ccyConvs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyConversion1 }
     *     
     */
    public CardPaymentTransaction24 setCcyConvs(CurrencyConversion1 value) {
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
     * Adds a new item to the actn list.
     * @see #getActn()
     * 
     */
    public CardPaymentTransaction24 addActn(Action3 actn) {
        getActn().add(actn);
        return this;
    }

}
