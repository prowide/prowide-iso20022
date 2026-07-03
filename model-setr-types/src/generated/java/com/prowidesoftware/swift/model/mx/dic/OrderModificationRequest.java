
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
 * An instructing party, eg, an investment manager, sends the OrderModificationRequest message to an executing party, eg, a broker, to request the modification of the previously sent Order.
 * Usage
 * Where permitted, an executing party, eg, a broker, sends directly the OrderModificationRequest to a point of execution such as an exchange. TheOrderModificationRequest message may also be used in broker-to-broker communications.
 * This message must contain the reference of the message to be modified and it must contain all the details of the message to be modified.
 * This modification message is a request to modify. There is no automatic acceptance of the modification instruction. The rejection or acceptance of a modification message instruction is made using an OrderStatus message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderModificationRequest", propOrder = {
    "id",
    "refs",
    "ordrDtls",
    "ordrQty",
    "ordrParamsDtls",
    "dscrtnInstrsDtls",
    "dispInstrDtls",
    "sctiesSttlmDtls"
})
public class OrderModificationRequest {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification11 id;
    @XmlElement(name = "Refs", required = true)
    protected Reference10 refs;
    @XmlElement(name = "OrdrDtls", required = true)
    protected SingleOrMultiLegOrderChoice ordrDtls;
    @XmlElement(name = "OrdrQty")
    protected OrderQuantity3 ordrQty;
    @XmlElement(name = "OrdrParamsDtls", required = true)
    protected OrderParameters1 ordrParamsDtls;
    @XmlElement(name = "DscrtnInstrsDtls")
    protected DiscretionInstructions1 dscrtnInstrsDtls;
    @XmlElement(name = "DispInstrDtls")
    protected DisplayInstruction1 dispInstrDtls;
    @XmlElement(name = "SctiesSttlmDtls")
    protected SecuritiesSettlement1 sctiesSttlmDtls;

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
    public OrderModificationRequest setId(DocumentIdentification11 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the refs property.
     * 
     * @return
     *     possible object is
     *     {@link Reference10 }
     *     
     */
    public Reference10 getRefs() {
        return refs;
    }

    /**
     * Sets the value of the refs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference10 }
     *     
     */
    public OrderModificationRequest setRefs(Reference10 value) {
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
    public OrderModificationRequest setOrdrDtls(SingleOrMultiLegOrderChoice value) {
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
    public OrderModificationRequest setOrdrQty(OrderQuantity3 value) {
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
    public OrderModificationRequest setOrdrParamsDtls(OrderParameters1 value) {
        this.ordrParamsDtls = value;
        return this;
    }

    /**
     * Gets the value of the dscrtnInstrsDtls property.
     * 
     * @return
     *     possible object is
     *     {@link DiscretionInstructions1 }
     *     
     */
    public DiscretionInstructions1 getDscrtnInstrsDtls() {
        return dscrtnInstrsDtls;
    }

    /**
     * Sets the value of the dscrtnInstrsDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscretionInstructions1 }
     *     
     */
    public OrderModificationRequest setDscrtnInstrsDtls(DiscretionInstructions1 value) {
        this.dscrtnInstrsDtls = value;
        return this;
    }

    /**
     * Gets the value of the dispInstrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayInstruction1 }
     *     
     */
    public DisplayInstruction1 getDispInstrDtls() {
        return dispInstrDtls;
    }

    /**
     * Sets the value of the dispInstrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayInstruction1 }
     *     
     */
    public OrderModificationRequest setDispInstrDtls(DisplayInstruction1 value) {
        this.dispInstrDtls = value;
        return this;
    }

    /**
     * Gets the value of the sctiesSttlmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlement1 }
     *     
     */
    public SecuritiesSettlement1 getSctiesSttlmDtls() {
        return sctiesSttlmDtls;
    }

    /**
     * Sets the value of the sctiesSttlmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlement1 }
     *     
     */
    public OrderModificationRequest setSctiesSttlmDtls(SecuritiesSettlement1 value) {
        this.sctiesSttlmDtls = value;
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
