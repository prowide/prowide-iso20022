
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
 * Status report of the individual orders of a bulk or multiple order that was previously received.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualOrderStatusAndReason7", propOrder = {
    "mstrRef",
    "ordrRef",
    "clntRef",
    "dealRef",
    "cxlRef",
    "ordrSts",
    "rprdFee",
    "stsInitr",
    "ordrData",
    "newDtls",
    "gtgOrHldBckDtls"
})
public class IndividualOrderStatusAndReason7 {

    @XmlElement(name = "MstrRef")
    protected String mstrRef;
    @XmlElement(name = "OrdrRef", required = true)
    protected String ordrRef;
    @XmlElement(name = "ClntRef")
    protected String clntRef;
    @XmlElement(name = "DealRef")
    protected String dealRef;
    @XmlElement(name = "CxlRef")
    protected String cxlRef;
    @XmlElement(name = "OrdrSts", required = true)
    protected OrderStatus5Choice ordrSts;
    @XmlElement(name = "RprdFee")
    protected List<Fee3> rprdFee;
    @XmlElement(name = "StsInitr")
    protected PartyIdentification113 stsInitr;
    @XmlElement(name = "OrdrData")
    protected FundOrderData5 ordrData;
    @XmlElement(name = "NewDtls")
    protected ExpectedExecutionDetails4 newDtls;
    @XmlElement(name = "GtgOrHldBckDtls")
    protected HoldBackInformation3 gtgOrHldBckDtls;

    /**
     * Gets the value of the mstrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMstrRef() {
        return mstrRef;
    }

    /**
     * Sets the value of the mstrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IndividualOrderStatusAndReason7 setMstrRef(String value) {
        this.mstrRef = value;
        return this;
    }

    /**
     * Gets the value of the ordrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdrRef() {
        return ordrRef;
    }

    /**
     * Sets the value of the ordrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IndividualOrderStatusAndReason7 setOrdrRef(String value) {
        this.ordrRef = value;
        return this;
    }

    /**
     * Gets the value of the clntRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntRef() {
        return clntRef;
    }

    /**
     * Sets the value of the clntRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IndividualOrderStatusAndReason7 setClntRef(String value) {
        this.clntRef = value;
        return this;
    }

    /**
     * Gets the value of the dealRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealRef() {
        return dealRef;
    }

    /**
     * Sets the value of the dealRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IndividualOrderStatusAndReason7 setDealRef(String value) {
        this.dealRef = value;
        return this;
    }

    /**
     * Gets the value of the cxlRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCxlRef() {
        return cxlRef;
    }

    /**
     * Sets the value of the cxlRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IndividualOrderStatusAndReason7 setCxlRef(String value) {
        this.cxlRef = value;
        return this;
    }

    /**
     * Gets the value of the ordrSts property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatus5Choice }
     *     
     */
    public OrderStatus5Choice getOrdrSts() {
        return ordrSts;
    }

    /**
     * Sets the value of the ordrSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatus5Choice }
     *     
     */
    public IndividualOrderStatusAndReason7 setOrdrSts(OrderStatus5Choice value) {
        this.ordrSts = value;
        return this;
    }

    /**
     * Gets the value of the rprdFee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rprdFee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRprdFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Fee3 }
     * 
     * 
     * @return
     *     The value of the rprdFee property.
     */
    public List<Fee3> getRprdFee() {
        if (rprdFee == null) {
            rprdFee = new ArrayList<>();
        }
        return this.rprdFee;
    }

    /**
     * Gets the value of the stsInitr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification113 }
     *     
     */
    public PartyIdentification113 getStsInitr() {
        return stsInitr;
    }

    /**
     * Sets the value of the stsInitr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification113 }
     *     
     */
    public IndividualOrderStatusAndReason7 setStsInitr(PartyIdentification113 value) {
        this.stsInitr = value;
        return this;
    }

    /**
     * Gets the value of the ordrData property.
     * 
     * @return
     *     possible object is
     *     {@link FundOrderData5 }
     *     
     */
    public FundOrderData5 getOrdrData() {
        return ordrData;
    }

    /**
     * Sets the value of the ordrData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundOrderData5 }
     *     
     */
    public IndividualOrderStatusAndReason7 setOrdrData(FundOrderData5 value) {
        this.ordrData = value;
        return this;
    }

    /**
     * Gets the value of the newDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ExpectedExecutionDetails4 }
     *     
     */
    public ExpectedExecutionDetails4 getNewDtls() {
        return newDtls;
    }

    /**
     * Sets the value of the newDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpectedExecutionDetails4 }
     *     
     */
    public IndividualOrderStatusAndReason7 setNewDtls(ExpectedExecutionDetails4 value) {
        this.newDtls = value;
        return this;
    }

    /**
     * Gets the value of the gtgOrHldBckDtls property.
     * 
     * @return
     *     possible object is
     *     {@link HoldBackInformation3 }
     *     
     */
    public HoldBackInformation3 getGtgOrHldBckDtls() {
        return gtgOrHldBckDtls;
    }

    /**
     * Sets the value of the gtgOrHldBckDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link HoldBackInformation3 }
     *     
     */
    public IndividualOrderStatusAndReason7 setGtgOrHldBckDtls(HoldBackInformation3 value) {
        this.gtgOrHldBckDtls = value;
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
     * Adds a new item to the rprdFee list.
     * @see #getRprdFee()
     * 
     */
    public IndividualOrderStatusAndReason7 addRprdFee(Fee3 rprdFee) {
        getRprdFee().add(rprdFee);
        return this;
    }

}
