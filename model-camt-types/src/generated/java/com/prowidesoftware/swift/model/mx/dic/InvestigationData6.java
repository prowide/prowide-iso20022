
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Provides the detailed information for the investigation response.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestigationData6", propOrder = {
    "orgnlInvstgtnSeq",
    "orgnlInvstgtnRsn",
    "orgnlInvstgtnRsnSubTp",
    "rspnData",
    "rltdInvstgtnData",
    "nclsdFile",
    "rltdFileData",
    "rspnOrgtr"
})
public class InvestigationData6 {

    @XmlElement(name = "OrgnlInvstgtnSeq")
    protected BigDecimal orgnlInvstgtnSeq;
    @XmlElement(name = "OrgnlInvstgtnRsn")
    protected InvestigationReason1Choice orgnlInvstgtnRsn;
    @XmlElement(name = "OrgnlInvstgtnRsnSubTp")
    protected InvestigationReasonSubType1Choice orgnlInvstgtnRsnSubTp;
    @XmlElement(name = "RspnData", required = true)
    protected InvestigationDataRecord7Choice rspnData;
    @XmlElement(name = "RltdInvstgtnData")
    protected RelatedInvestigationData1 rltdInvstgtnData;
    @XmlElement(name = "NclsdFile")
    protected List<Document12> nclsdFile;
    @XmlElement(name = "RltdFileData")
    protected List<FileData1> rltdFileData;
    @XmlElement(name = "RspnOrgtr")
    protected Party40Choice rspnOrgtr;

    /**
     * Gets the value of the orgnlInvstgtnSeq property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrgnlInvstgtnSeq() {
        return orgnlInvstgtnSeq;
    }

    /**
     * Sets the value of the orgnlInvstgtnSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InvestigationData6 setOrgnlInvstgtnSeq(BigDecimal value) {
        this.orgnlInvstgtnSeq = value;
        return this;
    }

    /**
     * Gets the value of the orgnlInvstgtnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link InvestigationReason1Choice }
     *     
     */
    public InvestigationReason1Choice getOrgnlInvstgtnRsn() {
        return orgnlInvstgtnRsn;
    }

    /**
     * Sets the value of the orgnlInvstgtnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigationReason1Choice }
     *     
     */
    public InvestigationData6 setOrgnlInvstgtnRsn(InvestigationReason1Choice value) {
        this.orgnlInvstgtnRsn = value;
        return this;
    }

    /**
     * Gets the value of the orgnlInvstgtnRsnSubTp property.
     * 
     * @return
     *     possible object is
     *     {@link InvestigationReasonSubType1Choice }
     *     
     */
    public InvestigationReasonSubType1Choice getOrgnlInvstgtnRsnSubTp() {
        return orgnlInvstgtnRsnSubTp;
    }

    /**
     * Sets the value of the orgnlInvstgtnRsnSubTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigationReasonSubType1Choice }
     *     
     */
    public InvestigationData6 setOrgnlInvstgtnRsnSubTp(InvestigationReasonSubType1Choice value) {
        this.orgnlInvstgtnRsnSubTp = value;
        return this;
    }

    /**
     * Gets the value of the rspnData property.
     * 
     * @return
     *     possible object is
     *     {@link InvestigationDataRecord7Choice }
     *     
     */
    public InvestigationDataRecord7Choice getRspnData() {
        return rspnData;
    }

    /**
     * Sets the value of the rspnData property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigationDataRecord7Choice }
     *     
     */
    public InvestigationData6 setRspnData(InvestigationDataRecord7Choice value) {
        this.rspnData = value;
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
    public InvestigationData6 setRltdInvstgtnData(RelatedInvestigationData1 value) {
        this.rltdInvstgtnData = value;
        return this;
    }

    /**
     * Gets the value of the nclsdFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nclsdFile property.
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
     */
    public List<Document12> getNclsdFile() {
        if (nclsdFile == null) {
            nclsdFile = new ArrayList<Document12>();
        }
        return this.nclsdFile;
    }

    /**
     * Gets the value of the rltdFileData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rltdFileData property.
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
     */
    public List<FileData1> getRltdFileData() {
        if (rltdFileData == null) {
            rltdFileData = new ArrayList<FileData1>();
        }
        return this.rltdFileData;
    }

    /**
     * Gets the value of the rspnOrgtr property.
     * 
     * @return
     *     possible object is
     *     {@link Party40Choice }
     *     
     */
    public Party40Choice getRspnOrgtr() {
        return rspnOrgtr;
    }

    /**
     * Sets the value of the rspnOrgtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party40Choice }
     *     
     */
    public InvestigationData6 setRspnOrgtr(Party40Choice value) {
        this.rspnOrgtr = value;
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
     * Adds a new item to the nclsdFile list.
     * @see #getNclsdFile()
     * 
     */
    public InvestigationData6 addNclsdFile(Document12 nclsdFile) {
        getNclsdFile().add(nclsdFile);
        return this;
    }

    /**
     * Adds a new item to the rltdFileData list.
     * @see #getRltdFileData()
     * 
     */
    public InvestigationData6 addRltdFileData(FileData1 rltdFileData) {
        getRltdFileData().add(rltdFileData);
        return this;
    }

}
