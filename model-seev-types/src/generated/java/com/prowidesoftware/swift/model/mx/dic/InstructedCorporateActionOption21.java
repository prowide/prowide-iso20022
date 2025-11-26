
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
@XmlType(name = "InstructedCorporateActionOption21", propOrder = {
    "optnNb",
    "optnTp",
    "instdBal",
    "dfltActn",
    "optnAccptdInstdBal",
    "optnCancInstrBal",
    "optnPdgInstrBal",
    "optnRjctdInstrBal",
    "optnRtrdInstdBal",
    "optnPrtctInstrBal",
    "evtDdlns",
    "optnInstrDtls"
})
public class InstructedCorporateActionOption21 {

    @XmlElement(name = "OptnNb")
    protected String optnNb;
    @XmlElement(name = "OptnTp", required = true)
    protected CorporateActionOption30Choice optnTp;
    @XmlElement(name = "InstdBal", required = true)
    protected BalanceFormat11Choice instdBal;
    @XmlElement(name = "DfltActn")
    protected DefaultProcessingOrStandingInstruction2Choice dfltActn;
    @XmlElement(name = "OptnAccptdInstdBal")
    protected SignedQuantityFormat10 optnAccptdInstdBal;
    @XmlElement(name = "OptnCancInstrBal")
    protected SignedQuantityFormat10 optnCancInstrBal;
    @XmlElement(name = "OptnPdgInstrBal")
    protected SignedQuantityFormat10 optnPdgInstrBal;
    @XmlElement(name = "OptnRjctdInstrBal")
    protected SignedQuantityFormat10 optnRjctdInstrBal;
    @XmlElement(name = "OptnRtrdInstdBal")
    protected SignedQuantityFormat10 optnRtrdInstdBal;
    @XmlElement(name = "OptnPrtctInstrBal")
    protected SignedQuantityFormat10 optnPrtctInstrBal;
    @XmlElement(name = "EvtDdlns", required = true)
    protected CorporateActionEventDeadlines3 evtDdlns;
    @XmlElement(name = "OptnInstrDtls")
    protected List<OptionInstructionDetails11> optnInstrDtls;

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
    public InstructedCorporateActionOption21 setOptnNb(String value) {
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
    public InstructedCorporateActionOption21 setOptnTp(CorporateActionOption30Choice value) {
        this.optnTp = value;
        return this;
    }

    /**
     * Gets the value of the instdBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat11Choice }
     *     
     */
    public BalanceFormat11Choice getInstdBal() {
        return instdBal;
    }

    /**
     * Sets the value of the instdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat11Choice }
     *     
     */
    public InstructedCorporateActionOption21 setInstdBal(BalanceFormat11Choice value) {
        this.instdBal = value;
        return this;
    }

    /**
     * Gets the value of the dfltActn property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultProcessingOrStandingInstruction2Choice }
     *     
     */
    public DefaultProcessingOrStandingInstruction2Choice getDfltActn() {
        return dfltActn;
    }

    /**
     * Sets the value of the dfltActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultProcessingOrStandingInstruction2Choice }
     *     
     */
    public InstructedCorporateActionOption21 setDfltActn(DefaultProcessingOrStandingInstruction2Choice value) {
        this.dfltActn = value;
        return this;
    }

    /**
     * Gets the value of the optnAccptdInstdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public SignedQuantityFormat10 getOptnAccptdInstdBal() {
        return optnAccptdInstdBal;
    }

    /**
     * Sets the value of the optnAccptdInstdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public InstructedCorporateActionOption21 setOptnAccptdInstdBal(SignedQuantityFormat10 value) {
        this.optnAccptdInstdBal = value;
        return this;
    }

    /**
     * Gets the value of the optnCancInstrBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public SignedQuantityFormat10 getOptnCancInstrBal() {
        return optnCancInstrBal;
    }

    /**
     * Sets the value of the optnCancInstrBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public InstructedCorporateActionOption21 setOptnCancInstrBal(SignedQuantityFormat10 value) {
        this.optnCancInstrBal = value;
        return this;
    }

    /**
     * Gets the value of the optnPdgInstrBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public SignedQuantityFormat10 getOptnPdgInstrBal() {
        return optnPdgInstrBal;
    }

    /**
     * Sets the value of the optnPdgInstrBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public InstructedCorporateActionOption21 setOptnPdgInstrBal(SignedQuantityFormat10 value) {
        this.optnPdgInstrBal = value;
        return this;
    }

    /**
     * Gets the value of the optnRjctdInstrBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public SignedQuantityFormat10 getOptnRjctdInstrBal() {
        return optnRjctdInstrBal;
    }

    /**
     * Sets the value of the optnRjctdInstrBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public InstructedCorporateActionOption21 setOptnRjctdInstrBal(SignedQuantityFormat10 value) {
        this.optnRjctdInstrBal = value;
        return this;
    }

    /**
     * Gets the value of the optnRtrdInstdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public SignedQuantityFormat10 getOptnRtrdInstdBal() {
        return optnRtrdInstdBal;
    }

    /**
     * Sets the value of the optnRtrdInstdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public InstructedCorporateActionOption21 setOptnRtrdInstdBal(SignedQuantityFormat10 value) {
        this.optnRtrdInstdBal = value;
        return this;
    }

    /**
     * Gets the value of the optnPrtctInstrBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public SignedQuantityFormat10 getOptnPrtctInstrBal() {
        return optnPrtctInstrBal;
    }

    /**
     * Sets the value of the optnPrtctInstrBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public InstructedCorporateActionOption21 setOptnPrtctInstrBal(SignedQuantityFormat10 value) {
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
    public InstructedCorporateActionOption21 setEvtDdlns(CorporateActionEventDeadlines3 value) {
        this.evtDdlns = value;
        return this;
    }

    /**
     * Gets the value of the optnInstrDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the optnInstrDtls property.
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
     * {@link OptionInstructionDetails11 }
     * 
     * 
     * @return
     *     The value of the optnInstrDtls property.
     */
    public List<OptionInstructionDetails11> getOptnInstrDtls() {
        if (optnInstrDtls == null) {
            optnInstrDtls = new ArrayList<>();
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
    public InstructedCorporateActionOption21 addOptnInstrDtls(OptionInstructionDetails11 optnInstrDtls) {
        getOptnInstrDtls().add(optnInstrDtls);
        return this;
    }

}
