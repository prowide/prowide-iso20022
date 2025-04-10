
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
 * Payment Data Results.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetailerPaymentResult1", propOrder = {
    "txTp",
    "addtlSvc",
    "svcAttr",
    "reqdTx",
    "txRspn",
    "cstmrOrdr",
    "imgCaptrdSgntr",
    "prtctdCaptrdSgntr",
    "mrchntOvrrdFlg",
    "cstmrLang",
    "onlnFlg"
})
public class RetailerPaymentResult1 {

    @XmlElement(name = "TxTp", required = true)
    @XmlSchemaType(name = "string")
    protected CardPaymentServiceType12Code txTp;
    @XmlElement(name = "AddtlSvc")
    @XmlSchemaType(name = "string")
    protected List<CardPaymentServiceType9Code> addtlSvc;
    @XmlElement(name = "SvcAttr")
    @XmlSchemaType(name = "string")
    protected CardPaymentServiceType3Code svcAttr;
    @XmlElement(name = "ReqdTx")
    protected CardPaymentTransaction91 reqdTx;
    @XmlElement(name = "TxRspn")
    protected CardPaymentTransaction84 txRspn;
    @XmlElement(name = "CstmrOrdr")
    protected List<CustomerOrder1> cstmrOrdr;
    @XmlElement(name = "ImgCaptrdSgntr")
    protected CapturedSignature1 imgCaptrdSgntr;
    @XmlElement(name = "PrtctdCaptrdSgntr")
    protected ContentInformationType17 prtctdCaptrdSgntr;
    @XmlElement(name = "MrchntOvrrdFlg")
    protected Boolean mrchntOvrrdFlg;
    @XmlElement(name = "CstmrLang")
    protected String cstmrLang;
    @XmlElement(name = "OnlnFlg")
    protected Boolean onlnFlg;

    /**
     * Gets the value of the txTp property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentServiceType12Code }
     *     
     */
    public CardPaymentServiceType12Code getTxTp() {
        return txTp;
    }

    /**
     * Sets the value of the txTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentServiceType12Code }
     *     
     */
    public RetailerPaymentResult1 setTxTp(CardPaymentServiceType12Code value) {
        this.txTp = value;
        return this;
    }

    /**
     * Gets the value of the addtlSvc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlSvc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlSvc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardPaymentServiceType9Code }
     * 
     * 
     * @return
     *     The value of the addtlSvc property.
     */
    public List<CardPaymentServiceType9Code> getAddtlSvc() {
        if (addtlSvc == null) {
            addtlSvc = new ArrayList<>();
        }
        return this.addtlSvc;
    }

    /**
     * Gets the value of the svcAttr property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentServiceType3Code }
     *     
     */
    public CardPaymentServiceType3Code getSvcAttr() {
        return svcAttr;
    }

    /**
     * Sets the value of the svcAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentServiceType3Code }
     *     
     */
    public RetailerPaymentResult1 setSvcAttr(CardPaymentServiceType3Code value) {
        this.svcAttr = value;
        return this;
    }

    /**
     * Gets the value of the reqdTx property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransaction91 }
     *     
     */
    public CardPaymentTransaction91 getReqdTx() {
        return reqdTx;
    }

    /**
     * Sets the value of the reqdTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransaction91 }
     *     
     */
    public RetailerPaymentResult1 setReqdTx(CardPaymentTransaction91 value) {
        this.reqdTx = value;
        return this;
    }

    /**
     * Gets the value of the txRspn property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransaction84 }
     *     
     */
    public CardPaymentTransaction84 getTxRspn() {
        return txRspn;
    }

    /**
     * Sets the value of the txRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransaction84 }
     *     
     */
    public RetailerPaymentResult1 setTxRspn(CardPaymentTransaction84 value) {
        this.txRspn = value;
        return this;
    }

    /**
     * Gets the value of the cstmrOrdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cstmrOrdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCstmrOrdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerOrder1 }
     * 
     * 
     * @return
     *     The value of the cstmrOrdr property.
     */
    public List<CustomerOrder1> getCstmrOrdr() {
        if (cstmrOrdr == null) {
            cstmrOrdr = new ArrayList<>();
        }
        return this.cstmrOrdr;
    }

    /**
     * Gets the value of the imgCaptrdSgntr property.
     * 
     * @return
     *     possible object is
     *     {@link CapturedSignature1 }
     *     
     */
    public CapturedSignature1 getImgCaptrdSgntr() {
        return imgCaptrdSgntr;
    }

    /**
     * Sets the value of the imgCaptrdSgntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapturedSignature1 }
     *     
     */
    public RetailerPaymentResult1 setImgCaptrdSgntr(CapturedSignature1 value) {
        this.imgCaptrdSgntr = value;
        return this;
    }

    /**
     * Gets the value of the prtctdCaptrdSgntr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType17 }
     *     
     */
    public ContentInformationType17 getPrtctdCaptrdSgntr() {
        return prtctdCaptrdSgntr;
    }

    /**
     * Sets the value of the prtctdCaptrdSgntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType17 }
     *     
     */
    public RetailerPaymentResult1 setPrtctdCaptrdSgntr(ContentInformationType17 value) {
        this.prtctdCaptrdSgntr = value;
        return this;
    }

    /**
     * Gets the value of the mrchntOvrrdFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMrchntOvrrdFlg() {
        return mrchntOvrrdFlg;
    }

    /**
     * Sets the value of the mrchntOvrrdFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public RetailerPaymentResult1 setMrchntOvrrdFlg(Boolean value) {
        this.mrchntOvrrdFlg = value;
        return this;
    }

    /**
     * Gets the value of the cstmrLang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstmrLang() {
        return cstmrLang;
    }

    /**
     * Sets the value of the cstmrLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RetailerPaymentResult1 setCstmrLang(String value) {
        this.cstmrLang = value;
        return this;
    }

    /**
     * Gets the value of the onlnFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnlnFlg() {
        return onlnFlg;
    }

    /**
     * Sets the value of the onlnFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public RetailerPaymentResult1 setOnlnFlg(Boolean value) {
        this.onlnFlg = value;
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
     * Adds a new item to the addtlSvc list.
     * @see #getAddtlSvc()
     * 
     */
    public RetailerPaymentResult1 addAddtlSvc(CardPaymentServiceType9Code addtlSvc) {
        getAddtlSvc().add(addtlSvc);
        return this;
    }

    /**
     * Adds a new item to the cstmrOrdr list.
     * @see #getCstmrOrdr()
     * 
     */
    public RetailerPaymentResult1 addCstmrOrdr(CustomerOrder1 cstmrOrdr) {
        getCstmrOrdr().add(cstmrOrdr);
        return this;
    }

}
