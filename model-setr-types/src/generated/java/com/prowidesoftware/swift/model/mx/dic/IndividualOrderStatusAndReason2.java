
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
 * Status report of the individual orders of a bulk or multiple order that was previously received.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualOrderStatusAndReason2", propOrder = {
    "mstrRef",
    "ordrRef",
    "clntRef",
    "dealRef",
    "cxlRef",
    "sts",
    "canc",
    "condlyAccptd",
    "rjctd",
    "sspd",
    "inRpr",
    "prtlySttld",
    "rprdConds",
    "stsInitr",
    "ordrData",
    "newDtls"
})
public class IndividualOrderStatusAndReason2 {

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
    @XmlElement(name = "Sts")
    @XmlSchemaType(name = "string")
    protected OrderStatus4Code sts;
    @XmlElement(name = "Canc")
    protected CancelledStatus2 canc;
    @XmlElement(name = "CondlyAccptd")
    protected ConditionallyAcceptedStatus2 condlyAccptd;
    @XmlElement(name = "Rjctd")
    protected List<RejectedStatus6> rjctd;
    @XmlElement(name = "Sspd")
    protected SuspendedStatus2 sspd;
    @XmlElement(name = "InRpr")
    protected InRepairStatus2 inRpr;
    @XmlElement(name = "PrtlySttld")
    protected PartiallySettledStatus1 prtlySttld;
    @XmlElement(name = "RprdConds")
    protected RepairedConditions3 rprdConds;
    @XmlElement(name = "StsInitr")
    protected PartyIdentification2Choice stsInitr;
    @XmlElement(name = "OrdrData")
    protected FundOrderData1 ordrData;
    @XmlElement(name = "NewDtls")
    protected ExpectedExecutionDetails2 newDtls;

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
    public IndividualOrderStatusAndReason2 setMstrRef(String value) {
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
    public IndividualOrderStatusAndReason2 setOrdrRef(String value) {
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
    public IndividualOrderStatusAndReason2 setClntRef(String value) {
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
    public IndividualOrderStatusAndReason2 setDealRef(String value) {
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
    public IndividualOrderStatusAndReason2 setCxlRef(String value) {
        this.cxlRef = value;
        return this;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatus4Code }
     *     
     */
    public OrderStatus4Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatus4Code }
     *     
     */
    public IndividualOrderStatusAndReason2 setSts(OrderStatus4Code value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the canc property.
     * 
     * @return
     *     possible object is
     *     {@link CancelledStatus2 }
     *     
     */
    public CancelledStatus2 getCanc() {
        return canc;
    }

    /**
     * Sets the value of the canc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelledStatus2 }
     *     
     */
    public IndividualOrderStatusAndReason2 setCanc(CancelledStatus2 value) {
        this.canc = value;
        return this;
    }

    /**
     * Gets the value of the condlyAccptd property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionallyAcceptedStatus2 }
     *     
     */
    public ConditionallyAcceptedStatus2 getCondlyAccptd() {
        return condlyAccptd;
    }

    /**
     * Sets the value of the condlyAccptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionallyAcceptedStatus2 }
     *     
     */
    public IndividualOrderStatusAndReason2 setCondlyAccptd(ConditionallyAcceptedStatus2 value) {
        this.condlyAccptd = value;
        return this;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rjctd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRjctd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RejectedStatus6 }
     * 
     * 
     */
    public List<RejectedStatus6> getRjctd() {
        if (rjctd == null) {
            rjctd = new ArrayList<RejectedStatus6>();
        }
        return this.rjctd;
    }

    /**
     * Gets the value of the sspd property.
     * 
     * @return
     *     possible object is
     *     {@link SuspendedStatus2 }
     *     
     */
    public SuspendedStatus2 getSspd() {
        return sspd;
    }

    /**
     * Sets the value of the sspd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuspendedStatus2 }
     *     
     */
    public IndividualOrderStatusAndReason2 setSspd(SuspendedStatus2 value) {
        this.sspd = value;
        return this;
    }

    /**
     * Gets the value of the inRpr property.
     * 
     * @return
     *     possible object is
     *     {@link InRepairStatus2 }
     *     
     */
    public InRepairStatus2 getInRpr() {
        return inRpr;
    }

    /**
     * Sets the value of the inRpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InRepairStatus2 }
     *     
     */
    public IndividualOrderStatusAndReason2 setInRpr(InRepairStatus2 value) {
        this.inRpr = value;
        return this;
    }

    /**
     * Gets the value of the prtlySttld property.
     * 
     * @return
     *     possible object is
     *     {@link PartiallySettledStatus1 }
     *     
     */
    public PartiallySettledStatus1 getPrtlySttld() {
        return prtlySttld;
    }

    /**
     * Sets the value of the prtlySttld property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartiallySettledStatus1 }
     *     
     */
    public IndividualOrderStatusAndReason2 setPrtlySttld(PartiallySettledStatus1 value) {
        this.prtlySttld = value;
        return this;
    }

    /**
     * Gets the value of the rprdConds property.
     * 
     * @return
     *     possible object is
     *     {@link RepairedConditions3 }
     *     
     */
    public RepairedConditions3 getRprdConds() {
        return rprdConds;
    }

    /**
     * Sets the value of the rprdConds property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepairedConditions3 }
     *     
     */
    public IndividualOrderStatusAndReason2 setRprdConds(RepairedConditions3 value) {
        this.rprdConds = value;
        return this;
    }

    /**
     * Gets the value of the stsInitr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getStsInitr() {
        return stsInitr;
    }

    /**
     * Sets the value of the stsInitr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public IndividualOrderStatusAndReason2 setStsInitr(PartyIdentification2Choice value) {
        this.stsInitr = value;
        return this;
    }

    /**
     * Gets the value of the ordrData property.
     * 
     * @return
     *     possible object is
     *     {@link FundOrderData1 }
     *     
     */
    public FundOrderData1 getOrdrData() {
        return ordrData;
    }

    /**
     * Sets the value of the ordrData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundOrderData1 }
     *     
     */
    public IndividualOrderStatusAndReason2 setOrdrData(FundOrderData1 value) {
        this.ordrData = value;
        return this;
    }

    /**
     * Gets the value of the newDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ExpectedExecutionDetails2 }
     *     
     */
    public ExpectedExecutionDetails2 getNewDtls() {
        return newDtls;
    }

    /**
     * Sets the value of the newDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpectedExecutionDetails2 }
     *     
     */
    public IndividualOrderStatusAndReason2 setNewDtls(ExpectedExecutionDetails2 value) {
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
     * Adds a new item to the rjctd list.
     * @see #getRjctd()
     * 
     */
    public IndividualOrderStatusAndReason2 addRjctd(RejectedStatus6 rjctd) {
        getRjctd().add(rjctd);
        return this;
    }

}
