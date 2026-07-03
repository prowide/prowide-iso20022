
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
@XmlType(name = "ProcessingStatus17Choice", propOrder = {
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
public class ProcessingStatus17Choice {

    @XmlElement(name = "AckdAccptd")
    protected ProprietaryReason1 ackdAccptd;
    @XmlElement(name = "AlrdyMtchdAndAffrmd")
    protected ProprietaryReason1 alrdyMtchdAndAffrmd;
    @XmlElement(name = "DfltActn")
    protected ProprietaryReason1 dfltActn;
    @XmlElement(name = "Done")
    protected ProprietaryReason1 done;
    @XmlElement(name = "ForcdRjctn")
    protected ProprietaryReason1 forcdRjctn;
    @XmlElement(name = "FullyExctdConfSnt")
    protected ProprietaryReason1 fullyExctdConfSnt;
    @XmlElement(name = "Futr")
    protected ProprietaryReason1 futr;
    @XmlElement(name = "Gnrtd")
    protected ProprietaryReason1 gnrtd;
    @XmlElement(name = "InRpr")
    protected InstructionProcessingReason2Choice inRpr;
    @XmlElement(name = "NoInstr")
    protected ProprietaryReason1 noInstr;
    @XmlElement(name = "OpnOrdr")
    protected ProprietaryReason1 opnOrdr;
    @XmlElement(name = "PdgPrcg")
    protected PendingProcessing1Choice pdgPrcg;
    @XmlElement(name = "RcvdAtIntrmy")
    protected ProprietaryReason1 rcvdAtIntrmy;
    @XmlElement(name = "Rjctd")
    protected InstructionProcessingReason1Choice rjctd;
    @XmlElement(name = "SttlmInstrSnt")
    protected ProprietaryReason1 sttlmInstrSnt;
    @XmlElement(name = "StgInstr")
    protected ProprietaryReason1 stgInstr;
    @XmlElement(name = "TradgSspdByStockXchg")
    protected ProprietaryReason1 tradgSspdByStockXchg;
    @XmlElement(name = "Trtd")
    protected ProprietaryReason1 trtd;
    @XmlElement(name = "PrtrySts")
    protected ProprietaryStatusAndReason1 prtrySts;

    /**
     * Gets the value of the ackdAccptd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ProprietaryReason1 getAckdAccptd() {
        return ackdAccptd;
    }

    /**
     * Sets the value of the ackdAccptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ProcessingStatus17Choice setAckdAccptd(ProprietaryReason1 value) {
        this.ackdAccptd = value;
        return this;
    }

    /**
     * Gets the value of the alrdyMtchdAndAffrmd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ProprietaryReason1 getAlrdyMtchdAndAffrmd() {
        return alrdyMtchdAndAffrmd;
    }

    /**
     * Sets the value of the alrdyMtchdAndAffrmd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ProcessingStatus17Choice setAlrdyMtchdAndAffrmd(ProprietaryReason1 value) {
        this.alrdyMtchdAndAffrmd = value;
        return this;
    }

    /**
     * Gets the value of the dfltActn property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ProprietaryReason1 getDfltActn() {
        return dfltActn;
    }

    /**
     * Sets the value of the dfltActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ProcessingStatus17Choice setDfltActn(ProprietaryReason1 value) {
        this.dfltActn = value;
        return this;
    }

    /**
     * Gets the value of the done property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ProprietaryReason1 getDone() {
        return done;
    }

    /**
     * Sets the value of the done property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ProcessingStatus17Choice setDone(ProprietaryReason1 value) {
        this.done = value;
        return this;
    }

    /**
     * Gets the value of the forcdRjctn property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ProprietaryReason1 getForcdRjctn() {
        return forcdRjctn;
    }

    /**
     * Sets the value of the forcdRjctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ProcessingStatus17Choice setForcdRjctn(ProprietaryReason1 value) {
        this.forcdRjctn = value;
        return this;
    }

    /**
     * Gets the value of the fullyExctdConfSnt property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ProprietaryReason1 getFullyExctdConfSnt() {
        return fullyExctdConfSnt;
    }

    /**
     * Sets the value of the fullyExctdConfSnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ProcessingStatus17Choice setFullyExctdConfSnt(ProprietaryReason1 value) {
        this.fullyExctdConfSnt = value;
        return this;
    }

    /**
     * Gets the value of the futr property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ProprietaryReason1 getFutr() {
        return futr;
    }

    /**
     * Sets the value of the futr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ProcessingStatus17Choice setFutr(ProprietaryReason1 value) {
        this.futr = value;
        return this;
    }

    /**
     * Gets the value of the gnrtd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ProprietaryReason1 getGnrtd() {
        return gnrtd;
    }

    /**
     * Sets the value of the gnrtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ProcessingStatus17Choice setGnrtd(ProprietaryReason1 value) {
        this.gnrtd = value;
        return this;
    }

    /**
     * Gets the value of the inRpr property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionProcessingReason2Choice }
     *     
     */
    public InstructionProcessingReason2Choice getInRpr() {
        return inRpr;
    }

    /**
     * Sets the value of the inRpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionProcessingReason2Choice }
     *     
     */
    public ProcessingStatus17Choice setInRpr(InstructionProcessingReason2Choice value) {
        this.inRpr = value;
        return this;
    }

    /**
     * Gets the value of the noInstr property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ProprietaryReason1 getNoInstr() {
        return noInstr;
    }

    /**
     * Sets the value of the noInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ProcessingStatus17Choice setNoInstr(ProprietaryReason1 value) {
        this.noInstr = value;
        return this;
    }

    /**
     * Gets the value of the opnOrdr property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ProprietaryReason1 getOpnOrdr() {
        return opnOrdr;
    }

    /**
     * Sets the value of the opnOrdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ProcessingStatus17Choice setOpnOrdr(ProprietaryReason1 value) {
        this.opnOrdr = value;
        return this;
    }

    /**
     * Gets the value of the pdgPrcg property.
     * 
     * @return
     *     possible object is
     *     {@link PendingProcessing1Choice }
     *     
     */
    public PendingProcessing1Choice getPdgPrcg() {
        return pdgPrcg;
    }

    /**
     * Sets the value of the pdgPrcg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingProcessing1Choice }
     *     
     */
    public ProcessingStatus17Choice setPdgPrcg(PendingProcessing1Choice value) {
        this.pdgPrcg = value;
        return this;
    }

    /**
     * Gets the value of the rcvdAtIntrmy property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ProprietaryReason1 getRcvdAtIntrmy() {
        return rcvdAtIntrmy;
    }

    /**
     * Sets the value of the rcvdAtIntrmy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ProcessingStatus17Choice setRcvdAtIntrmy(ProprietaryReason1 value) {
        this.rcvdAtIntrmy = value;
        return this;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionProcessingReason1Choice }
     *     
     */
    public InstructionProcessingReason1Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionProcessingReason1Choice }
     *     
     */
    public ProcessingStatus17Choice setRjctd(InstructionProcessingReason1Choice value) {
        this.rjctd = value;
        return this;
    }

    /**
     * Gets the value of the sttlmInstrSnt property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ProprietaryReason1 getSttlmInstrSnt() {
        return sttlmInstrSnt;
    }

    /**
     * Sets the value of the sttlmInstrSnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ProcessingStatus17Choice setSttlmInstrSnt(ProprietaryReason1 value) {
        this.sttlmInstrSnt = value;
        return this;
    }

    /**
     * Gets the value of the stgInstr property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ProprietaryReason1 getStgInstr() {
        return stgInstr;
    }

    /**
     * Sets the value of the stgInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ProcessingStatus17Choice setStgInstr(ProprietaryReason1 value) {
        this.stgInstr = value;
        return this;
    }

    /**
     * Gets the value of the tradgSspdByStockXchg property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ProprietaryReason1 getTradgSspdByStockXchg() {
        return tradgSspdByStockXchg;
    }

    /**
     * Sets the value of the tradgSspdByStockXchg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ProcessingStatus17Choice setTradgSspdByStockXchg(ProprietaryReason1 value) {
        this.tradgSspdByStockXchg = value;
        return this;
    }

    /**
     * Gets the value of the trtd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ProprietaryReason1 getTrtd() {
        return trtd;
    }

    /**
     * Sets the value of the trtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ProcessingStatus17Choice setTrtd(ProprietaryReason1 value) {
        this.trtd = value;
        return this;
    }

    /**
     * Gets the value of the prtrySts property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryStatusAndReason1 }
     *     
     */
    public ProprietaryStatusAndReason1 getPrtrySts() {
        return prtrySts;
    }

    /**
     * Sets the value of the prtrySts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryStatusAndReason1 }
     *     
     */
    public ProcessingStatus17Choice setPrtrySts(ProprietaryStatusAndReason1 value) {
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
