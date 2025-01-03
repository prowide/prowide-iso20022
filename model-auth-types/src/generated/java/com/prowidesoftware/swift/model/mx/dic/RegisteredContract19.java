
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
 * Document that a user must file with an authorised servicer for each contract that involves foreign currency transactions with non residents.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisteredContract19", propOrder = {
    "regdCtrctClsrId",
    "rptgPty",
    "regnAgt",
    "orgnlRegdCtrct",
    "prty",
    "clsrRsn",
    "cssn",
    "attchmnt",
    "splmtryData"
})
public class RegisteredContract19 {

    @XmlElement(name = "RegdCtrctClsrId", required = true)
    protected String regdCtrctClsrId;
    @XmlElement(name = "RptgPty", required = true)
    protected TradeParty6 rptgPty;
    @XmlElement(name = "RegnAgt", required = true)
    protected BranchAndFinancialInstitutionIdentification8 regnAgt;
    @XmlElement(name = "OrgnlRegdCtrct", required = true)
    protected DocumentIdentification29 orgnlRegdCtrct;
    @XmlElement(name = "Prty", required = true)
    @XmlSchemaType(name = "string")
    protected Priority2Code prty;
    @XmlElement(name = "ClsrRsn", required = true)
    protected ContractClosureReason1Choice clsrRsn;
    @XmlElement(name = "Cssn")
    protected ContractCessionData2 cssn;
    @XmlElement(name = "Attchmnt")
    protected List<DocumentGeneralInformation5> attchmnt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the regdCtrctClsrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegdCtrctClsrId() {
        return regdCtrctClsrId;
    }

    /**
     * Sets the value of the regdCtrctClsrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RegisteredContract19 setRegdCtrctClsrId(String value) {
        this.regdCtrctClsrId = value;
        return this;
    }

    /**
     * Gets the value of the rptgPty property.
     * 
     * @return
     *     possible object is
     *     {@link TradeParty6 }
     *     
     */
    public TradeParty6 getRptgPty() {
        return rptgPty;
    }

    /**
     * Sets the value of the rptgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeParty6 }
     *     
     */
    public RegisteredContract19 setRptgPty(TradeParty6 value) {
        this.rptgPty = value;
        return this;
    }

    /**
     * Gets the value of the regnAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification8 getRegnAgt() {
        return regnAgt;
    }

    /**
     * Sets the value of the regnAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public RegisteredContract19 setRegnAgt(BranchAndFinancialInstitutionIdentification8 value) {
        this.regnAgt = value;
        return this;
    }

    /**
     * Gets the value of the orgnlRegdCtrct property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification29 }
     *     
     */
    public DocumentIdentification29 getOrgnlRegdCtrct() {
        return orgnlRegdCtrct;
    }

    /**
     * Sets the value of the orgnlRegdCtrct property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification29 }
     *     
     */
    public RegisteredContract19 setOrgnlRegdCtrct(DocumentIdentification29 value) {
        this.orgnlRegdCtrct = value;
        return this;
    }

    /**
     * Gets the value of the prty property.
     * 
     * @return
     *     possible object is
     *     {@link Priority2Code }
     *     
     */
    public Priority2Code getPrty() {
        return prty;
    }

    /**
     * Sets the value of the prty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Priority2Code }
     *     
     */
    public RegisteredContract19 setPrty(Priority2Code value) {
        this.prty = value;
        return this;
    }

    /**
     * Gets the value of the clsrRsn property.
     * 
     * @return
     *     possible object is
     *     {@link ContractClosureReason1Choice }
     *     
     */
    public ContractClosureReason1Choice getClsrRsn() {
        return clsrRsn;
    }

    /**
     * Sets the value of the clsrRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractClosureReason1Choice }
     *     
     */
    public RegisteredContract19 setClsrRsn(ContractClosureReason1Choice value) {
        this.clsrRsn = value;
        return this;
    }

    /**
     * Gets the value of the cssn property.
     * 
     * @return
     *     possible object is
     *     {@link ContractCessionData2 }
     *     
     */
    public ContractCessionData2 getCssn() {
        return cssn;
    }

    /**
     * Sets the value of the cssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractCessionData2 }
     *     
     */
    public RegisteredContract19 setCssn(ContractCessionData2 value) {
        this.cssn = value;
        return this;
    }

    /**
     * Gets the value of the attchmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the attchmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttchmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentGeneralInformation5 }
     * 
     * 
     * @return
     *     The value of the attchmnt property.
     */
    public List<DocumentGeneralInformation5> getAttchmnt() {
        if (attchmnt == null) {
            attchmnt = new ArrayList<>();
        }
        return this.attchmnt;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
        }
        return this.splmtryData;
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
     * Adds a new item to the attchmnt list.
     * @see #getAttchmnt()
     * 
     */
    public RegisteredContract19 addAttchmnt(DocumentGeneralInformation5 attchmnt) {
        getAttchmnt().add(attchmnt);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public RegisteredContract19 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
