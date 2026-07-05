
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Choice of status for the processing.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessingStatus98Choice", propOrder = {
    "ackdAccptd",
    "alrdyMtchdAndAffrmd",
    "dfltActn",
    "done",
    "forcdRjctn",
    "fullyExctdConfSnt",
    "futr",
    "gnrtd",
    "inRpr",
    "noInstr",
    "opnOrdr",
    "pdgPrcg",
    "rcvdAtIntrmy",
    "rjctd",
    "sttlmInstrSnt",
    "stgInstr",
    "tradgSspdByStockXchg",
    "trtd",
    "prtrySts"
})
public class ProcessingStatus98Choice {

    @XmlElement(name = "AckdAccptd")
    protected ProprietaryReason4 ackdAccptd;
    @XmlElement(name = "AlrdyMtchdAndAffrmd")
    protected ProprietaryReason4 alrdyMtchdAndAffrmd;
    @XmlElement(name = "DfltActn")
    protected ProprietaryReason4 dfltActn;
    @XmlElement(name = "Done")
    protected ProprietaryReason4 done;
    @XmlElement(name = "ForcdRjctn")
    protected ProprietaryReason4 forcdRjctn;
    @XmlElement(name = "FullyExctdConfSnt")
    protected ProprietaryReason4 fullyExctdConfSnt;
    @XmlElement(name = "Futr")
    protected ProprietaryReason4 futr;
    @XmlElement(name = "Gnrtd")
    protected ProprietaryReason4 gnrtd;
    @XmlElement(name = "InRpr")
    protected InstructionProcessingReason4Choice inRpr;
    @XmlElement(name = "NoInstr")
    protected ProprietaryReason4 noInstr;
    @XmlElement(name = "OpnOrdr")
    protected ProprietaryReason4 opnOrdr;
    @XmlElement(name = "PdgPrcg")
    protected PendingProcessing2Choice pdgPrcg;
    @XmlElement(name = "RcvdAtIntrmy")
    protected ProprietaryReason4 rcvdAtIntrmy;
    @XmlElement(name = "Rjctd")
    protected InstructionProcessingReason3Choice rjctd;
    @XmlElement(name = "SttlmInstrSnt")
    protected ProprietaryReason4 sttlmInstrSnt;
    @XmlElement(name = "StgInstr")
    protected ProprietaryReason4 stgInstr;
    @XmlElement(name = "TradgSspdByStockXchg")
    protected ProprietaryReason4 tradgSspdByStockXchg;
    @XmlElement(name = "Trtd")
    protected ProprietaryReason4 trtd;
    @XmlElement(name = "PrtrySts")
    protected ProprietaryStatusAndReason6 prtrySts;

    /**
     * Gets the value of the ackdAccptd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getAckdAccptd() {
        return ackdAccptd;
    }

    /**
     * Sets the value of the ackdAccptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProcessingStatus98Choice setAckdAccptd(ProprietaryReason4 value) {
        this.ackdAccptd = value;
        return this;
    }

    /**
     * Gets the value of the alrdyMtchdAndAffrmd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getAlrdyMtchdAndAffrmd() {
        return alrdyMtchdAndAffrmd;
    }

    /**
     * Sets the value of the alrdyMtchdAndAffrmd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProcessingStatus98Choice setAlrdyMtchdAndAffrmd(ProprietaryReason4 value) {
        this.alrdyMtchdAndAffrmd = value;
        return this;
    }

    /**
     * Gets the value of the dfltActn property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getDfltActn() {
        return dfltActn;
    }

    /**
     * Sets the value of the dfltActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProcessingStatus98Choice setDfltActn(ProprietaryReason4 value) {
        this.dfltActn = value;
        return this;
    }

    /**
     * Gets the value of the done property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getDone() {
        return done;
    }

    /**
     * Sets the value of the done property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProcessingStatus98Choice setDone(ProprietaryReason4 value) {
        this.done = value;
        return this;
    }

    /**
     * Gets the value of the forcdRjctn property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getForcdRjctn() {
        return forcdRjctn;
    }

    /**
     * Sets the value of the forcdRjctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProcessingStatus98Choice setForcdRjctn(ProprietaryReason4 value) {
        this.forcdRjctn = value;
        return this;
    }

    /**
     * Gets the value of the fullyExctdConfSnt property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getFullyExctdConfSnt() {
        return fullyExctdConfSnt;
    }

    /**
     * Sets the value of the fullyExctdConfSnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProcessingStatus98Choice setFullyExctdConfSnt(ProprietaryReason4 value) {
        this.fullyExctdConfSnt = value;
        return this;
    }

    /**
     * Gets the value of the futr property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getFutr() {
        return futr;
    }

    /**
     * Sets the value of the futr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProcessingStatus98Choice setFutr(ProprietaryReason4 value) {
        this.futr = value;
        return this;
    }

    /**
     * Gets the value of the gnrtd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getGnrtd() {
        return gnrtd;
    }

    /**
     * Sets the value of the gnrtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProcessingStatus98Choice setGnrtd(ProprietaryReason4 value) {
        this.gnrtd = value;
        return this;
    }

    /**
     * Gets the value of the inRpr property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionProcessingReason4Choice }
     *     
     */
    public InstructionProcessingReason4Choice getInRpr() {
        return inRpr;
    }

