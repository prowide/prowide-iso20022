
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
 * Scope
 * The DataSetSubmission message is sent by a party involved in the transaction to the matching application.
 * This message is used to trigger either a match or a pre-match of the information submitted with the message.
 * Usage
 * The DataSetSubmission message can be sent by either party with the instruction pre-match. In the outlined scenario, the matching application will compare the data set(s) conveyed by the DataSetSubmission message with the established baseline and report the matching result to the requester of the data set pre-match by sending a DataSetMatchReport message.
 * or
 * The DataSetSubmission message can be sent by the party specified in the baseline as data set submitter with the instruction match. In the outlined scenario, the matching application will compare the data set(s) conveyed by the DataSetSubmission message with the established baseline and report the matching result to
 * - the parties involved in a transaction established in the push-through mode, or
 * - the initiator of a transaction established in the lodge mode.
 * The DataSetSubmission message can be used to submit multiple data sets for multiple transactions (baselines) at the same time. However, all transactions (baselines) covered by the message must be for the same parties, that is transaction initiator and counterparty, as well as for the same buyer and seller.
 * The DataSetSubmission message consists of data reflecting trade information related to the purchasing agreement covered by the transaction(s), for example shipment date, invoice amount.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataSetSubmissionV03", propOrder = {
    "submissnId",
    "rltdTxRefs",
    "cmonSubmissnRef",
    "instr",
    "buyrBk",
    "sellrBk",
    "comrclDataSet",
    "trnsprtDataSet",
    "insrncDataSet",
    "certDataSet",
    "othrCertDataSet"
})
public class DataSetSubmissionV03 {

    @XmlElement(name = "SubmissnId", required = true)
    protected MessageIdentification1 submissnId;
    @XmlElement(name = "RltdTxRefs", required = true)
    protected List<DataSetSubmissionReferences3> rltdTxRefs;
    @XmlElement(name = "CmonSubmissnRef", required = true)
    protected SimpleIdentificationInformation cmonSubmissnRef;
    @XmlElement(name = "Instr", required = true)
    protected InstructionType3 instr;
    @XmlElement(name = "BuyrBk", required = true)
    protected BICIdentification1 buyrBk;
    @XmlElement(name = "SellrBk", required = true)
    protected BICIdentification1 sellrBk;
    @XmlElement(name = "ComrclDataSet")
    protected CommercialDataSet3 comrclDataSet;
    @XmlElement(name = "TrnsprtDataSet")
    protected TransportDataSet3 trnsprtDataSet;
    @XmlElement(name = "InsrncDataSet")
    protected InsuranceDataSet1 insrncDataSet;
    @XmlElement(name = "CertDataSet")
    protected List<CertificateDataSet1> certDataSet;
    @XmlElement(name = "OthrCertDataSet")
    protected List<OtherCertificateDataSet1> othrCertDataSet;

    /**
     * Gets the value of the submissnId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getSubmissnId() {
        return submissnId;
    }

    /**
     * Sets the value of the submissnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public DataSetSubmissionV03 setSubmissnId(MessageIdentification1 value) {
        this.submissnId = value;
        return this;
    }

    /**
     * Gets the value of the rltdTxRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rltdTxRefs property.
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
     * {@link DataSetSubmissionReferences3 }
     * 
     * 
     * @return
     *     The value of the rltdTxRefs property.
     */
    public List<DataSetSubmissionReferences3> getRltdTxRefs() {
        if (rltdTxRefs == null) {
            rltdTxRefs = new ArrayList<>();
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
    public DataSetSubmissionV03 setCmonSubmissnRef(SimpleIdentificationInformation value) {
        this.cmonSubmissnRef = value;
        return this;
    }

    /**
     * Gets the value of the instr property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionType3 }
     *     
     */
    public InstructionType3 getInstr() {
        return instr;
    }

    /**
     * Sets the value of the instr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionType3 }
     *     
     */
    public DataSetSubmissionV03 setInstr(InstructionType3 value) {
        this.instr = value;
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
    public DataSetSubmissionV03 setBuyrBk(BICIdentification1 value) {
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
    public DataSetSubmissionV03 setSellrBk(BICIdentification1 value) {
        this.sellrBk = value;
        return this;
    }

    /**
     * Gets the value of the comrclDataSet property.
     * 
     * @return
     *     possible object is
     *     {@link CommercialDataSet3 }
     *     
     */
    public CommercialDataSet3 getComrclDataSet() {
        return comrclDataSet;
    }

    /**
     * Sets the value of the comrclDataSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommercialDataSet3 }
     *     
     */
    public DataSetSubmissionV03 setComrclDataSet(CommercialDataSet3 value) {
        this.comrclDataSet = value;
        return this;
    }

    /**
     * Gets the value of the trnsprtDataSet property.
     * 
     * @return
     *     possible object is
     *     {@link TransportDataSet3 }
     *     
     */
    public TransportDataSet3 getTrnsprtDataSet() {
        return trnsprtDataSet;
    }

    /**
     * Sets the value of the trnsprtDataSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportDataSet3 }
     *     
     */
    public DataSetSubmissionV03 setTrnsprtDataSet(TransportDataSet3 value) {
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
    public DataSetSubmissionV03 setInsrncDataSet(InsuranceDataSet1 value) {
        this.insrncDataSet = value;
        return this;
    }

    /**
     * Gets the value of the certDataSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the certDataSet property.
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
     * {@link CertificateDataSet1 }
     * 
     * 
     * @return
     *     The value of the certDataSet property.
     */
    public List<CertificateDataSet1> getCertDataSet() {
        if (certDataSet == null) {
            certDataSet = new ArrayList<>();
        }
        return this.certDataSet;
    }

    /**
     * Gets the value of the othrCertDataSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othrCertDataSet property.
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
     * @return
     *     The value of the othrCertDataSet property.
     */
    public List<OtherCertificateDataSet1> getOthrCertDataSet() {
        if (othrCertDataSet == null) {
            othrCertDataSet = new ArrayList<>();
        }
        return this.othrCertDataSet;
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
    public DataSetSubmissionV03 addRltdTxRefs(DataSetSubmissionReferences3 rltdTxRefs) {
        getRltdTxRefs().add(rltdTxRefs);
        return this;
    }

    /**
     * Adds a new item to the certDataSet list.
     * @see #getCertDataSet()
     * 
     */
    public DataSetSubmissionV03 addCertDataSet(CertificateDataSet1 certDataSet) {
        getCertDataSet().add(certDataSet);
        return this;
    }

    /**
     * Adds a new item to the othrCertDataSet list.
     * @see #getOthrCertDataSet()
     * 
     */
    public DataSetSubmissionV03 addOthrCertDataSet(OtherCertificateDataSet1 othrCertDataSet) {
        getOthrCertDataSet().add(othrCertDataSet);
        return this;
    }

}
