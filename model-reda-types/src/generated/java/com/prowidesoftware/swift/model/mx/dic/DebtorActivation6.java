
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
 * Specifies the attributes for a debtor activation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DebtorActivation6", propOrder = {
    "dbtrActvtnId",
    "dispNm",
    "ultmtDbtr",
    "dbtr",
    "dbtrSolPrvdr",
    "cstmrId",
    "ctrctFrmtTp",
    "ctrctRef",
    "cdtr",
    "ultmtCdtr",
    "actvtnReqDlvryPty",
    "startDt",
    "endDt",
    "ddctdActvtnCd"
})
public class DebtorActivation6 {

    @XmlElement(name = "DbtrActvtnId")
    protected String dbtrActvtnId;
    @XmlElement(name = "DispNm")
    protected String dispNm;
    @XmlElement(name = "UltmtDbtr")
    protected RTPPartyIdentification2 ultmtDbtr;
    @XmlElement(name = "Dbtr")
    protected RTPPartyIdentification2 dbtr;
    @XmlElement(name = "DbtrSolPrvdr")
    protected RTPPartyIdentification2 dbtrSolPrvdr;
    @XmlElement(name = "CstmrId")
    protected List<Party53Choice> cstmrId;
    @XmlElement(name = "CtrctFrmtTp")
    protected List<DocumentFormat2Choice> ctrctFrmtTp;
    @XmlElement(name = "CtrctRef")
    protected List<ContractReference1> ctrctRef;
    @XmlElement(name = "Cdtr")
    protected RTPPartyIdentification2 cdtr;
    @XmlElement(name = "UltmtCdtr")
    protected RTPPartyIdentification2 ultmtCdtr;
    @XmlElement(name = "ActvtnReqDlvryPty")
    protected RTPPartyIdentification2 actvtnReqDlvryPty;
    @XmlElement(name = "StartDt")
    protected DateAndDateTime2Choice startDt;
    @XmlElement(name = "EndDt")
    protected DateAndDateTime2Choice endDt;
    @XmlElement(name = "DdctdActvtnCd")
    protected String ddctdActvtnCd;

    /**
     * Gets the value of the dbtrActvtnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbtrActvtnId() {
        return dbtrActvtnId;
    }

    /**
     * Sets the value of the dbtrActvtnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DebtorActivation6 setDbtrActvtnId(String value) {
        this.dbtrActvtnId = value;
        return this;
    }

    /**
     * Gets the value of the dispNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDispNm() {
        return dispNm;
    }

    /**
     * Sets the value of the dispNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DebtorActivation6 setDispNm(String value) {
        this.dispNm = value;
        return this;
    }

    /**
     * Gets the value of the ultmtDbtr property.
     * 
     * @return
     *     possible object is
     *     {@link RTPPartyIdentification2 }
     *     
     */
    public RTPPartyIdentification2 getUltmtDbtr() {
        return ultmtDbtr;
    }

    /**
     * Sets the value of the ultmtDbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RTPPartyIdentification2 }
     *     
     */
    public DebtorActivation6 setUltmtDbtr(RTPPartyIdentification2 value) {
        this.ultmtDbtr = value;
        return this;
    }

