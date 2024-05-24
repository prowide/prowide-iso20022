
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
 * This component contains the response of the corresponding service request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceResponse2", propOrder = {
    "envt",
    "cntxt",
    "svcCntt",
    "pmtRspn",
    "rvslRspn",
    "balNqryRspn",
    "lltyRspn",
    "stordValRspn",
    "btchRspn",
    "cardAcqstnRspn",
    "rspn",
    "splmtryData"
})
public class ServiceResponse2 {

    @XmlElement(name = "Envt", required = true)
    protected CardPaymentEnvironment73 envt;
    @XmlElement(name = "Cntxt", required = true)
    protected CardPaymentContext27 cntxt;
    @XmlElement(name = "SvcCntt", required = true)
    @XmlSchemaType(name = "string")
    protected RetailerService3Code svcCntt;
    @XmlElement(name = "PmtRspn")
    protected PaymentResponse1 pmtRspn;
    @XmlElement(name = "RvslRspn")
    protected ReversalResponse1 rvslRspn;
    @XmlElement(name = "BalNqryRspn")
    protected BalanceInquiryResponse1 balNqryRspn;
    @XmlElement(name = "LltyRspn")
    protected LoyaltyResponse1 lltyRspn;
    @XmlElement(name = "StordValRspn")
    protected StoredValueResponse2 stordValRspn;
    @XmlElement(name = "BtchRspn")
    protected BatchResponse1 btchRspn;
    @XmlElement(name = "CardAcqstnRspn")
    protected CardAcquisitionResponse1 cardAcqstnRspn;
    @XmlElement(name = "Rspn", required = true)
    protected ResponseType9 rspn;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentEnvironment73 }
     *     
     */
    public CardPaymentEnvironment73 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentEnvironment73 }
     *     
     */
    public ServiceResponse2 setEnvt(CardPaymentEnvironment73 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the cntxt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentContext27 }
     *     
     */
    public CardPaymentContext27 getCntxt() {
        return cntxt;
    }

    /**
     * Sets the value of the cntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentContext27 }
     *     
     */
    public ServiceResponse2 setCntxt(CardPaymentContext27 value) {
        this.cntxt = value;
        return this;
    }

    /**
     * Gets the value of the svcCntt property.
     * 
     * @return
     *     possible object is
     *     {@link RetailerService3Code }
     *     
     */
    public RetailerService3Code getSvcCntt() {
        return svcCntt;
    }

    /**
     * Sets the value of the svcCntt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailerService3Code }
     *     
     */
    public ServiceResponse2 setSvcCntt(RetailerService3Code value) {
        this.svcCntt = value;
        return this;
    }

    /**
     * Gets the value of the pmtRspn property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentResponse1 }
     *     
     */
    public PaymentResponse1 getPmtRspn() {
        return pmtRspn;
    }

    /**
     * Sets the value of the pmtRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentResponse1 }
     *     
     */
    public ServiceResponse2 setPmtRspn(PaymentResponse1 value) {
        this.pmtRspn = value;
        return this;
    }

    /**
     * Gets the value of the rvslRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ReversalResponse1 }
     *     
     */
    public ReversalResponse1 getRvslRspn() {
        return rvslRspn;
    }

    /**
     * Sets the value of the rvslRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReversalResponse1 }
     *     
     */
    public ServiceResponse2 setRvslRspn(ReversalResponse1 value) {
        this.rvslRspn = value;
        return this;
    }

    /**
     * Gets the value of the balNqryRspn property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceInquiryResponse1 }
     *     
     */
    public BalanceInquiryResponse1 getBalNqryRspn() {
        return balNqryRspn;
    }

    /**
     * Sets the value of the balNqryRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceInquiryResponse1 }
     *     
     */
    public ServiceResponse2 setBalNqryRspn(BalanceInquiryResponse1 value) {
        this.balNqryRspn = value;
        return this;
    }

    /**
     * Gets the value of the lltyRspn property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyResponse1 }
     *     
     */
    public LoyaltyResponse1 getLltyRspn() {
        return lltyRspn;
    }

    /**
     * Sets the value of the lltyRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyResponse1 }
     *     
     */
    public ServiceResponse2 setLltyRspn(LoyaltyResponse1 value) {
        this.lltyRspn = value;
        return this;
    }

    /**
     * Gets the value of the stordValRspn property.
     * 
     * @return
     *     possible object is
     *     {@link StoredValueResponse2 }
     *     
     */
    public StoredValueResponse2 getStordValRspn() {
        return stordValRspn;
    }

    /**
     * Sets the value of the stordValRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoredValueResponse2 }
     *     
     */
    public ServiceResponse2 setStordValRspn(StoredValueResponse2 value) {
        this.stordValRspn = value;
        return this;
    }

    /**
     * Gets the value of the btchRspn property.
     * 
     * @return
     *     possible object is
     *     {@link BatchResponse1 }
     *     
     */
    public BatchResponse1 getBtchRspn() {
        return btchRspn;
    }

    /**
     * Sets the value of the btchRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchResponse1 }
     *     
     */
    public ServiceResponse2 setBtchRspn(BatchResponse1 value) {
        this.btchRspn = value;
        return this;
    }

    /**
     * Gets the value of the cardAcqstnRspn property.
     * 
     * @return
     *     possible object is
     *     {@link CardAcquisitionResponse1 }
     *     
     */
    public CardAcquisitionResponse1 getCardAcqstnRspn() {
        return cardAcqstnRspn;
    }

    /**
     * Sets the value of the cardAcqstnRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAcquisitionResponse1 }
     *     
     */
    public ServiceResponse2 setCardAcqstnRspn(CardAcquisitionResponse1 value) {
        this.cardAcqstnRspn = value;
        return this;
    }

    /**
     * Gets the value of the rspn property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType9 }
     *     
     */
    public ResponseType9 getRspn() {
        return rspn;
    }

    /**
     * Sets the value of the rspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType9 }
     *     
     */
    public ServiceResponse2 setRspn(ResponseType9 value) {
        this.rspn = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
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
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
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
    public ServiceResponse2 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
