
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Choice between different statuses of an investigation case.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestigationStatus", propOrder = {
    "conf",
    "assgnmtCxlConf",
    "rjctdMod",
    "rjctdCxl",
    "dplctOf",
    "rtrInf"
})
public class InvestigationStatus {

    @XmlElement(name = "Conf")
    @XmlSchemaType(name = "string")
    protected InvestigationExecutionConfirmation2Code conf;
    @XmlElement(name = "AssgnmtCxlConf")
    protected Boolean assgnmtCxlConf;
    @XmlElement(name = "RjctdMod")
    @XmlSchemaType(name = "string")
    protected List<PaymentModificationRejection1Code> rjctdMod;
    @XmlElement(name = "RjctdCxl")
    protected RejectedCancellationJustification rjctdCxl;
    @XmlElement(name = "DplctOf")
    protected Case dplctOf;
    @XmlElement(name = "RtrInf")
    protected ReturnInformation1 rtrInf;

    /**
     * Gets the value of the conf property.
     * 
     * @return
     *     possible object is
     *     {@link InvestigationExecutionConfirmation2Code }
     *     
     */
    public InvestigationExecutionConfirmation2Code getConf() {
        return conf;
    }

    /**
     * Sets the value of the conf property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigationExecutionConfirmation2Code }
     *     
     */
    public InvestigationStatus setConf(InvestigationExecutionConfirmation2Code value) {
        this.conf = value;
        return this;
    }

    /**
     * Gets the value of the assgnmtCxlConf property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAssgnmtCxlConf() {
        return assgnmtCxlConf;
    }

    /**
     * Sets the value of the assgnmtCxlConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public InvestigationStatus setAssgnmtCxlConf(Boolean value) {
        this.assgnmtCxlConf = value;
        return this;
    }

    /**
     * Gets the value of the rjctdMod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rjctdMod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRjctdMod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentModificationRejection1Code }
     * 
     * 
     * @return
     *     The value of the rjctdMod property.
     */
    public List<PaymentModificationRejection1Code> getRjctdMod() {
        if (rjctdMod == null) {
            rjctdMod = new ArrayList<>();
        }
        return this.rjctdMod;
    }

    /**
     * Gets the value of the rjctdCxl property.
     * 
     * @return
     *     possible object is
     *     {@link RejectedCancellationJustification }
     *     
     */
    public RejectedCancellationJustification getRjctdCxl() {
        return rjctdCxl;
    }

    /**
     * Sets the value of the rjctdCxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectedCancellationJustification }
     *     
     */
    public InvestigationStatus setRjctdCxl(RejectedCancellationJustification value) {
        this.rjctdCxl = value;
        return this;
    }

    /**
     * Gets the value of the dplctOf property.
     * 
     * @return
     *     possible object is
     *     {@link Case }
     *     
     */
    public Case getDplctOf() {
        return dplctOf;
    }

    /**
     * Sets the value of the dplctOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Case }
     *     
     */
    public InvestigationStatus setDplctOf(Case value) {
        this.dplctOf = value;
        return this;
    }

    /**
     * Gets the value of the rtrInf property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnInformation1 }
     *     
     */
    public ReturnInformation1 getRtrInf() {
        return rtrInf;
    }

    /**
     * Sets the value of the rtrInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnInformation1 }
     *     
     */
    public InvestigationStatus setRtrInf(ReturnInformation1 value) {
        this.rtrInf = value;
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
     * Adds a new item to the rjctdMod list.
     * @see #getRjctdMod()
     * 
     */
    public InvestigationStatus addRjctdMod(PaymentModificationRejection1Code rjctdMod) {
        getRjctdMod().add(rjctdMod);
        return this;
    }

}
