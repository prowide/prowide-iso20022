
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
 * The DataSetSubmission message is sent by either party involved in the transaction to the matching application.
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
@XmlType(name = "tsmt.014.001.02", propOrder = {
    "submissnId",
    "txRltdRefs",
    "instr",
    "buyrBk",
    "sellrBk",
    "stordDataSetRef",
    "newComrclDataSet",
    "newTrnsprtDataSet"
})
public class Tsmt01400102 {

    @XmlElement(name = "SubmissnId", required = true)
    protected MessageIdentification1 submissnId;
    @XmlElement(name = "TxRltdRefs", required = true)
    protected List<DataSetSubmissionReferences1> txRltdRefs;
    @XmlElement(name = "Instr", required = true)
    protected InstructionType3 instr;
    @XmlElement(name = "BuyrBk", required = true)
    protected BICIdentification1 buyrBk;
    @XmlElement(name = "SellrBk", required = true)
    protected BICIdentification1 sellrBk;
    @XmlElement(name = "StordDataSetRef")
    protected List<DocumentIdentification1> stordDataSetRef;
    @XmlElement(name = "NewComrclDataSet")
    protected CommercialDataSet2 newComrclDataSet;
    @XmlElement(name = "NewTrnsprtDataSet")
    protected TransportDataSet2 newTrnsprtDataSet;

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
    public Tsmt01400102 setSubmissnId(MessageIdentification1 value) {
        this.submissnId = value;
        return this;
    }

    /**
     * Gets the value of the txRltdRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txRltdRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxRltdRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataSetSubmissionReferences1 }
     * 
     * 
     */
    public List<DataSetSubmissionReferences1> getTxRltdRefs() {
        if (txRltdRefs == null) {
            txRltdRefs = new ArrayList<DataSetSubmissionReferences1>();
        }
        return this.txRltdRefs;
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
    public Tsmt01400102 setInstr(InstructionType3 value) {
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
    public Tsmt01400102 setBuyrBk(BICIdentification1 value) {
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
    public Tsmt01400102 setSellrBk(BICIdentification1 value) {
        this.sellrBk = value;
        return this;
    }

    /**
     * Gets the value of the stordDataSetRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stordDataSetRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStordDataSetRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentIdentification1 }
     * 
     * 
     */
    public List<DocumentIdentification1> getStordDataSetRef() {
        if (stordDataSetRef == null) {
            stordDataSetRef = new ArrayList<DocumentIdentification1>();
        }
        return this.stordDataSetRef;
    }

    /**
     * Gets the value of the newComrclDataSet property.
     * 
     * @return
     *     possible object is
     *     {@link CommercialDataSet2 }
     *     
     */
    public CommercialDataSet2 getNewComrclDataSet() {
        return newComrclDataSet;
    }

    /**
     * Sets the value of the newComrclDataSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommercialDataSet2 }
     *     
     */
    public Tsmt01400102 setNewComrclDataSet(CommercialDataSet2 value) {
        this.newComrclDataSet = value;
        return this;
    }

    /**
     * Gets the value of the newTrnsprtDataSet property.
     * 
     * @return
     *     possible object is
     *     {@link TransportDataSet2 }
     *     
     */
    public TransportDataSet2 getNewTrnsprtDataSet() {
        return newTrnsprtDataSet;
    }

    /**
     * Sets the value of the newTrnsprtDataSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportDataSet2 }
     *     
     */
    public Tsmt01400102 setNewTrnsprtDataSet(TransportDataSet2 value) {
        this.newTrnsprtDataSet = value;
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
     * Adds a new item to the txRltdRefs list.
     * @see #getTxRltdRefs()
     * 
     */
    public Tsmt01400102 addTxRltdRefs(DataSetSubmissionReferences1 txRltdRefs) {
        getTxRltdRefs().add(txRltdRefs);
        return this;
    }

    /**
     * Adds a new item to the stordDataSetRef list.
     * @see #getStordDataSetRef()
     * 
     */
    public Tsmt01400102 addStordDataSetRef(DocumentIdentification1 stordDataSetRef) {
        getStordDataSetRef().add(stordDataSetRef);
        return this;
    }

}
