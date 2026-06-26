
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
@XmlType(name = "SwitchOrderStatusAndReason3", propOrder = {
    "mstrRef",
    "ordrRef",
    "clntRef",
    "dealRef",
    "nonceId",
    "cxlRef",
    "ordrSts",
    "legInf",
    "stsInitr",
    "ordrData",
    "newDtls"
})
public class SwitchOrderStatusAndReason3 {

    @XmlElement(name = "MstrRef")
    protected String mstrRef;
    @XmlElement(name = "OrdrRef", required = true)
    protected String ordrRef;
    @XmlElement(name = "ClntRef")
    protected String clntRef;
    @XmlElement(name = "DealRef")
    protected String dealRef;
    @XmlElement(name = "NonceId")
    protected String nonceId;
    @XmlElement(name = "CxlRef")
    protected String cxlRef;
    @XmlElement(name = "OrdrSts", required = true)
    protected OrderStatus7Choice ordrSts;
    @XmlElement(name = "LegInf")
    protected List<SwitchLegReferences3> legInf;
    @XmlElement(name = "StsInitr")
    protected PartyIdentification139 stsInitr;
    @XmlElement(name = "OrdrData")
    protected FundOrderData6 ordrData;
    @XmlElement(name = "NewDtls")
    protected ExpectedExecution6 newDtls;

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
    public SwitchOrderStatusAndReason3 setMstrRef(String value) {
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
    public SwitchOrderStatusAndReason3 setOrdrRef(String value) {
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
    public SwitchOrderStatusAndReason3 setClntRef(String value) {
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
    public SwitchOrderStatusAndReason3 setDealRef(String value) {
        this.dealRef = value;
        return this;
    }

    /**
     * Gets the value of the nonceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonceId() {
        return nonceId;
    }

    /**
     * Sets the value of the nonceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwitchOrderStatusAndReason3 setNonceId(String value) {
        this.nonceId = value;
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
    public SwitchOrderStatusAndReason3 setCxlRef(String value) {
        this.cxlRef = value;
        return this;
    }

    /**
     * Gets the value of the ordrSts property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatus7Choice }
     *     
     */
    public OrderStatus7Choice getOrdrSts() {
        return ordrSts;
    }

    /**
     * Sets the value of the ordrSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatus7Choice }
     *     
     */
    public SwitchOrderStatusAndReason3 setOrdrSts(OrderStatus7Choice value) {
        this.ordrSts = value;
        return this;
    }

    /**
     * Gets the value of the legInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the legInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwitchLegReferences3 }
     * 
     * 
     * @return
     *     The value of the legInf property.
     */
    public List<SwitchLegReferences3> getLegInf() {
        if (legInf == null) {
            legInf = new ArrayList<>();
        }
        return this.legInf;
    }

    /**
     * Gets the value of the stsInitr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification139 }
     *     
     */
    public PartyIdentification139 getStsInitr() {
        return stsInitr;
    }

    /**
     * Sets the value of the stsInitr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification139 }
     *     
     */
    public SwitchOrderStatusAndReason3 setStsInitr(PartyIdentification139 value) {
        this.stsInitr = value;
        return this;
    }

    /**
     * Gets the value of the ordrData property.
     * 
     * @return
     *     possible object is
     *     {@link FundOrderData6 }
     *     
     */
    public FundOrderData6 getOrdrData() {
        return ordrData;
    }

    /**
     * Sets the value of the ordrData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundOrderData6 }
     *     
     */
    public SwitchOrderStatusAndReason3 setOrdrData(FundOrderData6 value) {
        this.ordrData = value;
        return this;
    }

    /**
     * Gets the value of the newDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ExpectedExecution6 }
     *     
     */
    public ExpectedExecution6 getNewDtls() {
        return newDtls;
    }

    /**
     * Sets the value of the newDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpectedExecution6 }
     *     
     */
    public SwitchOrderStatusAndReason3 setNewDtls(ExpectedExecution6 value) {
        this.newDtls = value;
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
     * Adds a new item to the legInf list.
     * @see #getLegInf()
     * 
     */
    public SwitchOrderStatusAndReason3 addLegInf(SwitchLegReferences3 legInf) {
        getLegInf().add(legInf);
        return this;
    }

}