    /**
     * Gets the value of the dbtr property.
     * 
     * @return
     *     possible object is
     *     {@link RTPPartyIdentification2 }
     *     
     */
    public RTPPartyIdentification2 getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RTPPartyIdentification2 }
     *     
     */
    public DebtorActivation6 setDbtr(RTPPartyIdentification2 value) {
        this.dbtr = value;
        return this;
    }

    /**
     * Gets the value of the dbtrSolPrvdr property.
     * 
     * @return
     *     possible object is
     *     {@link RTPPartyIdentification2 }
     *     
     */
    public RTPPartyIdentification2 getDbtrSolPrvdr() {
        return dbtrSolPrvdr;
    }

    /**
     * Sets the value of the dbtrSolPrvdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RTPPartyIdentification2 }
     *     
     */
    public DebtorActivation6 setDbtrSolPrvdr(RTPPartyIdentification2 value) {
        this.dbtrSolPrvdr = value;
        return this;
    }

    /**
     * Gets the value of the cstmrId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cstmrId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCstmrId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Party53Choice }
     * 
     * 
     * @return
     *     The value of the cstmrId property.
     */
    public List<Party53Choice> getCstmrId() {
        if (cstmrId == null) {
            cstmrId = new ArrayList<>();
        }
        return this.cstmrId;
    }

    /**
     * Gets the value of the ctrctFrmtTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ctrctFrmtTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtrctFrmtTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentFormat2Choice }
     * 
     * 
     * @return
     *     The value of the ctrctFrmtTp property.
     */
    public List<DocumentFormat2Choice> getCtrctFrmtTp() {
        if (ctrctFrmtTp == null) {
            ctrctFrmtTp = new ArrayList<>();
        }
        return this.ctrctFrmtTp;
    }

    /**
     * Gets the value of the ctrctRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ctrctRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtrctRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractReference1 }
     * 
     * 
     * @return
     *     The value of the ctrctRef property.
     */
    public List<ContractReference1> getCtrctRef() {
        if (ctrctRef == null) {
            ctrctRef = new ArrayList<>();
        }
        return this.ctrctRef;
    }

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link RTPPartyIdentification2 }
     *     
     */
    public RTPPartyIdentification2 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RTPPartyIdentification2 }
     *     
     */
    public DebtorActivation6 setCdtr(RTPPartyIdentification2 value) {
        this.cdtr = value;
        return this;
    }

    /**
     * Gets the value of the ultmtCdtr property.
     * 
     * @return
     *     possible object is
     *     {@link RTPPartyIdentification2 }
     *     
     */
    public RTPPartyIdentification2 getUltmtCdtr() {
        return ultmtCdtr;
    }

    /**
     * Sets the value of the ultmtCdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RTPPartyIdentification2 }
     *     
     */
    public DebtorActivation6 setUltmtCdtr(RTPPartyIdentification2 value) {
        this.ultmtCdtr = value;
        return this;
    }

    /**
     * Gets the value of the actvtnReqDlvryPty property.
     * 
     * @return
     *     possible object is
     *     {@link RTPPartyIdentification2 }
     *     
     */
    public RTPPartyIdentification2 getActvtnReqDlvryPty() {
        return actvtnReqDlvryPty;
    }

    /**
     * Sets the value of the actvtnReqDlvryPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link RTPPartyIdentification2 }
     *     
     */
    public DebtorActivation6 setActvtnReqDlvryPty(RTPPartyIdentification2 value) {
        this.actvtnReqDlvryPty = value;
        return this;
    }

    /**
     * Gets the value of the startDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DebtorActivation6 setStartDt(DateAndDateTime2Choice value) {
        this.startDt = value;
        return this;
    }

    /**
     * Gets the value of the endDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getEndDt() {
        return endDt;
    }

    /**
     * Sets the value of the endDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DebtorActivation6 setEndDt(DateAndDateTime2Choice value) {
        this.endDt = value;
        return this;
    }

    /**
     * Gets the value of the ddctdActvtnCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDdctdActvtnCd() {
        return ddctdActvtnCd;
    }

    /**
     * Sets the value of the ddctdActvtnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DebtorActivation6 setDdctdActvtnCd(String value) {
        this.ddctdActvtnCd = value;
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
     * Adds a new item to the cstmrId list.
     * @see #getCstmrId()
     * 
     */
    public DebtorActivation6 addCstmrId(Party53Choice cstmrId) {
        getCstmrId().add(cstmrId);
        return this;
    }

    /**
     * Adds a new item to the ctrctFrmtTp list.
     * @see #getCtrctFrmtTp()
     * 
     */
    public DebtorActivation6 addCtrctFrmtTp(DocumentFormat2Choice ctrctFrmtTp) {
        getCtrctFrmtTp().add(ctrctFrmtTp);
        return this;
    }

    /**
     * Adds a new item to the ctrctRef list.
     * @see #getCtrctRef()
     * 
     */
    public DebtorActivation6 addCtrctRef(ContractReference1 ctrctRef) {
        getCtrctRef().add(ctrctRef);
        return this;
    }

}
