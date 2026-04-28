
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Defines the criteria based on which information is included.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntraPositionQueryCriteria5__1", propOrder = {
    "cxlReqId",
    "instrQryTp",
    "prcgSts",
    "sfkpgAcct",
    "acctOwnr",
    "msgOrgtr",
    "creDtTm"
})
public class IntraPositionQueryCriteria51 {

    @XmlElement(name = "CxlReqId")
    protected List<String> cxlReqId;
    @XmlElement(name = "InstrQryTp", required = true)
    @XmlSchemaType(name = "string")
    protected InstructionQueryType1Code instrQryTp;
    @XmlElement(name = "PrcgSts")
    protected List<CancellationProcessingStatus9Choice1> prcgSts;
    @XmlElement(name = "SfkpgAcct")
    protected SecuritiesAccount191 sfkpgAcct;
    @XmlElement(name = "AcctOwnr")
    protected SystemPartyIdentification61 acctOwnr;
    @XmlElement(name = "MsgOrgtr")
    protected SystemPartyIdentification61 msgOrgtr;
    @XmlElement(name = "CreDtTm")
    protected DateAndDateTimeSearch2Choice1 creDtTm;

    /**
     * Gets the value of the cxlReqId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cxlReqId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCxlReqId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the cxlReqId property.
     */
    public List<String> getCxlReqId() {
        if (cxlReqId == null) {
            cxlReqId = new ArrayList<>();
        }
        return this.cxlReqId;
    }

    /**
     * Gets the value of the instrQryTp property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionQueryType1Code }
     *     
     */
    public InstructionQueryType1Code getInstrQryTp() {
        return instrQryTp;
    }

    /**
     * Sets the value of the instrQryTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionQueryType1Code }
     *     
     */
    public IntraPositionQueryCriteria51 setInstrQryTp(InstructionQueryType1Code value) {
        this.instrQryTp = value;
        return this;
    }

    /**
     * Gets the value of the prcgSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prcgSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrcgSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CancellationProcessingStatus9Choice1 }
     * 
     * 
     * @return
     *     The value of the prcgSts property.
     */
    public List<CancellationProcessingStatus9Choice1> getPrcgSts() {
        if (prcgSts == null) {
            prcgSts = new ArrayList<>();
        }
        return this.prcgSts;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount191 }
     *     
     */
    public SecuritiesAccount191 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount191 }
     *     
     */
    public IntraPositionQueryCriteria51 setSfkpgAcct(SecuritiesAccount191 value) {
        this.sfkpgAcct = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyIdentification61 }
     *     
     */
    public SystemPartyIdentification61 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyIdentification61 }
     *     
     */
    public IntraPositionQueryCriteria51 setAcctOwnr(SystemPartyIdentification61 value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the msgOrgtr property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyIdentification61 }
     *     
     */
    public SystemPartyIdentification61 getMsgOrgtr() {
        return msgOrgtr;
    }

    /**
     * Sets the value of the msgOrgtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyIdentification61 }
     *     
     */
    public IntraPositionQueryCriteria51 setMsgOrgtr(SystemPartyIdentification61 value) {
        this.msgOrgtr = value;
        return this;
    }

    /**
     * Gets the value of the creDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeSearch2Choice1 }
     *     
     */
    public DateAndDateTimeSearch2Choice1 getCreDtTm() {
        return creDtTm;
    }

    /**
     * Sets the value of the creDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeSearch2Choice1 }
     *     
     */
    public IntraPositionQueryCriteria51 setCreDtTm(DateAndDateTimeSearch2Choice1 value) {
        this.creDtTm = value;
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
     * Adds a new item to the cxlReqId list.
     * @see #getCxlReqId()
     * 
     */
    public IntraPositionQueryCriteria51 addCxlReqId(String cxlReqId) {
        getCxlReqId().add(cxlReqId);
        return this;
    }

    /**
     * Adds a new item to the prcgSts list.
     * @see #getPrcgSts()
     * 
     */
    public IntraPositionQueryCriteria51 addPrcgSts(CancellationProcessingStatus9Choice1 prcgSts) {
        getPrcgSts().add(prcgSts);
        return this;
    }

}
