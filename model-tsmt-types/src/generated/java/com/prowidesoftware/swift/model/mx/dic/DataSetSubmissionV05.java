
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
@XmlType(name = "DataSetSubmissionV05", propOrder = {
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
public class DataSetSubmissionV05 {

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
    protected CommercialDataSet5 comrclDataSet;
    @XmlElement(name = "TrnsprtDataSet")
    protected TransportDataSet5 trnsprtDataSet;
    @XmlElement(name = "InsrncDataSet")
    protected InsuranceDataSet1 insrncDataSet;
    @XmlElement(name = "CertDataSet")
    protected List<CertificateDataSet2> certDataSet;
    @XmlElement(name = "OthrCertDataSet")
    protected List<OtherCertificateDataSet2> othrCertDataSet;

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
    public DataSetSubmissionV05 setSubmissnId(MessageIdentification1 value) {
        this.submissnId = value;
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
     * {@link DataSetSubmissionReferences3 }
     * 
     * 
     */
    public List<DataSetSubmissionReferences3> getRltdTxRefs() {
        if (rltdTxRefs == null) {
            rltdTxRefs = new ArrayList<DataSetSubmissionReferences3>();
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
    public DataSetSubmissionV05 setCmonSubmissnRef(SimpleIdentificationInformation value) {
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
    public DataSetSubmissionV05 setInstr(InstructionType3 value) {
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
    public DataSetSubmissionV05 setBuyrBk(BICIdentification1 value) {
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
    public DataSetSubmissionV05 setSellrBk(BICIdentification1 value) {
        this.sellrBk = value;
        return this;
    }

    /**
     * Gets the value of the comrclDataSet property.
     * 
     * @return
     *     possible object is
     *     {@link CommercialDataSet5 }
     *     
     */
    public CommercialDataSet5 getComrclDataSet() {
        return comrclDataSet;
    }

    /**
     * Sets the value of the comrclDataSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommercialDataSet5 }
     *     
     */
    public DataSetSubmissionV05 setComrclDataSet(CommercialDataSet5 value) {
        this.comrclDataSet = value;
        return this;
    }

    /**
     * Gets the value of the trnsprtDataSet property.
     * 
     * @return
     *     possible object is
     *     {@link TransportDataSet5 }
     *     
     */
    public TransportDataSet5 getTrnsprtDataSet() {
        return trnsprtDataSet;
    }

    /**
     * Sets the value of the trnsprtDataSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportDataSet5 }
     *     
     */
    public DataSetSubmissionV05 setTrnsprtDataSet(TransportDataSet5 value) {
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
    public DataSetSubmissionV05 setInsrncDataSet(InsuranceDataSet1 value) {
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
     * {@link OtherCertificateDataSet2 }
     * 
     * 
     */
    public List<OtherCertificateDataSet2> getOthrCertDataSet() {
        if (othrCertDataSet == null) {
            othrCertDataSet = new ArrayList<OtherCertificateDataSet2>();
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
    public DataSetSubmissionV05 addRltdTxRefs(DataSetSubmissionReferences3 rltdTxRefs) {
        getRltdTxRefs().add(rltdTxRefs);
        return this;
    }

    /**
     * Adds a new item to the certDataSet list.
     * @see #getCertDataSet()
     * 
     */
    public DataSetSubmissionV05 addCertDataSet(CertificateDataSet2 certDataSet) {
        getCertDataSet().add(certDataSet);
        return this;
    }

    /**
     * Adds a new item to the othrCertDataSet list.
     * @see #getOthrCertDataSet()
     * 
     */
    public DataSetSubmissionV05 addOthrCertDataSet(OtherCertificateDataSet2 othrCertDataSet) {
        getOthrCertDataSet().add(othrCertDataSet);
        return this;
    }

}
