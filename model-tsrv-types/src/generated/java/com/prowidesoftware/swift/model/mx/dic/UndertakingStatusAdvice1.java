
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Undertaking status information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UndertakingStatusAdvice1", propOrder = {
    "initgPty",
    "udrtkgId",
    "amdmntSeqNb",
    "advsgPtyRefNb",
    "cnfrmrRefNb",
    "stsCtgy",
    "sts",
    "stsRsn",
    "rptdAmt",
    "orgnlMsgDtls",
    "nclsdFile",
    "addtlInf"
})
public class UndertakingStatusAdvice1 {

    @XmlElement(name = "InitgPty", required = true)
    protected PartyIdentification43 initgPty;
    @XmlElement(name = "UdrtkgId")
    protected Undertaking8 udrtkgId;
    @XmlElement(name = "AmdmntSeqNb")
    protected BigDecimal amdmntSeqNb;
    @XmlElement(name = "AdvsgPtyRefNb")
    protected String advsgPtyRefNb;
    @XmlElement(name = "CnfrmrRefNb")
    protected String cnfrmrRefNb;
    @XmlElement(name = "StsCtgy", required = true)
    protected String stsCtgy;
    @XmlElement(name = "Sts", required = true)
    @XmlSchemaType(name = "string")
    protected UndertakingStatus3Code sts;
    @XmlElement(name = "StsRsn")
    protected List<StatusReasonInformation8> stsRsn;
    @XmlElement(name = "RptdAmt")
    protected List<ReportedAmount1> rptdAmt;
    @XmlElement(name = "OrgnlMsgDtls")
    protected OriginalMessage1 orgnlMsgDtls;
    @XmlElement(name = "NclsdFile")
    protected List<Document9> nclsdFile;
    @XmlElement(name = "AddtlInf")
    protected List<String> addtlInf;

    /**
     * Gets the value of the initgPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *     
     */
    public PartyIdentification43 getInitgPty() {
        return initgPty;
    }

    /**
     * Sets the value of the initgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *     
     */
    public UndertakingStatusAdvice1 setInitgPty(PartyIdentification43 value) {
        this.initgPty = value;
        return this;
    }

    /**
     * Gets the value of the udrtkgId property.
     * 
     * @return
     *     possible object is
     *     {@link Undertaking8 }
     *     
     */
    public Undertaking8 getUdrtkgId() {
        return udrtkgId;
    }

    /**
     * Sets the value of the udrtkgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Undertaking8 }
     *     
     */
    public UndertakingStatusAdvice1 setUdrtkgId(Undertaking8 value) {
        this.udrtkgId = value;
        return this;
    }

    /**
     * Gets the value of the amdmntSeqNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmdmntSeqNb() {
        return amdmntSeqNb;
    }

    /**
     * Sets the value of the amdmntSeqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public UndertakingStatusAdvice1 setAmdmntSeqNb(BigDecimal value) {
        this.amdmntSeqNb = value;
        return this;
    }

    /**
     * Gets the value of the advsgPtyRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvsgPtyRefNb() {
        return advsgPtyRefNb;
    }

    /**
     * Sets the value of the advsgPtyRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public UndertakingStatusAdvice1 setAdvsgPtyRefNb(String value) {
        this.advsgPtyRefNb = value;
        return this;
    }

    /**
     * Gets the value of the cnfrmrRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnfrmrRefNb() {
        return cnfrmrRefNb;
    }

    /**
     * Sets the value of the cnfrmrRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public UndertakingStatusAdvice1 setCnfrmrRefNb(String value) {
        this.cnfrmrRefNb = value;
        return this;
    }

    /**
     * Gets the value of the stsCtgy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStsCtgy() {
        return stsCtgy;
    }

    /**
     * Sets the value of the stsCtgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public UndertakingStatusAdvice1 setStsCtgy(String value) {
        this.stsCtgy = value;
        return this;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingStatus3Code }
     *     
     */
    public UndertakingStatus3Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingStatus3Code }
     *     
     */
    public UndertakingStatusAdvice1 setSts(UndertakingStatus3Code value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the stsRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the stsRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStsRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusReasonInformation8 }
     * 
     * 
     * @return
     *     The value of the stsRsn property.
     */
    public List<StatusReasonInformation8> getStsRsn() {
        if (stsRsn == null) {
            stsRsn = new ArrayList<>();
        }
        return this.stsRsn;
    }

    /**
     * Gets the value of the rptdAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rptdAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRptdAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportedAmount1 }
     * 
     * 
     * @return
     *     The value of the rptdAmt property.
     */
    public List<ReportedAmount1> getRptdAmt() {
        if (rptdAmt == null) {
            rptdAmt = new ArrayList<>();
        }
        return this.rptdAmt;
    }

    /**
     * Gets the value of the orgnlMsgDtls property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalMessage1 }
     *     
     */
    public OriginalMessage1 getOrgnlMsgDtls() {
        return orgnlMsgDtls;
    }

    /**
     * Sets the value of the orgnlMsgDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalMessage1 }
     *     
     */
    public UndertakingStatusAdvice1 setOrgnlMsgDtls(OriginalMessage1 value) {
        this.orgnlMsgDtls = value;
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
     * {@link Document9 }
     * 
     * 
     * @return
     *     The value of the nclsdFile property.
     */
    public List<Document9> getNclsdFile() {
        if (nclsdFile == null) {
            nclsdFile = new ArrayList<>();
        }
        return this.nclsdFile;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<String> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
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
     * Adds a new item to the stsRsn list.
     * @see #getStsRsn()
     * 
     */
    public UndertakingStatusAdvice1 addStsRsn(StatusReasonInformation8 stsRsn) {
        getStsRsn().add(stsRsn);
        return this;
    }

    /**
     * Adds a new item to the rptdAmt list.
     * @see #getRptdAmt()
     * 
     */
    public UndertakingStatusAdvice1 addRptdAmt(ReportedAmount1 rptdAmt) {
        getRptdAmt().add(rptdAmt);
        return this;
    }

    /**
     * Adds a new item to the nclsdFile list.
     * @see #getNclsdFile()
     * 
     */
    public UndertakingStatusAdvice1 addNclsdFile(Document9 nclsdFile) {
        getNclsdFile().add(nclsdFile);
        return this;
    }

    /**
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public UndertakingStatusAdvice1 addAddtlInf(String addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
