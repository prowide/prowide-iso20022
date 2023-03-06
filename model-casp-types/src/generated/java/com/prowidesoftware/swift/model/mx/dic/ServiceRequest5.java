
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
 * This component defines the service to be called.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceRequest5", propOrder = {
    "envt",
    "cntxt",
    "svcCntt",
    "pmtReq",
    "rvslReq",
    "balNqryReq",
    "lltyReq",
    "stordValReq",
    "btchReq",
    "nblSvcReq",
    "cardAcqstnReq",
    "splmtryData"
})
public class ServiceRequest5 {

    @XmlElement(name = "Envt", required = true)
    protected CardPaymentEnvironment78 envt;
    @XmlElement(name = "Cntxt", required = true)
    protected CardPaymentContext29 cntxt;
    @XmlElement(name = "SvcCntt", required = true)
    @XmlSchemaType(name = "string")
    protected RetailerService2Code svcCntt;
    @XmlElement(name = "PmtReq")
    protected PaymentRequest4 pmtReq;
    @XmlElement(name = "RvslReq")
    protected ReversalRequest4 rvslReq;
    @XmlElement(name = "BalNqryReq")
    protected BalanceInquiryRequest5 balNqryReq;
    @XmlElement(name = "LltyReq")
    protected LoyaltyRequest4 lltyReq;
    @XmlElement(name = "StordValReq")
    protected StoredValueRequest5 stordValReq;
    @XmlElement(name = "BtchReq")
    protected BatchRequest4 btchReq;
    @XmlElement(name = "NblSvcReq")
    protected EnableServiceRequest4 nblSvcReq;
    @XmlElement(name = "CardAcqstnReq")
    protected CardAcquisitionRequest3 cardAcqstnReq;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentEnvironment78 }
     *     
     */
    public CardPaymentEnvironment78 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentEnvironment78 }
     *     
     */
    public ServiceRequest5 setEnvt(CardPaymentEnvironment78 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the cntxt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentContext29 }
     *     
     */
    public CardPaymentContext29 getCntxt() {
        return cntxt;
    }

    /**
     * Sets the value of the cntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentContext29 }
     *     
     */
    public ServiceRequest5 setCntxt(CardPaymentContext29 value) {
        this.cntxt = value;
        return this;
    }

    /**
     * Gets the value of the svcCntt property.
     * 
     * @return
     *     possible object is
     *     {@link RetailerService2Code }
     *     
     */
    public RetailerService2Code getSvcCntt() {
        return svcCntt;
    }

    /**
     * Sets the value of the svcCntt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailerService2Code }
     *     
     */
    public ServiceRequest5 setSvcCntt(RetailerService2Code value) {
        this.svcCntt = value;
        return this;
    }

    /**
     * Gets the value of the pmtReq property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentRequest4 }
     *     
     */
    public PaymentRequest4 getPmtReq() {
        return pmtReq;
    }

    /**
     * Sets the value of the pmtReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentRequest4 }
     *     
     */
    public ServiceRequest5 setPmtReq(PaymentRequest4 value) {
        this.pmtReq = value;
        return this;
    }

    /**
     * Gets the value of the rvslReq property.
     * 
     * @return
     *     possible object is
     *     {@link ReversalRequest4 }
     *     
     */
    public ReversalRequest4 getRvslReq() {
        return rvslReq;
    }

    /**
     * Sets the value of the rvslReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReversalRequest4 }
     *     
     */
    public ServiceRequest5 setRvslReq(ReversalRequest4 value) {
        this.rvslReq = value;
        return this;
    }

    /**
     * Gets the value of the balNqryReq property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceInquiryRequest5 }
     *     
     */
    public BalanceInquiryRequest5 getBalNqryReq() {
        return balNqryReq;
    }

    /**
     * Sets the value of the balNqryReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceInquiryRequest5 }
     *     
     */
    public ServiceRequest5 setBalNqryReq(BalanceInquiryRequest5 value) {
        this.balNqryReq = value;
        return this;
    }

    /**
     * Gets the value of the lltyReq property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyRequest4 }
     *     
     */
    public LoyaltyRequest4 getLltyReq() {
        return lltyReq;
    }

    /**
     * Sets the value of the lltyReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyRequest4 }
     *     
     */
    public ServiceRequest5 setLltyReq(LoyaltyRequest4 value) {
        this.lltyReq = value;
        return this;
    }

    /**
     * Gets the value of the stordValReq property.
     * 
     * @return
     *     possible object is
     *     {@link StoredValueRequest5 }
     *     
     */
    public StoredValueRequest5 getStordValReq() {
        return stordValReq;
    }

    /**
     * Sets the value of the stordValReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoredValueRequest5 }
     *     
     */
    public ServiceRequest5 setStordValReq(StoredValueRequest5 value) {
        this.stordValReq = value;
        return this;
    }

    /**
     * Gets the value of the btchReq property.
     * 
     * @return
     *     possible object is
     *     {@link BatchRequest4 }
     *     
     */
    public BatchRequest4 getBtchReq() {
        return btchReq;
    }

    /**
     * Sets the value of the btchReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchRequest4 }
     *     
     */
    public ServiceRequest5 setBtchReq(BatchRequest4 value) {
        this.btchReq = value;
        return this;
    }

    /**
     * Gets the value of the nblSvcReq property.
     * 
     * @return
     *     possible object is
     *     {@link EnableServiceRequest4 }
     *     
     */
    public EnableServiceRequest4 getNblSvcReq() {
        return nblSvcReq;
    }

    /**
     * Sets the value of the nblSvcReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnableServiceRequest4 }
     *     
     */
    public ServiceRequest5 setNblSvcReq(EnableServiceRequest4 value) {
        this.nblSvcReq = value;
        return this;
    }

    /**
     * Gets the value of the cardAcqstnReq property.
     * 
     * @return
     *     possible object is
     *     {@link CardAcquisitionRequest3 }
     *     
     */
    public CardAcquisitionRequest3 getCardAcqstnReq() {
        return cardAcqstnReq;
    }

    /**
     * Sets the value of the cardAcqstnReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAcquisitionRequest3 }
     *     
     */
    public ServiceRequest5 setCardAcqstnReq(CardAcquisitionRequest3 value) {
        this.cardAcqstnReq = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
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
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public ServiceRequest5 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
