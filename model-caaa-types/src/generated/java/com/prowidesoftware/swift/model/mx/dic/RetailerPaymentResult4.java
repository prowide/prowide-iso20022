
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
 * Payment Data Results.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetailerPaymentResult4", propOrder = {
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
public class RetailerPaymentResult4 {

    @XmlElement(name = "TxTp", required = true)
    @XmlSchemaType(name = "string")
    protected CardPaymentServiceType12Code txTp;
    @XmlElement(name = "AddtlSvc")
    @XmlSchemaType(name = "string")
    protected List<CardPaymentServiceType9Code> addtlSvc;
    @XmlElement(name = "SvcAttr")
    @XmlSchemaType(name = "string")
    protected CardPaymentServiceType14Code svcAttr;
    @XmlElement(name = "ReqdTx")
    protected CardPaymentTransaction120 reqdTx;
    @XmlElement(name = "TxRspn")
    protected CardPaymentTransaction114 txRspn;
    @XmlElement(name = "CstmrOrdr")
    protected List<CustomerOrder1> cstmrOrdr;
    @XmlElement(name = "ImgCaptrdSgntr")
    protected CapturedSignature1 imgCaptrdSgntr;
    @XmlElement(name = "PrtctdCaptrdSgntr")
    protected ContentInformationType32 prtctdCaptrdSgntr;
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
    public RetailerPaymentResult4 setTxTp(CardPaymentServiceType12Code value) {
        this.txTp = value;
        return this;
    }

    /**
     * Gets the value of the addtlSvc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlSvc property.
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
     */
    public List<CardPaymentServiceType9Code> getAddtlSvc() {
        if (addtlSvc == null) {
            addtlSvc = new ArrayList<CardPaymentServiceType9Code>();
        }
        return this.addtlSvc;
    }

    /**
     * Gets the value of the svcAttr property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentServiceType14Code }
     *     
     */
    public CardPaymentServiceType14Code getSvcAttr() {
        return svcAttr;
    }

    /**
     * Sets the value of the svcAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentServiceType14Code }
     *     
     */
    public RetailerPaymentResult4 setSvcAttr(CardPaymentServiceType14Code value) {
        this.svcAttr = value;
        return this;
    }

    /**
     * Gets the value of the reqdTx property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransaction120 }
     *     
     */
    public CardPaymentTransaction120 getReqdTx() {
        return reqdTx;
    }

    /**
     * Sets the value of the reqdTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransaction120 }
     *     
     */
    public RetailerPaymentResult4 setReqdTx(CardPaymentTransaction120 value) {
        this.reqdTx = value;
        return this;
    }

    /**
     * Gets the value of the txRspn property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransaction114 }
     *     
     */
    public CardPaymentTransaction114 getTxRspn() {
        return txRspn;
    }

    /**
     * Sets the value of the txRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransaction114 }
     *     
     */
    public RetailerPaymentResult4 setTxRspn(CardPaymentTransaction114 value) {
        this.txRspn = value;
        return this;
    }

    /**
     * Gets the value of the cstmrOrdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cstmrOrdr property.
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
     */
    public List<CustomerOrder1> getCstmrOrdr() {
        if (cstmrOrdr == null) {
            cstmrOrdr = new ArrayList<CustomerOrder1>();
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
    public RetailerPaymentResult4 setImgCaptrdSgntr(CapturedSignature1 value) {
        this.imgCaptrdSgntr = value;
        return this;
    }

    /**
     * Gets the value of the prtctdCaptrdSgntr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType32 }
     *     
     */
    public ContentInformationType32 getPrtctdCaptrdSgntr() {
        return prtctdCaptrdSgntr;
    }

    /**
     * Sets the value of the prtctdCaptrdSgntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType32 }
     *     
     */
    public RetailerPaymentResult4 setPrtctdCaptrdSgntr(ContentInformationType32 value) {
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
    public RetailerPaymentResult4 setMrchntOvrrdFlg(Boolean value) {
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
    public RetailerPaymentResult4 setCstmrLang(String value) {
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
    public RetailerPaymentResult4 setOnlnFlg(Boolean value) {
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
    public RetailerPaymentResult4 addAddtlSvc(CardPaymentServiceType9Code addtlSvc) {
        getAddtlSvc().add(addtlSvc);
        return this;
    }

    /**
     * Adds a new item to the cstmrOrdr list.
     * @see #getCstmrOrdr()
     * 
     */
    public RetailerPaymentResult4 addCstmrOrdr(CustomerOrder1 cstmrOrdr) {
        getCstmrOrdr().add(cstmrOrdr);
        return this;
    }

}
