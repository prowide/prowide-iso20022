
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
 * Defines the service to be called.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceRequest6", propOrder = {
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
public class ServiceRequest6 {

    @XmlElement(name = "Envt", required = true)
    protected CardPaymentEnvironment79 envt;
    @XmlElement(name = "Cntxt", required = true)
    protected CardPaymentContext30 cntxt;
    @XmlElement(name = "SvcCntt", required = true)
    @XmlSchemaType(name = "string")
    protected RetailerService2Code svcCntt;
    @XmlElement(name = "PmtReq")
    protected PaymentRequest5 pmtReq;
    @XmlElement(name = "RvslReq")
    protected ReversalRequest5 rvslReq;
    @XmlElement(name = "BalNqryReq")
    protected BalanceInquiryRequest6 balNqryReq;
    @XmlElement(name = "LltyReq")
    protected LoyaltyRequest5 lltyReq;
    @XmlElement(name = "StordValReq")
    protected StoredValueRequest6 stordValReq;
    @XmlElement(name = "BtchReq")
    protected BatchRequest5 btchReq;
    @XmlElement(name = "NblSvcReq")
    protected EnableServiceRequest5 nblSvcReq;
    @XmlElement(name = "CardAcqstnReq")
    protected CardAcquisitionRequest3 cardAcqstnReq;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentEnvironment79 }
     *     
     */
    public CardPaymentEnvironment79 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentEnvironment79 }
     *     
     */
    public ServiceRequest6 setEnvt(CardPaymentEnvironment79 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the cntxt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentContext30 }
     *     
     */
    public CardPaymentContext30 getCntxt() {
        return cntxt;
    }

    /**
     * Sets the value of the cntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentContext30 }
     *     
     */
    public ServiceRequest6 setCntxt(CardPaymentContext30 value) {
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
    public ServiceRequest6 setSvcCntt(RetailerService2Code value) {
        this.svcCntt = value;
        return this;
    }

    /**
     * Gets the value of the pmtReq property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentRequest5 }
     *     
     */
    public PaymentRequest5 getPmtReq() {
        return pmtReq;
    }

    /**
     * Sets the value of the pmtReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentRequest5 }
     *     
     */
    public ServiceRequest6 setPmtReq(PaymentRequest5 value) {
        this.pmtReq = value;
        return this;
    }

    /**
     * Gets the value of the rvslReq property.
     * 
     * @return
     *     possible object is
     *     {@link ReversalRequest5 }
     *     
     */
    public ReversalRequest5 getRvslReq() {
        return rvslReq;
    }

    /**
     * Sets the value of the rvslReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReversalRequest5 }
     *     
     */
    public ServiceRequest6 setRvslReq(ReversalRequest5 value) {
        this.rvslReq = value;
        return this;
    }

    /**
     * Gets the value of the balNqryReq property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceInquiryRequest6 }
     *     
     */
    public BalanceInquiryRequest6 getBalNqryReq() {
        return balNqryReq;
    }

    /**
     * Sets the value of the balNqryReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceInquiryRequest6 }
     *     
     */
    public ServiceRequest6 setBalNqryReq(BalanceInquiryRequest6 value) {
        this.balNqryReq = value;
        return this;
    }

    /**
     * Gets the value of the lltyReq property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyRequest5 }
     *     
     */
    public LoyaltyRequest5 getLltyReq() {
        return lltyReq;
    }

    /**
     * Sets the value of the lltyReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyRequest5 }
     *     
     */
    public ServiceRequest6 setLltyReq(LoyaltyRequest5 value) {
        this.lltyReq = value;
        return this;
    }

    /**
     * Gets the value of the stordValReq property.
     * 
     * @return
     *     possible object is
     *     {@link StoredValueRequest6 }
     *     
     */
    public StoredValueRequest6 getStordValReq() {
        return stordValReq;
    }

    /**
     * Sets the value of the stordValReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoredValueRequest6 }
     *     
     */
    public ServiceRequest6 setStordValReq(StoredValueRequest6 value) {
        this.stordValReq = value;
        return this;
    }

    /**
     * Gets the value of the btchReq property.
     * 
     * @return
     *     possible object is
     *     {@link BatchRequest5 }
     *     
     */
    public BatchRequest5 getBtchReq() {
        return btchReq;
    }

    /**
     * Sets the value of the btchReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchRequest5 }
     *     
     */
    public ServiceRequest6 setBtchReq(BatchRequest5 value) {
        this.btchReq = value;
        return this;
    }

    /**
     * Gets the value of the nblSvcReq property.
     * 
     * @return
     *     possible object is
     *     {@link EnableServiceRequest5 }
     *     
     */
    public EnableServiceRequest5 getNblSvcReq() {
        return nblSvcReq;
    }

    /**
     * Sets the value of the nblSvcReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnableServiceRequest5 }
     *     
     */
    public ServiceRequest6 setNblSvcReq(EnableServiceRequest5 value) {
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
    public ServiceRequest6 setCardAcqstnReq(CardAcquisitionRequest3 value) {
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
    public ServiceRequest6 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
