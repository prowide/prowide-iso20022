
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
 * Payment terminal or ATM performing the transaction
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Terminal3", propOrder = {
    "termnlId",
    "cpblties",
    "crdhldrVrfctnCpblty",
    "termnlIntgtn",
    "outdrInd",
    "offPrmissInd",
    "onBrdInd",
    "poiCmpnt"
})
public class Terminal3 {

    @XmlElement(name = "TermnlId")
    protected TerminalIdentification2 termnlId;
    @XmlElement(name = "Cpblties")
    protected Capabilities1 cpblties;
    @XmlElement(name = "CrdhldrVrfctnCpblty")
    protected List<CardholderVerificationCapabilities1> crdhldrVrfctnCpblty;
    @XmlElement(name = "TermnlIntgtn")
    @XmlSchemaType(name = "string")
    protected TerminalIntegrationCategory1Code termnlIntgtn;
    @XmlElement(name = "OutdrInd")
    protected Boolean outdrInd;
    @XmlElement(name = "OffPrmissInd")
    protected Boolean offPrmissInd;
    @XmlElement(name = "OnBrdInd")
    protected Boolean onBrdInd;
    @XmlElement(name = "POICmpnt")
    protected List<PointOfInteractionComponent8> poiCmpnt;

    /**
     * Gets the value of the termnlId property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalIdentification2 }
     *     
     */
    public TerminalIdentification2 getTermnlId() {
        return termnlId;
    }

    /**
     * Sets the value of the termnlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalIdentification2 }
     *     
     */
    public Terminal3 setTermnlId(TerminalIdentification2 value) {
        this.termnlId = value;
        return this;
    }

    /**
     * Gets the value of the cpblties property.
     * 
     * @return
     *     possible object is
     *     {@link Capabilities1 }
     *     
     */
    public Capabilities1 getCpblties() {
        return cpblties;
    }

    /**
     * Sets the value of the cpblties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Capabilities1 }
     *     
     */
    public Terminal3 setCpblties(Capabilities1 value) {
        this.cpblties = value;
        return this;
    }

    /**
     * Gets the value of the crdhldrVrfctnCpblty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crdhldrVrfctnCpblty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrdhldrVrfctnCpblty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardholderVerificationCapabilities1 }
     * 
     * 
     */
    public List<CardholderVerificationCapabilities1> getCrdhldrVrfctnCpblty() {
        if (crdhldrVrfctnCpblty == null) {
            crdhldrVrfctnCpblty = new ArrayList<CardholderVerificationCapabilities1>();
        }
        return this.crdhldrVrfctnCpblty;
    }

    /**
     * Gets the value of the termnlIntgtn property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalIntegrationCategory1Code }
     *     
     */
    public TerminalIntegrationCategory1Code getTermnlIntgtn() {
        return termnlIntgtn;
    }

    /**
     * Sets the value of the termnlIntgtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalIntegrationCategory1Code }
     *     
     */
    public Terminal3 setTermnlIntgtn(TerminalIntegrationCategory1Code value) {
        this.termnlIntgtn = value;
        return this;
    }

    /**
     * Gets the value of the outdrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOutdrInd() {
        return outdrInd;
    }

    /**
     * Sets the value of the outdrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Terminal3 setOutdrInd(Boolean value) {
        this.outdrInd = value;
        return this;
    }

    /**
     * Gets the value of the offPrmissInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOffPrmissInd() {
        return offPrmissInd;
    }

    /**
     * Sets the value of the offPrmissInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Terminal3 setOffPrmissInd(Boolean value) {
        this.offPrmissInd = value;
        return this;
    }

    /**
     * Gets the value of the onBrdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnBrdInd() {
        return onBrdInd;
    }

    /**
     * Sets the value of the onBrdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Terminal3 setOnBrdInd(Boolean value) {
        this.onBrdInd = value;
        return this;
    }

    /**
     * Gets the value of the poiCmpnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the poiCmpnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPOICmpnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointOfInteractionComponent8 }
     * 
     * 
     */
    public List<PointOfInteractionComponent8> getPOICmpnt() {
        if (poiCmpnt == null) {
            poiCmpnt = new ArrayList<PointOfInteractionComponent8>();
        }
        return this.poiCmpnt;
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
     * Adds a new item to the crdhldrVrfctnCpblty list.
     * @see #getCrdhldrVrfctnCpblty()
     * 
     */
    public Terminal3 addCrdhldrVrfctnCpblty(CardholderVerificationCapabilities1 crdhldrVrfctnCpblty) {
        getCrdhldrVrfctnCpblty().add(crdhldrVrfctnCpblty);
        return this;
    }

    /**
     * Adds a new item to the pOICmpnt list.
     * @see #getPOICmpnt()
     * 
     */
    public Terminal3 addPOICmpnt(PointOfInteractionComponent8 pOICmpnt) {
        getPOICmpnt().add(pOICmpnt);
        return this;
    }

}
