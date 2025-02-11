
package com.prowidesoftware.swift.model.mx.dic;

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
@XmlType(name = "InstructedCorporateActionOption9", propOrder = {
    "optnNb",
    "optnTp",
    "instdBal",
    "dfltActn",
    "evtDdlns"
})
public class InstructedCorporateActionOption9 {

    @XmlElement(name = "OptnNb")
    protected String optnNb;
    @XmlElement(name = "OptnTp", required = true)
    protected CorporateActionOption23Choice optnTp;
    @XmlElement(name = "InstdBal", required = true)
    protected BalanceFormat7Choice instdBal;
    @XmlElement(name = "DfltActn")
    protected DefaultProcessingOrStandingInstruction1Choice dfltActn;
    @XmlElement(name = "EvtDdlns", required = true)
    protected CorporateActionEventDeadlines2 evtDdlns;

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
    public InstructedCorporateActionOption9 setOptnNb(String value) {
        this.optnNb = value;
        return this;
    }

    /**
     * Gets the value of the optnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionOption23Choice }
     *     
     */
    public CorporateActionOption23Choice getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionOption23Choice }
     *     
     */
    public InstructedCorporateActionOption9 setOptnTp(CorporateActionOption23Choice value) {
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
    public InstructedCorporateActionOption9 setInstdBal(BalanceFormat7Choice value) {
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
    public InstructedCorporateActionOption9 setDfltActn(DefaultProcessingOrStandingInstruction1Choice value) {
        this.dfltActn = value;
        return this;
    }

    /**
     * Gets the value of the evtDdlns property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEventDeadlines2 }
     *     
     */
    public CorporateActionEventDeadlines2 getEvtDdlns() {
        return evtDdlns;
    }

    /**
     * Sets the value of the evtDdlns property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEventDeadlines2 }
     *     
     */
    public InstructedCorporateActionOption9 setEvtDdlns(CorporateActionEventDeadlines2 value) {
        this.evtDdlns = value;
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
