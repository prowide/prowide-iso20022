
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
 * Provides corporate action option details about total instructed balance.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstructedCorporateActionOption16", propOrder = {
    "optnNb",
    "optnTp",
    "instdBal",
    "dfltActn",
    "optnAccptdInstdBal",
    "optnCancInstrBal",
    "optnPdgInstrBal",
    "optnRjctdInstrBal",
    "optnPrtctInstrBal",
    "evtDdlns",
    "optnInstrDtls"
})
public class InstructedCorporateActionOption16 {

    @XmlElement(name = "OptnNb")
    protected String optnNb;
    @XmlElement(name = "OptnTp", required = true)
    protected CorporateActionOption36Choice optnTp;
    @XmlElement(name = "InstdBal", required = true)
    protected BalanceFormat7Choice instdBal;
    @XmlElement(name = "DfltActn")
    protected DefaultProcessingOrStandingInstruction1Choice dfltActn;
    @XmlElement(name = "OptnAccptdInstdBal")
    protected SignedQuantityFormat9 optnAccptdInstdBal;
    @XmlElement(name = "OptnCancInstrBal")
    protected SignedQuantityFormat9 optnCancInstrBal;
    @XmlElement(name = "OptnPdgInstrBal")
    protected SignedQuantityFormat9 optnPdgInstrBal;
    @XmlElement(name = "OptnRjctdInstrBal")
    protected SignedQuantityFormat9 optnRjctdInstrBal;
    @XmlElement(name = "OptnPrtctInstrBal")
    protected SignedQuantityFormat9 optnPrtctInstrBal;
    @XmlElement(name = "EvtDdlns", required = true)
    protected CorporateActionEventDeadlines4 evtDdlns;
    @XmlElement(name = "OptnInstrDtls")
    protected List<OptionInstructionDetails6> optnInstrDtls;

    /**
     * Gets the value of the optnNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptnNb() {
        return optnNb;
    }

    /**
     * Sets the value of the optnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InstructedCorporateActionOption16 setOptnNb(String value) {
        this.optnNb = value;
        return this;
    }

    /**
     * Gets the value of the optnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionOption36Choice }
     *     
     */
    public CorporateActionOption36Choice getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionOption36Choice }
     *     
     */
    public InstructedCorporateActionOption16 setOptnTp(CorporateActionOption36Choice value) {
        this.optnTp = value;
        return this;
    }

    /**
     * Gets the value of the instdBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat7Choice }
     *     
     */
    public BalanceFormat7Choice getInstdBal() {
        return instdBal;
    }

    /**
     * Sets the value of the instdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat7Choice }
     *     
     */
    public InstructedCorporateActionOption16 setInstdBal(BalanceFormat7Choice value) {
        this.instdBal = value;
        return this;
    }

    /**
     * Gets the value of the dfltActn property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultProcessingOrStandingInstruction1Choice }
     *     
     */
    public DefaultProcessingOrStandingInstruction1Choice getDfltActn() {
        return dfltActn;
    }

    /**
     * Sets the value of the dfltActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultProcessingOrStandingInstruction1Choice }
     *     
     */
    public InstructedCorporateActionOption16 setDfltActn(DefaultProcessingOrStandingInstruction1Choice value) {
        this.dfltActn = value;
        return this;
    }

    /**
     * Gets the value of the optnAccptdInstdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public SignedQuantityFormat9 getOptnAccptdInstdBal() {
        return optnAccptdInstdBal;
    }

    /**
     * Sets the value of the optnAccptdInstdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public InstructedCorporateActionOption16 setOptnAccptdInstdBal(SignedQuantityFormat9 value) {
        this.optnAccptdInstdBal = value;
        return this;
    }

    /**
     * Gets the value of the optnCancInstrBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public SignedQuantityFormat9 getOptnCancInstrBal() {
        return optnCancInstrBal;
    }

    /**
     * Sets the value of the optnCancInstrBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public InstructedCorporateActionOption16 setOptnCancInstrBal(SignedQuantityFormat9 value) {
        this.optnCancInstrBal = value;
        return this;
    }

    /**
     * Gets the value of the optnPdgInstrBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public SignedQuantityFormat9 getOptnPdgInstrBal() {
        return optnPdgInstrBal;
    }

    /**
     * Sets the value of the optnPdgInstrBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public InstructedCorporateActionOption16 setOptnPdgInstrBal(SignedQuantityFormat9 value) {
        this.optnPdgInstrBal = value;
        return this;
    }

    /**
     * Gets the value of the optnRjctdInstrBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public SignedQuantityFormat9 getOptnRjctdInstrBal() {
        return optnRjctdInstrBal;
    }

    /**
     * Sets the value of the optnRjctdInstrBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public InstructedCorporateActionOption16 setOptnRjctdInstrBal(SignedQuantityFormat9 value) {
        this.optnRjctdInstrBal = value;
        return this;
    }

    /**
     * Gets the value of the optnPrtctInstrBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public SignedQuantityFormat9 getOptnPrtctInstrBal() {
        return optnPrtctInstrBal;
    }

    /**
     * Sets the value of the optnPrtctInstrBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public InstructedCorporateActionOption16 setOptnPrtctInstrBal(SignedQuantityFormat9 value) {
        this.optnPrtctInstrBal = value;
        return this;
    }

    /**
     * Gets the value of the evtDdlns property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEventDeadlines4 }
     *     
     */
    public CorporateActionEventDeadlines4 getEvtDdlns() {
        return evtDdlns;
    }

    /**
     * Sets the value of the evtDdlns property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEventDeadlines4 }
     *     
     */
    public InstructedCorporateActionOption16 setEvtDdlns(CorporateActionEventDeadlines4 value) {
        this.evtDdlns = value;
        return this;
    }

    /**
     * Gets the value of the optnInstrDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optnInstrDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptnInstrDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionInstructionDetails6 }
     * 
     * 
     */
    public List<OptionInstructionDetails6> getOptnInstrDtls() {
        if (optnInstrDtls == null) {
            optnInstrDtls = new ArrayList<OptionInstructionDetails6>();
        }
        return this.optnInstrDtls;
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
     * Adds a new item to the optnInstrDtls list.
     * @see #getOptnInstrDtls()
     * 
     */
    public InstructedCorporateActionOption16 addOptnInstrDtls(OptionInstructionDetails6 optnInstrDtls) {
        getOptnInstrDtls().add(optnInstrDtls);
        return this;
    }

}