    /**
     * Sets the value of the inRpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionProcessingReason4Choice }
     *     
     */
    public ProcessingStatus98Choice setInRpr(InstructionProcessingReason4Choice value) {
        this.inRpr = value;
        return this;
    }

    /**
     * Gets the value of the noInstr property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getNoInstr() {
        return noInstr;
    }

    /**
     * Sets the value of the noInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProcessingStatus98Choice setNoInstr(ProprietaryReason4 value) {
        this.noInstr = value;
        return this;
    }

    /**
     * Gets the value of the opnOrdr property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getOpnOrdr() {
        return opnOrdr;
    }

    /**
     * Sets the value of the opnOrdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProcessingStatus98Choice setOpnOrdr(ProprietaryReason4 value) {
        this.opnOrdr = value;
        return this;
    }

    /**
     * Gets the value of the pdgPrcg property.
     * 
     * @return
     *     possible object is
     *     {@link PendingProcessing2Choice }
     *     
     */
    public PendingProcessing2Choice getPdgPrcg() {
        return pdgPrcg;
    }

    /**
     * Sets the value of the pdgPrcg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingProcessing2Choice }
     *     
     */
    public ProcessingStatus98Choice setPdgPrcg(PendingProcessing2Choice value) {
        this.pdgPrcg = value;
        return this;
    }

    /**
     * Gets the value of the rcvdAtIntrmy property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getRcvdAtIntrmy() {
        return rcvdAtIntrmy;
    }

    /**
     * Sets the value of the rcvdAtIntrmy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProcessingStatus98Choice setRcvdAtIntrmy(ProprietaryReason4 value) {
        this.rcvdAtIntrmy = value;
        return this;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionProcessingReason3Choice }
     *     
     */
    public InstructionProcessingReason3Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionProcessingReason3Choice }
     *     
     */
    public ProcessingStatus98Choice setRjctd(InstructionProcessingReason3Choice value) {
        this.rjctd = value;
        return this;
    }

    /**
     * Gets the value of the sttlmInstrSnt property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getSttlmInstrSnt() {
        return sttlmInstrSnt;
    }

    /**
     * Sets the value of the sttlmInstrSnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProcessingStatus98Choice setSttlmInstrSnt(ProprietaryReason4 value) {
        this.sttlmInstrSnt = value;
        return this;
    }

    /**
     * Gets the value of the stgInstr property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getStgInstr() {
        return stgInstr;
    }

    /**
     * Sets the value of the stgInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProcessingStatus98Choice setStgInstr(ProprietaryReason4 value) {
        this.stgInstr = value;
        return this;
    }

    /**
     * Gets the value of the tradgSspdByStockXchg property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getTradgSspdByStockXchg() {
        return tradgSspdByStockXchg;
    }

    /**
     * Sets the value of the tradgSspdByStockXchg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProcessingStatus98Choice setTradgSspdByStockXchg(ProprietaryReason4 value) {
        this.tradgSspdByStockXchg = value;
        return this;
    }

    /**
     * Gets the value of the trtd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getTrtd() {
        return trtd;
    }

    /**
     * Sets the value of the trtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProcessingStatus98Choice setTrtd(ProprietaryReason4 value) {
        this.trtd = value;
        return this;
    }

    /**
     * Gets the value of the prtrySts property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryStatusAndReason6 }
     *     
     */
    public ProprietaryStatusAndReason6 getPrtrySts() {
        return prtrySts;
    }

    /**
     * Sets the value of the prtrySts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryStatusAndReason6 }
     *     
     */
    public ProcessingStatus98Choice setPrtrySts(ProprietaryStatusAndReason6 value) {
        this.prtrySts = value;
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
