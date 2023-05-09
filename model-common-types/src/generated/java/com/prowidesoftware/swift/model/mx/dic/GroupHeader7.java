
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
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
 * Set of characteristics shared by all individual transactions included in the message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupHeader7", propOrder = {
    "msgId",
    "creDtTm",
    "nbOfTxs",
    "ctrlSum",
    "grpCxl",
    "initgPty",
    "fwdgAgt",
    "dbtrAgt",
    "cdtrAgt",
    "instgAgt",
    "instdAgt"
})
public class GroupHeader7 {

    @XmlElement(name = "MsgId", required = true)
    protected String msgId;
    @XmlElement(name = "CreDtTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime creDtTm;
    @XmlElement(name = "NbOfTxs", required = true)
    protected String nbOfTxs;
    @XmlElement(name = "CtrlSum")
    protected BigDecimal ctrlSum;
    @XmlElement(name = "GrpCxl")
    protected Boolean grpCxl;
    @XmlElement(name = "InitgPty")
    protected PartyIdentification8 initgPty;
    @XmlElement(name = "FwdgAgt")
    protected BranchAndFinancialInstitutionIdentification3 fwdgAgt;
    @XmlElement(name = "DbtrAgt")
    protected BranchAndFinancialInstitutionIdentification3 dbtrAgt;
    @XmlElement(name = "CdtrAgt")
    protected BranchAndFinancialInstitutionIdentification3 cdtrAgt;
    @XmlElement(name = "InstgAgt")
    protected BranchAndFinancialInstitutionIdentification3 instgAgt;
    @XmlElement(name = "InstdAgt")
    protected BranchAndFinancialInstitutionIdentification3 instdAgt;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public GroupHeader7 setMsgId(String value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the creDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getCreDtTm() {
        return creDtTm;
    }

    /**
     * Sets the value of the creDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public GroupHeader7 setCreDtTm(OffsetDateTime value) {
        this.creDtTm = value;
        return this;
    }

    /**
     * Gets the value of the nbOfTxs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbOfTxs() {
        return nbOfTxs;
    }

    /**
     * Sets the value of the nbOfTxs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public GroupHeader7 setNbOfTxs(String value) {
        this.nbOfTxs = value;
        return this;
    }

    /**
     * Gets the value of the ctrlSum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCtrlSum() {
        return ctrlSum;
    }

    /**
     * Sets the value of the ctrlSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public GroupHeader7 setCtrlSum(BigDecimal value) {
        this.ctrlSum = value;
        return this;
    }

    /**
     * Gets the value of the grpCxl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGrpCxl() {
        return grpCxl;
    }

    /**
     * Sets the value of the grpCxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public GroupHeader7 setGrpCxl(Boolean value) {
        this.grpCxl = value;
        return this;
    }

    /**
     * Gets the value of the initgPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification8 }
     *     
     */
    public PartyIdentification8 getInitgPty() {
        return initgPty;
    }

    /**
     * Sets the value of the initgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification8 }
     *     
     */
    public GroupHeader7 setInitgPty(PartyIdentification8 value) {
        this.initgPty = value;
        return this;
    }

    /**
     * Gets the value of the fwdgAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification3 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification3 getFwdgAgt() {
        return fwdgAgt;
    }

    /**
     * Sets the value of the fwdgAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification3 }
     *     
     */
    public GroupHeader7 setFwdgAgt(BranchAndFinancialInstitutionIdentification3 value) {
        this.fwdgAgt = value;
        return this;
    }

    /**
     * Gets the value of the dbtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification3 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification3 getDbtrAgt() {
        return dbtrAgt;
    }

    /**
     * Sets the value of the dbtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification3 }
     *     
     */
    public GroupHeader7 setDbtrAgt(BranchAndFinancialInstitutionIdentification3 value) {
        this.dbtrAgt = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification3 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification3 getCdtrAgt() {
        return cdtrAgt;
    }

    /**
     * Sets the value of the cdtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification3 }
     *     
     */
    public GroupHeader7 setCdtrAgt(BranchAndFinancialInstitutionIdentification3 value) {
        this.cdtrAgt = value;
        return this;
    }

    /**
     * Gets the value of the instgAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification3 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification3 getInstgAgt() {
        return instgAgt;
    }

    /**
     * Sets the value of the instgAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification3 }
     *     
     */
    public GroupHeader7 setInstgAgt(BranchAndFinancialInstitutionIdentification3 value) {
        this.instgAgt = value;
        return this;
    }

    /**
     * Gets the value of the instdAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification3 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification3 getInstdAgt() {
        return instdAgt;
    }

    /**
     * Sets the value of the instdAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification3 }
     *     
     */
    public GroupHeader7 setInstdAgt(BranchAndFinancialInstitutionIdentification3 value) {
        this.instdAgt = value;
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

}
