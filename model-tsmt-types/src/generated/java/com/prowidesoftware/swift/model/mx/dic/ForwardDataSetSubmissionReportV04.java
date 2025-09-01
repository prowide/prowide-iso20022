
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Scope
 * The ForwardDataSetSubmissionReport message is sent by the matching application to the counterparty(ies) of the submitter of data sets.
 * This message is used to pass on information related to the purchasing agreement(s) covered by the transaction(s) referred to in the message.
 * Usage
 * The ForwardDataSetSubmission message can be sent by the matching application to forward the details of a DataSetSubmission message that it has obtained.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForwardDataSetSubmissionReportV04", propOrder = {
    "rptId",
    "rltdTxRefs",
    "cmonSubmissnRef",
    "submitr",
    "buyrBk",
    "sellrBk",
    "comrclDataSet",
    "trnsprtDataSet",
    "insrncDataSet",
    "certDataSet",
    "othrCertDataSet",
    "reqForActn"
})
public class ForwardDataSetSubmissionReportV04 {

    @XmlElement(name = "RptId", required = true)
    protected MessageIdentification1 rptId;
    @XmlElement(name = "RltdTxRefs", required = true)
    protected List<DataSetSubmissionReferences4> rltdTxRefs;
    @XmlElement(name = "CmonSubmissnRef", required = true)
    protected SimpleIdentificationInformation cmonSubmissnRef;
    @XmlElement(name = "Submitr", required = true)
    protected BICIdentification1 submitr;
    @XmlElement(name = "BuyrBk", required = true)
    protected BICIdentification1 buyrBk;
    @XmlElement(name = "SellrBk", required = true)
    protected BICIdentification1 sellrBk;
    @XmlElement(name = "ComrclDataSet")
    protected CommercialDataSet4 comrclDataSet;
    @XmlElement(name = "TrnsprtDataSet")
    protected TransportDataSet4 trnsprtDataSet;
    @XmlElement(name = "InsrncDataSet")
    protected InsuranceDataSet1 insrncDataSet;
    @XmlElement(name = "CertDataSet")
    protected List<CertificateDataSet2> certDataSet;
    @XmlElement(name = "OthrCertDataSet")
    protected List<OtherCertificateDataSet1> othrCertDataSet;
    @XmlElement(name = "ReqForActn")
    protected PendingActivity2 reqForActn;

    /**
     * Gets the value of the rptId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getRptId() {
        return rptId;
    }

    /**
     * Sets the value of the rptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public ForwardDataSetSubmissionReportV04 setRptId(MessageIdentification1 value) {
        this.rptId = value;
        return this;
    }

    /**
     * Gets the value of the rltdTxRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rltdTxRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdTxRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataSetSubmissionReferences4 }
     * 
     * 
     */
    public List<DataSetSubmissionReferences4> getRltdTxRefs() {
        if (rltdTxRefs == null) {
            rltdTxRefs = new ArrayList<DataSetSubmissionReferences4>();
        }
        return this.rltdTxRefs;
    }

    /**
     * Gets the value of the cmonSubmissnRef property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleIdentificationInformation }
     *     
     */
    public SimpleIdentificationInformation getCmonSubmissnRef() {
        return cmonSubmissnRef;
    }

    /**
     * Sets the value of the cmonSubmissnRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleIdentificationInformation }
     *     
     */
    public ForwardDataSetSubmissionReportV04 setCmonSubmissnRef(SimpleIdentificationInformation value) {
        this.cmonSubmissnRef = value;
        return this;
    }

    /**
     * Gets the value of the submitr property.
     * 
     * @return
     *     possible object is
     *     {@link BICIdentification1 }
     *     
     */
    public BICIdentification1 getSubmitr() {
        return submitr;
    }

    /**
     * Sets the value of the submitr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BICIdentification1 }
     *     
     */
    public ForwardDataSetSubmissionReportV04 setSubmitr(BICIdentification1 value) {
        this.submitr = value;
        return this;
    }

    /**
     * Gets the value of the buyrBk property.
     * 
     * @return
     *     possible object is
     *     {@link BICIdentification1 }
     *     
     */
    public BICIdentification1 getBuyrBk() {
        return buyrBk;
    }

    /**
     * Sets the value of the buyrBk property.
     * 
     * @param value
     *     allowed object is
     *     {@link BICIdentification1 }
     *     
     */
    public ForwardDataSetSubmissionReportV04 setBuyrBk(BICIdentification1 value) {
        this.buyrBk = value;
        return this;
    }

