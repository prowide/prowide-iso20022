
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
 * Completion of a securities settlement instruction, wherein securities are delivered/debited from a securities account and received/credited to the designated securities account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceiveInformation2", propOrder = {
    "chrgDtls",
    "taxDtls",
    "sttlmPtiesDtls",
    "physTrfInd",
    "physTrfDtls"
})
public class ReceiveInformation2 {

    @XmlElement(name = "ChrgDtls")
    protected List<Charge4> chrgDtls;
    @XmlElement(name = "TaxDtls")
    protected List<Tax3> taxDtls;
    @XmlElement(name = "SttlmPtiesDtls", required = true)
    protected ReceivingPartiesAndAccount1 sttlmPtiesDtls;
    @XmlElement(name = "PhysTrfInd")
    protected boolean physTrfInd;
    @XmlElement(name = "PhysTrfDtls")
    protected DeliveryParameters2 physTrfDtls;

    /**
     * Gets the value of the chrgDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the chrgDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChrgDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Charge4 }
     * 
     * 
     * @return
     *     The value of the chrgDtls property.
     */
    public List<Charge4> getChrgDtls() {
        if (chrgDtls == null) {
            chrgDtls = new ArrayList<>();
        }
        return this.chrgDtls;
    }

    /**
     * Gets the value of the taxDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the taxDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax3 }
     * 
     * 
     * @return
     *     The value of the taxDtls property.
     */
    public List<Tax3> getTaxDtls() {
        if (taxDtls == null) {
            taxDtls = new ArrayList<>();
        }
        return this.taxDtls;
    }

    /**
     * Gets the value of the sttlmPtiesDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ReceivingPartiesAndAccount1 }
     *     
     */
    public ReceivingPartiesAndAccount1 getSttlmPtiesDtls() {
        return sttlmPtiesDtls;
    }

    /**
     * Sets the value of the sttlmPtiesDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivingPartiesAndAccount1 }
     *     
     */
    public ReceiveInformation2 setSttlmPtiesDtls(ReceivingPartiesAndAccount1 value) {
        this.sttlmPtiesDtls = value;
        return this;
    }

    /**
     * Gets the value of the physTrfInd property.
     * 
     */
    public boolean isPhysTrfInd() {
        return physTrfInd;
    }

    /**
     * Sets the value of the physTrfInd property.
     * 
     */
    public ReceiveInformation2 setPhysTrfInd(boolean value) {
        this.physTrfInd = value;
        return this;
    }

    /**
     * Gets the value of the physTrfDtls property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryParameters2 }
     *     
     */
    public DeliveryParameters2 getPhysTrfDtls() {
        return physTrfDtls;
    }

    /**
     * Sets the value of the physTrfDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryParameters2 }
     *     
     */
    public ReceiveInformation2 setPhysTrfDtls(DeliveryParameters2 value) {
        this.physTrfDtls = value;
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
     * Adds a new item to the chrgDtls list.
     * @see #getChrgDtls()
     * 
     */
    public ReceiveInformation2 addChrgDtls(Charge4 chrgDtls) {
        getChrgDtls().add(chrgDtls);
        return this;
    }

    /**
     * Adds a new item to the taxDtls list.
     * @see #getTaxDtls()
     * 
     */
    public ReceiveInformation2 addTaxDtls(Tax3 taxDtls) {
        getTaxDtls().add(taxDtls);
        return this;
    }

}
