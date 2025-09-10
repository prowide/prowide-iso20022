
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
 * Data related to the result of a processed payment transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetailerPaymentResult7", propOrder = {
    "pmtInstrm",
    "pmtTpInf",
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
public class RetailerPaymentResult7 {

    @XmlElement(name = "PmtInstrm")
    @XmlSchemaType(name = "string")
    protected List<PaymentInstrumentType2Code> pmtInstrm;
    @XmlElement(name = "PmtTpInf")
    protected PaymentTypeInformation26 pmtTpInf;
    @XmlElement(name = "TxTp", required = true)
    @XmlSchemaType(name = "string")
    protected CardPaymentServiceType12Code txTp;
    @XmlElement(name = "AddtlSvc")
    @XmlSchemaType(name = "string")
    protected List<CardPaymentServiceType9Code> addtlSvc;
    @XmlElement(name = "SvcAttr")
    @XmlSchemaType(name = "string")
    protected CardPaymentServiceType15Code svcAttr;
    @XmlElement(name = "ReqdTx")
    protected PaymentTransaction165 reqdTx;
    @XmlElement(name = "TxRspn")
    protected CardPaymentTransaction144 txRspn;
    @XmlElement(name = "CstmrOrdr")
    protected List<CustomerOrder1> cstmrOrdr;
    @XmlElement(name = "ImgCaptrdSgntr")
    protected CapturedSignature1 imgCaptrdSgntr;
    @XmlElement(name = "PrtctdCaptrdSgntr")
    protected ContentInformationType40 prtctdCaptrdSgntr;
    @XmlElement(name = "MrchntOvrrdFlg")
    protected Boolean mrchntOvrrdFlg;
    @XmlElement(name = "CstmrLang")
    protected String cstmrLang;
    @XmlElement(name = "OnlnFlg")
    protected Boolean onlnFlg;

    /**
     * Gets the value of the pmtInstrm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pmtInstrm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtInstrm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentInstrumentType2Code }
     * 
     * 
     * @return
     *     The value of the pmtInstrm property.
     */
    public List<PaymentInstrumentType2Code> getPmtInstrm() {
        if (pmtInstrm == null) {
            pmtInstrm = new ArrayList<>();
        }
        return this.pmtInstrm;
    }

    /**
     * Gets the value of the pmtTpInf property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTypeInformation26 }
     *     
     */
    public PaymentTypeInformation26 getPmtTpInf() {
        return pmtTpInf;
    }

    /**
     * Sets the value of the pmtTpInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTypeInformation26 }
     *     
     */
    public RetailerPaymentResult7 setPmtTpInf(PaymentTypeInformation26 value) {
        this.pmtTpInf = value;
        return this;
    }

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
    public RetailerPaymentResult7 setTxTp(CardPaymentServiceType12Code value) {
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
     *     {@link CardPaymentServiceType15Code }
     *     
     */
    public CardPaymentServiceType15Code getSvcAttr() {
        return svcAttr;
    }

    /**
     * Sets the value of the svcAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentServiceType15Code }
     *     
     */
    public RetailerPaymentResult7 setSvcAttr(CardPaymentServiceType15Code value) {
        this.svcAttr = value;
        return this;
    }

    /**
     * Gets the value of the reqdTx property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTransaction165 }
     *     
     */
    public PaymentTransaction165 getReqdTx() {
        return reqdTx;
    }

    /**
     * Sets the value of the reqdTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTransaction165 }
     *     
     */
    public RetailerPaymentResult7 setReqdTx(PaymentTransaction165 value) {
        this.reqdTx = value;
        return this;
    }

    /**
     * Gets the value of the txRspn property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransaction144 }
     *     
     */
    public CardPaymentTransaction144 getTxRspn() {
        return txRspn;
    }

    /**
     * Sets the value of the txRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransaction144 }
     *     
     */
    public RetailerPaymentResult7 setTxRspn(CardPaymentTransaction144 value) {
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
    public RetailerPaymentResult7 setImgCaptrdSgntr(CapturedSignature1 value) {
        this.imgCaptrdSgntr = value;
        return this;
    }

    /**
     * Gets the value of the prtctdCaptrdSgntr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType40 }
     *     
     */
    public ContentInformationType40 getPrtctdCaptrdSgntr() {
        return prtctdCaptrdSgntr;
    }

    /**
     * Sets the value of the prtctdCaptrdSgntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType40 }
     *     
     */
    public RetailerPaymentResult7 setPrtctdCaptrdSgntr(ContentInformationType40 value) {
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
    public RetailerPaymentResult7 setMrchntOvrrdFlg(Boolean value) {
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
    public RetailerPaymentResult7 setCstmrLang(String value) {
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
    public RetailerPaymentResult7 setOnlnFlg(Boolean value) {
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
     * Adds a new item to the pmtInstrm list.
     * @see #getPmtInstrm()
     * 
     */
    public RetailerPaymentResult7 addPmtInstrm(PaymentInstrumentType2Code pmtInstrm) {
        getPmtInstrm().add(pmtInstrm);
        return this;
    }

    /**
     * Adds a new item to the addtlSvc list.
     * @see #getAddtlSvc()
     * 
     */
    public RetailerPaymentResult7 addAddtlSvc(CardPaymentServiceType9Code addtlSvc) {
        getAddtlSvc().add(addtlSvc);
        return this;
    }

    /**
     * Adds a new item to the cstmrOrdr list.
     * @see #getCstmrOrdr()
     * 
     */
    public RetailerPaymentResult7 addCstmrOrdr(CustomerOrder1 cstmrOrdr) {
        getCstmrOrdr().add(cstmrOrdr);
        return this;
    }

}
