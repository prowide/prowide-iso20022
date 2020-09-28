
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Execution of a subscription order.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionBulkExecution4", propOrder = {
    "amdmntInd",
    "mstrRef",
    "plcOfTrad",
    "ordrDtTm",
    "rcvdDtTm",
    "reqdFutrTradDt",
    "cxlRght",
    "finInstrmDtls",
    "indvExctnDtls",
    "reqdSttlmCcy",
    "reqdNAVCcy",
    "ttlSttlmAmt",
    "blkCshSttlmDtls"
})
public class SubscriptionBulkExecution4 {

    @XmlElement(name = "AmdmntInd")
    protected Boolean amdmntInd;
    @XmlElement(name = "MstrRef")
    protected String mstrRef;
    @XmlElement(name = "PlcOfTrad")
    protected PlaceOfTradeIdentification1Choice plcOfTrad;
    @XmlElement(name = "OrdrDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ordrDtTm;
    @XmlElement(name = "RcvdDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rcvdDtTm;
    @XmlElement(name = "ReqdFutrTradDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reqdFutrTradDt;
    @XmlElement(name = "CxlRght")
    protected CancellationRight1Choice cxlRght;
    @XmlElement(name = "FinInstrmDtls", required = true)
    protected FinancialInstrument57 finInstrmDtls;
    @XmlElement(name = "IndvExctnDtls", required = true)
    protected List<SubscriptionExecution12> indvExctnDtls;
    @XmlElement(name = "ReqdSttlmCcy")
    protected String reqdSttlmCcy;
    @XmlElement(name = "ReqdNAVCcy")
    protected String reqdNAVCcy;
    @XmlElement(name = "TtlSttlmAmt")
    protected ActiveCurrencyAndAmount ttlSttlmAmt;
    @XmlElement(name = "BlkCshSttlmDtls")
    protected PaymentTransaction70 blkCshSttlmDtls;

    /**
     * Gets the value of the amdmntInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAmdmntInd() {
        return amdmntInd;
    }

    /**
     * Sets the value of the amdmntInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SubscriptionBulkExecution4 setAmdmntInd(Boolean value) {
        this.amdmntInd = value;
        return this;
    }

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
    public SubscriptionBulkExecution4 setMstrRef(String value) {
        this.mstrRef = value;
        return this;
    }

    /**
     * Gets the value of the plcOfTrad property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceOfTradeIdentification1Choice }
     *     
     */
    public PlaceOfTradeIdentification1Choice getPlcOfTrad() {
        return plcOfTrad;
    }

    /**
     * Sets the value of the plcOfTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceOfTradeIdentification1Choice }
     *     
     */
    public SubscriptionBulkExecution4 setPlcOfTrad(PlaceOfTradeIdentification1Choice value) {
        this.plcOfTrad = value;
        return this;
    }

    /**
     * Gets the value of the ordrDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrdrDtTm() {
        return ordrDtTm;
    }

    /**
     * Sets the value of the ordrDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public SubscriptionBulkExecution4 setOrdrDtTm(XMLGregorianCalendar value) {
        this.ordrDtTm = value;
        return this;
    }

    /**
     * Gets the value of the rcvdDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRcvdDtTm() {
        return rcvdDtTm;
    }

    /**
     * Sets the value of the rcvdDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public SubscriptionBulkExecution4 setRcvdDtTm(XMLGregorianCalendar value) {
        this.rcvdDtTm = value;
        return this;
    }

    /**
     * Gets the value of the reqdFutrTradDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReqdFutrTradDt() {
        return reqdFutrTradDt;
    }

    /**
     * Sets the value of the reqdFutrTradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public SubscriptionBulkExecution4 setReqdFutrTradDt(XMLGregorianCalendar value) {
        this.reqdFutrTradDt = value;
        return this;
    }

    /**
     * Gets the value of the cxlRght property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationRight1Choice }
     *     
     */
    public CancellationRight1Choice getCxlRght() {
        return cxlRght;
    }

    /**
     * Sets the value of the cxlRght property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationRight1Choice }
     *     
     */
    public SubscriptionBulkExecution4 setCxlRght(CancellationRight1Choice value) {
        this.cxlRght = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument57 }
     *     
     */
    public FinancialInstrument57 getFinInstrmDtls() {
        return finInstrmDtls;
    }

    /**
     * Sets the value of the finInstrmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument57 }
     *     
     */
    public SubscriptionBulkExecution4 setFinInstrmDtls(FinancialInstrument57 value) {
        this.finInstrmDtls = value;
        return this;
    }

    /**
     * Gets the value of the indvExctnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indvExctnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndvExctnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubscriptionExecution12 }
     * 
     * 
     */
    public List<SubscriptionExecution12> getIndvExctnDtls() {
        if (indvExctnDtls == null) {
            indvExctnDtls = new ArrayList<SubscriptionExecution12>();
        }
        return this.indvExctnDtls;
    }

    /**
     * Gets the value of the reqdSttlmCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqdSttlmCcy() {
        return reqdSttlmCcy;
    }

    /**
     * Sets the value of the reqdSttlmCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SubscriptionBulkExecution4 setReqdSttlmCcy(String value) {
        this.reqdSttlmCcy = value;
        return this;
    }

    /**
     * Gets the value of the reqdNAVCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqdNAVCcy() {
        return reqdNAVCcy;
    }

    /**
     * Sets the value of the reqdNAVCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SubscriptionBulkExecution4 setReqdNAVCcy(String value) {
        this.reqdNAVCcy = value;
        return this;
    }

    /**
     * Gets the value of the ttlSttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlSttlmAmt() {
        return ttlSttlmAmt;
    }

    /**
     * Sets the value of the ttlSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public SubscriptionBulkExecution4 setTtlSttlmAmt(ActiveCurrencyAndAmount value) {
        this.ttlSttlmAmt = value;
        return this;
    }

    /**
     * Gets the value of the blkCshSttlmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTransaction70 }
     *     
     */
    public PaymentTransaction70 getBlkCshSttlmDtls() {
        return blkCshSttlmDtls;
    }

    /**
     * Sets the value of the blkCshSttlmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTransaction70 }
     *     
     */
    public SubscriptionBulkExecution4 setBlkCshSttlmDtls(PaymentTransaction70 value) {
        this.blkCshSttlmDtls = value;
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
     * Adds a new item to the indvExctnDtls list.
     * @see #getIndvExctnDtls()
     * 
     */
    public SubscriptionBulkExecution4 addIndvExctnDtls(SubscriptionExecution12 indvExctnDtls) {
        getIndvExctnDtls().add(indvExctnDtls);
        return this;
    }

}
