
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
 * Provides corporate action option details about total instructed balance.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstructedCorporateActionOption15", propOrder = {
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
public class InstructedCorporateActionOption15 {

    @XmlElement(name = "OptnNb")
    protected String optnNb;
    @XmlElement(name = "OptnTp", required = true)
    protected CorporateActionOption30Choice optnTp;
    @XmlElement(name = "InstdBal", required = true)
    protected BalanceFormat5Choice instdBal;
    @XmlElement(name = "DfltActn")
    protected DefaultProcessingOrStandingInstruction1Choice dfltActn;
    @XmlElement(name = "OptnAccptdInstdBal")
    protected SignedQuantityFormat6 optnAccptdInstdBal;
    @XmlElement(name = "OptnCancInstrBal")
    protected SignedQuantityFormat6 optnCancInstrBal;
    @XmlElement(name = "OptnPdgInstrBal")
    protected SignedQuantityFormat6 optnPdgInstrBal;
    @XmlElement(name = "OptnRjctdInstrBal")
    protected SignedQuantityFormat6 optnRjctdInstrBal;
    @XmlElement(name = "OptnPrtctInstrBal")
    protected SignedQuantityFormat6 optnPrtctInstrBal;
    @XmlElement(name = "EvtDdlns", required = true)
    protected CorporateActionEventDeadlines3 evtDdlns;
    @XmlElement(name = "OptnInstrDtls")
    protected List<OptionInstructionDetails5> optnInstrDtls;

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
    public InstructedCorporateActionOption15 setOptnNb(String value) {
        this.optnNb = value;
        return this;
    }

    /**
     * Gets the value of the optnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionOption30Choice }
     *     
     */
    public CorporateActionOption30Choice getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionOption30Choice }
     *     
     */
    public InstructedCorporateActionOption15 setOptnTp(CorporateActionOption30Choice value) {
        this.optnTp = value;
        return this;
    }

    /**
     * Gets the value of the instdBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat5Choice }
     *     
     */
    public BalanceFormat5Choice getInstdBal() {
        return instdBal;
    }

    /**
     * Sets the value of the instdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat5Choice }
     *     
     */
    public InstructedCorporateActionOption15 setInstdBal(BalanceFormat5Choice value) {
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
    public InstructedCorporateActionOption15 setDfltActn(DefaultProcessingOrStandingInstruction1Choice value) {
        this.dfltActn = value;
        return this;
    }

    /**
     * Gets the value of the optnAccptdInstdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat6 }
     *     
     */
    public SignedQuantityFormat6 getOptnAccptdInstdBal() {
        return optnAccptdInstdBal;
    }

    /**
     * Sets the value of the optnAccptdInstdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat6 }
     *     
     */
    public InstructedCorporateActionOption15 setOptnAccptdInstdBal(SignedQuantityFormat6 value) {
        this.optnAccptdInstdBal = value;
        return this;
    }

    /**
     * Gets the value of the optnCancInstrBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat6 }
     *     
     */
    public SignedQuantityFormat6 getOptnCancInstrBal() {
        return optnCancInstrBal;
    }

    /**
     * Sets the value of the optnCancInstrBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat6 }
     *     
     */
    public InstructedCorporateActionOption15 setOptnCancInstrBal(SignedQuantityFormat6 value) {
        this.optnCancInstrBal = value;
        return this;
    }

    /**
     * Gets the value of the optnPdgInstrBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat6 }
     *     
     */
    public SignedQuantityFormat6 getOptnPdgInstrBal() {
        return optnPdgInstrBal;
    }

    /**
     * Sets the value of the optnPdgInstrBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat6 }
     *     
     */
    public InstructedCorporateActionOption15 setOptnPdgInstrBal(SignedQuantityFormat6 value) {
        this.optnPdgInstrBal = value;
        return this;
    }

    /**
     * Gets the value of the optnRjctdInstrBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat6 }
     *     
     */
    public SignedQuantityFormat6 getOptnRjctdInstrBal() {
        return optnRjctdInstrBal;
    }

    /**
     * Sets the value of the optnRjctdInstrBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat6 }
     *     
     */
    public InstructedCorporateActionOption15 setOptnRjctdInstrBal(SignedQuantityFormat6 value) {
        this.optnRjctdInstrBal = value;
        return this;
    }

    /**
     * Gets the value of the optnPrtctInstrBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat6 }
     *     
     */
    public SignedQuantityFormat6 getOptnPrtctInstrBal() {
        return optnPrtctInstrBal;
    }

    /**
     * Sets the value of the optnPrtctInstrBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat6 }
     *     
     */
    public InstructedCorporateActionOption15 setOptnPrtctInstrBal(SignedQuantityFormat6 value) {
        this.optnPrtctInstrBal = value;
        return this;
    }

    /**
     * Gets the value of the evtDdlns property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEventDeadlines3 }
     *     
     */
    public CorporateActionEventDeadlines3 getEvtDdlns() {
        return evtDdlns;
    }

    /**
     * Sets the value of the evtDdlns property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEventDeadlines3 }
     *     
     */
    public InstructedCorporateActionOption15 setEvtDdlns(CorporateActionEventDeadlines3 value) {
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
     * {@link OptionInstructionDetails5 }
     * 
     * 
     */
    public List<OptionInstructionDetails5> getOptnInstrDtls() {
        if (optnInstrDtls == null) {
            optnInstrDtls = new ArrayList<OptionInstructionDetails5>();
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
    public InstructedCorporateActionOption15 addOptnInstrDtls(OptionInstructionDetails5 optnInstrDtls) {
        getOptnInstrDtls().add(optnInstrDtls);
        return this;
    }

}
