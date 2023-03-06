
package com.prowidesoftware.swift.model.mx.dic;

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
 * Provides information about the standing instruction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionStandingInstructionGeneralInformation1", propOrder = {
    "stgInstrTp",
    "evtTp",
    "instgPtyId",
    "clntStgInstrId",
    "acctDtls",
    "undrlygScty"
})
public class CorporateActionStandingInstructionGeneralInformation1 {

    @XmlElement(name = "StgInstrTp", required = true)
    @XmlSchemaType(name = "string")
    protected StandingInstructionType1Code stgInstrTp;
    @XmlElement(name = "EvtTp")
    protected List<CorporateActionEventType2FormatChoice> evtTp;
    @XmlElement(name = "InstgPtyId", required = true)
    protected PartyIdentification2Choice instgPtyId;
    @XmlElement(name = "ClntStgInstrId", required = true)
    protected String clntStgInstrId;
    @XmlElement(name = "AcctDtls")
    protected List<IncludedAccount1> acctDtls;
    @XmlElement(name = "UndrlygScty")
    protected FinancialInstrumentDescription3 undrlygScty;

    /**
     * Gets the value of the stgInstrTp property.
     * 
     * @return
     *     possible object is
     *     {@link StandingInstructionType1Code }
     *     
     */
    public StandingInstructionType1Code getStgInstrTp() {
        return stgInstrTp;
    }

    /**
     * Sets the value of the stgInstrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandingInstructionType1Code }
     *     
     */
    public CorporateActionStandingInstructionGeneralInformation1 setStgInstrTp(StandingInstructionType1Code value) {
        this.stgInstrTp = value;
        return this;
    }

    /**
     * Gets the value of the evtTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evtTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvtTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionEventType2FormatChoice }
     * 
     * 
     */
    public List<CorporateActionEventType2FormatChoice> getEvtTp() {
        if (evtTp == null) {
            evtTp = new ArrayList<CorporateActionEventType2FormatChoice>();
        }
        return this.evtTp;
    }

    /**
     * Gets the value of the instgPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getInstgPtyId() {
        return instgPtyId;
    }

    /**
     * Sets the value of the instgPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public CorporateActionStandingInstructionGeneralInformation1 setInstgPtyId(PartyIdentification2Choice value) {
        this.instgPtyId = value;
        return this;
    }

    /**
     * Gets the value of the clntStgInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntStgInstrId() {
        return clntStgInstrId;
    }

    /**
     * Sets the value of the clntStgInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionStandingInstructionGeneralInformation1 setClntStgInstrId(String value) {
        this.clntStgInstrId = value;
        return this;
    }

    /**
     * Gets the value of the acctDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IncludedAccount1 }
     * 
     * 
     */
    public List<IncludedAccount1> getAcctDtls() {
        if (acctDtls == null) {
            acctDtls = new ArrayList<IncludedAccount1>();
        }
        return this.acctDtls;
    }

    /**
     * Gets the value of the undrlygScty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentDescription3 }
     *     
     */
    public FinancialInstrumentDescription3 getUndrlygScty() {
        return undrlygScty;
    }

    /**
     * Sets the value of the undrlygScty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentDescription3 }
     *     
     */
    public CorporateActionStandingInstructionGeneralInformation1 setUndrlygScty(FinancialInstrumentDescription3 value) {
        this.undrlygScty = value;
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
     * Adds a new item to the evtTp list.
     * @see #getEvtTp()
     * 
     */
    public CorporateActionStandingInstructionGeneralInformation1 addEvtTp(CorporateActionEventType2FormatChoice evtTp) {
        getEvtTp().add(evtTp);
        return this;
    }

    /**
     * Adds a new item to the acctDtls list.
     * @see #getAcctDtls()
     * 
     */
    public CorporateActionStandingInstructionGeneralInformation1 addAcctDtls(IncludedAccount1 acctDtls) {
        getAcctDtls().add(acctDtls);
        return this;
    }

}