    /**
     * Gets the value of the sellrBk property.
     * 
     * @return
     *     possible object is
     *     {@link BICIdentification1 }
     *     
     */
    public BICIdentification1 getSellrBk() {
        return sellrBk;
    }

    /**
     * Sets the value of the sellrBk property.
     * 
     * @param value
     *     allowed object is
     *     {@link BICIdentification1 }
     *     
     */
    public ForwardDataSetSubmissionReportV04 setSellrBk(BICIdentification1 value) {
        this.sellrBk = value;
        return this;
    }

    /**
     * Gets the value of the comrclDataSet property.
     * 
     * @return
     *     possible object is
     *     {@link CommercialDataSet4 }
     *     
     */
    public CommercialDataSet4 getComrclDataSet() {
        return comrclDataSet;
    }

    /**
     * Sets the value of the comrclDataSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommercialDataSet4 }
     *     
     */
    public ForwardDataSetSubmissionReportV04 setComrclDataSet(CommercialDataSet4 value) {
        this.comrclDataSet = value;
        return this;
    }

    /**
     * Gets the value of the trnsprtDataSet property.
     * 
     * @return
     *     possible object is
     *     {@link TransportDataSet4 }
     *     
     */
    public TransportDataSet4 getTrnsprtDataSet() {
        return trnsprtDataSet;
    }

    /**
     * Sets the value of the trnsprtDataSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportDataSet4 }
     *     
     */
    public ForwardDataSetSubmissionReportV04 setTrnsprtDataSet(TransportDataSet4 value) {
        this.trnsprtDataSet = value;
        return this;
    }

    /**
     * Gets the value of the insrncDataSet property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceDataSet1 }
     *     
     */
    public InsuranceDataSet1 getInsrncDataSet() {
        return insrncDataSet;
    }

    /**
     * Sets the value of the insrncDataSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceDataSet1 }
     *     
     */
    public ForwardDataSetSubmissionReportV04 setInsrncDataSet(InsuranceDataSet1 value) {
        this.insrncDataSet = value;
        return this;
    }

    /**
     * Gets the value of the certDataSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certDataSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertDataSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CertificateDataSet2 }
     * 
     * 
     */
    public List<CertificateDataSet2> getCertDataSet() {
        if (certDataSet == null) {
            certDataSet = new ArrayList<CertificateDataSet2>();
        }
        return this.certDataSet;
    }

    /**
     * Gets the value of the othrCertDataSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the othrCertDataSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrCertDataSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherCertificateDataSet1 }
     * 
     * 
     */
    public List<OtherCertificateDataSet1> getOthrCertDataSet() {
        if (othrCertDataSet == null) {
            othrCertDataSet = new ArrayList<OtherCertificateDataSet1>();
        }
        return this.othrCertDataSet;
    }

    /**
     * Gets the value of the reqForActn property.
     * 
     * @return
     *     possible object is
     *     {@link PendingActivity2 }
     *     
     */
    public PendingActivity2 getReqForActn() {
        return reqForActn;
    }

    /**
     * Sets the value of the reqForActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingActivity2 }
     *     
     */
    public ForwardDataSetSubmissionReportV04 setReqForActn(PendingActivity2 value) {
        this.reqForActn = value;
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
     * Adds a new item to the rltdTxRefs list.
     * @see #getRltdTxRefs()
     * 
     */
    public ForwardDataSetSubmissionReportV04 addRltdTxRefs(DataSetSubmissionReferences4 rltdTxRefs) {
        getRltdTxRefs().add(rltdTxRefs);
        return this;
    }

    /**
     * Adds a new item to the certDataSet list.
     * @see #getCertDataSet()
     * 
     */
    public ForwardDataSetSubmissionReportV04 addCertDataSet(CertificateDataSet2 certDataSet) {
        getCertDataSet().add(certDataSet);
        return this;
    }

    /**
     * Adds a new item to the othrCertDataSet list.
     * @see #getOthrCertDataSet()
     * 
     */
    public ForwardDataSetSubmissionReportV04 addOthrCertDataSet(OtherCertificateDataSet1 othrCertDataSet) {
        getOthrCertDataSet().add(othrCertDataSet);
        return this;
    }

}
