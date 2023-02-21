
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
 * Specifies the details relative to the submission of the insurance data set.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequiredSubmission3", propOrder = {
    "submitr",
    "mtchIssr",
    "mtchIsseDt",
    "mtchTrnsprt",
    "mtchAmt",
    "clausesReqrd",
    "mtchAssrdPty"
})
public class RequiredSubmission3 {

    @XmlElement(name = "Submitr", required = true)
    protected List<BICIdentification1> submitr;
    @XmlElement(name = "MtchIssr")
    protected PartyIdentification27 mtchIssr;
    @XmlElement(name = "MtchIsseDt")
    protected boolean mtchIsseDt;
    @XmlElement(name = "MtchTrnsprt")
    protected boolean mtchTrnsprt;
    @XmlElement(name = "MtchAmt")
    protected boolean mtchAmt;
    @XmlElement(name = "ClausesReqrd")
    @XmlSchemaType(name = "string")
    protected List<InsuranceClauses1Code> clausesReqrd;
    @XmlElement(name = "MtchAssrdPty")
    @XmlSchemaType(name = "string")
    protected AssuredType1Code mtchAssrdPty;

    /**
     * Gets the value of the submitr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the submitr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubmitr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BICIdentification1 }
     * 
     * 
     */
    public List<BICIdentification1> getSubmitr() {
        if (submitr == null) {
            submitr = new ArrayList<BICIdentification1>();
        }
        return this.submitr;
    }

    /**
     * Gets the value of the mtchIssr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification27 }
     *     
     */
    public PartyIdentification27 getMtchIssr() {
        return mtchIssr;
    }

    /**
     * Sets the value of the mtchIssr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification27 }
     *     
     */
    public RequiredSubmission3 setMtchIssr(PartyIdentification27 value) {
        this.mtchIssr = value;
        return this;
    }

    /**
     * Gets the value of the mtchIsseDt property.
     * 
     */
    public boolean isMtchIsseDt() {
        return mtchIsseDt;
    }

    /**
     * Sets the value of the mtchIsseDt property.
     * 
     */
    public RequiredSubmission3 setMtchIsseDt(boolean value) {
        this.mtchIsseDt = value;
        return this;
    }

    /**
     * Gets the value of the mtchTrnsprt property.
     * 
     */
    public boolean isMtchTrnsprt() {
        return mtchTrnsprt;
    }

    /**
     * Sets the value of the mtchTrnsprt property.
     * 
     */
    public RequiredSubmission3 setMtchTrnsprt(boolean value) {
        this.mtchTrnsprt = value;
        return this;
    }

    /**
     * Gets the value of the mtchAmt property.
     * 
     */
    public boolean isMtchAmt() {
        return mtchAmt;
    }

    /**
     * Sets the value of the mtchAmt property.
     * 
     */
    public RequiredSubmission3 setMtchAmt(boolean value) {
        this.mtchAmt = value;
        return this;
    }

    /**
     * Gets the value of the clausesReqrd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clausesReqrd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClausesReqrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsuranceClauses1Code }
     * 
     * 
     */
    public List<InsuranceClauses1Code> getClausesReqrd() {
        if (clausesReqrd == null) {
            clausesReqrd = new ArrayList<InsuranceClauses1Code>();
        }
        return this.clausesReqrd;
    }

    /**
     * Gets the value of the mtchAssrdPty property.
     * 
     * @return
     *     possible object is
     *     {@link AssuredType1Code }
     *     
     */
    public AssuredType1Code getMtchAssrdPty() {
        return mtchAssrdPty;
    }

    /**
     * Sets the value of the mtchAssrdPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssuredType1Code }
     *     
     */
    public RequiredSubmission3 setMtchAssrdPty(AssuredType1Code value) {
        this.mtchAssrdPty = value;
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
     * Adds a new item to the submitr list.
     * @see #getSubmitr()
     * 
     */
    public RequiredSubmission3 addSubmitr(BICIdentification1 submitr) {
        getSubmitr().add(submitr);
        return this;
    }

    /**
     * Adds a new item to the clausesReqrd list.
     * @see #getClausesReqrd()
     * 
     */
    public RequiredSubmission3 addClausesReqrd(InsuranceClauses1Code clausesReqrd) {
        getClausesReqrd().add(clausesReqrd);
        return this;
    }

}
