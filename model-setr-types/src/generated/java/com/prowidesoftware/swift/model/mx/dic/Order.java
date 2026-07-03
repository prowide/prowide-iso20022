
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
 * Scope
 * An instructing party, eg, an investment manager, sends the Order message to an executing party, eg, a broker, to instruct the executing party to buy or sell a given quantity of a specified financial instrument (single or multileg).
 * Usage
 * Where permitted, an executing party, eg, a broker, sends directly the Order to a point of execution such as an exchange. The Order may also be used in broker-to-broker communications.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Order", propOrder = {
    "id",
    "refs",
    "ordrDtls",
    "ordrQty",
    "ordrParamsDtls",
    "trggrgInstrDtls",
    "dscrtnInstrs",
    "dispInstrsDtls",
    "sttlmDtls"
})
public class Order {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification11 id;
    @XmlElement(name = "Refs", required = true)
    protected Reference8 refs;
    @XmlElement(name = "OrdrDtls", required = true)
    protected SingleOrMultiLegOrderChoice ordrDtls;
    @XmlElement(name = "OrdrQty")
    protected OrderQuantity3 ordrQty;
    @XmlElement(name = "OrdrParamsDtls", required = true)
    protected OrderParameters1 ordrParamsDtls;
    @XmlElement(name = "TrggrgInstrDtls")
    protected TriggeringInstructions trggrgInstrDtls;
    @XmlElement(name = "DscrtnInstrs")
    protected DiscretionInstructions1 dscrtnInstrs;
    @XmlElement(name = "DispInstrsDtls")
    protected DisplayInstruction1 dispInstrsDtls;
    @XmlElement(name = "SttlmDtls")
    protected SecuritiesSettlement1 sttlmDtls;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification11 }
     *     
     */
    public DocumentIdentification11 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification11 }
     *     
     */
    public Order setId(DocumentIdentification11 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the refs property.
     * 
     * @return
     *     possible object is
     *     {@link Reference8 }
     *     
     */
    public Reference8 getRefs() {
        return refs;
    }

    /**
     * Sets the value of the refs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference8 }
     *     
     */
    public Order setRefs(Reference8 value) {
        this.refs = value;
        return this;
    }

    /**
     * Gets the value of the ordrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SingleOrMultiLegOrderChoice }
     *     
     */
    public SingleOrMultiLegOrderChoice getOrdrDtls() {
        return ordrDtls;
    }

    /**
     * Sets the value of the ordrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SingleOrMultiLegOrderChoice }
     *     
     */
    public Order setOrdrDtls(SingleOrMultiLegOrderChoice value) {
        this.ordrDtls = value;
        return this;
    }

    /**
     * Gets the value of the ordrQty property.
     * 
     * @return
     *     possible object is
     *     {@link OrderQuantity3 }
     *     
     */
    public OrderQuantity3 getOrdrQty() {
        return ordrQty;
    }

    /**
     * Sets the value of the ordrQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderQuantity3 }
     *     
     */
    public Order setOrdrQty(OrderQuantity3 value) {
        this.ordrQty = value;
        return this;
    }

    /**
     * Gets the value of the ordrParamsDtls property.
     * 
     * @return
     *     possible object is
     *     {@link OrderParameters1 }
     *     
     */
    public OrderParameters1 getOrdrParamsDtls() {
        return ordrParamsDtls;
    }

    /**
     * Sets the value of the ordrParamsDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderParameters1 }
     *     
     */
    public Order setOrdrParamsDtls(OrderParameters1 value) {
        this.ordrParamsDtls = value;
        return this;
    }

    /**
     * Gets the value of the trggrgInstrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TriggeringInstructions }
     *     
     */
    public TriggeringInstructions getTrggrgInstrDtls() {
        return trggrgInstrDtls;
    }

    /**
     * Sets the value of the trggrgInstrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggeringInstructions }
     *     
     */
    public Order setTrggrgInstrDtls(TriggeringInstructions value) {
        this.trggrgInstrDtls = value;
        return this;
    }

    /**
     * Gets the value of the dscrtnInstrs property.
     * 
     * @return
     *     possible object is
     *     {@link DiscretionInstructions1 }
     *     
     */
    public DiscretionInstructions1 getDscrtnInstrs() {
        return dscrtnInstrs;
    }

    /**
     * Sets the value of the dscrtnInstrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscretionInstructions1 }
     *     
     */
    public Order setDscrtnInstrs(DiscretionInstructions1 value) {
        this.dscrtnInstrs = value;
        return this;
    }

    /**
     * Gets the value of the dispInstrsDtls property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayInstruction1 }
     *     
     */
    public DisplayInstruction1 getDispInstrsDtls() {
        return dispInstrsDtls;
    }

    /**
     * Sets the value of the dispInstrsDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayInstruction1 }
     *     
     */
    public Order setDispInstrsDtls(DisplayInstruction1 value) {
        this.dispInstrsDtls = value;
        return this;
    }

    /**
     * Gets the value of the sttlmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlement1 }
     *     
     */
    public SecuritiesSettlement1 getSttlmDtls() {
        return sttlmDtls;
    }

    /**
     * Sets the value of the sttlmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlement1 }
     *     
     */
    public Order setSttlmDtls(SecuritiesSettlement1 value) {
        this.sttlmDtls = value;
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
