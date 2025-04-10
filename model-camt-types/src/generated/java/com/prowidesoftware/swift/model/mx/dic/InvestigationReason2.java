
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Provides the details reason for the investigation request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestigationReason2", propOrder = {
    "seq",
    "rsn",
    "rsnSubTp",
    "addtlReqData",
    "rltdInvstgtnData",
    "nclsdFile",
    "rltdFileData"
})
public class InvestigationReason2 {

    @XmlElement(name = "Seq")
    protected BigDecimal seq;
    @XmlElement(name = "Rsn", required = true)
    protected InvestigationReason1Choice rsn;
    @XmlElement(name = "RsnSubTp")
    protected InvestigationReasonSubType1Choice rsnSubTp;
    @XmlElement(name = "AddtlReqData")
    protected AdditionalRequestData1Choice addtlReqData;
    @XmlElement(name = "RltdInvstgtnData")
    protected RelatedInvestigationData1 rltdInvstgtnData;
    @XmlElement(name = "NclsdFile")
    protected List<Document12> nclsdFile;
    @XmlElement(name = "RltdFileData")
    protected List<FileData1> rltdFileData;

    /**
     * Gets the value of the seq property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeq() {
        return seq;
    }

    /**
     * Sets the value of the seq property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InvestigationReason2 setSeq(BigDecimal value) {
        this.seq = value;
        return this;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link InvestigationReason1Choice }
     *     
     */
    public InvestigationReason1Choice getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigationReason1Choice }
     *     
     */
    public InvestigationReason2 setRsn(InvestigationReason1Choice value) {
        this.rsn = value;
        return this;
    }

    /**
     * Gets the value of the rsnSubTp property.
     * 
     * @return
     *     possible object is
     *     {@link InvestigationReasonSubType1Choice }
     *     
     */
    public InvestigationReasonSubType1Choice getRsnSubTp() {
        return rsnSubTp;
    }

    /**
     * Sets the value of the rsnSubTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigationReasonSubType1Choice }
     *     
     */
    public InvestigationReason2 setRsnSubTp(InvestigationReasonSubType1Choice value) {
        this.rsnSubTp = value;
        return this;
    }

    /**
     * Gets the value of the addtlReqData property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalRequestData1Choice }
     *     
     */
    public AdditionalRequestData1Choice getAddtlReqData() {
        return addtlReqData;
    }

    /**
     * Sets the value of the addtlReqData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalRequestData1Choice }
     *     
     */
    public InvestigationReason2 setAddtlReqData(AdditionalRequestData1Choice value) {
        this.addtlReqData = value;
        return this;
    }

    /**
     * Gets the value of the rltdInvstgtnData property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedInvestigationData1 }
     *     
     */
    public RelatedInvestigationData1 getRltdInvstgtnData() {
        return rltdInvstgtnData;
    }

    /**
     * Sets the value of the rltdInvstgtnData property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedInvestigationData1 }
     *     
     */
    public InvestigationReason2 setRltdInvstgtnData(RelatedInvestigationData1 value) {
        this.rltdInvstgtnData = value;
        return this;
    }

    /**
     * Gets the value of the nclsdFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the nclsdFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNclsdFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Document12 }
     * 
     * 
     * @return
     *     The value of the nclsdFile property.
     */
    public List<Document12> getNclsdFile() {
        if (nclsdFile == null) {
            nclsdFile = new ArrayList<>();
        }
        return this.nclsdFile;
    }

    /**
     * Gets the value of the rltdFileData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rltdFileData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdFileData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FileData1 }
     * 
     * 
     * @return
     *     The value of the rltdFileData property.
     */
    public List<FileData1> getRltdFileData() {
        if (rltdFileData == null) {
            rltdFileData = new ArrayList<>();
        }
        return this.rltdFileData;
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
     * Adds a new item to the nclsdFile list.
     * @see #getNclsdFile()
     * 
     */
    public InvestigationReason2 addNclsdFile(Document12 nclsdFile) {
        getNclsdFile().add(nclsdFile);
        return this;
    }

    /**
     * Adds a new item to the rltdFileData list.
     * @see #getRltdFileData()
     * 
     */
    public InvestigationReason2 addRltdFileData(FileData1 rltdFileData) {
        getRltdFileData().add(rltdFileData);
        return this;
    }

}
