
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Unique and unambiguous identifier of the group of transactions as assigned by the original instructing party.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalGroupInformation19", propOrder = {
    "orgnlMsgId",
    "ntwkFileNm",
    "orgnlMsgNmId",
    "orgnlCreDtTm",
    "fileOrgtr",
    "orgnlNbOfTxs",
    "orgnlCtrlSum",
    "grpSts",
    "stsRsnInf",
    "nbOfTxsPerSts"
})
public class OriginalGroupInformation19 {

    @XmlElement(name = "OrgnlMsgId")
    protected String orgnlMsgId;
    @XmlElement(name = "NtwkFileNm")
    protected String ntwkFileNm;
    @XmlElement(name = "OrgnlMsgNmId", required = true)
    protected String orgnlMsgNmId;
    @XmlElement(name = "OrgnlCreDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime orgnlCreDtTm;
    @XmlElement(name = "FileOrgtr")
    protected String fileOrgtr;
    @XmlElement(name = "OrgnlNbOfTxs")
    protected String orgnlNbOfTxs;
    @XmlElement(name = "OrgnlCtrlSum")
    protected BigDecimal orgnlCtrlSum;
    @XmlElement(name = "GrpSts")
    @XmlSchemaType(name = "string")
    protected TransactionGroupStatus1Code grpSts;
    @XmlElement(name = "StsRsnInf")
    protected List<StatusReasonInformation7> stsRsnInf;
    @XmlElement(name = "NbOfTxsPerSts")
    protected List<NumberOfTransactionsPerStatus1> nbOfTxsPerSts;

    /**
     * Gets the value of the orgnlMsgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlMsgId() {
        return orgnlMsgId;
    }

    /**
     * Sets the value of the orgnlMsgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalGroupInformation19 setOrgnlMsgId(String value) {
        this.orgnlMsgId = value;
        return this;
    }

    /**
     * Gets the value of the ntwkFileNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtwkFileNm() {
        return ntwkFileNm;
    }

    /**
     * Sets the value of the ntwkFileNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalGroupInformation19 setNtwkFileNm(String value) {
        this.ntwkFileNm = value;
        return this;
    }

    /**
     * Gets the value of the orgnlMsgNmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlMsgNmId() {
        return orgnlMsgNmId;
    }

    /**
     * Sets the value of the orgnlMsgNmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalGroupInformation19 setOrgnlMsgNmId(String value) {
        this.orgnlMsgNmId = value;
        return this;
    }

    /**
     * Gets the value of the orgnlCreDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getOrgnlCreDtTm() {
        return orgnlCreDtTm;
    }

    /**
     * Sets the value of the orgnlCreDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalGroupInformation19 setOrgnlCreDtTm(OffsetDateTime value) {
        this.orgnlCreDtTm = value;
        return this;
    }

    /**
     * Gets the value of the fileOrgtr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileOrgtr() {
        return fileOrgtr;
    }

    /**
     * Sets the value of the fileOrgtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalGroupInformation19 setFileOrgtr(String value) {
        this.fileOrgtr = value;
        return this;
    }

    /**
     * Gets the value of the orgnlNbOfTxs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlNbOfTxs() {
        return orgnlNbOfTxs;
    }

    /**
     * Sets the value of the orgnlNbOfTxs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalGroupInformation19 setOrgnlNbOfTxs(String value) {
        this.orgnlNbOfTxs = value;
        return this;
    }

    /**
     * Gets the value of the orgnlCtrlSum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrgnlCtrlSum() {
        return orgnlCtrlSum;
    }

    /**
     * Sets the value of the orgnlCtrlSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public OriginalGroupInformation19 setOrgnlCtrlSum(BigDecimal value) {
        this.orgnlCtrlSum = value;
        return this;
    }

    /**
     * Gets the value of the grpSts property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionGroupStatus1Code }
     *     
     */
    public TransactionGroupStatus1Code getGrpSts() {
        return grpSts;
    }

    /**
     * Sets the value of the grpSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionGroupStatus1Code }
     *     
     */
    public OriginalGroupInformation19 setGrpSts(TransactionGroupStatus1Code value) {
        this.grpSts = value;
        return this;
    }

    /**
     * Gets the value of the stsRsnInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the stsRsnInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStsRsnInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusReasonInformation7 }
     * 
     * 
     * @return
     *     The value of the stsRsnInf property.
     */
    public List<StatusReasonInformation7> getStsRsnInf() {
        if (stsRsnInf == null) {
            stsRsnInf = new ArrayList<>();
        }
        return this.stsRsnInf;
    }

    /**
     * Gets the value of the nbOfTxsPerSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the nbOfTxsPerSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNbOfTxsPerSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NumberOfTransactionsPerStatus1 }
     * 
     * 
     * @return
     *     The value of the nbOfTxsPerSts property.
     */
    public List<NumberOfTransactionsPerStatus1> getNbOfTxsPerSts() {
        if (nbOfTxsPerSts == null) {
            nbOfTxsPerSts = new ArrayList<>();
        }
        return this.nbOfTxsPerSts;
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
     * Adds a new item to the stsRsnInf list.
     * @see #getStsRsnInf()
     * 
     */
    public OriginalGroupInformation19 addStsRsnInf(StatusReasonInformation7 stsRsnInf) {
        getStsRsnInf().add(stsRsnInf);
        return this;
    }

    /**
     * Adds a new item to the nbOfTxsPerSts list.
     * @see #getNbOfTxsPerSts()
     * 
     */
    public OriginalGroupInformation19 addNbOfTxsPerSts(NumberOfTransactionsPerStatus1 nbOfTxsPerSts) {
        getNbOfTxsPerSts().add(nbOfTxsPerSts);
        return this;
    }

}
